package com.company;

public class ListItem implements Comparable
{
    private String name;
    private int quantity;

    public ListItem (String name, int quantity)
    {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName()

    {
        return this.name;
    }

    @Override
    public int compareTo(Object that)

    {
        return this.getQuantity();
    }

    public int getQuantity()
    {
        return this.quantity;
    }

    public String setName(String name)
    {
        return this.name = name;
    }

    public int setQuantity(int quantity)
    {
        return this.quantity = quantity;
    }
    public void printItems()
    {
        System.out.println(getQuantity() +" "+ getName());
    }
}
