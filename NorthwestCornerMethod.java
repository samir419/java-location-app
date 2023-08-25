/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxapplication1;

/**
 *
 * @author Hello
 */
public class NorthwestCornerMethod {
    public static int[][] northwestCornerMethod(int[] supply, int[] demand, int[][] costMatrix) {
        int numRows = supply.length;
        int numCols = demand.length;
        int[][] result = new int[numRows][numCols];
        
        int i = 0, j = 0;
        
        while (i < numRows && j < numCols) {
            int quantity = Math.min(supply[i], demand[j]);
            result[i][j] = quantity;
            supply[i] -= quantity;
            demand[j] -= quantity;
            
            if (supply[i] == 0) {
                i++;
            }
            if (demand[j] == 0) {
                j++;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] supply = {20, 30};
        int[] demand = {10, 25, 15};
        int[][] costMatrix = {
            {16, 18, 20},
            {14, 16, 18}
        };
        
        int[][] result = northwestCornerMethod(supply, demand, costMatrix);
        
        System.out.println("Optimal Solution:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
