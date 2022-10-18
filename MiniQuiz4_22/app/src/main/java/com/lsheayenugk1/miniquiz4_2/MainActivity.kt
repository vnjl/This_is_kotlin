package com.lsheayenugk1.miniquiz4_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lsheayenugk1.miniquiz4_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy{ActivityMainBinding.inflate(layoutInflater)}

    var apple = false
    var banana = false
    var orange = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setCeontentView(binding.root)

        binding.checkApple.setOnCheckedChageListener { buttonView, isChecked ->
            apple = isChecked
            printCheckedItems()
        }
        binding.checkBanana.setOnCheckedChageListener { buttonView, isChecked ->
            apple = isChecked
            printCheckedItems()
        }
        binding.checkOrange.setOnCheckedChageListener { buttonView, isChecked ->
            apple = isChecked
            printCheckedItems()
        }

    }

    fun printCheckedItems(){
        var result = ""
        if(apple) result = " 사과"

        if(banana) {
            if(result.isNotEmpty()) result += "와"
            result += " 바나나"
        }
        if(orange) {
            if (result.isNotEmpty()) result += "와"
            result += " 오렌지"
        }else {
            binding.textView.text = "선택되지 않았습니다."
        }
    }
}