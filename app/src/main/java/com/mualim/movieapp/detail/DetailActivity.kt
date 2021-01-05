package com.mualim.movieapp.detail

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.mualim.movieapp.R
import com.mualim.movieapp.data.MovieEntity
import com.mualim.movieapp.data.TvShowEntity
import com.mualim.movieapp.databinding.ActivityDetailBinding
import com.mualim.movieapp.databinding.ContentDetailBinding
import com.mualim.movieapp.utils.DataDummy

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

        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[DetailViewModel::class.java]

        val extras = intent.extras
        if (extras != null) {
            val idMovie = extras.getInt(EXTRA_MOVIE, 0)
            val idTvShow = extras.getInt(EXTRA_TV_SHOW, 0)
            if (idMovie != 0) {
                viewModel.movieDetail(idMovie)?.let { populateMovie(it) }
            } else {
                viewModel.tvShowDetail(idTvShow)?.let { populateTvShow(it) }
            }
        }
    }

    @SuppressLint("SetTextI18n")
    private fun populateMovie(movieEntity: MovieEntity) {
        detailBinding.textTitle.text = movieEntity.title
        detailBinding.textRelease.text = "(${movieEntity.release})"
        detailBinding.textGenre.text = movieEntity.genre
        detailBinding.textDuration.text = movieEntity.duration
        detailBinding.textScore.text = "${movieEntity.userScore}%"
        detailBinding.textDescOverview.text = movieEntity.overview
        Glide.with(this)
                .load(movieEntity.img)
                .transform(RoundedCorners(20))
                .apply(RequestOptions.placeholderOf(R.drawable.ic_loading)
                        .error(R.drawable.ic_error))
                .into(detailBinding.imageView)

    }

    @SuppressLint("SetTextI18n")
    private fun populateTvShow(tvShowEntity: TvShowEntity) {
        detailBinding.textTitle.text = tvShowEntity.title
        detailBinding.textRelease.text = "(${tvShowEntity.release})"
        detailBinding.textGenre.text = tvShowEntity.genre
        detailBinding.textDuration.text = tvShowEntity.duration
        detailBinding.textScore.text = "${tvShowEntity.userScore}%"
        detailBinding.textDescOverview.text = tvShowEntity.overview
        Glide.with(this)
                .load(tvShowEntity.img)
                .transform(RoundedCorners(20))
                .apply(RequestOptions.placeholderOf(R.drawable.ic_loading)
                        .error(R.drawable.ic_error))
                .into(detailBinding.imageView)
    }
}