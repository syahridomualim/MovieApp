package com.mualim.ui.detail

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.observe
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.mualim.movieapp.R
import com.mualim.movieapp.data.MovieEntity
import com.mualim.movieapp.data.TvShowEntity
import com.mualim.movieapp.databinding.ActivityDetailBinding
import com.mualim.movieapp.databinding.ContentDetailBinding
import com.mualim.movieapp.viewmodel.ViewModelFactory

@Suppress("COMPATIBILITY_WARNING")
class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_MOVIE = "extra_movie"
        const val EXTRA_TV_SHOW = "extra_tv_show"
    }

    private lateinit var detailBinding: ContentDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activityDetailBinding = ActivityDetailBinding.inflate(layoutInflater)
        detailBinding = activityDetailBinding.detailContent

        setContentView(activityDetailBinding.root)

        setSupportActionBar(activityDetailBinding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val factory = ViewModelFactory.getInstance(this)
        val viewModel = ViewModelProvider(this, factory)[DetailViewModel::class.java]

        val extras = intent.extras
        if (extras != null) {
            val idMovie = extras.getInt(EXTRA_MOVIE, 0)
            val idTvShow = extras.getInt(EXTRA_TV_SHOW, 0)
            if (idMovie != 0) {
                activityDetailBinding.progressBar.visibility = View.VISIBLE
                activityDetailBinding.content.visibility = View.INVISIBLE
                viewModel.selectedItem(idMovie)

                viewModel.getMovie().observe(this, { movie ->
                    activityDetailBinding.progressBar.visibility = View.GONE
                    activityDetailBinding.content.visibility = View.VISIBLE
                    populateMovie(movie)
                })
            } else {
                activityDetailBinding.progressBar.visibility = View.VISIBLE
                activityDetailBinding.content.visibility = View.INVISIBLE
                viewModel.selectedItem(idTvShow)

                viewModel.getTvShow().observe(this, {tvShow ->
                    activityDetailBinding.progressBar.visibility = View.GONE
                    activityDetailBinding.content.visibility = View.VISIBLE
                    populateTvShow(tvShow)
                })
            }
        }
    }

    private fun populateMovie(movieEntity: MovieEntity) {
        detailBinding.textTitle.text = movieEntity.title
        detailBinding.textRelease.text = resources.getString(R.string.release_desc, movieEntity.release)
        detailBinding.textGenre.text = movieEntity.genres.joinToString(", ")
        detailBinding.textDuration.text = movieEntity.duration
        detailBinding.textScore.text = resources.getString(R.string.user_score_desc, movieEntity.userScore + "%")
        detailBinding.textDescOverview.text = movieEntity.overview
        Glide.with(this)
                .load(movieEntity.poster_path)
                .transform(RoundedCorners(20))
                .apply(RequestOptions.placeholderOf(R.drawable.ic_loading)
                        .error(R.drawable.ic_error))
                .into(detailBinding.imageView)

    }

    private fun populateTvShow(tvShowEntity: TvShowEntity) {
        detailBinding.textTitle.text = tvShowEntity.title
        detailBinding.textRelease.text = resources.getString(R.string.release_desc, tvShowEntity.release)
        detailBinding.textGenre.text = tvShowEntity.genres.joinToString(", ")
        detailBinding.textDuration.text = tvShowEntity.duration
        detailBinding.textScore.text = resources.getString(R.string.user_score_desc, tvShowEntity.userScore + "%")
        detailBinding.textDescOverview.text = tvShowEntity.overview
        Glide.with(this)
                .load(tvShowEntity.poster_path)
                .transform(RoundedCorners(20))
                .apply(RequestOptions.placeholderOf(R.drawable.ic_loading)
                        .error(R.drawable.ic_error))
                .into(detailBinding.imageView)
    }
}