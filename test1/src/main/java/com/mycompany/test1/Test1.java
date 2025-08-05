/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


package com.mycompany.test1;

import java.util.*;
/**
 *
 * @author cyber
 */
public class Test1 
{
    public static void main(String[] args)
    {
       // pattern();
       // sum1();
       // sum2();
       // Acircle();
       // adultest();
       // oddeven();
       // compare2();
       // butt();
       // Simpcalc();
       // monthnum();
       // table();
       // nsum();
       // pRintn();
       // ran();
       // grader();
       // qpime();
       // Pattern_triangle1();
       // Pattern_triangle2();
       // Pattern_triangle3();
       // Pattern_diamond();
        /*
        ///sum
        int a,b,Sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers:\n");
        a=sc.nextInt();
        b=sc.nextInt();
        Sum=SUM3(a,b);
        System.out.println("Sum is:" + Sum);
       */
        
        /*
        //factorial
         int a;
         long fact;
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:\n");
        a=sc.nextInt();
        fact=(long)fact(a);
        System.out.println("factorial is:" + fact);
       */
        
        
        
        
    }
     
    public static int fact(int a)
    {
        int b=1;
        long i;
        if(a==0)
            return 1;
        else
        {
        for(i=1;i<=a;i++)
        {
            b*=i;
        }
        return b;
        }
    }
    
    public static int SUM3(int a,int b)
    {
        a+=b;
        return a;
    }
    
