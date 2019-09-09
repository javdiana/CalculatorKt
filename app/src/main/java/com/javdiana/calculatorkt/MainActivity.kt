package com.javdiana.calculatorkt

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var number: EditText? = null
    private var listener: View.OnClickListener? = null

    private lateinit var numb: Numb


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        number = findViewById(R.id.editText_number)
        numb = Numb()

        listener = View.OnClickListener {
            numb.num1 = number?.text.toString().toFloat()
            when (it.id) {
                R.id.button_sum -> {
                    numb.operation = '+'
                    number?.setText("")
                }
                R.id.button_subst -> {
                    numb.operation = '-'
                    number?.setText("")
                }
                R.id.button_mult -> {
                    numb.operation = '*'
                    number?.setText("")
                }
                R.id.button_div -> {
                    numb.operation = '/'
                    number?.setText("")
                }
            }
        }

        val listener2 = View.OnClickListener {
            numb.num2 = number?.text.toString().toFloat()
            number?.setText(calculate(numb).toString())
        }

        val btnSum: Button = findViewById(R.id.button_sum)
        btnSum.setOnClickListener(listener)

        val btnSub: Button = findViewById(R.id.button_subst)
        btnSub.setOnClickListener(listener)

        val btnMul: Button = findViewById(R.id.button_mult)
        btnMul.setOnClickListener(listener)

        val btnDiv: Button = findViewById(R.id.button_div)
        btnDiv.setOnClickListener(listener)

        val btnRes: Button = findViewById(R.id.button_result)
        btnRes.setOnClickListener(listener2)

    }
}
