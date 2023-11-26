package dsa.solutions.adobe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumDeletionsTest {

    @Test
    void minDeletions() {
        assertEquals(MinimumDeletions.minDeletions("aabbbab"),1);
        assertEquals(MinimumDeletions.minDeletions("aabbbb"),0);
        assertEquals(MinimumDeletions.minDeletions("bbaaabb"),2);
        assertEquals(MinimumDeletions.minDeletions("aaaabba"),1);
        assertEquals(MinimumDeletions.minDeletions("aababababb"),3);
        assertEquals(MinimumDeletions.minDeletions("abbbabab"),2);
        assertEquals(MinimumDeletions.minDeletions("abbaabba"),3);
        assertEquals(MinimumDeletions.minDeletions("bbaba"),2);
        assertEquals(MinimumDeletions.minDeletions("bbabaaab"),3);
        assertEquals(MinimumDeletions.minDeletions("aaba"),1);
        assertEquals(MinimumDeletions.minDeletions("aaaaabbb"),0);
        assertEquals(MinimumDeletions.minDeletions("aaaabbabaabba"),4);
    }
}