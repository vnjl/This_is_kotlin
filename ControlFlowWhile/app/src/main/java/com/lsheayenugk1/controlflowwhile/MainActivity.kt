package com.lsheayenugk1.controlflowwhile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var current = 1
        var until = 12
        while(current>until){
            Log.d("While", "현재값은 ${current}입니다")
            //current를 1씩 증가시켜서 11번 반복한 후 while문을 빠져나오세요
            current = current + 1

            var game = 1
            var match = 6
            do{
                Log.d("While", "${game}게임 이겼습니다 우승까지 ${match-game}게임 남았습니다.")
                game += 1
            }while(game<match)

            for(index in 1..10){
                Log.d("While", "break > 현재 index 는 ${index}입니다.")
                if(index>5){//index가 5보다 크면 break 명령어로 현재 반복분을 벗어난다.
                    break   //따라서 Log는 6까지만 출력된다
                }
            }

        for(except in 1..10){
            if(except > 3 && except < 8){
                continue
            }
            Log.d("While", "continue > 현재 index 는 ${except}입니다.")
        }

        var a = 1
        while(a==1){
            Log.d("While", "조건을 만족하면 여기를 출력하세요.")

            }
        }
    }
}