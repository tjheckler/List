package com.company;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2
{
    public static void main(String[] args)
    {
        ListDemo2 listDemo2 = new ListDemo2();
        listDemo2.execute();
    }
    private void execute()
    {
        List<String> stringList = new ArrayList<>();
        stringList.add("Couch");
        stringList.add("Table");
        stringList.add("Coffee Table");
        printList(stringList);
        System.out.println();
        stringList.add("Dinning Table");
        printList(stringList);
        System.out.println();
        stringList.add(0, "Chair");
        printList(stringList);
        System.out.println();
        stringList.add(2, "Love Seat");
        printList(stringList);
        System.out.println();
        stringList.remove(stringList.size()-1);
        printList(stringList);
        System.out.println();
        stringList.remove(1);
        printList(stringList);
        System.out.println();
        stringList.remove(1);
        printList(stringList);


    }
    private void printList(List<String> arrayList)
    {
        for ( String list: arrayList)
        {
            System.out.println(list+ ":");
        }

    }
}
