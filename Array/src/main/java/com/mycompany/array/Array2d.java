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



public class Array2d 
{
    
    public static final Scanner sc = new Scanner(System.in);
    

    public static int[][] input(int[][] a)
    {
        int i,j,row,col;
        System.out.print("ENTER COLLUMN,ROWS:");
        col = sc.nextInt();
        row = sc.nextInt();
        a= new int[row][col];
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                System.out.print("\nEnter data for row: "+ i + " collumn:"+j+" : ");
                a[i][j]= sc.nextInt();
            } 
        }
        System.out.println("\n\nINPUT SUCCESS . . . . . .");
        return a;
    }
    
    public static void display(int[][] a)
    {
        int i,j;
        for(i=0;i<a.length;i++)
        {
            for(j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+" " );
            }
            System.out.print("\n");
        }
            
    }
    
    public static int sumOallElemen(int[][] a)
    {
        int i,j,sum=0;
        for(i=0;i<a.length;i++)
        {
            for(j=0;j<a[i].length;j++)
            {
                sum+=a[i][j];
            }
        }
        System.out.println("SUM SUCCESSFUL . . . . . . . .");
        return sum;
    }
    
    public static void linearSearch(int[][] a)
    {
        int i,j,flag=0,item;
        System.out.println("Enter element you want to find: ");
        item=sc.nextInt();
        for(i=0;i<a.length;i++)
        {
            for(j=0;j<a[i].length;j++)
            {
                if(a[i][j]==item)
                {
                    System.out.println("Item foound at pos(row,col) : "+(i+1)+","+(j+1));
                    flag++;
                }
            }
        }
        if(flag==0)
        {
            System.out.println("Item not found");
        }
        else
        {
            System.out.println("Duplicates : " + (flag-1));
        }
    }
    
    public static int[][] matrixsum(int[][] a,int[][] b)
    {
        int i,l,m=0,j=0,row,col;
        for(i=0;i<a.length;i++)
        {
         for(j=0;j<a[i].length;j++);
        }
        for(l=0;l<b.length;l++)
        {
            for(m=0;m<b[l].length;m++);
        }
    if(i>=l)
    {
        row=i;
    }
    else
    {
        row=l;
    }
    if(j>=m)
    {
        col=j;
    }
    else
    {
        col=m;
    }
    
    int[][] c = new int[row][col];
    for(i=0;i<row;i++)
    {
        for(j=0;j<col;j++)
        {
            c[i][j]=(a[i][j]+b[i][j]);
        }
    }
    System.out.println("SUM SUCCESSFUL . . . . . . . .");
    
    return c;
    }
    
}
