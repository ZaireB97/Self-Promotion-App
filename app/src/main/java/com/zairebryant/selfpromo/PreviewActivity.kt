package com.zairebryant.selfpromo

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_preview.*
import java.io.Serializable

class PreviewActivity : AppCompatActivity() {


    lateinit var message:Message
    lateinit var messagePreviewText:String


    @RequiresApi(33)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preview)

        setUpButton()
        val messagePreviewText: String = displayMessage()
        text_view_message.text = messagePreviewText









    }

    @RequiresApi(33)
    private fun displayMessage(): String {
        message = intent.getSerializableExtra("Message", Message::class.java) as Message
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
        send_message_button.setOnClickListener{
            //Send Message Intent

            val intent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("sms:to ${message.contactNumber}")// ensures that only sms apps respond
                putExtra("sms_body",messagePreviewText)
            }

            startActivity(intent)
            }
        }

    }
