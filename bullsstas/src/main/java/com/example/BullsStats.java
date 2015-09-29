package com.example;

public class BullsStats {
    public static void main(String[] args)
    {
        double[] points = {1300, 1443, 903, 951, 639, 836, 592, 482, 432, 376, 108, 151, 28, 11};
        double[] rebounds = {377, 920, 163, 164, 397, 402, 246, 643, 173, 119, 44, 45, 39, 7};
        double[] Rose = {903, 153, 36};
        double[] Butler = {1300, 384, 117};
        double avrgPoints = 0;
        double avrgRebounds = 0;
        int comparedRose = 0, comparedButler = 0;

        for(int i = 0; i < points.length; i++)
        {
            avrgPoints += points[i];
        }
        for(int i = 0; i < points.length; i++)
        {
            avrgRebounds += rebounds[i];
        }
        avrgPoints /= points.length;
        avrgRebounds /= rebounds.length;

        for (int i = 0; i < Rose.length; i++)
        {
            if(Rose[i] > Butler[i])
            {
                comparedRose++;
            }
            else if(Rose[i] < Butler[i])
            {
                comparedButler++;
            }
        }
        System.out.println("Average points scored by the team: " + avrgPoints);
        System.out.println("Average rebounds made by the team: " + avrgRebounds);

        if(comparedButler > comparedRose)
        {
            System.out.println("Butler is better than Rose");
        }
        else if(comparedButler < comparedRose)
        {
            System.out.println("Rose is better than Butler");
        }
        else if(comparedButler == comparedRose)
        {
            System.out.println("Rose and Butler are equal");
        }
    }
}
