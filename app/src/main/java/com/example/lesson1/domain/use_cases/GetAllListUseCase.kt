package com.example.lesson1.domain.use_cases

import com.example.lesson1.domain.model.NoteModel
import com.example.lesson1.domain.repository.NoteRepository

class GetAllListUseCase(private val noteRepository: NoteRepository) {

    fun getAllNote(noteModel: NoteModel) = noteRepository.getAllList()

}