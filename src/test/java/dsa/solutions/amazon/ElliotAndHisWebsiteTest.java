package dsa.solutions.amazon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class ElliotAndHisWebsiteTest {
    ArrayList<String> x = null;
    ArrayList<String> y = null;
    @Test
    void getUsernames() {
        x = new ArrayList<>(List.of("ab","ab","ab"));
        y = new ArrayList<>(List.of("ab","ab0","ab1"));
        Assertions.assertEquals(ElliotAndHisWebsite.getUsernames(3,x),y);

        x = new ArrayList<>(List.of("xy","xy1"));
        y = new ArrayList<>(List.of("xy","xy1"));
        Assertions.assertEquals(ElliotAndHisWebsite.getUsernames(2,x),y);

        x = new ArrayList<>(List.of("ninjas","ninjas1","ninjas"));
        y = new ArrayList<>(List.of("ninjas","ninjas1","ninjas0"));
        Assertions.assertEquals(ElliotAndHisWebsite.getUsernames(3,x),y);

        x = new ArrayList<>(List.of("mrrobot","mrobot","mobot","mrrobo","mrrob"));
        y = new ArrayList<>(List.of("mrrobot","mrobot","mobot","mrrobo","mrrob"));
        Assertions.assertEquals(ElliotAndHisWebsite.getUsernames(5,x),y);

        x = new ArrayList<>(List.of("0","01","0","03","0"));
        y = new ArrayList<>(List.of("0","01","00","03","02"));
        Assertions.assertEquals(ElliotAndHisWebsite.getUsernames(5,x),y);

        x = new ArrayList<>(List.of("har","hhar","har"));
        y = new ArrayList<>(List.of("har","hhar","har0"));
        Assertions.assertEquals(ElliotAndHisWebsite.getUsernames(3,x),y);

        x = new ArrayList<>(List.of("02m4pf1z6u5","02m4pf1z6u5","02m4pf1z6u5","02m4pf1z6u5","02m4pf1z6u5","02m4pf1z6u5","02m4pf1z6u5","02m4pf1z6u5"));
        y = new ArrayList<>(List.of("02m4pf1z6u5","02m4pf1z6u50","02m4pf1z6u51","02m4pf1z6u52","02m4pf1z6u53","02m4pf1z6u54","02m4pf1z6u55","02m4pf1z6u56"));
        Assertions.assertEquals(ElliotAndHisWebsite.getUsernames(8,x),y);
    }
}