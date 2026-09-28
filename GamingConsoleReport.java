/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gamingconsolereport;

/**
 *
 * @author Student
 */
import java.util.ArrayList;
public class GamingConsoleReport {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // Array containes the city name 
        String[] cities = {
            "CAPE TOWN",
            "PORT ELIZABETH",
            "PRETORIA"
         };
         // 2D Array        
        int[][] sales = {
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200}
        };
        
        int [] totalOfCity = new int[3];
        
        int highSales = 0;
        String cityWithMostSales = "";
        
        for(int i=0; i< cities.length; i++) {
            int total = 0;
            ; 
            for(int j = 0; j< sales [i].length; j++){
                 total = total + sales[i][j];
        }
            totalOfCity[i] = total;
            
        if (total > highSales) {
            highSales = total;
            cityWithMostSales = cities[i];
        }    
            
        }
        // Report Displaying 
        System.out.println("====================================");
        System.out.println("       GAMING CONSOLE REPORT         ");
        System.out.println("======================================");
        System.out.printf("%-20s %-10s %-10s %-10s%n",
        "CITY", "PS5", "XBOX", "SWITCH");
        
        for(int i= 0; i<cities.length; i++) {
            System.out.printf("%-20s %-10d %-10d %-10d%n",
                    cities[i],
                    sales[i][0],
                    sales[i][1],
                    sales[i][2]);
        }
        System.out.println();
        System.out.println("========================================");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("=========================================");
        
        for (int i= 0; i<cities.length; i++) {
             System.out.println(cities[i] + ":" + totalOfCity[i]);
        }
         System.out.println();
          System.out.println("CITY WITH THE MOST SALES:" + cityWithMostSales);
           System.out.println("TOTALS SALES: " + highSales);
           
            System.out.println("=========================================");
        }
    }

