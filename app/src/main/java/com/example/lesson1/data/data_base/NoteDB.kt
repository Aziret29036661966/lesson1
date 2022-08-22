package com.example.lesson1.data.data_base

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.lesson1.data.dao.DAO
import com.example.lesson1.data.model.NoteEntity

@Database(entities = [NoteEntity::class], version = 1)
abstract class NoteDB: RoomDatabase() {

        abstract fun noteDao(): DAO
}