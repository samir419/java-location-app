/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxapplication1;

/**
 *
 * @author Hello
 */
public class CriticalPathMethod {
    public static int calculateCriticalPath(int[][] adjacencyMatrix, int[] durations) {
        int numActivities = durations.length;
        int[] earliestStart = new int[numActivities];
        int[] earliestFinish = new int[numActivities];
        
        earliestStart[0] = 0;
        earliestFinish[0] = durations[0];
        
        for (int i = 1; i < numActivities; i++) {
            int maxPrevFinish = 0;
            for (int j = 0; j < i; j++) {
                if (adjacencyMatrix[j][i] == 1 && earliestFinish[j] > maxPrevFinish) {
                    maxPrevFinish = earliestFinish[j];
                }
            }
            earliestStart[i] = maxPrevFinish;
            earliestFinish[i] = maxPrevFinish + durations[i];
        }
        
        int criticalPathLength = earliestFinish[numActivities - 1];
        return criticalPathLength;
    }

    public static void main(String[] args) {
        int numActivities = 6;
        int[] durations = {3, 2, 5, 4, 2, 3};
        
        int[][] adjacencyMatrix = {
            {0, 1, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0},
            {0, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 1, 0},
            {0, 0, 0, 0, 0, 1},
            {0, 0, 0, 0, 0, 0}
        };
        
        int criticalPathLength = calculateCriticalPath(adjacencyMatrix, durations);
        System.out.println("Critical Path Length: " + criticalPathLength);
    }
}
