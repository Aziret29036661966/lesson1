package com.example.lesson1.data.repo


import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import com.example.lesson1.App
import com.example.lesson1.data.mapper.NoteMapper

import com.example.lesson1.domain.model.NoteModel
import com.example.lesson1.domain.repository.NoteRepository
import com.example.lesson1.utils.Resource

import kotlinx.coroutines.Dispatchers

class NoteRepoImp() : NoteRepository {

    private val dao = App.dao
    private val noteMapper = NoteMapper()

    override fun addNote(add: NoteModel): LiveData<Resource<Unit>> = liveData(Dispatchers.IO) {
        dao.addNote(noteMapper.noteToNoteEntity(add))
    }

    override fun getAllList(): List<NoteModel> {
        TODO("Not yet implemented")
    }

    override fun deleteNote(noteModel: NoteModel) {
        TODO("Not yet implemented")
    }

    override fun editNote(id: Int, noteModel: NoteModel) {
        TODO("Not yet implemented")
    }


}