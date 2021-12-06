package com.marianunez.quotesapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.marianunez.quotesapp.databinding.ActivityMainBinding
import com.marianunez.quotesapp.viewmodel.QuoteViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val quoteViewModel: QuoteViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        quoteViewModel.quoteModel.observe(this, Observer {
            //lo que está aquí dentro estará enganchado al LiveData
            //hacemos getString porque el QuoteModel selecciona el id de los string res y tenemos que coger la string de ese id
            binding.quote.text = getString(it.quoteId)
        })

        binding.viewContainer.setOnClickListener { quoteViewModel.randomQuote() }

    }
}