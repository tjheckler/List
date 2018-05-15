package com.company;

public class ListItem implements Comparable
{
    private String name;
    private int quantity = 1;

    public ListItem (String name, int quantity)
    {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public int compareTo(Object that)
    {
        return this.getQuantity();
    }

    public int getQuantity()
    {
        return quantity;
    }

    public String setName(String name)
    {
        return this.name = name;
    }

    public int setQuantity(int quantity)
    {
        return this.quantity = quantity;
    }
}
