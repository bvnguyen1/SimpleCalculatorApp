package com.bignerdranch.android.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var answerField: TextView
    private lateinit var resetButton: Button
    private lateinit var dotButton: Button
    private lateinit var zeroButton: Button
    private lateinit var oneButton: Button
    private lateinit var twoButton: Button
    private lateinit var threeButton: Button
    private lateinit var fourButton: Button
    private lateinit var fiveButton: Button
    private lateinit var sixButton: Button
    private lateinit var sevenButton: Button
    private lateinit var eightButton: Button
    private lateinit var nineButton: Button
    private lateinit var divideButton: Button
    private lateinit var multiplyButton: Button
    private lateinit var subtractButton: Button
    private lateinit var plusButton: Button
    private lateinit var equalButton: Button
    var numberStr = "0"
    var operationClicked = false;
    var equalClicked = false;
    var divide = false;
    var multiply = false;
    var subtract = false;
    var plus = false;
    var num1 = -1.8293
    var num2 = -1.234567

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Set Default
        initilizeButton()

        resetButton.setOnClickListener { view: View ->
            resetButtonsToDefault()
            enableAllButtons()
        }
        dotButton.setOnClickListener { view: View ->
            if (operationClicked) {
                numberStr = "0"
                operationClicked = false;
            }else if (equalClicked){
                resetButtonsToDefault()
            }
            if (!numberStr.contains('.'))
                numberStr = numberStr + "."
            answerField.text = numberStr
        }
        zeroButton.setOnClickListener { view: View ->
            if (operationClicked) {
                numberStr = "0"
                operationClicked = false;
            }else if (equalClicked){
                resetButtonsToDefault()
            }
            if (numberStr == "0")
                numberStr = "0"
            else
                numberStr = numberStr + "0"
            answerField.text = numberStr
        }
        oneButton.setOnClickListener { view: View ->
            if (operationClicked) {
                numberStr = "0"
                operationClicked = false;
            }else if (equalClicked){
                resetButtonsToDefault()
            }
            if (numberStr == "0")
                numberStr = "1"
            else
                numberStr = numberStr + "1"
            answerField.text = numberStr
        }
        twoButton.setOnClickListener { view: View ->
            if (operationClicked) {
                numberStr = "0"
                operationClicked = false;
            }else if (equalClicked){
                resetButtonsToDefault()
            }
            if (numberStr == "0")
                numberStr = "2"
            else
                numberStr = numberStr + "2"
            answerField.text = numberStr
        }
        threeButton.setOnClickListener { view: View ->
            if (operationClicked) {
                numberStr = "0"
                operationClicked = false;
            }else if (equalClicked){
                resetButtonsToDefault()
            }
            if (numberStr == "0")
                numberStr = "3"
            else
                numberStr = numberStr + "3"
            answerField.text = numberStr
        }
        fourButton.setOnClickListener { view: View ->
            if (operationClicked) {
                numberStr = "0"
                operationClicked = false;
            }else if (equalClicked){
                resetButtonsToDefault()
            }
            if (numberStr == "0")
                numberStr = "4"
            else
                numberStr = numberStr + "4"
            answerField.text = numberStr
        }
        fiveButton.setOnClickListener { view: View ->
            if (operationClicked) {
                numberStr = "0"
                operationClicked = false;
            }else if (equalClicked){
                resetButtonsToDefault()
            }
            if (numberStr == "0")
                numberStr = "5"
            else
                numberStr = numberStr + "5"
            answerField.text = numberStr
        }
        sixButton.setOnClickListener { view: View ->
            if (operationClicked) {
                numberStr = "0"
                operationClicked = false;
            }else if (equalClicked){
                resetButtonsToDefault()
            }
            if (numberStr == "0")
                numberStr = "6"
            else
                numberStr = numberStr + "6"
            answerField.text = numberStr
        }
        sevenButton.setOnClickListener { view: View ->
            if (operationClicked) {
                numberStr = "0"
                operationClicked = false;
            }else if (equalClicked){
                resetButtonsToDefault()
            }
            if (numberStr == "0")
                numberStr = "7"
            else
                numberStr = numberStr + "7"
            answerField.text = numberStr
        }
        eightButton.setOnClickListener { view: View ->
            if (operationClicked) {
                numberStr = "0"
                operationClicked = false;
            }else if (equalClicked){
                resetButtonsToDefault()
            }
            if (numberStr == "0")
                numberStr = "8"
            else
                numberStr = numberStr + "8"
            answerField.text = numberStr
        }
        nineButton.setOnClickListener { view: View ->
            if (operationClicked) {
                numberStr = "0"
                operationClicked = false;
            }else if (equalClicked){
                resetButtonsToDefault()
            }
            if (numberStr == "0")
                numberStr = "9"
            else
                numberStr = numberStr + "9"
            answerField.text = numberStr
        }

        // Operator event handling
        divideButton.setOnClickListener { view: View ->
            // do the calculation
            equalButtonIsPressed()
            divide = true
            multiply = false
            subtract = false
            plus = false
            operationClicked = true

        }
        multiplyButton.setOnClickListener { view: View ->
            // do the calculation
            equalButtonIsPressed()
            multiply = true
            divide = false
            subtract = false
            plus = false
            operationClicked = true
        }
        subtractButton.setOnClickListener { view: View ->
            // do the calculation
            equalButtonIsPressed()
            plus = false
            divide = false
            multiply = false
            subtract = true
            operationClicked = true
        }
        plusButton.setOnClickListener { view: View ->
            equalButtonIsPressed()
            plus = true
            divide = false
            multiply = false
            subtract = false
            operationClicked = true
        }
        equalButton.setOnClickListener { view: View ->
            equalButtonIsPressed()
            equalClicked = true;
        }
    }


    fun resetButtonsToDefault() {
        operationClicked = false;
        numberStr = "0"
        num1 = -1.8293
        num2 = -1.234567
        answerField.text = numberStr
        divide = false
        multiply = false
        subtract = false
        plus = false
        equalClicked = false;
    }

    var answer = 0.0
    fun equalButtonIsPressed(){
        if (num1 == -1.8293) {
            num1 = numberStr.toDouble()
            answer = num1
        }
        else
            num2 = numberStr.toDouble()

        if (plus)
            answer = num1 + num2
        else if (subtract)
            answer = num1 - num2
        else if (multiply)
            answer = num1 * num2

        numberStr = answer.toString()
        if (divide)
            if (num2== 0.0){
                numberStr = "ERROR"
                // disable all button
                disableAllButtons()
            }else if(num1 == 0.0){
                answer = 0.0
            }else {
                answer = num1 / num2
                numberStr = answer.toString()
            }
        answerField.text = numberStr
        num1 = answer
        num2 = -1.234567
        divide = false
        multiply = false
        subtract = false
        plus = false
        numberStr = "0"
    }

    fun disableAllButtons() {
        equalButton.setEnabled(false)
        divideButton.setEnabled(false)
        multiplyButton.setEnabled(false)
        subtractButton.setEnabled(false)
        plusButton.setEnabled(false)
        dotButton.setEnabled(false)
        zeroButton.setEnabled(false)
        oneButton.setEnabled(false)
        twoButton.setEnabled(false)
        threeButton.setEnabled(false)
        fourButton.setEnabled(false)
        fiveButton.setEnabled(false)
        sixButton.setEnabled(false)
        sevenButton.setEnabled(false)
        eightButton.setEnabled(false)
        nineButton.setEnabled(false)
    }

    fun enableAllButtons(){
        equalButton.setEnabled(true)
        divideButton.setEnabled(true)
        multiplyButton.setEnabled(true)
        subtractButton.setEnabled(true)
        plusButton.setEnabled(true)
        dotButton.setEnabled(true)
        zeroButton.setEnabled(true)
        oneButton.setEnabled(true)
        twoButton.setEnabled(true)
        threeButton.setEnabled(true)
        fourButton.setEnabled(true)
        fiveButton.setEnabled(true)
        sixButton.setEnabled(true)
        sevenButton.setEnabled(true)
        eightButton.setEnabled(true)
        nineButton.setEnabled(true)
    }

    fun initilizeButton() {
        answerField = findViewById(R.id.answer_field) as TextView
        resetButton = findViewById(R.id.reset_button) as Button
        dotButton = findViewById(R.id.dot_button) as Button
        zeroButton = findViewById(R.id.zero_button) as Button
        oneButton = findViewById(R.id.one_button) as Button
        twoButton = findViewById(R.id.two_button) as Button
        threeButton = findViewById(R.id.three_button) as Button
        fourButton = findViewById(R.id.four_button) as Button
        fiveButton = findViewById(R.id.five_button) as Button
        sixButton = findViewById(R.id.six_button) as Button
        sevenButton = findViewById(R.id.seven_button) as Button
        eightButton = findViewById(R.id.eight_button) as Button
        nineButton = findViewById(R.id.nine_button) as Button
        divideButton = findViewById(R.id.divide_button) as Button
        multiplyButton = findViewById(R.id.multiply_button) as Button
        subtractButton = findViewById(R.id.subtract_button) as Button
        plusButton = findViewById(R.id.plus_button) as Button
        equalButton = findViewById(R.id.equal_button) as Button
    }
}