package com.example.lesson1.domain.repository

import androidx.lifecycle.LiveData
import com.example.lesson1.domain.model.NoteModel
import com.example.lesson1.utils.Resource

interface NoteRepository {

    fun addNote(add:NoteModel) : LiveData<Resource<Unit>>

    fun getAllList(): List<NoteModel>

    fun deleteNote(noteModel: NoteModel)

    fun editNote(id: Int, noteModel: NoteModel)

}