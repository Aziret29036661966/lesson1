package com.example.lesson1.data.mapper

import com.example.lesson1.data.dao.DAO
import com.example.lesson1.data.model.NoteEntity
import com.example.lesson1.domain.model.NoteModel

class NoteMapper {

    fun noteToNoteEntity(noteModel: NoteModel) =
            NoteEntity(idn = noteModel.id,
            title = noteModel.title,
            description = noteModel.description,
            date = noteModel.date)

    fun noteEntityToNoteModel(noteEntity: NoteEntity) =
        NoteModel(id = noteEntity.idn,
            title = noteEntity.title,
            description = noteEntity.description,
            date = noteEntity.date)


}