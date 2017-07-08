package jp.techacademy.taison.yanai.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;   //ここを追加

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Dog dog = new Dog("ポチ" , 3);
        dog.move();
        dog.say();
        Log.d("javatest", "犬の名前は" + dog.name + "です");
        Log.d("javatest", "犬の年齢は" + dog.age + "歳です");

        BigDog bigdog = new BigDog("太郎",15);

        bigdog.say();
        bigdog.move();
        Log.d("javatest", "犬の名前は" + bigdog.name + "です");
        Log.d("javatest", "犬の年齢は" + bigdog.age + "歳です");
        }
    }
