package dsa.solutions.adobe;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Stack;
class Point {
    double x, y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
};
public class MaximumTime {
    static double getDistanceSquared(Point pointA, Point pointB) {
        return ((pointA.x - pointB.x) * (pointA.x - pointB.x)) + ((pointA.y - pointB.y) * (pointA.y - pointB.y));
    }

    static double getCrossProduct(Point a, Point b, Point c) {
        return ((b.x - a.x) * (c.y - a.y)) - ((b.y - a.y) * (c.x - a.x));
    }

    private static Point getLowestPoint(ArrayList<Point> points) {

        Point lowestPoint = points.get(0);

        for (Point point : points) {
            if (point.y < lowestPoint.y) {
                lowestPoint = point;
            } else if (point.y == lowestPoint.y && point.x < lowestPoint.x) {
                lowestPoint = point;
            }
        }

        return lowestPoint;
    }

    private static Point[] getConvexHull(ArrayList<Point> points) {

        // Get the lowest-leftmost point
        Point lowestPoint = getLowestPoint(points);

        Collections.sort(points, new Comparator<Point>() {

            @Override
            public int compare(Point o1, Point o2) {
                double crossProduct = getCrossProduct(lowestPoint, o1, o2);
                if (crossProduct == 0) {
                    if (getDistanceSquared(o1, lowestPoint) < getDistanceSquared(o2, lowestPoint)) {
                        return -1;
                    } else {
                        return 1;
                    }
                }
                if (crossProduct * -1 < 0) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });

        // Add first two points in the stack
        Stack<Point> st  =new Stack<>();
        st.add(points.get(0));
        st.add(points.get(1));

        int n = points.size();

        for (int i = 2; i < n; i++) {
            Point nextPoint = points.get(i);
            Point currentPoint = st.pop();

            // If the next point is making a left clockwise turn/ or is colinear remove it
            // from stack
            while (!st.empty() && getCrossProduct(st.peek(), currentPoint, nextPoint) <= 0) {
                currentPoint = st.pop();
            }

            // Add the point that is making counter-clockwise turn
            st.push(currentPoint);
            st.push(nextPoint);
        }

        Point[] convexHull= new Point[st.size()];
        int convexHullStartIndex=0;
        while (!st.empty()) {
            convexHull[convexHullStartIndex++] = st.pop();
        }

        Collections.reverse(Arrays.asList(convexHull));

        // Return the convex hull points
        return convexHull;
    }

    public static double maxTime(int n, int speed, int[][] locations) {

        if (n == 1) {
            return 0;
        }

        // Create an empty array of points
        ArrayList<Point> points = new ArrayList<>();

        // Convert each location into a point and add it to points array
        for (int[] location : locations) {
            Point point = new Point(location[0], location[1]);
            points.add(point);
        }

        // Get the convex hull of the points
        Point[] convexHull = getConvexHull(points);
        int num = convexHull.length;

        // If only two ponits present then all points were colinear
        if (num == 2) {
            double maxDistance = getDistanceSquared(convexHull[0], convexHull[1]);
            maxDistance = Math.sqrt(maxDistance);
            return maxDistance / speed;
        }

        // Set the midHull as it divides hull into lower and upper hull
        int midHull = 1;

        while (Math.abs(getCrossProduct(convexHull[num - 1], convexHull[0], convexHull[(midHull + 1) % num])) > Math.abs(
                getCrossProduct(convexHull[num - 1], convexHull[0], convexHull[(midHull)]))) {
            midHull++;
        }

        // Points with largest distance cannot be in the same part of the hull
        // Points to traverse the lower and upper hull
        int lower = 0, upper = midHull;

        double maxDistance = 0;

        while ((lower < midHull) || (upper < num)) {
            // Store the square of the maximum distance
            maxDistance = Math.max(maxDistance, getDistanceSquared(convexHull[lower], convexHull[upper]));

            // If the next point in the upper hull has bigger area of triangle then increase
            // go to that point
            if (Math.abs(getCrossProduct(convexHull[lower], convexHull[(upper + 1) % num],
                    convexHull[(lower + 1) % num])) > Math.abs(
                    getCrossProduct(convexHull[lower], convexHull[upper], convexHull[(lower + 1) % num]))) {
                upper++;
            }

            // Otherwise go to the next point in lower hull
            else {
                lower++;
            }
        }

        maxDistance = Math.sqrt(maxDistance);

        // Calculate the answer
        double ans = maxDistance / speed;

        // Finally return the answer
        return ans;

    }
}
