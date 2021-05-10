package com.mualim.movieapp.ui.tvshow

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.ShareCompat
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.mualim.movieapp.callback.OnItemTvCallback
import com.mualim.movieapp.callback.TvShowFragmentCallback
import com.mualim.movieapp.data.TvShowEntity
import com.mualim.movieapp.databinding.FragmentTvShowBinding
import com.mualim.movieapp.detail.DetailActivity
import com.mualim.movieapp.viewmodel.ViewModelFactory
import com.mualim.ui.tvshow.TvShowViewModel

class TvShowFragment : Fragment(), TvShowFragmentCallback {

    private lateinit var tvShowBinding: FragmentTvShowBinding

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        tvShowBinding = FragmentTvShowBinding.inflate(layoutInflater, container, false)
        return tvShowBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null) {

            val factory = ViewModelFactory.getInstance(requireActivity())
            val viewModel = ViewModelProvider(this, factory)[TvShowViewModel::class.java]

            val tvShowAdapter = TvShowAdapter(this)

            tvShowBinding.progressBar.visibility = View.VISIBLE
            viewModel.getTvShows().observe(viewLifecycleOwner, { tvShows ->
                tvShowBinding.progressBar.visibility = View.GONE
                tvShowAdapter.setTvShow(tvShows)
                tvShowAdapter.notifyDataSetChanged()
            })

            tvShowAdapter.setOnItemTvCallback(object : OnItemTvCallback {
                override fun onItemClicked(tvShow: TvShowEntity) {
                    val intent = Intent(context, DetailActivity::class.java)
                    intent.putExtra(DetailActivity.EXTRA_TV_SHOW, tvShow.id)
                    context?.startActivity(intent)
                }

            })

            with(tvShowBinding.rvTvShow) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = tvShowAdapter
            }
        }
    }

    override fun onShareClick(tvShow: TvShowEntity) {
        if (activity != null) {
            val mimeType = "text/plain"
            ShareCompat.IntentBuilder
                    .from(requireActivity())
                    .setType(mimeType)
                    .setChooserTitle("Bagikan aplikasi imi sekarang.")
                    .setText(tvShow.title)
                    .startChooser()
        }
    }
}