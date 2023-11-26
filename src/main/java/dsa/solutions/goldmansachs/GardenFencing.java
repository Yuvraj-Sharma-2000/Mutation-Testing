package dsa.solutions.goldmansachs;

import java.util.ArrayList;

public class GardenFencing {
    public static double[] gardenFencing(int n, int[][] trees) {
        // Container to store the points lying on the boundary
        ArrayList<ArrayList<Double>> boundaryPts = new ArrayList<ArrayList<Double>>();

        // Inital call to the recursive function 'SEC' to caclulate the smallest enclosing circle
        ArrayList<Double> ans = smallestEnclosingCircle(n - 1, boundaryPts, trees);

        double[] finalAns = new double[ans.size()];
        for(int i = 0; i < ans.size(); i++){
            finalAns[i] = (double)ans.get(i);
        }

        return finalAns;
    }

    public static ArrayList<Double> smallestEnclosingCircle(int i, ArrayList<ArrayList<Double>> bPts,
                                                            int[][] trees) {

        ArrayList<ArrayList<Double>> boundaryPts = new ArrayList<ArrayList<Double>>(bPts);

        // Base condition
        if (i == -1 || boundaryPts.size() == 3){
            // Find the smallest circle from the points in 'boundaryPts'
            return findCircle(boundaryPts);
        }

        // Recursively call the (i - 1)'th tree to calculate the smallest circle enclosing i - 1 trees
        ArrayList<Double> circle = smallestEnclosingCircle(i - 1, boundaryPts, trees);

        // Variables to store the coordinates of the current tree
        Double curX = trees[i][0] * 1.0;
        Double curY = trees[i][1] * 1.0;

        // Calculate distance of the current tree from the center of the smallest circle enclosing 'i-1' trees
        Double distToCenter = distance(curX, curY, circle.get(0), circle.get(1));

        // If the current tree lies inside the smallest enclosing circle
        if (distToCenter <= circle.get(2)){
            // The SEC will remain the same and we will now calculate SEC for (i+1) trees
            return circle;
        }

        /*
            If the current tree lies outside the smallest enclosing circle
            Then, current tree will surely lie on the boundary
        */
        ArrayList<Double> temp = new ArrayList<Double>();
        temp.add(curX);
        temp.add(curY);
        boundaryPts.add(temp);

        // Calculating the SEC for for first 'i' trees and i'th tree will surely lie on the boundary
        return smallestEnclosingCircle(i - 1, boundaryPts, trees);
    }

    public static ArrayList<Double> findCircle(ArrayList<ArrayList<Double>> b){
        // No boundary points
        if (b.size() == 0) {
            return new ArrayList<Double>() {
                {
                    add(0.0);
                    add(0.0);
                    add(0.0);
                }
            };
        }

        // Smallest circle formed by 1 point
        else if (b.size() == 1) {
            return new ArrayList<Double>() {
                {
                    add(b.get(0).get(0));
                    add(b.get(0).get(1));
                    add(0.0);
                }
            };
        }

        // Smallest circle formed by 2 points
        else if (b.size() == 2) {
            Double xCoord = (b.get(0).get(0) + b.get(1).get(0)) / 2;
            Double yCoord = (b.get(0).get(1) + b.get(1).get(1)) / 2;
            Double radius = distance(b.get(0).get(0), b.get(0).get(1),
                    b.get(1).get(0), b.get(1).get(1)) / 2;

            return new ArrayList<Double>() {
                {
                    add(xCoord);
                    add(yCoord);
                    add(radius);
                }
            };
        }

        // Smallest circle formed by 3 points
        else {
            return circleFrom3Pts(b.get(0).get(0), b.get(0).get(1), b.get(1).get(0),
                    b.get(1).get(1), b.get(2).get(0), b.get(2).get(1));
        }
    }

    // Function to accurately calculate the circle formed by 3 points
    public static ArrayList<Double> circleFrom3Pts(Double aX, Double aY, Double bX, Double bY,
                                                   Double cX, Double cY) {

        Double baX = bX - aX, baY = bY - aY, caX = cX - aX, caY = cY - aY;

        Double x = baX * baX + baY * baY;
        Double y = caX * caX + caY * caY;
        Double z = baX * caY - baY * caX;

        Double xCoord = (caY * x - baY * y) / (2 * z) + aX;
        Double yCoord = (baX * y - caX * x) / (2 * z) + aY;

        Double radius = distance(xCoord, yCoord, aX, aY);

        return new ArrayList<Double>() {
            {
                add(xCoord);
                add(yCoord);
                add(radius);
            }
        };
    }

    // Function to calculate distance b/w 2 points
    public static Double distance(Double x1, Double y1, Double x2, Double y2) {
        return (Double)Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }
}