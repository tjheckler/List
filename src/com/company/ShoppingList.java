package com.company;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ShoppingList
{
    public static void main(String[] args)
    {
        ShoppingList shoppingList = new ShoppingList();
        {
            shoppingList.run();
        }
    }

    private void run()
    {

        String commandLine;

        List<String> foodList = new ArrayList<>();
        System.out.println("Please Enter one of the Following Commands:");
        System.out.println("Add <Item Name>, to add an Item to the List");
        System.out.println("Print, To Print List");
        System.out.println("Remove <index>, To Remove an item from the list");
        System.out.println("Clear, To clear the list");
        System.out.println("Exit, To Exit the Program");

        Scanner in = new Scanner(System.in);
        String command;
        do
        {


            System.out.println("What is your command?");
            commandLine = in.nextLine();
            String[] commands = commandLine.split(" ");
            command = commands[0].toUpperCase();


            if (command.equals("ADD"))
            {
                String itemName = commands[1];
                foodList.add(itemName);
                System.out.println("You added: "+ itemName);
            }
            else if(command.equals("PRINT"))
            {
                for (String items:foodList)
                {
                    for (int i = 0;i < foodList.size(); i++)
                    System.out.println( i+ " "+ items );
                }
            }
            else if (command.equals("REMOVE"))
            {
                int x = Integer.parseInt(commands[1]);
                foodList.remove(x);


            }
            else if (command.equals("CLEAR"))
            {
                foodList.clear();
                System.out.println("LIST NOW EMPTY");
            }
        }
        while(!command.equals("EXIT"));
        System.out.println("You Have Ended Program");

}
    private void printList(List<String> foodList)
    {
        for ( String list: foodList)
        {
            System.out.println(list);
        }

    }
}
