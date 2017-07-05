package jp.techacademy.taison.yanai.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;   //ここを追加

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int drink = 1;

        switch (drink) {
            case 0:
                Log.d("javatest", "aaaa");
                break;
            case 1:
                Log.d("javatest", "bbbb");
                break;
            case 2:
                Log.d("javatest", "cccc");
                break;
            default:
                Log.d("javatest", "dddd");
                break;
        }
    }
}
