package com.zairebryant.selfpromo

import android.view.View

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.zairebryant.selfpromo.database.AllMessagesEntity
import com.zairebryant.selfpromo.databinding.ActivityInfoBinding.inflate
import com.zairebryant.selfpromo.databinding.ActivityMessageViewItemBinding


class MessageAdapter(dataSet: Array<AllMessagesEntity>): RecyclerView.Adapter<MessageAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private var textViewContactName: TextView
        private var textViewMessage: TextView

        init{

            textViewContactName = view.findViewById(R.id.text_view_contact_name)
            textViewMessage = view.findViewById(R.id.text_view_message_view_holder)


        }


    }


    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.activity_message_view_item,viewGroup,false)


        return ViewHolder(view)
    }













    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}