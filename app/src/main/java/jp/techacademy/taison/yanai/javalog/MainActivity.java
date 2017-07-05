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
        Log.d("javatest", String.valueOf(num));        //javatestで引っ張られる値ですよ

        int num2 = 10 + 5 - 2 * 4 / 2;
        Log.d("javatest","10 + 5 - 2 * 4 / 2 = " + String.valueOf(num2));

        boolean flag1 = true;
        boolean flag2 = false;
        Log.d("javatest","flag1 && flag2 = " + String.valueOf(flag1 && flag2));
        Log.d("javatest","flag1 || flag2 = " + String.valueOf(flag1 || flag2));

        int num3 = 10;
        int num4 = 20;
        Log.d("javatest","num3 < num4 = " + String.valueOf(num3 < num4));

        String str = "aaa" + "bbb";
        Log.d("javatest",String.valueOf(str));

        Log.d("javatest","ログへの出力テスト");     //ログへの出力テストというテキストの表示
    }
}
