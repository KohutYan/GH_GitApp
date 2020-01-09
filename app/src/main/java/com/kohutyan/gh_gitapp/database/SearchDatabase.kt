package com.kohutyan.gh_gitapp.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [SearchEntry::class],
    version = 1
)
abstract class SearchDatabase : RoomDatabase() {
    abstract fun searchDao():SearchDao

    companion object{
        @Volatile private var instance: SearchDatabase? = null
        private val LOCK = Any()

        operator fun invoke (context: Context) = instance ?: synchronized(LOCK){
            instance ?: buildDatabase(context).also { instance = it }
        }

        private fun buildDatabase(context: Context) =
            Room.databaseBuilder(context.applicationContext,
                SearchDatabase::class.java, "search.db")
                .build()
    }
}