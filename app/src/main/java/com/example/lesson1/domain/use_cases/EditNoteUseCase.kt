package com.example.lesson1.domain.use_cases

import com.example.lesson1.domain.model.NoteModel
import com.example.lesson1.domain.repository.NoteRepository

class EditNoteUseCase(private val noteRepository: NoteRepository) {

    fun editNote(noteModel: NoteModel) = noteRepository.editNote(0, noteModel)

}