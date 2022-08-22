package com.example.lesson1.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.lesson1.NOTE_DATA_BASE

@Entity(tableName = NOTE_DATA_BASE)
data class NoteEntity(
    @PrimaryKey(autoGenerate = true)
    val idn: Long,
    val title:String,
    val description: String,
    val date : String
)
