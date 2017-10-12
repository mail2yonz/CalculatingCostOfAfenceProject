package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int Height,width,NumberOfFences=0,FenceCost=0;
        double coastbeforeTax,TotalCost;
        String TypesOfFence;


        Scanner scan= new Scanner (System.in);

        System.out.println("Enter The Height of the Yard:");
        Height= scan.nextInt ();

        System.out.println("Enter The Width  of the Yard:");
        scan= new Scanner (System.in);
        width=scan.nextInt ();
        scan.nextLine ();

        System.out.println("Enter The Number of Gates you want to use:");
        //scan= new Scanner (System.in);
        NumberOfFences=scan.nextInt ();
        scan.nextLine ();

        System.out.println("Enter The Type of the Fence(wooden or Chain) you want to use:");
       // scan= new Scanner (System.in);
        TypesOfFence= scan.nextLine ();



        if(TypesOfFence.equalsIgnoreCase ( "Wooden" )) {
            FenceCost = 25;
        }else if(TypesOfFence.equalsIgnoreCase ( "Chain" ))
        {
            FenceCost=15;
        }else{
            System.out.println("Enter a correct type");
        }
        double buildingPermit=50.00;
        double taxRate=0.06;
        int perimeter=2*(Height+width);


        if(NumberOfFences<=3) {
            int GateCost=150*NumberOfFences;


            System.out.println ("Display the number of fences:"+NumberOfFences );
            coastbeforeTax= perimeter*FenceCost+ buildingPermit + GateCost;
            NumberOfFences++;
            System.out.println("The total cost is : "+coastbeforeTax);

            TotalCost=coastbeforeTax + (taxRate*coastbeforeTax);
            System.out.println("The total cost is : "+TotalCost);

        }else{
            System.out.println ("Please Enter number of fences between 1 to 3" );
        }


    }
}
