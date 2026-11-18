/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
public class Main { 

    public static void main(String[] args) { 

        String[] products = {"cozy nightligths monarch mattress","rsetonic barbados mattress ","sealy phuket mattress"};

        String[] months = {"month 1","month 2","month 3"};
        
        int[][] sales = { 

            {25,18,20 },
            {15,10,12},
            {18,15,20}, 

        }; 


        int[] totalSales = new int[products.length]; 

  

        ProductSales ps = new ProductSales(); 

  

        System.out.println("Product SALES REPORT - 2024"); 

        System.out.println(); 

        System.out.printf("%-15s", ""); 

        for (int j = 0; j < months.length; j++) { 

            System.out.printf("%-10s", months[j]); 

        } 

        System.out.println(); 

        System.out.println("-------------------------------------------------"); 

  

        for (int i = 0; i < products.length; i++) { 

            System.out.printf("%-15s", products[i]); 

            for (int j = 0; j < months.length; j++) { 

                System.out.printf("%-10d", sales[i][j]); 

            } 

            System.out.println(); 

            totalSales[i] = ps.TotalProductSold(sales[i]); 

        } 

  

        System.out.println(); 

        for (int i = 0; i < products.length; i++) { 

            System.out.println("Total Products sales for " + months[i] + " : "+ products[i] + " " + totalSales[i]); 

        } 

  

        System.out.println(); 

        System.out.println("Top performing Product: " + ps.TopProduct(products, totalSales)); 

    } 

} 

 