     public static void Pattern_diamond()
    {
        int i,j,k,size;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter size");
        size = sc.nextInt();
        for(i=0;i<=size;i++)
        {
            for(k=0;k<=(size-i);k++)
            {
                System.out.print(" ");
            }
            
            for(j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
         for(i=0;i<=size;i++)
        {
             for(k=0;k<=i;k++)
            {
                System.out.print(" ");
            }
            for(j=(size-i);j>=0;j--)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
     
       public static void Pattern_triangle3()
    {
        int i,j,k,size;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter size");
        size = sc.nextInt();
        for(i=1;i<=size;i++)
        {
            for(k=1;k<=(size-i);k++)
            {
                System.out.print(" ");
            }
            
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    
    public static void Pattern_triangle2()
    {
        int i,j,k,size;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter size");
        size = sc.nextInt();
        for(i=1;i<=size;i++)
        {
            for(k=1;k<=(size-i);k++)
            {
                System.out.print("  ");
            }
            
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    
    public static void Pattern_triangle1()
    {
        int i,j,size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        size = sc.nextInt();
        for(i=0;i<size;i++)
        {
            for(j=0;j<=i;j++)
            {
            System.out.print("* ");
            }
            System.out.print("\n");
        }
        
    }
    
    //prime
    public static void qpime()
    {
        int num,i,flag=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check:");
        num=sc.nextInt();
        for(i=1;i<=num;i++)
        {
            if(num%i==0)
                flag++;
        }
        if(flag==2)
        {
            System.out.println(num + " is a prime number");
        }
        else if(num==1)
            System.out.println("1 is not a prime number");
        else
            System.out.println(num + " is not a prime number");
    }
    public static void grader()
    {
        int opt,marks;
        Scanner sc = new Scanner(System.in);

        do
        {
             System.out.println("Enter marks:");
             marks = sc.nextInt();
             if(marks>=90 && marks<=100)
             {
                 System.out.println("This is Good");
             }
             else if(marks <= 89 && marks >= 60)
             {
                 System.out.println("This is also Good");
             }
             else if(marks >= 0 && marks <= 59)
             {
                 System.out.println("This is Good as well");
             }
             else
             {
                System.out.println("Input Out of range");
             }
        System.out.println("Choose option \n 1> estimator \n 0>exit");
        opt=sc.nextInt();
        }while(opt!=0);
    }
    //infinite loop
    public static void ran()
    {
        for(; ;) 
        {
            System.out.println("Apna College");
        }

    }
     public static void pRintn()
    {
        int i,n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n :");
        n= sc.nextInt();
        for(i=0;i<=n;i++)
        {
            System.out.println(i);
        }
    }
    
    public static void nsum()
    {
        int i,n,sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n for sum:");
        n= sc.nextInt();
        for(i=0;i<=n;i++)
        {
            sum+=i;
        }
        System.out.println(sum);
    }
    
    public static void table()
    {
        int i,n,t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter; Number for table ,upto : ");
        t=sc.nextInt();
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
          System.out.println( i + "*" + t  + "=" + (i*t));
          
          
        }
        
    }
    
    public static void monthnum()
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1->12:");
        num = sc.nextInt();
        switch(num)
        {
            case 1 -> System.out.println("JANUARY");
            case 2 -> System.out.println("FEBRUARY");
            case 3 -> System.out.println("MARCH");
            case 4 -> System.out.println("APRIL");
            case 5 -> System.out.println("MAY");
            case 6 -> System.out.println("JUNE");
            case 7 -> System.out.println("JULY");
            case 8 -> System.out.println("AUGUST");
            case 9 -> System.out.println("SEPTEMBER");
            case 10 -> System.out.println("OCTOBER");
            case 11 -> System.out.println("NOVEMBER");
            case 12 -> System.out.println("DECEMBER");
            default -> System.out.println("INVALID INPUT");
        }
    }
    
    public static void Simpcalc()
    {
        int num1,num2,opt;
        Scanner sc = new Scanner(System.in);
        System.out.println("OPERATIONS OFFERED: \n 1>Add \t 2>Sub \n 3>multiple \t 4>division \n 5>modulus\nEnter option:");
        opt = sc.nextInt();
        System.out.println("Enter Two numbers:");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        switch(opt)
        {
            case 1 -> System.out.println("THE ans is "+(num1 + num2));
            case 2 -> System.out.println("THE ans is "+(num1 - num2));
            case 3 -> System.out.println("THE ans is "+(num1 * num2));
            case 4 -> System.out.println("THE ans is "+(num1 / num2));
            case 5 -> System.out.println("THE ans is "+(num1 % num2));
            default -> System.out.println("INVALID INPUT");
        }
    }
    
    public static void butt()
    {
        int butt;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER OPTION \n \n 1>English \n 2>Hindi \n 3>Japanese\n?>");
        butt = sc.nextInt();
        switch(butt)
        {
            case 1 -> System.out.println("Hello");
            case 2 -> System.out.println("Namaste");
            case 3 -> System.out.println("Ohaio");
            default -> System.out.println("INVALID OUTPUT");
        }
    }
    
    public static void compare2()
    {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        a= sc.nextInt();
        b= sc.nextInt();
        if(a==b)
            System.out.println("equal");
        else if(a>b)
            System.out.println("A is greater");
        else 
            System.out.println("A IS SMAllER");
    }
    
    public static void oddeven()
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        num = sc.nextInt();
        if((num%2)==0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
    
    public static void adultest()
    {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        age = sc.nextInt();
        if(age>=18)
        System.out.println("You are an adult");
        else
        System.out.println("You are Not an adult");
    }
    public static void pattern()
    {
        System.out.println("\nPrinting Star pattern 1 without loops");
        System.out.println("*");
        System.out.println("* *");
        System.out.println("* * *");
        System.out.println("* * * *");
        System.out.println("* * * * *");
        System.out.println("* * * * * *");
    }

    public static void sum1()
    {
        int a,b,sum;
        System.out.println("Enter two int:");
        Scanner c = new Scanner(System.in);
        a = c.nextInt();
        Scanner e = new Scanner(System.in);
        b = e.nextInt();
        sum = a+ b;
        System.out.println("The sum is:" + sum);
    }
    
    
    public static void sum2()
    {
        int a,b,sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        a=sc.nextInt();
        b=sc.nextInt();
        sum = a + b;
        System.out.println("The sum is:" + sum);
    }
    
    //area of circle
    public static void Acircle()
    {
        int r;
        float pi=(float)3.14;
        double area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius:");
        r=sc.nextInt();
        area = pi * r * r ;
        System.out.println("Radius is :" + area );
    }
    
}