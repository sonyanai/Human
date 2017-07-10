package jp.techacademy.taison.yanai.javalog;
import android.util.Log;

/**
 * Created by taiso on 2017/07/09.
 */

class Human extends Animal implements Thinkable {
    public String hobby =new String("aaa");

    public Human(String name , int age) {
        this.name = name;
        this.age = age;
    }
    public void say() {
        Log.d( "javatest" , "私の名前は" + this.name + "です。年は" + this.age + "歳です。" );
    }
    @Override
    public void think() {
        Log.d( "javatest" , "私は" + hobby + "について考える" );
    }
}
