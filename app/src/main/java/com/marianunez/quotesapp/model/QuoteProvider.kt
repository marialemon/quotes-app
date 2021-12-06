package com.marianunez.quotesapp.model

import com.marianunez.quotesapp.R

class QuoteProvider {

    companion object {

        fun randomPosition():QuoteModel{
            val position = (0..6).random()
            return quote[position]
        }

        private val quote = listOf<QuoteModel>(
            QuoteModel(R.string.quote1),
            QuoteModel(R.string.quote2),
            QuoteModel(R.string.quote3),
            QuoteModel(R.string.quote4),
            QuoteModel(R.string.quote5),
            QuoteModel(R.string.quote6),
            QuoteModel(R.string.quote7)
        )

    }

}