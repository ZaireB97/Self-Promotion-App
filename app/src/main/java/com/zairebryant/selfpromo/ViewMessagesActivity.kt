package com.zairebryant.selfpromo


import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.room.Room
import com.zairebryant.selfpromo.database.AppDatabase
import com.zairebryant.selfpromo.databinding.ActivityViewMessagesBinding
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


class ViewMessagesActivity : AppCompatActivity() {
    private val db by lazy {  AppDatabase.invoke(this) }

    private lateinit var message:String

    @RequiresApi(33)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityViewMessagesBinding.inflate(layoutInflater)
        setContentView(binding.root)


        GlobalScope.launch{
            db.allMessagesDao().getAll()
            Log.v("ITWORKSSSITHINK", "$db")



        }
//        db.allMessagesDao().getAll()



    }


}