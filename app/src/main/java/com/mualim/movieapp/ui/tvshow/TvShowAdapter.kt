package com.mualim.movieapp.ui.tvshow

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.mualim.movieapp.R
import com.mualim.movieapp.callback.OnItemTvCallback
import com.mualim.movieapp.callback.TvShowFragmentCallback
import com.mualim.movieapp.data.TvShowEntity
import com.mualim.movieapp.databinding.ItemsTvshowBinding

class TvShowAdapter(private val callback: TvShowFragmentCallback) : RecyclerView.Adapter<TvShowAdapter.MovieViewHolder>() {

    private val listTvShows = ArrayList<TvShowEntity>()

    private var onItemTvCallback: OnItemTvCallback? = null

    fun setOnItemTvCallback(onItemTvCallback: OnItemTvCallback) {
        this.onItemTvCallback = onItemTvCallback
    }

    fun setTvShow(tvShows: List<TvShowEntity>?) {
        if (tvShows == null) return
        this.listTvShows.clear()
        this.listTvShows.addAll(tvShows)

        this.notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val itemsTvShowBinding = ItemsTvshowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieViewHolder(itemsTvShowBinding)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val tvShow = listTvShows[position]
        holder.bind(tvShow)
    }

    override fun getItemCount(): Int {
        return listTvShows.size
    }

    inner class MovieViewHolder(private val itemsTvShowBinding: ItemsTvshowBinding) : RecyclerView.ViewHolder(itemsTvShowBinding.root) {
        fun bind(tvShow: TvShowEntity) {
            with(itemsTvShowBinding) {
                textTitle.text = tvShow.title
                textRelease.text = tvShow.release
                Glide.with(itemView.context)
                        .load(tvShow.poster_path)
                        .apply(RequestOptions.placeholderOf(R.drawable.ic_loading))
                        .error(R.drawable.ic_error)
                        .into(imgPoster)

                itemView.setOnClickListener { onItemTvCallback?.onItemClicked(tvShow) }
                imgShare.setOnClickListener { callback.onShareClick(tvShow) }
            }
        }
    }
}