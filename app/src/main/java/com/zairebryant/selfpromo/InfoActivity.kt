package com.zairebryant.selfpromo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import com.zairebryant.selfpromo.databinding.ActivityInfoBinding
import com.zairebryant.selfpromo.databinding.ActivityInfoBinding.inflate


class InfoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityInfoBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = inflate(layoutInflater)
        val myView = binding.root
        setContentView(myView)

        binding.buttonPreview.setOnClickListener {

            onPreviewClicked()
        }

        val spinnerValues: Array<String> = arrayOf("Android Developer", "Android Engineer")

        val spinnerAdapter =
            ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, spinnerValues)

        val spinnerDropDown = findViewById<Spinner>(R.id.spinner_drop_down)
        spinnerDropDown.adapter = spinnerAdapter
    }


    private fun onPreviewClicked() {


        val message = Message(
            binding.editTextContactName.text.toString(),
            binding.editTextContactNumber.text.toString(),
            binding.editTextMyDisplayName.text.toString(),
            binding.checkBoxJunior.isChecked,
            binding.spinnerDropDown.selectedItem?.toString(),
            binding.checkBoxImmediateStart.isChecked,
            binding.editTextAvailableFromDate.text.toString()


        )


        val previewActivityIntent = Intent(this,PreviewActivity::class.java)

        previewActivityIntent.putExtra("Message",message)

        startActivity(previewActivityIntent)


    }
}