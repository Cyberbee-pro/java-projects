/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test2;
import java.util.*;

/**
 *
 * @author Cyberbee
 */
public class strfunc {
    
    public static String a,b;
    
    public static final Scanner sc = new Scanner(System.in);
    
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
    
    public static void inputAll()
    {
        int x;
        String opt;
        System.out.println("************INPUT MENU************");
        System.out.println("0>EXIT\n1>A\t2>B");
        x=sc.nextInt();
        System.out.println("Enter input:");
       sc.nextLine();
        do{
        switch(x)
        {
            case 1-> a=sc.nextLine();
            case 2-> b=sc.nextLine();
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
        System.out.println("************DISPLAY MENU************");
        System.out.println("0>EXIT\n1>A\t2>B");
         x=sc.nextInt();
        do{
        switch(x)
        {
            case 1-> System.out.println("A:"+ a);
            case 2-> System.out.println("B:"+ b);
            case 0-> System.exit(0);
            default -> System.out.println("WRONG INPUT|\\\\\\\\\\\\");
        }
        System.out.println("repeat DISPLAY(Y)?");
        sc.next();
        opt = sc.nextLine();
        }while(opt.equalsIgnoreCase("y"));
        System.out.println("DISPLAY Success");
    }
        

}
