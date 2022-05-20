package com.example.demo.collection;

/**
 * @Author dongm
 * @Description:
 * @Date 2020/3/14
 */
public class ForDemo {

    public static void main(String[] args) {
        int i = 1;
        i = i++;
        int j = i++;
        int k = i + ++i * i++;
        System.out.println("i=" + i);
        System.out.println("j=" + j);
        System.out.println("k=" + k);
    }
}
