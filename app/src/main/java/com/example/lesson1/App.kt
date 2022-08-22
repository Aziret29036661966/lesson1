package com.example.lesson1

import android.app.Application
import androidx.room.Room
import com.example.lesson1.data.dao.DAO
import com.example.lesson1.data.data_base.NoteDB

class App : Application() {

    companion object{
        lateinit var dao: DAO
    }

    lateinit var db : NoteDB

    override fun onCreate() {
        super.onCreate()
        db = Room.databaseBuilder(
            this,
            NoteDB::class.java,
            NOTE_DATA_BASE)
            .allowMainThreadQueries()
            .build()
        dao = db.noteDao()
    }

}