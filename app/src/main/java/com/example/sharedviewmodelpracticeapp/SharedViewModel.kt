package com.example.sharedviewmodelpracticeapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {
    private var _note = MutableLiveData("")
    val note: LiveData<String>
        get() = _note

    fun saveNote(newText: String) {
        _note.value = newText
    }
}