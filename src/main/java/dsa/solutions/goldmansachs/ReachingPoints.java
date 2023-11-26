package dsa.solutions.goldmansachs;

public class ReachingPoints {
    public static boolean isReachable(int startX, int startY, int endX, int endY) {
        // If any starting point cordinates are greater than ending point cordinates its unreachable
        if (startX > endX || startY > endY)
            return false;

        while (startX < endX && startY < endY)
            // If endX greater than endY instead of subtracting endX from endY until
            // it becomes less than endY ,we can do mod to avoid many steps
            if (endX > endY)	endX %= endY;
                // Similarly for endY and endX
            else endY %= endX;

        if (startX == endX && endY >= startY && (endY - startY) % endX == 0)
            return true;
        else if (startY == endY && endX >= startX && (endX - startX) % endY == 0)
            return true;
        else
            return false;

    }
}
