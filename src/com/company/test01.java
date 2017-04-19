package com.company;

/**
 * Created by usr0200547 on 2017/04/18.
 */
public class test01 {
    String name;
    //コンストラクタ
    public test01(){
        System.out.println(
                "コンストラクタ"
        );
    }
    public test01(String name){
        this.name = name;
    }
    //インスタンスのメソッド
    public void play(){
        System.out.println("instance ok¥n");
    }
    public static void listen(){
        String wav = "static can use";
        System.out.println(wav);
    }
}
