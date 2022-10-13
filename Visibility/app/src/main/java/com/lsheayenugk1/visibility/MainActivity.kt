package com.lsheayenugk1.visibility

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //추상 클래스 설계
        abstract class animal{
            fun walk() {
                Log.d("abstract", "걷습니다")
            }
            abstract fun move()
        }
    }
}
//구현
class Bird : Animal() {
    override fun move() {
        Log.d("abstract", "날아서 이동합니다")
    }
}
//인터페이스 설계
interface InterfaceKotlin{
    var variable : String
    fun get()
    fun set()
}
//구현
class KotlinImpl : InterfaceKotlin{
    override var variable: String = "init value"
    override fun get() {

    }
    override fun set() {
        //코드 구현
    }
}