package com.example.lab2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ed_Name = findViewById<EditText>(R.id.ed_Name)
        val tv_text = findViewById<TextView>(R.id.tv_text)
        val tv_name = findViewById<TextView>(R.id.tv_name)
        val tv_winner = findViewById<TextView>(R.id.tv_winner)
        val tv_mmora = findViewById<TextView>(R.id.tv_mmora)
        val tv_cmora = findViewById<TextView>(R.id.tv_cmora)
        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        val scissor = findViewById<RadioButton>(R.id.scissor)
        val stone = findViewById<RadioButton>(R.id.stone)
        val papper = findViewById<RadioButton>(R.id.radioButton5)
        val btn_mora = findViewById<Button>(R.id.btn_mora)
        btn_mora.setOnClickListener {
            if (ed_Name.length()<1)
                tv_text.text = "請輸入玩家姓名"
            else{
                tv_name.text = "名字\n${ed_Name.text}"

                tv_mmora.text = "我方出全\n${if(scissor.isChecked) "剪刀"
                else if
                    (stone.isChecked) "石頭"
                    
                else
                    "布"}"
                var computer =(Math.random()*3).toInt()
                tv_cmora.text = "電腦出全\n${if(computer==0) "剪刀"
                    else if
                       (computer==1) "石頭"

                    else
                        "布"}"
                //用三個判断式判断並顧示猜拳结果
                when {
                    scissor.isChecked && computer == 2 ||
                            stone.isChecked && computer == 0 ||
                            papper.isChecked && computer == 1 -> {
                        tv_winner.text = "勝利者\n${ed_Name.text}"
                        tv_text.text = "恭喜你獲勝了!!!"
                    }
                    scissor.isChecked && computer == 1 ||
                            stone.isChecked && computer == 2 ||
                            papper.isChecked && computer == 0 -> {
                        tv_winner.text = "勝利者\n電腦"
                        tv_text.text = "電腦獲勝了!!!"
                    }
                    else -> {
                        tv_winner.text = "勝利者\n平手"
                        tv_text.text = "平局請在試一次!"

                    }


                }
            }
        }

    }
}