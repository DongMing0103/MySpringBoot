package com.example.demo.collection;
/**
  * @author dongm
  * @date 2023/9/1
  * 
  */
public class StaticTest {
    static int x=1;
    int y;
    StaticTest()
    {y++;}

    public static void main(String[] args){
        StaticTest st = new StaticTest();
            System. out.println("x="+x);
            System. out.println("st.y="+st.y);
            st = new StaticTest();
            System. out.println("st.y="+st.y);
    }
    static {x++;}
}
