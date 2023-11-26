package dsa.solutions.amazon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringwithAtMostKDistinctCharactersTest {
    LongestSubstringwithAtMostKDistinctCharacters v = null;
    public LongestSubstringwithAtMostKDistinctCharactersTest() {
        v = new LongestSubstringwithAtMostKDistinctCharacters();
    }

    @Test
    void kDistinctChars() {
        Assertions.assertEquals(v.kDistinctChars(2,"abbbbbbc"),7);
        Assertions.assertEquals(v.kDistinctChars(3,"abcddefg"),4);
        Assertions.assertEquals(v.kDistinctChars(3,"aaaaaaaa"),8);
        Assertions.assertEquals(v.kDistinctChars(1,"abcefg"),1);
        Assertions.assertEquals(v.kDistinctChars(6,"zcviqwyuydegijtgwxujqdn"),7);
        Assertions.assertEquals(v.kDistinctChars(3,"cglnbksuyrl"),3);
        Assertions.assertEquals(v.kDistinctChars(17,"uvtptxgtckttipjpnewpc"),21);
        Assertions.assertEquals(v.kDistinctChars(2,"onfqziylxcbnmcpldjztpvjcjcwku"),4);
    }
}