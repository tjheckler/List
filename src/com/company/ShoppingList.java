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

        String commandLine;

        List<String> foodList = new ArrayList<>();
        System.out.println("Please Enter one of the Following Commands:");
        System.out.println("Add <Item Name>, Example: 'add cheese' To add item to list");
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


            if (command.equals("ADD"))
            {
                String itemName = commands[1];
                foodList.add(itemName);
                System.out.println("You added: " + itemName);
            } else if (command.equals("PRINT"))
            {


                for (int i = 0; i < foodList.size(); i++)
                {
                    System.out.println(i + " " + foodList.get(i));
                }


            } else if (command.equals("REMOVE"))
            {
                int x = Integer.parseInt(commands[1]);
                foodList.remove(x);


            } else if (command.equals("CLEAR"))
            {
                foodList.clear();
                System.out.println("LIST NOW EMPTY");
            } else if (command.equals("SORT"))
            {
                Collections.sort(foodList);
                for (int i = 0; i < foodList.size(); i++)
                {
                    System.out.println(i + " " + foodList.get(i));
                }
            }
            else if (command.equals("FIND"))
            {

                for (int i = 0; i < foodList.size(); i++)
                {

                    String[] regexe = commandLine.split(" ");
                    Pattern pattern = Pattern.compile(regexe[1]);
                    Matcher matcher = pattern.matcher(commandLine);

                    if (matcher.find(1)) {
                        System.out.println("matches() found the pattern \"" + matcher.group()
                                + "\" starting at index " + matcher.start()
                                + " and ending at index " + matcher.end());
                    } else  {
                        System.out.println("matches() found nothing");
                    }

                   /* while (matcher.find());
                    {


                        // find the next match
                        System.out.println("Found it! \" is in the list, Which is " + foodList.get(i));


                    }*/
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
