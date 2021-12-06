package com.marianunez.quotesapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.marianunez.quotesapp.model.QuoteModel
import com.marianunez.quotesapp.model.QuoteProvider

class QuoteViewModel: ViewModel() {
    // lo metemos en un MutableLiveData porque el valor de dentro va a ir cambiando
    val quoteModel = MutableLiveData<QuoteModel>()

    fun randomQuote(){
        val currentQuote: QuoteModel = QuoteProvider.randomPosition()

        //el método postValue le dice a la val de quoteModel que han habido cambios y los actualiza
        quoteModel.postValue(currentQuote)
    }

}