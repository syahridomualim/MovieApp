package com.mualim.movieapp.utils

import android.content.Context
import com.mualim.movieapp.data.source.remote.response.MovieResponse
import com.mualim.movieapp.data.source.remote.response.TvShowResponse
import org.json.JSONException
import org.json.JSONObject
import java.io.IOException

class JsonHelper(private val context: Context) {
    private fun parsingFileToString(fileName: String): String? {
        return try {
            val `is` = context.assets.open(fileName)
            val buffer = ByteArray(`is`.available())
            `is`.read(buffer)
            `is`.close()
            String(buffer)
        } catch (e: IOException) {
            e.printStackTrace()
            null
        }
    }

    fun loadMovie(): List<MovieResponse> {
        val list = ArrayList<MovieResponse>()

        try {
            val responseObject = JSONObject(parsingFileToString("MovieResponse.json").toString())
            val listArray = responseObject.getJSONArray("movies")
            for (i in 0 until listArray.length()) {
                val course = listArray.getJSONObject(i)

                val id = course.getInt("id")
                val title = course.getString("title")
                val release = course.getString("release")
                val listGenre = ArrayList<String>()
                val genre = course.getJSONArray("genres")
                for (j in 0 until genre.length()) {
                    val mGenre = genre.getString(j)
                    listGenre.add(mGenre)
                }
                val duration = course.getString("duration")
                val userScore = course.getString("userScore")
                val overview = course.getString("overview")
                val posterPath = course.getString("poster_path")

                val movieResponse = MovieResponse(id, title, release, listGenre, duration, userScore, overview, posterPath)
                list.add(movieResponse)
            }

        } catch (e: JSONException) {
            e.printStackTrace()
        }
        return list
    }

    fun loadTvShow(): List<TvShowResponse> {
        val list = ArrayList<TvShowResponse>()

        try {
            val responseObject = JSONObject(parsingFileToString("TVShowResponse.json").toString())
            val listArray = responseObject.getJSONArray("tvShows")
            for (i in 0 until listArray.length()) {
                val course = listArray.getJSONObject(i)

                val id = course.getInt("id")
                val title = course.getString("title")
                val release = course.getString("release")
                val listGenre = ArrayList<String>()
                val genre = course.getJSONArray("genres")
                for (j in 0 until genre.length()) {
                    val mGenre = genre.getString(j)
                    listGenre.add(mGenre)
                }
                val duration = course.getString("duration")
                val userScore = course.getString("userScore")
                val overview = course.getString("overview")
                val posterPath = course.getString("poster_path")

                val tvShowResponse = TvShowResponse(id, title, release, listGenre, duration, userScore, overview, posterPath)
                list.add(tvShowResponse)
            }

        } catch (e: JSONException) {
            e.printStackTrace()
        }
        return list
    }
}