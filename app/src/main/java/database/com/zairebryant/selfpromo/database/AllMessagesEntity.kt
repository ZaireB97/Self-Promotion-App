package com.zairebryant.selfpromo.database
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import com.zairebryant.selfpromo.Message
import java.util.*

@Entity(tableName = "all_messages")
data class AllMessagesEntity(@PrimaryKey(autoGenerate = true) var id: Int,

                             @ColumnInfo(name = "contact_name")var contactName:String,@ColumnInfo(name = "message")var message: String

                             )
