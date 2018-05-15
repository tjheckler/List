package com.company;

import java.sql.SQLOutput;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        String name = "";
        int quantity = 1;
        String commandLine;


        System.out.println("Please Enter one of the Following Commands:");
        System.out.println("Add <Item Name> <item amount>, Example: 'add cheese' To add item to list");
        System.out.println("Remove <index>, Example: 'remove 0' To remove item from list");
        System.out.println("Print, To Print List");
        System.out.println("Sort, To Sort and Print List");
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
            List<ListItem> item = new ArrayList<>();

            if (command.equals("ADD") && commands.length == 3)
            {
                name = commands[1];
                quantity = Integer.parseInt(commands[2]);
                item.add(new ListItem(name, quantity));


                System.out.println("You added: " +quantity+ " "+name);
            } else if (command.equals("PRINT"))
            {


                for (int i = 0; i < item.size(); i++)
                {
                    System.out.println(i + " " + quantity+ " "+name);
                }


            } else if (command.equals("REMOVE") && commands.length == 2)
            {
                int x = Integer.parseInt(commands[1]);
                item.remove(x);


            } else if (command.equals("CLEAR") && commands.length == 2)
            {
                item.clear();
                System.out.println("LIST NOW EMPTY");
            } else if (command.equals("SORT"))
            {
                Collections.sort(item);

                for (int i = 0; i < item.size(); i++)
                {
                    System.out.println(i + " " + item.get(i));
                }
            } else if (command.equals("FIND") && commands.length == 2)
            {
                String[] regexe = commandLine.split(" ");
                Pattern pattern = Pattern.compile(regexe[1]);
                Matcher matcher = pattern.matcher(commandLine);
                if (matcher.find()) ;
                {

                }

                for (int i = 0; i < item.size(); i++)
                {
                    if (item.get(i).equals(regexe[1]))
                    {
                        // find the next match
                        System.out.println("Looking for " + regexe[1]);
                        System.out.println("Found it! " + regexe[1] + "  is in the list, Which is " + item.get(i));
                    } else if (!item.get(i).equals(regexe))
                    {
                        System.out.println("Looking for " + regexe[1]);
                        System.out.println("Item not found try again!");
                    } else
                    {
                        System.out.println("Please Try Again");
                    }
                }
            } else
            {
                System.out.println("Please Try Again");
            }
        }
        while (!command.equals("EXIT"));
        System.out.println("You Have Ended Program");

    }

}
