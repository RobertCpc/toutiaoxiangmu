package com.nowcoder;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class test1 {
    /**
     * 重写基本的打印
     * @param index
     * @param obj
     */
    public static void print(int index, Object obj) {
        System.out.println(String.format("{%d}, %s", index, obj.toString()));
    }
    public static void testFor() {
        String str = "hello my baby";
        for(char i : str.toCharArray()) {
            print(2, i);
        }
    }

    public static void testList() {
        List<String> strList = new ArrayList<String>();
        for(int i=1; i < 4; i++) {
            strList.add(String.valueOf(i));
        }

        List<String> strListB = new ArrayList<String>();
        for(int i=1; i < 5; i++) {
            strListB.add(String.valueOf(i*3));
        }
        List<Integer> inList = new ArrayList<Integer>();
        for(int i=1; i < 17; i++) {
            inList.add(i);
        }
        print(3, strList);
        strList.addAll(strListB);
        print(3, strList);

        print(4,strList.get(2));
        strList.remove(String.valueOf(1));
        print(5,strList);
        strList.remove(2);
        print(6, strList);
        strList.add("25");
        strList.add(String.valueOf(30));
        print(6, strList);
        Collections.sort(strList);
        print(7, strList);
        Collections.sort(strList, new Comparator<String>() {
            @Override
            //内部匿名类
            public int compare(String o1, String o2) {
                return Integer.parseInt(o1)-Integer.parseInt(o2);
            }
        });
        print(8, strList);
        Collections.reverse(strList);
        print(9, strList);
        print(10,inList);
        Collections.sort(inList);
        Collections.sort(inList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        print(11, inList);
    }
    private static void testDate() {
        Date date = new Date();
        print(1, date);
        print(2, date.getTime());
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        print(3,df.format(date));
        print(4,UUID.randomUUID());
    }
    public static void main(String[] args) {
        //System.out.printf("hello word!");
        //print(1,"nihao");
        // testFor();
        //testList();
        testDate();
    }
}
