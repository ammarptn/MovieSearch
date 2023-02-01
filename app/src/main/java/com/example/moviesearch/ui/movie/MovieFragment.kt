package com.example.moviesearch.ui.movie

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.SearchView.OnQueryTextListener
import com.example.moviesearch.R
import com.example.moviesearch.databinding.FragmentMovieBinding
import kotlinx.coroutines.flow.collectLatest

class MovieFragment : Fragment() {

    companion object {
        fun newInstance() = MovieFragment()
        private const val TAG = "MovieFragment"
    }

    private lateinit var viewModel: MovieViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MovieViewModel::class.java)
    }

    private var _binding: FragmentMovieBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMovieBinding.inflate(inflater, container, false)
        val view = binding.root



        binding.searchView.setOnQueryTextListener(object : OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                Log.d(TAG, "onQueryTextSubmit: search: $query")

                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                return true
            }

        })

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}