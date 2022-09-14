package com.company;

public class Main
{

    public static void main(String[] args)
    {
        for (int k = 0; k <= 10; k++)
        {
            double alfa = k * Math.PI / 5;
            double sin = Math.sin(alfa);
            double cos = Math.cos(alfa);
            System.out.println(alfa + ", " + sin + ", " + cos);
        }
    }
}
