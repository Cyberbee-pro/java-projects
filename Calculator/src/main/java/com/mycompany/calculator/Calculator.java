/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculator;

import java.util.*;

/**
 *
 * @author Cyberbee
 */
public class Calculator {

    public static final Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int i,Subi;
        String opt;
        int[] a = null;
        do
        {
        System.out.println("* * * * * * * * * * CALCULATOR * * * * * * * * * *");
        System.out.println("* * * * * * * * * * MAIN MENU * * * * * * * * * *");
        System.out.println("1>SUM\t2>SUBTRACT\n3>MULTIPLY\t4>DIVIDE_Q\n5>DIVIDE_R\t6>Factorial\n7>Expo\t8>Num.sys\n0>EXIT");
        System.out.print("ENTER CHOICE:");
        i= sc.nextInt();

        switch(i)
        {
            case 0 -> System.exit(0);
            case 1 ->sum();
            case 2 -> sub();
            case 3 -> multiply();
            case 4 -> div();
            case 5 -> rem();
            case 6-> fact();
            case 7-> expo();
            case 8-> number_system();
            
            default -> System.out.println("OPTION OUT OF BOUNDS");
          
        }
          System.out.print("Do you want to continue Calculator.java ?(Y/N):");
          opt=sc.next();    
        }while(opt.equalsIgnoreCase("Y"));
    }
    
    public static void sum()
    {
       float x, y;
       System.out.println("Enter two numbers:");
       x=sc.nextFloat();
       y=sc.nextFloat();
       x+=y;
       System.out.println("Sum is :"+x);
    }
    
    public static void sub()
    {
       float x, y;
       System.out.println("Enter two numbers:");
       x=sc.nextFloat();
       y=sc.nextFloat();
       x-=y;
       System.out.println("Sub is :"+x);
    }
    
    public static void multiply()
    {
       float x, y;
       System.out.println("Enter two numbers:");
       x=sc.nextFloat();
       y=sc.nextFloat();
       x*=y;
       System.out.println("Product is :"+x);
    }
    
    public static void div()
    {
       float x, y;
       System.out.println("Enter two numbers:");
       x=sc.nextFloat();
       y=sc.nextFloat();
       x/=y;
       System.out.println("Quotient is :"+x);
    }
    
    public static void rem()
    {
       float x, y;
       System.out.println("Enter two numbers:");
       x=sc.nextFloat();
       y=sc.nextFloat();
       x%=y;
       System.out.println("Reminder is :"+ x);
    }
    
    public static void fact()
    {
     long fac=1,i;
     int x;
     System.out.println("Enter noumber for factorial");
     x=sc.nextInt();
     for(i=1;i<=x;i++)
     {
         fac*=i;
     }
     System.out.println("Factorial is:"+fac);
    }
    
    public static void expo()
    {
        float x,y,ans;
        System.out.println("Eter x,y (x^y):");
        x=sc.nextFloat();
        y=sc.nextFloat();
        ans=x;
        for(int i=1;i<=y;i++)
        {
            ans*=x;
        }
        System.out.println("Ans = "+ ans);
    }
    
    public static void trigo()
    {
        
    }
    
    public static void number_system()
    {
        int i,Subi;
        String opt;
        int[] a = null;
        do
        {
        System.out.println("* * * * * * * * * * Num.Sys MENU * * * * * * * * * *");
        System.out.println("1>Convertion\t2>____\n3>____\t4>____\n5>____\t6>____\n7>____\n0>EXIT");
        System.out.print("ENTER CHOICE:");
        i= sc.nextInt();

        switch(i)
        {
            case 0 -> System.exit(0);
            case 1 -> Convert();
           /* case 2 -> ;
            case 3 -> ;
            case 4 -> ;
            case 5 -> ;
            case 6->  ;
            case 7->  ;
            */
            default -> System.out.println("OPTION OUT OF BOUNDS");
          
        }
          System.out.print("Do you want to continue Number_System ?(Y/N):");
          opt=sc.next();    
        }while(opt.equalsIgnoreCase("Y"));
    }
    
    public static void Convert()
    {
         int i,Subi;
        String opt;
        int[] a = null;
        do
        {
        System.out.println("* * * * * * * * * * Num.sys>>>Convertion MENU * * * * * * * * * *");
        System.out.println("1>Decibal to binary\t2>Decibal to Octal\n3>Decibal to HexaDecibal\t4>____\n5>____\t6>____\n7>____\n0>EXIT");
        System.out.print("ENTER CHOICE:");
        i= sc.nextInt();

        switch(i)
        {
            case 0 -> System.exit(0);
            case 1 -> D2b2();
            case 2 -> D2O();
            case 3 -> D2H();
           /* case 4 -> ;
            case 5 -> ;
            case 6->  ;
            case 7->  ;
            */
            default -> System.out.println("OPTION OUT OF BOUNDS");
          
        }
          System.out.print("Do you want to continue Convert ?(Y/N):");
          opt=sc.next();    
        }while(opt.equalsIgnoreCase("Y"));
    }
    
    public static float Frev(int a)
    {
        int rem,rev=0;
        float REV;
        while(a>0){
            rem=a%10;
            rev*=10;
            rev+=rem;
            a/=10;
            //System.out.println(rev+"<<<<<>>>>>>"+a);
        }
        REV=(float)rev;
        return REV;
    }
    
    /* //cancled - - - - - - - disabled
    public static void D2b()
    {
        int a,i=0,n;
        System.out.println("Enter Decimal num:");
        n=sc.nextInt();
        for(a=1;n>=1;a*=10)
        {
            i+=(n%2)*a;
            n/=2;
        }
         System.out.println("The decibal to binary conversion is:"+i);
    }
    */
    public static void D2b2()
    {
        float n,cop,copdp,convtd,j=0;
        int copInt,a,i=0,tempdig,q=0,IJ;
        System.out.println("Enter Decimal num:");
        n=sc.nextFloat();
        cop=n;
        copInt=(int)cop;
        copdp= cop-copInt;//decimal part
        //System.out.println(copInt+"/. . .\\" +copdp);
        for(a=1;copInt>=1;a*=10) //calculating bin of copint
        {
            i+=(copInt%2)*a;
            copInt/=2;
        }
        for(a=1;copdp!=0;a*=10) //calculating bin part of copdp
        {
           copdp*=2;
           tempdig=(int)copdp;
           j+=(float)(tempdig*a);
           copdp-=tempdig;
           q++;
           //System.out.println(tempdig+"/. . .\\" +copdp+"/\\"+j+">>>>>"+q);
           if(q==6)
           {
               a/=10;
               break;
           }
        }
        IJ=(int)j;
        j=Frev(IJ);
        System.out.println(j);
        j/=a;
        convtd=i+j;
         System.out.println("The decibal to binary conversion is:"+convtd);
         
    }
    
    public static void D2O()
    {
         float n,cop,copdp,convtd,j=0;
        int copInt,a,i=0,tempdig,q=0,IJ;
        System.out.println("Enter Decimal num:");
        n=sc.nextFloat();
        cop=n;
        copInt=(int)cop;
        copdp= cop-copInt;//decimal part
        //System.out.println(copInt+"/. . .\\" +copdp);
        for(a=1;copInt>=1;a*=10) //calculating Octal of copint
        {
            i+=(copInt%8)*a;
            copInt/=8;
        }
        for(a=1;copdp!=0;a*=10) //calculating bin part of copdp
        {
           copdp*=8;
           tempdig=(int)copdp;
           j+=(float)(tempdig*a);
           copdp-=tempdig;
           q++;
           //System.out.println(tempdig+"/. . .\\" +copdp+"/\\"+j+">>>>>"+q);
           if(q==6)
           {
               a/=10;
               break;
           }
        }
        IJ=(int)j;
        j=Frev(IJ);
       // System.out.println(j);
        j/=a;
        convtd=i+j;
         System.out.println("The decibal to octal conversion is:"+convtd);
    }
    
    private static final char[] HEX_DIGITS = {
    '0','1','2','3','4','5','6','7',
    '8','9','A','B','C','D','E','F'
};

    
    public static char dec2hexIndex(int hd)
    {
        if (hd < 0 || hd > 15) 
        throw new IllegalArgumentException("hd must be 0–15");
    return HEX_DIGITS[hd];

    }
    
    //under construction
    
     public static void D2H()
    {
         float n,cop,copdp,convtd,j=0;
        int copInt,a,i=0,tempdig,q=0,IJ;
        System.out.println("Enter Decimal num:");
        n=sc.nextFloat();
        cop=n;
        copInt=(int)cop;
        copdp= cop-copInt;//decimal part
        //System.out.println(copInt+"/. . .\\" +copdp);
        for(a=1;copInt>=1;a*=10) //calculating Octal of copint
        {
            i+=(copInt%16)*a;
            copInt/=16;
            
            System.out.println(copInt);
        }
        for(a=1;copdp!=0;a*=10) //calculating bin part of copdp
        {
           copdp*=16;
           tempdig=(int)copdp;
           j+=(float)(tempdig*a);
           copdp-=tempdig;
           q++;
           //System.out.println(tempdig+"/. . .\\" +copdp+"/\\"+j+">>>>>"+q);
           if(q==6)
           {
               a/=10;
               break;
           }
        }
        IJ=(int)j;
        j=Frev(IJ);
       // System.out.println(j);
        j/=a;
        convtd=i+j;
         System.out.println("The decibal to octal conversion is:"+convtd);
    }
    
    
}
