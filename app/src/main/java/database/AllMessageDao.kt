package com.zairebryant.selfpromo.database
import androidx.room.*
import com.zairebryant.selfpromo.Message

@Dao
interface AllMessageDao {

    @Query("SELECT * FROM all_messages")
    fun getAll(): List<AllMessagesEntity>

//    @Query("SELECT * FROM all_messages WHERE contact_name")
//    fun findByName(contact_name:String):AllMessagesEntity


    @Insert
    fun insert(message:AllMessagesEntity)

    @Delete
    fun delete(message:AllMessagesEntity)

    @Update
    fun updateMessage(vararg messages: AllMessagesEntity)
}