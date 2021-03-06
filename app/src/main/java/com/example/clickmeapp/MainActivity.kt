package com.example.clickmeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var editText: EditText? = null
    private var button: Button? = null
    private var textView: TextView? = null

    private var numTimesClicked = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //editText= findViewById<EditText>(R.id.editTextTextPersonName)
        val userInput: EditText= findViewById<EditText>(R.id.editTextTextPersonName)
        button =findViewById<Button>(R.id.button)
        textView = findViewById<TextView>(R.id.textView)

        textView?.text = ""
        textView?.movementMethod = ScrollingMovementMethod()


        button?.setOnClickListener(object :View.OnClickListener {
            override fun onClick(p0: View?) {
                textView?.append(userInput.text)
                textView?.append("\n")
                userInput.setText("")
                //numTimesClicked +=1
               // textView?.append("\n Button got clicked $numTimesClicked time")
               // if (numTimesClicked !=1){
                    //textView?.append("s")
                //}

            }

        })
    }
}