package com.example.moviesearch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.moviesearch.ui.movie.MovieFragment

class MovieActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MovieFragment.newInstance())
                .commitNow()
        }
    }
}