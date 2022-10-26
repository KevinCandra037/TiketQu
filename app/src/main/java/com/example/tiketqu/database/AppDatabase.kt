package com.example.tiketqu.database

import androidx.room.Database
import com.example.tiketqu.model.ModelDatabase
import androidx.room.RoomDatabase
import com.example.tiketqu.database.dao.DatabaseDao

@Database(entities = [ModelDatabase::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun databaseDao(): DatabaseDao?
}