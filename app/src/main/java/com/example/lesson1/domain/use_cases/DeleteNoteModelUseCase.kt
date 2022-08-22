package com.example.lesson1.domain.use_cases

import com.example.lesson1.domain.model.NoteModel
import com.example.lesson1.domain.repository.NoteRepository

class DeleteNoteModelUseCase(private val noteRepository:NoteRepository) {

    fun deleteNote(noteModel: NoteModel) = noteRepository.deleteNote(noteModel)

}