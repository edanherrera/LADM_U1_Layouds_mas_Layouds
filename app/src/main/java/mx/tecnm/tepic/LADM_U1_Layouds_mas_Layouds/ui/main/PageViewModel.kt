package mx.tecnm.tepic.LADM_U1_Layouds_mas_Layouds.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class PageViewModel : ViewModel() {

    private val _index = MutableLiveData<Int>()
    val text: LiveData<String> = Transformations.map(_index) {
        "Animal #$it"
    }

    fun setIndex(index: Int) {
        _index.value = index
    }
}