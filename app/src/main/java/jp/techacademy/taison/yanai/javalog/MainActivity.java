package jp.techacademy.taison.yanai.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;   //ここを追加

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int num = 60;

        if(num >= 90){
            Log.d("javatest", "AAAA");       //numの表示
        }else if (num >= 75){
            Log.d("javatest", "BBBB");        //javatestで引っ張られる値です
        }else if(num >= 60){
            Log.d("javatest", "CCCC");
        }else{
            Log.d("javatest", "DDDD");
        }
    }
}
