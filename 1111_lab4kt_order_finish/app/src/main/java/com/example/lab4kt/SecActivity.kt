package com.example.lab4kt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.*
import android.app.Activity

class SecActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sec)
        val btn_send = findViewById<Button>(R.id.btn_send )
        val ed_drink = findViewById<EditText>(R.id.ed_drink)
        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        val radioGroup1 = findViewById<RadioGroup>(R.id.radioGroup1)

       btn_send.setOnClickListener{
           if (ed_drink.length()<1)
               Toast.makeText(this,"請輸入飲料名稱",Toast.LENGTH_SHORT).show()
           else {
               val b = Bundle()
               b.putString("drink",ed_drink.text.toString() )
               b.putString("sugar",radioGroup.findViewById<RadioButton>
                   (radioGroup.checkedRadioButtonId).text.toString())
               b.putString("ice",radioGroup1.findViewById<RadioButton>
                   (radioGroup1.checkedRadioButtonId).text.toString())
               setResult(Activity.RESULT_OK,Intent().putExtras(b))
                finish()
           }
       }

    }
}