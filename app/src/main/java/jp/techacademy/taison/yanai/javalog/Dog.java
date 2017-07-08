package jp.techacademy.taison.yanai.javalog;

/**
 * Created by taiso on 2017/07/07.
 */
import android.util.Log;

class Dog extends Animal {
    static String to_jp ="犬";


    public Dog(String name,int age) {
        this.name = name;
        this.age = age;
    }
    public static void introduce(){
        Log.d("javatest","これは犬クラスです");
    }
    public void say(){
        Log.d("javatest",this.name + "(" +this.age+ "歳)" + "「ワンワン」");
    }

}
