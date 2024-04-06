package com.example.myapplication_xo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var tvText: TextView = findViewById(R.id.textView) // Хранить информацию о игроке, который сейчас делает ход
        tvText.text = "Ход игрока X"
        val xMovies = mutableListOf<Int>() //Список ходов игрока Х
        val oMovies = mutableListOf<Int>() // Список ходов игрока О
        var flMove: Char = 'X'  // Хранит значение флага игрока, делающего ход
        fun changeFlMove(z:Int){     // Меняет значение флага, и регистрирует ход
            flMove = when (flMove) {
                'X'-> 'O'
                'O'-> 'X'
                else -> 'T'
            }

            //Запись в листы игроков клеток, которые они закрасили
            if (flMove=='X') oMovies.add(z)
            else if (flMove=='O') xMovies.add(z)
            //Изменение статуса хода игроков
            tvText.text = "Ход игрока $flMove"
            Log.d("MyLogXO", "Ходы игрока Х:$xMovies \n Ходы игрока О:$oMovies")
        }




        // Кнопка 1 и ее слушатель
        var bt1: Button = findViewById(R.id.btField1)
        bt1.setOnClickListener{
            if(bt1.text=="") {
                bt1.text = flMove.toString()
                changeFlMove(1)
            }
        }
        // Кнопка 2 и ее слушатель
        var bt2: Button = findViewById(R.id.btField2)
        bt2.setOnClickListener{
            if(bt2.text=="") {
                bt2.text = flMove.toString()
                changeFlMove(2)
            }
        }
        // Кнопка 3 и ее слушатель
        var bt3: Button = findViewById(R.id.btField3)
        bt3.setOnClickListener{
            if(bt3.text==""){
                bt3.text = flMove.toString()
                changeFlMove(3)
            }
        }
        // Кнопка 4 и ее слушатель
        var bt4: Button = findViewById(R.id.btField4)
        bt4.setOnClickListener{
            if(bt4.text==""){
                bt4.text = flMove.toString()
                changeFlMove(4)
            }
        }
        // Кнопка 5 и ее слушатель
        var bt5: Button = findViewById(R.id.btField5)
        bt5.setOnClickListener{
            if(bt5.text=="") {
                bt5.text = flMove.toString()
                changeFlMove(5)
            }
        }
        // Кнопка 6 и ее слушатель
        var bt6: Button = findViewById(R.id.btField6)
        bt6.setOnClickListener{
            if(bt6.text=="") {
                bt6.text = flMove.toString()
                changeFlMove(6)
            }
        }
        // Кнопка 7 и ее слушатель
        var bt7: Button = findViewById(R.id.btField7)
        bt7.setOnClickListener{
            if(bt7.text=="") {
                bt7.text = flMove.toString()
                changeFlMove(7)
            }
        }
        // Кнопка 8 и ее слушатель
        var bt8: Button = findViewById(R.id.btField8)
        bt8.setOnClickListener{
            if(bt8.text=="") {
                bt8.text = flMove.toString()
                changeFlMove(8)
            }
        }

        // Кнопка 9 и ее слушатель
        var bt9: Button = findViewById(R.id.btField9)
        bt9.setOnClickListener{
            if(bt9.text=="") {
                bt9.text = flMove.toString()
                changeFlMove(9)
            }
        }

    }
    // Кнопка назад
    fun onClickToBack(view : View){
        setResult(RESULT_OK)
        finish()
    }
}