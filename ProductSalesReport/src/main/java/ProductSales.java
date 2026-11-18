/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
public class ProductSales implements IProductSales { 

  

    public int TotalProductSold(int[] productSales) { 

        int total = 0; 

        for (int i = 0; i < productSales.length; i++) { 

            total += productSales[i]; 

        } 

        return total; 

    } 

  

    public String TopProduct(String[] products, int[] totalSales) { 

        int top = 0; 

        for (int i = 1; i < totalSales.length; i++) { 

            if (totalSales[i] > totalSales[top]) { 

                top = i; 

            } 

        } 

        return products[top]; 

    } 

}