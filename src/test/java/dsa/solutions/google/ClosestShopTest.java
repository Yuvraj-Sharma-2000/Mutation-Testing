package dsa.solutions.google;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClosestShopTest{

    int[] x = null;
    int[] y = null;

    int[] ans = null;

    @Test
    void closestShop(){
        x = new int[]{2,4,2};
        y = new int[]{5,1,2,3};
        ans = new int[]{2,3,2};
        Assertions.assertArrayEquals(ans,ClosestShop.closestShop(3,x,4,y));

        x = new int[]{5,10,17};
        y = new int[]{1,5,20,11,16};
        ans = new int[]{5,11,16};
        Assertions.assertArrayEquals(ans,ClosestShop.closestShop(3,x,5,y));


        x = new int[]{14,13,2,2};
        y = new int[]{3,14,13,9,3,15,4,4};
        ans = new int[]{14,13,3,3};
        Assertions.assertArrayEquals(ans,ClosestShop.closestShop(4,x,8,y));

        x = new int[]{14 ,11 ,2 ,8 ,12 ,1 ,12 ,12 ,8};
        y = new int[]{5 ,12 ,13 ,11 ,4 ,11 ,6 ,3 ,10};
        ans = new int[]{13 ,11 ,3 ,6 ,12 ,3 ,12 ,12 ,6};
        Assertions.assertArrayEquals(ans,ClosestShop.closestShop(9,x,9,y));



    }
}