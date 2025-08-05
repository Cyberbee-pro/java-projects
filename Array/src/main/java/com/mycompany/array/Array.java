/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.array;
//import static com.mycompany.array.Array2d.*;
import java.util.*;
import static com.mycompany.array.Array1d.*;
import static com.mycompany.array.strfunc.*;
/**
 *
 * @author cyber
 */
public class Array {
public static final Scanner sc = new Scanner(System.in);
public static void main(String[] args) 
    {
        int i;
        String opt;
         do
        {
        System.out.println("* * * * * * * * * * Main MENU * * * * * * * * * *");
        System.out.println("1>1D ARRAY\t2>2D ARRAY\n3>STRING ARRAY \n0>EXIT");
        System.out.print("ENTER CHOICE:");
        i= sc.nextInt();

        switch(i)
        {
            case 0 -> System.exit(0);
            case 1 -> callList1D();
            case 2 -> callList2D();
            case 3 -> callListStr();         
            
            default -> System.out.println("OPTION OUT OF BOUNDS");
          
        }
          System.out.print("Do you want to continue Main Menu?(Y/N):");
          opt=sc.next();    
        }while(opt.equalsIgnoreCase("Y"));
        System.out.println("Thank You For Choosing us. . . . . . . ");

    }

public static void callList1D()
  {
       int i,Subi;
        String opt;
        int[] a = null;
        do
        {
        System.out.println("* * * * * * * * * * 1D ARRAY * * * * * * * * * *");
        System.out.println("* * * * * * * * * * MENU * * * * * * * * * *");
        System.out.println("1>input\t2>display\n3>SORT\t4>Search\n0>EXIT");
        System.out.print("ENTER CHOICE:");
        i= sc.nextInt();

        switch(i)
        {
            case 0 -> System.exit(0);
            case 1 ->{ 
                        a=inputAint(a);
                     }
            case 2 -> {
                        if (a == null)
                        {
                             System.out.println("Array is empty! Please input data first.");
                             break;
                        }
                        else
                             displayAint(a);
                      }
            case 3 -> {
                        if (a == null)
                        {
                             System.out.println("Array is empty! Please input data first.");
                             break;
                        }
                        else
                        {
                         System.out.println("* * * * * * * * * * SORT MENU * * * * * * * * * *");
                         System.out.println("1>Bubble SORT");
                         System.out.print("ENTER CHOICE:");
                          Subi= sc.nextInt();
                          switch(Subi)
                          {
                              case 1->bubSortInt(a);
                               default -> System.out.println("OPTION OUT OF BOUNDS");
                          }
                        }
                       }
            case 4 -> 
                     { 
                        if (a == null)
                        {
                             System.out.println("Array is empty! Please input data first.");
                             break;
                        }
                        else
                        {
                          System.out.println("* * * * * * * * * * SEARCH MENU * * * * * * * * * *");
                          System.out.println("1>Binary Search\t2>Linear Search");
                          System.out.print("ENTER CHOICE:");
                          Subi= sc.nextInt();
                          switch(Subi)
                           {
                            case 1->binSearch(a);
                            case 2->linearSearch(a);
                             default -> System.out.println("OPTION OUT OF BOUNDS");
                           }
                        }
                      }
          
            
            default -> System.out.println("OPTION OUT OF BOUNDS");
          
        }
          System.out.print("Do you want to continue 1D ARRAY ?(Y/N):");
          opt=sc.next();    
        }while(opt.equalsIgnoreCase("Y"));
  }

public static void callList2D()
  {
       int i,Subi,sum;
        String opt;
        int[][] A = null;
        int[][] B = null;
        int[][] C = null;
        do
        {
        System.out.println("* * * * * * * * * * 2D ARRAY * * * * * * * * * *");
        System.out.println("* * * * * * * * * * MENU * * * * * * * * * *");
        System.out.println("1>input\t2>2d display menu \n3>Sum of elements\t4>Search\n5>Matix Operations\n0>EXIT");
        System.out.print("ENTER CHOICE:");
        i= sc.nextInt();

        switch(i)
        {
            case 0 -> System.exit(0);
            case 1 ->{ 
                        A=Array2d.input(A);
                     }
            case 2 -> {
                        if (A == null)
                        {
                             System.out.println("Array is empty! Please input data first.");
                             break;
                        }
                        else
                             Array2d.display(A);
                      }
            case 3 -> {
                        if (A == null)
                        {
                             System.out.println("Array is empty! Please input data first.");
                             break;
                        }
                        else
                        {
                         System.out.println("Operation sum initiating. . . . ");
                         sum=Array2d.sumOallElemen(A);
                         System.out.println("SUM = "+sum);
                        }
                      }
            case 4 -> { 
                        if (A == null)
                        {
                             System.out.println("Array is empty! Please input data first.");
                             break;
                        }
                        else
                        {
                          System.out.println("* * * * * * * * * * SEARCH MENU * * * * * * * * * *");
                          System.out.println("1>Linear Search\t");
                          System.out.print("ENTER CHOICE:");
                          Subi= sc.nextInt();
                          switch(Subi)
                           {
                            case 1->Array2d.linearSearch(A);
                            
                             default -> System.out.println("OPTION OUT OF BOUNDS");
                           }
                        }
                      }
           
            
            
            
            case 5 ->{
                     do{ 
                     { 
                        if (A == null)
                        {
                             System.out.println("Array A is empty! Please input data first.");
                             break;
                        }
                        else
                        {
                          System.out.println("* * * * * * * * * * MATRIX OPERATIONS * * * * * * * * * *");
                          System.out.println("0>EXIT\n1>input B\n2>2d display menu\t3>Addition");
                          System.out.print("ENTER CHOICE:");
                          Subi= sc.nextInt();
                          switch(Subi)
                           {
                            case 0 -> System.exit(0);
                            case 1->{
                                     B=Array2d.input(B);
                                    }
                            case 2-> DisplayMenu2d(A,B,C);
                            case 3->{
                                         if (B == null)
                                            {
                                             System.out.println("Array B is empty! Please input data first.");
                                             break;
                                            }
                                              C = Array2d.matrixsum(A,B);
                                    }
                            default -> System.out.println("OPTION OUT OF BOUNDS");
                           }
                        }
                      }
                     System.out.print("Do you want to continue MATRIX OPERATIONS ?(Y/N):");
                     opt=sc.next(); 
                       }while(opt.equalsIgnoreCase("Y"));
                     }
            
            
            
            
            
            default -> System.out.println("OPTION OUT OF BOUNDS");
        }
          System.out.print("Do you want to continue 2D ARRAY ?(Y/N):");
          opt=sc.next();    
        }while(opt.equalsIgnoreCase("Y"));
  }

public static void DisplayMenu2d(int[][] A,int[][] B,int[][] C)
 {
     int i;
     String opt;
    do
        {
        System.out.println("* * * * * * * * * * 2D DISPLAY MENU * * * * * * * * * *");
        System.out.println("1>A\t2>B\n3>C\t\n0>EXIT");
        System.out.print("ENTER CHOICE:");
        i= sc.nextInt();

        switch(i)
        {
            case 0 -> System.exit(0);
            case 1 ->{ 
                        if(A==null)
                        {
                            System.out.println("NULL");
                            break;
                        }
                        else
                        Array2d.display(A);
                     }
            case 2 ->{ 
                         if(B==null)
                        {
                            System.out.println("NULL");
                            break;
                        }
                        else
                        Array2d.display(B);
                     }
            case 3 ->{ 
                         if(C==null)
                        {
                            System.out.println("NULL");
                            break;
                        }
                        else
                        Array2d.display(C);
                     }
            
            default -> System.out.println("OPTION OUT OF BOUNDS");
          
        }
          System.out.print("Do you want to continue 2D DISPLAY MENU ?(Y/N):");
          opt=sc.next();    
        }while(opt.equalsIgnoreCase("Y"));
 
 }
    
public static void callListStr()
{
    int i,Subi;
        String opt;
        
        do
        {
        System.out.println("* * * * * * * * * * STRING ARRAY * * * * * * * * * *");
        System.out.println("* * * * * * * * * * MENU * * * * * * * * * *");
        System.out.println("1>input\t2>display\n3>. . . .\t4>. . . .\n0>EXIT");
        System.out.print("ENTER CHOICE:");
        i= sc.nextInt();

        switch(i)
        {
            case 0 -> System.exit(0);
            case 1 ->{ 
                        inputAll();
                     }
            case 2 -> {
                        displayAll();
                      }
            case 3 -> {
                       
                       }
                     
            default -> System.out.println("OPTION OUT OF BOUNDS");
          
        }
          System.out.print("Do you want to continue String ARRAY ?(Y/N):");
          opt=sc.next();    
        }while(opt.equalsIgnoreCase("Y"));
 
}

}
                                                   