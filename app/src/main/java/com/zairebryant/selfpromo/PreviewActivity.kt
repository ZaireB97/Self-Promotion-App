package com.zairebryant.selfpromo


import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.room.Room
import com.zairebryant.selfpromo.databinding.ActivityMainBinding

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import com.zairebryant.selfpromo.databinding.ActivityPreviewBinding


class PreviewActivity : AppCompatActivity() {


    private lateinit var binding: ActivityPreviewBinding
    lateinit var message:Message
    lateinit var messagePreviewText:String


    @RequiresApi(33)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityPreviewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpButton()
        val messagePreviewText: String = displayMessage()
        binding.textViewMessage.text = messagePreviewText






















    }

    @RequiresApi(33)
    private fun displayMessage(): String {

        message = intent.getSerializableExtra("Message") as Message
        messagePreviewText = """
                Hello ${message.contactName},
                
                My name is ${message.myDisplayName} and I am ${message.getFullJobDescription()}.
                
                I have a portfolio of apps to demonstrate my technical skills that I can show on request.
                
                I am able to start a new position ${message.getAvailability()}.
                
                Please get in touch if  you have any suitable roles for me.
                
                Thanks and best regards.
               
            """.trimIndent()

        return messagePreviewText
    }

    private fun setUpButton(){
        binding.sendMessageButton.setOnClickListener(){
            //Send Message Intent

            val intent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("sms:to ${message.contactNumber}")// ensures that only sms apps respond
                putExtra("sms_body",messagePreviewText)
            }

            startActivity(intent)
            }
        }

    @RequiresApi(33)
    private fun addToDatabase(newMessage:String){

        message = intent.getSerializableExtra("Message") as Message



        GlobalScope.launch{



        }
    }

    }
