package jp.techacademy.taison.yanai.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;   //ここを追加

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int num = 10;
        Log.d("javatest", String.valueOf(num));       //numの表示

        num = 50;
        Log.d("javatest", String.valueOf(num));        //javatestで引っ張られる値です

        num = 10000;
        Log.d("javatest", String.valueOf(num));

        num = 90;
        Log.d("javatest",String.valueOf(num));

        String str = "aaa" + "bbb";
        Log.d("javatest",String.valueOf(str));

        Log.d("javatest","ログへの出力テスト");     //ログへの出力テストというテキストの表示
    }
}
