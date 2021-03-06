package com.example.tictac

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var button1: Button
    private lateinit var button2: Button
    private lateinit var button3: Button
    private lateinit var button4: Button
    private lateinit var button5: Button
    private lateinit var button6: Button
    private lateinit var button7: Button
    private lateinit var button8: Button
    private lateinit var button9: Button
    private lateinit var buttonA: Button
    private lateinit var Fpoints: TextView
    private lateinit var Spoints: TextView
    private lateinit var ResetTheScore: Button

    private var activePlayer= 1

    private var firstPlayer = ArrayList<Int>()
    private var secondPlayer = ArrayList<Int>()

    private var points1 = 0
    private var points2 = 0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()

    }

    override fun onClick(clickedView: View?) {

        if (clickedView is Button){

            var buttonNumber = 0

            when(clickedView.id){

                R.id.button1 -> buttonNumber = 1
                R.id.button2 -> buttonNumber = 2
                R.id.button3 -> buttonNumber = 3
                R.id.button4 -> buttonNumber = 4
                R.id.button5 -> buttonNumber = 5
                R.id.button6 -> buttonNumber = 6
                R.id.button7 -> buttonNumber = 7
                R.id.button8 -> buttonNumber = 8
                R.id.button9 -> buttonNumber = 9


            }

            if(buttonNumber != 0){
                playGame(clickedView, buttonNumber)

            }
            if(clickedView == buttonA){
                refreshBoard_pointAdd(clickedView)
            }
            if(clickedView == ResetTheScore){
                scoreReset()
            }
        }

    }

    private fun disable(){ //???????????????????????? ????????? ?????? ???????????????????????? ????????? ????????????????????? ?????? ???????????? disable()-??? ?????????????????????.?????????????????????????????? ?????????????????????,????????? ?????? ??????????????????
        button1.isEnabled = false
        button2.isEnabled = false
        button3.isEnabled = false
        button4.isEnabled = false
        button5.isEnabled = false
        button6.isEnabled = false
        button7.isEnabled = false
        button8.isEnabled = false
        button9.isEnabled = false
    }

    private fun scoreReset(){ //???????????????????????? ?????????????????????
        points1 = 0
        points2 = 0

        Fpoints.text = points1.toString()
        Spoints.text = points2.toString()

    }



    private fun refreshBoard_pointAdd(clickedView: Button){ //??????????????? ?????????????????????????????? 
        if(clickedView == buttonA){
            button1.text = ""
            button1.setBackgroundColor(Color.BLUE)
            button1.isEnabled = true

            button2.text = ""
            button2.setBackgroundColor(Color.BLUE)
            button2.isEnabled = true

            button3.text = ""
            button3.setBackgroundColor(Color.BLUE)
            button3.isEnabled = true

            button4.text = ""
            button4.setBackgroundColor(Color.BLUE)
            button4.isEnabled = true

            button5.text = ""
            button5.setBackgroundColor(Color.BLUE)
            button5.isEnabled = true

            button6.text = ""
            button6.setBackgroundColor(Color.BLUE)
            button6.isEnabled = true

            button7.text = ""
            button7.setBackgroundColor(Color.BLUE)
            button7.isEnabled = true

            button8.text = ""
            button8.setBackgroundColor(Color.BLUE)
            button8.isEnabled = true

            button9.text = ""
            button9.setBackgroundColor(Color.BLUE)
            button9.isEnabled = true

            activePlayer = 1

            firstPlayer.clear()
            secondPlayer.clear()

            



        }

    }

    private fun playGame(clickedView: Button, buttonNumber: Int) {

        if(activePlayer == 1){

            clickedView.text = "x"
            clickedView.setBackgroundColor(Color.DKGRAY)
            activePlayer = 2
            firstPlayer.add(buttonNumber)



        }
        else {
            clickedView.text = "O"
            clickedView.setBackgroundColor(Color.LTGRAY)
            activePlayer = 1
            secondPlayer.add(buttonNumber)


        }

        clickedView.isEnabled = false
        check()
    }

    private fun check() {
        var winnerPlayer = 0

        if (firstPlayer.contains(1) && firstPlayer.contains(2) && firstPlayer.contains(3)){
            winnerPlayer = 1
        }
        if (firstPlayer.contains(4) && firstPlayer.contains(5) && firstPlayer.contains(6)){
            winnerPlayer = 1
        }
        if (firstPlayer.contains(7) && firstPlayer.contains(8) && firstPlayer.contains(9)){
            winnerPlayer = 1
        }
        if (firstPlayer.contains(1) && firstPlayer.contains(4) && firstPlayer.contains(7)){
            winnerPlayer = 1
        }
        if (firstPlayer.contains(2) && firstPlayer.contains(5) && firstPlayer.contains(8)){
            winnerPlayer = 1
        }
        if (firstPlayer.contains(3) && firstPlayer.contains(6) && firstPlayer.contains(9)){
            winnerPlayer = 1
        }
        if (firstPlayer.contains(1) && firstPlayer.contains(5) && firstPlayer.contains(9)){
            winnerPlayer = 1
        }
        if (firstPlayer.contains(3) && firstPlayer.contains(5) && firstPlayer.contains(7)){
            winnerPlayer = 1
        }
        if (secondPlayer.contains(1) && secondPlayer.contains(2) && secondPlayer.contains(3)){
            winnerPlayer = 2
        }
        if (secondPlayer.contains(4) && secondPlayer.contains(5) && secondPlayer.contains(6)){
            winnerPlayer = 2
        }
        if (secondPlayer.contains(7) && secondPlayer.contains(8) && secondPlayer.contains(9)){
            winnerPlayer = 2
        }
        if (secondPlayer.contains(1) && secondPlayer.contains(4) && secondPlayer.contains(7)){
            winnerPlayer = 2
        }
        if (secondPlayer.contains(2) && secondPlayer.contains(5) && secondPlayer.contains(8)){
            winnerPlayer = 2
        }
        if (secondPlayer.contains(3) && secondPlayer.contains(6) && secondPlayer.contains(9)){
            winnerPlayer = 2
        }
        if (secondPlayer.contains(1) && secondPlayer.contains(5) && secondPlayer.contains(9)){
            winnerPlayer = 2
        }
        if (secondPlayer.contains(3) && secondPlayer.contains(5) && secondPlayer.contains(7)){
            winnerPlayer = 2
        }
        if (!(button1.isEnabled) && !(button2.isEnabled) && !(button3.isEnabled) && !(button4.isEnabled) && !(button5.isEnabled) && !(button6.isEnabled) && !(button7.isEnabled) && !(button8.isEnabled) && !(button9.isEnabled)) {
            if (123 !in secondPlayer && 456 !in secondPlayer && 789 !in secondPlayer && 147 !in secondPlayer && 258 !in secondPlayer && 369 !in secondPlayer && 159 !in secondPlayer && 357 !in secondPlayer){
            winnerPlayer = 3
            }
        }
        

        if (!(button1.isEnabled) && !(button2.isEnabled) && !(button3.isEnabled) && !(button4.isEnabled) && !(button5.isEnabled) && !(button6.isEnabled) && !(button7.isEnabled) && !(button8.isEnabled) && !(button9.isEnabled)) {
            if (123 !in secondPlayer && 456 !in secondPlayer && 789 !in secondPlayer && 147 !in secondPlayer && 258 !in secondPlayer && 369 !in secondPlayer && 159 !in secondPlayer && 357 !in secondPlayer){
            winnerPlayer = 3
            }
        }
        

        if (winnerPlayer == 1){
            Toast.makeText(this,"FIRST PLAYER WON", Toast.LENGTH_SHORT).show()
            disable()
            points1 += 1
            Fpoints.text = points1.toString()
            Spoints.text = points2.toString()




        }
        if (winnerPlayer == 2){
            Toast.makeText(this,"SECOND PLAYER WON", Toast.LENGTH_SHORT).show()
            disable()
            points2 += 1
            Fpoints.text = points1.toString()
            Spoints.text = points2.toString()



        }
        if (winnerPlayer == 3){
            Toast.makeText(this,"Draw", Toast.LENGTH_SHORT).show()
            disable()



        }


    }

    private fun init(){

        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)
        button4 = findViewById(R.id.button4)
        button5 = findViewById(R.id.button5)
        button6 = findViewById(R.id.button6)
        button7 = findViewById(R.id.button7)
        button8 = findViewById(R.id.button8)
        button9 = findViewById(R.id.button9)
        buttonA = findViewById(R.id.ButtonReset)
        Fpoints = findViewById(R.id.firstPoints)
        Spoints = findViewById(R.id.secondPoints)
        ResetTheScore = findViewById(R.id.ButtonResetScore)



        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
        button5.setOnClickListener(this)
        button6.setOnClickListener(this)
        button7.setOnClickListener(this)
        button8.setOnClickListener(this)
        button9.setOnClickListener(this)
        buttonA.setOnClickListener(this)
        ResetTheScore.setOnClickListener(this)


    }
}
