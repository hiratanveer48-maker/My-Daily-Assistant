package com.example.mydailyassistant.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tasks_table")
data class TaskEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    val title: String,
    val description: String,
    val category: String,
    val priority: String,
    val date: String,
    val time: String,
    val isCompleted: Boolean = false,
    val reminderTime: Long = 0L,
    val recurrence: String = "None"
)
