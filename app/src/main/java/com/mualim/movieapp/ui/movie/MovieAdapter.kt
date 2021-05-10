package com.mualim.movieapp.ui.movie

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.mualim.movieapp.R
import com.mualim.movieapp.callback.MovieFragmentCallback
import com.mualim.movieapp.callback.OnItemMovieCallback
import com.mualim.movieapp.data.MovieEntity
import com.mualim.movieapp.databinding.ItemsMovieBinding

class MovieAdapter(private val callback: MovieFragmentCallback) : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    private val listMovies = ArrayList<MovieEntity>()

    private var onItemMovieCallback: OnItemMovieCallback? = null
    fun setOnItemMovieClickCallback(onItemMovieCallback: OnItemMovieCallback) {
        this.onItemMovieCallback = onItemMovieCallback
    }
    fun setMovies(movies: List<MovieEntity>?) {
        if (movies == null) return
        this.listMovies.clear()
        this.listMovies.addAll(movies)

        this.notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val itemsMovieBinding = ItemsMovieBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieViewHolder(itemsMovieBinding)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movies = listMovies[position]
        holder.bind(movies)
    }

    override fun getItemCount(): Int {
        return listMovies.size
    }

    inner class MovieViewHolder(private val binding: ItemsMovieBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(movie: MovieEntity) {
            with(binding) {
                textTitle.text = movie.title
                textRelease.text = movie.release
                Glide.with(itemView.context)
                        .load(movie.poster_path)
                        .apply(RequestOptions.placeholderOf(R.drawable.ic_loading))
                        .error(R.drawable.ic_error)
                        .into(imgPoster)
                itemView.setOnClickListener { onItemMovieCallback?.onItemClicked(movie)}
                imgShare.setOnClickListener { callback.onShareClick(movie) }
            }
        }
    }
}