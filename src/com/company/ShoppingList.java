package com.company;

import java.util.*;

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
        List<ListItem> items = new ArrayList<>();
        String name;
        int quantity = 1;
        String commandLine;
        Scanner in = new Scanner(System.in);
        String command;

        System.out.println("Please Enter one of the Following Commands:");
        System.out.println("Add <Item Name>, Example: 'add cheese' To add item to list");
        System.out.println("Remove <index>, Example: 'remove 0' To remove item from list");
        System.out.println("Print, To Print List");
        System.out.println("Sort, To Sort and Print List");
        System.out.println("Clear, To clear the list");
        System.out.println("Exit, To Exit the Program");


        do
        {

            System.out.println("What is your command?");
            commandLine = in.nextLine();

            String[] commands = commandLine.split(" ");
            command = commands[0].toUpperCase();

            if (command.equals("ADD") && commands.length == 2)
            {
                name = commands[1];

                boolean added = false;
                for (int i = 0; i < items.size(); i++)
                {

                    ListItem item = items.get(i);
                    if (item.getName().equals(name))
                    {
                        items.remove(item);
                        quantity++;
                        item.setQuantity(quantity);
                        items.add(item);
                        System.out.println();
                        added = true;

                        break;

                    }
                }
                if (!added)
                {


                    items.add(new ListItem(name, quantity));
                    System.out.println();
                    quantity = 1;
                }
            } else if (command.equals("PRINT"))
            {
                for (ListItem item : items)
                {
                    item.printItems();
                }
            } else if (command.equals("REMOVE") && commands.length == 2)
            {
                name = commands[1];
                boolean removed = false;
                for (int i = 0; i < items.size(); i++)
                {
                    ListItem item = items.get(i);
                    if (item.getName().equals(name) && item.getQuantity() > 1)
                    {
                        items.remove(item);
                        quantity--;
                        item.setQuantity(quantity);
                        items.add(item);


                        removed = true;

                        break;

                    } else if (!removed && item.getQuantity() <= 1)
                    {
                        items.remove(item);
                        System.out.println();
                        quantity = 1;


                    }
                }


            } else if (command.equals("CLEAR"))
            {
                items.clear();
                System.out.println("LIST NOW EMPTY");
            } else if (command.equals("SORT"))
            {
                Collections.sort(items);
                for (ListItem item : items)
                {
                    System.out.println(item.getQuantity() + " " + item.getName());
                }
            } else if (command.equals("FIND") && commands.length == 2)
            {

                for (ListItem item : items)
                {
                    if (item.getName().equals(commands[1]))
                    {
                        // find the next match
                        System.out.println("Looking for " + commands[1]);
                        System.out.println("Found it! " + commands[1] + "  is in the list, Which is " + item.getName());
                    } else if (!item.equals(commands))
                    {
                        System.out.println("Looking for " + commands[1]);
                        System.out.println("Item not found try again!");
                    } else
                    {
                        System.out.println("Please Try Again");
                    }
                }
            }

        }
        while (!command.equals("EXIT"));
        System.out.println("You Have Ended Program");

    }

}
