package com.example.lesson1.domain.use_cases

import com.example.lesson1.domain.model.NoteModel
import com.example.lesson1.domain.repository.NoteRepository


class AddNoteModelUseCase(private val noteRepository: NoteRepository){

    fun addNote(noteModel : NoteModel) = noteRepository.addNote(noteModel)

}