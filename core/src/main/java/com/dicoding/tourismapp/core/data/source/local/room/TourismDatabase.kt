package com.dicoding.tourismapp.core.data.source.local.room

import android.content.Context

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [com.dicoding.tourismapp.core.data.source.local.entity.TourismEntity::class], version = 1, exportSchema = false)
abstract class TourismDatabase : RoomDatabase() {

    abstract fun tourismDao(): com.dicoding.tourismapp.core.data.source.local.room.TourismDao

    companion object {
        @Volatile
        private var INSTANCE: com.dicoding.tourismapp.core.data.source.local.room.TourismDatabase? = null

        fun getInstance(context: Context): com.dicoding.tourismapp.core.data.source.local.room.TourismDatabase =
            com.dicoding.tourismapp.core.data.source.local.room.TourismDatabase.Companion.INSTANCE ?: synchronized(this) {
            val instance = Room.databaseBuilder(
                context.applicationContext,
                com.dicoding.tourismapp.core.data.source.local.room.TourismDatabase::class.java,
                "Tourism.db"
            )
                .fallbackToDestructiveMigration()
                .build()
            com.dicoding.tourismapp.core.data.source.local.room.TourismDatabase.Companion.INSTANCE = instance
            instance
        }
    }
}