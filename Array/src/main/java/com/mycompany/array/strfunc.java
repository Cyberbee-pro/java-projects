/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.array;
import java.util.*;

/**
 *
 * @author Cyberbee
 */
public class strfunc {
    public static String a[]=new String[1];
    public static String b[]=new String[1];
    
    
    public static final Scanner sc = new Scanner(System.in);
   
    /*
    public static void inputA()
    {
        System.out.println("Input A:");
        a=sc.nextLine();
        System.out.println("INPUT SUCCESS. . . . . . . . .");
    }
    
    public static void displayA()
    {
        System.out.println("A: "+ a);
    }
    */
     public static String[] inputArrStr(String[] z,int POpt)
    {
        int i,size;
        System.out.print("Enter size for array:");
        size=sc.nextInt();
        sc.next();
        for(i=0;i<size;i++)
        {
            System.out.println("Enter Data " + (i+1) + ":");
            z[i]=z+sc.nextLine();
        }
        return z;
    }
    
    public static void sizeRedef(int POpt)
    {
        int size;
        System.out.print("Enter size for array:");
        size=sc.nextInt();
        sc.nextLine();
        switch(POpt)
        {
            case 1-> 
                     {
                         a = new String[size];
                     }
            case 2-> 
                    {
                         b = new String[size];
                     }
            case 0-> System.exit(0);
            default -> System.out.println("WRONG INPUT|\\\\\\\\\\\\");
        }
        System.out.println("Redef Success");
    }
    
     
    
    public static void inputAll()
    {
        int x;
        String opt;
        do{
        System.out.println("************INPUT MENU************");
        System.out.println("0>EXIT\n1>A\t2>B");
        x=sc.nextInt();
        sc.nextLine();
        switch(x)
        {
            case 1-> a=inputArrStr(a,x);
            case 2-> b=inputArrStr(b,x);
            case 0-> System.exit(0);
            default -> System.out.println("WRONG INPUT|\\\\\\\\\\\\");
        }
        System.out.println("repeat INPUT(Y)?");
        opt = sc.nextLine();
        }while(opt.equalsIgnoreCase("y"));
        System.out.println("Input Success");
    }
    
    public static void displayAll()
    {
        int x;
        String opt;
        String tmpStr[]=new String[1000];
        do{
        System.out.println("************DISPLAY MENU************");
        System.out.println("0>EXIT\n1>A\t2>B");
         x=sc.nextInt();
        switch(x)
        {
            case 1-> strArrPrint(a);
            case 2-> strArrPrint(b);
            case 0-> System.exit(0);
            default -> System.out.println("WRONG INPUT|\\\\\\\\\\\\");
        }
        System.out.println("repeat DISPLAY(Y)?");
        sc.next();
        opt = sc.nextLine();
        }while(opt.equalsIgnoreCase("y"));
        System.out.println("DISPLAY Success");
    }
    
    public static void strArrPrint(String tmp[])
    {
        int i;
        System.out.println("Printing Array:");
        for(i=0;i<tmp.length;i++)
        {
            System.out.println(tmp[i]);
        }
        

    }
    /*    
   public static void StrSearch()
   {
       int x;
       String opt;
       String[]
   }
    */
}
