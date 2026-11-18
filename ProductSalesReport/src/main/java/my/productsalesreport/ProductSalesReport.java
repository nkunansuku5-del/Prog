/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package my.productsalesreport;

/**
 *
 * @author Student
 */
public class ProductSalesReport { 

    public static void main(String[] args) { 

        String[] products = {"cozy nightligths monarch mattress","rsetonic barbados mattress ","sealy phuket mattress"};

        String[] months = {"month 1","month 2","month 3"};
        
 

  

        // 2D array: rows = movies, columns = months 

        int[][] sales = { 

            {25,18,20 },
            {15,10,12},
            {18,15,20}, 

        }; 

  

        int[] totalSales = new int[products.length];
        double[] averagesales = new double[products.length];
        

  

        System.out.println("Products SALES REPORT - 2026"); 

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

                totalSales[i] += sales[i][j]; 

            } 
            
        

            System.out.println(); 

        } 
        
        

  

        System.out.println(); 

        for (int i = 0; i < products.length; i++) { 

            System.out.println("Enter the number of sales for " + months[i] + " : " + products[i] + " " + totalSales[i]); 

        } 

  

        // Find top performing product 

        int top = 0; 

        for (int i = 1; i < totalSales.length; i++) { 

            if (totalSales[i] > totalSales[top]) { 

                top = i; 

            } 

        } 

  

        System.out.println(); 
        
        System.out.println("Total product sales:" + averagesales);

        System.out.println("Most popular product: " + products[top]); 

    } 

} 

 
