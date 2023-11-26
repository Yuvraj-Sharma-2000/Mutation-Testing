package dsa.solutions.microsoft;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringConcatenationTest {
    String[] x = null;
    @Test
    void stringConcatenation() {
        x = new String[]{"cha", "r", "act", "ers"};
        Assertions.assertEquals(StringConcatenation.stringConcatenation(x),6);

        x = new String[]{"abcdefghijklmnopqrstuvwxyz"};
        Assertions.assertEquals(StringConcatenation.stringConcatenation(x),26);

        x = new String[]{"abc" ,"def" ,"f"};
        Assertions.assertEquals(StringConcatenation.stringConcatenation(x),6);

        x = new String[]{"yy", "bkhwmpbiisbldzknpm"};
        Assertions.assertEquals(StringConcatenation.stringConcatenation(x),0);

        x = new String[]{"bossdsncx" ,"xdgpn" ,"esvohadb" ,"ygozmptpiq" ,"ucyu" ,"lpq" ,"mkuxbp"};
        Assertions.assertEquals(StringConcatenation.stringConcatenation(x),11);

        x = new String[]{"vdjzhk", "wuumqbxjgjxsxaega" ,"trialrmnqermuucizgn", "bxukfiaasuejxhpwji", "vspscpwaltieq", "dicoznwkxouzbdxyvsyxxo", "chkrgwbm" ,"qnteljipgb" ,"upimzeghpevnduokf" ,"plraevdvuwqklphcusf", "pkhaaue" ,"oopgdijqsxsnwrzjoj" ,"oaddwtmdsawryvsohu", "gngnomden" ,"wicrzugvcmxzcwukcuuosp" };
        Assertions.assertEquals(StringConcatenation.stringConcatenation(x),10);

        x = new String[]{"fxvyzkiiacswu" ,"sbabkltsuvhooo", "ucshrrugl", "sutaqb" ,"vojoxiw", "hrqbwwdr" ,"hcpradurdxgajdb", "dnaybdqi" ,"mcjkllbzul", "ljvilil"};
        Assertions.assertEquals(StringConcatenation.stringConcatenation(x),6);

    }
}