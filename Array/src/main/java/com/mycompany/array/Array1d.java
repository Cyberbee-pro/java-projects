/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.array;

import java.util.*;

/**
 *
 * @author cyber
 */
public class Array1d {
    
       public static int[] inputAint(int[] a)
    {
        Scanner sc = new Scanner(System.in);
        int size,i;
        System.out.print("Enter size for array:");
        size = sc.nextInt();
        a = new int[size];
        for(i=0;i<size;i++)
        {
            System.out.println("Enter Data " + (i+1) + ":");
            a[i]=sc.nextInt();
        }
        return a;
    }

    public static void displayAint(int[] a)
    {
       int i;
       System.out.println("Printing the array. . . . . . . \n");
       for(i=0;i<a.length;i++)
       {
            System.out.println(a[i]);
       }
    }
    
    public static void bubSortInt(int[] a)
    {
        int i,j,temp;
        for(i=0;i<(a.length-1);i++)
        {
           for(j=0;j<(a.length-i-1);j++)
            {
                if(a[j]>=a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("SORT SUCCESS. . . . . . . . . . . . . . ");
    }
    
    public static void binSearch(int[] a)
    {
        int n,item,mid,beg,end,left,right,flag=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element You Want to search:");
        item= sc.nextInt();
        n=a.length;
        beg=0;
        end=n-1;
        bubSortInt(a);
        while(beg<=end)
        {
            mid=(beg+end)/2;
            if(item==a[mid])
            {
                System.out.println("Item found at pos:"+(mid+1));
                 flag++;
                left=mid-1;
                
                    if(a[mid-1]==item && left>=0)//check left
                       {
                         //check left
                           while(a[left]==item && left>=0)
                           {
                                  System.out.println("Item found at pos:"+(left+1));
                                  left--;
                        
                            }
                        }
                        right=mid+1;
                    if(a[mid+1]==item && right<=a.length)//check right
                        {
                        //check right
                          while(a[right]==item && right<=a.length)
                           {
                               System.out.println("Item found at pos:"+(right+1));
                               right++;
                           }
                        }
             return;
            }
            else if(item>a[mid])
            {
                beg=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        if(flag==0)
        {
            System.out.println("Item Not Found");
        }
    }
    
    public static void linearSearch(int[] a)
    {
        int i,flag=0,num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element You Want to search:");
        num = sc.nextInt();
        for(i=0;i<a.length;i++)
        {
            if(a[i]==num)
            {
                System.out.println("Item found At Pos:"+(i+1));
                flag++;
            }
        }
        if(flag==0)
        {
            System.out.println("Item Not Found");
        }
        else
           System.out.println("duplicates="+(flag-1));
    }
    
    
}
