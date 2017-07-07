package jp.techacademy.taison.yanai.javalog;

/**
 * Created by taiso on 2017/07/07.
 */
import android.util.Log;

class Dog {

    String name;
    int age;

    public Dog(String name,int age) {
        this.name = name;
        this.age = age;
    }
    public void say(){
        Log.d("javatest",this.name + "(" +this.age+ "歳)" + "「ワンワン」");
    }

}
