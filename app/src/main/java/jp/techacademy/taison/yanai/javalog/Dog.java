package jp.techacademy.taison.yanai.javalog;

/**
 * Created by taiso on 2017/07/07.
 */
import android.util.Log;

class Dog {

    String name;
    int age;

    public Dog() {
        name = "";
        age = 0;
    }
    public void say(){
        Log.d("javatest",this.name + "(" +this.age+ "歳)" + "「ワンワン」");
    }

}
