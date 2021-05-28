package com.mualim.movieapp.ui.movie

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.ShareCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.mualim.movieapp.callback.MovieFragmentCallback
import com.mualim.movieapp.callback.OnItemMovieCallback
import com.mualim.movieapp.data.MovieEntity
import com.mualim.movieapp.databinding.FragmentMovieBinding
import com.mualim.movieapp.viewmodel.ViewModelFactory
import com.mualim.ui.detail.DetailActivity


class MovieFragment : Fragment(), MovieFragmentCallback {

    private lateinit var fragmentMovieBinding: FragmentMovieBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        fragmentMovieBinding = FragmentMovieBinding.inflate(layoutInflater, container, false)
        return fragmentMovieBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null) {

            val factory = ViewModelFactory.getInstance(requireActivity())
            val vieModel = ViewModelProvider(this, factory)[MovieViewModel::class.java]

            val movieAdapter = MovieAdapter(this)

            fragmentMovieBinding.progressBar.visibility = View.VISIBLE
            vieModel.getMovies().observe(viewLifecycleOwner, { movies ->
                fragmentMovieBinding.progressBar.visibility = View.GONE
                movieAdapter.setMovies(movies)

                movieAdapter.notifyDataSetChanged()
            })

            movieAdapter.setOnItemMovieClickCallback(object : OnItemMovieCallback {
                override fun onItemClicked(movie: MovieEntity) {
                    val intent = Intent(context, DetailActivity::class.java)
                    intent.putExtra(DetailActivity.EXTRA_MOVIE, movie.id)
                    startActivity(intent)
                }

            })
            with(fragmentMovieBinding.rvMovie) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                this.adapter = movieAdapter
            }
        }
    }

    override fun onShareClick(movie: MovieEntity) {
        if (activity != null) {
            val mimeType = "text/plain"
            ShareCompat.IntentBuilder
                .from(requireActivity())
                .setType(mimeType)
                .setChooserTitle("Bagikan aplikasi imi sekarang.")
                .setText(movie.title)
                .startChooser()
        }
    }
}