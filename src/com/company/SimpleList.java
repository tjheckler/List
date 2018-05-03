package com.company;

import java.util.ArrayList;
import java.util.List;

public class SimpleList
{
    public static void main(String[]args)
    {
        SimpleList simpleList = new SimpleList();
        simpleList.demo();
    }
    private void demo()
    {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Red");
        arrayList.add("Blue");
        arrayList.add("Yellow");
        arrayList.add("Purple");
        arrayList.add("Orange");

        for (String list:arrayList)
        {
            System.out.println(list);
        }
    }
}
