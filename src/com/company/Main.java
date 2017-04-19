package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //System.out.print("Hello world 12");
    int i = 1;
    String t = "test";
    i = i + 10;

        if (i < 12)
            System.out.println("true");
        else
            System.out.println("false");
        while (i<20){
            System.out.println(i);
            i++;
        }
        int n = average();
        System.out.println(n);
        int m = average(3);
        System.out.println(m);

        //クラスインスタンス
        test01 num = new test01();
        num.play();
        num.listen();
        test01.listen();
        //test01.play-できない
        test01 waq = new test01(name: "halo");

    }
    public static int average(){
        int ave = 0;
        return ave;
    }

    public static int average(int m){
        int ave = 0;
        return ave+m;
    }
}
