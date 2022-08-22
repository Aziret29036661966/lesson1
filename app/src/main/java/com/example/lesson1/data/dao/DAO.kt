package com.example.lesson1.data.dao

import androidx.room.*
import com.example.lesson1.data.model.NoteEntity

@Dao
interface DAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addNote(noteEntity: NoteEntity)

   // @Query("DELETE FROM note_db WHERE idn = :id")
    //suspend fun deleteNote(id:Long)

    @Delete
    suspend fun deleteNote(noteEntity: NoteEntity)

}