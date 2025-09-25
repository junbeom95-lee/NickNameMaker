package com.hello;

import java.util.Random;

public class Main {

    private String[] data1 = {"기절초풍", "멋있는", "재미있는"};
    private String[] data2 = {"도전적인", "노란색의", "바보같은"};
    private String[] data3 = {"돌고래", "개발자", "오랑우탄"};

    public static void main(String[] args) {
        Main makeNickName = new Main();
        String nickName = makeNickName.makeNickName();
        System.out.println(nickName);
    }

    public String makeNickName() {
        Random random = new Random();
        String part1 = data1[random.nextInt(data1.length)];
        String part2 = data2[random.nextInt(data2.length)];
        String part3 = data3[random.nextInt(data3.length)];

        return part1 + " " + part2 + " " + part3;
    }
}