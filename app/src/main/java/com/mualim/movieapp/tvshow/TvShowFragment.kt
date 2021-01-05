package com.mualim.movieapp.tvshow

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.ShareCompat
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.mualim.movieapp.R
import com.mualim.movieapp.callback.TvShowFragmentCallback
import com.mualim.movieapp.data.TvShowEntity
import com.mualim.movieapp.databinding.FragmentTvShowBinding
import com.mualim.movieapp.utils.DataDummy

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
            val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[TvShowViewModel::class.java]
            val tvShows = viewModel.getTvShows()
            val tvShowAdapter = TvShowAdapter(this)
            tvShowAdapter.setTvShow(tvShows)

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