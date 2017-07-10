package jp.techacademy.taison.yanai.javalog;
import android.util.Log;

/**
 * Created by taiso on 2017/07/09.
 */

class Human extends Animal implements Thinkable {
    //public String hobby =new String("趣味");



    public Human(String name , int age ,String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }
    public void say() {
        Log.d( "javatest" , "私の名前は" + this.name + "です。年は" + this.age + "歳です。" );
    }
    @Override
    public void think() {
        Log.d( "javatest" , "私nは" + this.hobby + "について考える" );
    }
}
