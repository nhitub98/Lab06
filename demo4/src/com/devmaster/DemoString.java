package com.devmaster;

import java.util.ArrayList;
import java.util.List;

public class DemoString {
    public static void main(String[] args) {
//        String a="Abc";
//        String b="BGD";
//        System.out.println(a.charAt(1)); //In ra kí tự thứ 1
////        System.out.println(a.concat(b)); //cộng chuỗi
//        System.out.println(a.compareTo(b)); //so sánh chuỗi
//        String text="Hello";
//        System.out.println(text.charAt(1));
//        System.out.println(text.indexOf("e")); //Kiểm tra chuỗi nằm trong vị trí thứ mấy
//    }

            List<String> list=new ArrayList<>();
            list.add("a");
            list.add("b");
            list.add("c");

//            for(int i=0; i< list.size();i++){
//            System.out.println(list.get(i));
        //for-each
        for(String s:list){
            System.out.println(s);
            }
        //lamda
        list.forEach(s -> System.out.println(s));

        }

}
