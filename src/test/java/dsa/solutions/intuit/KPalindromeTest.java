package dsa.solutions.intuit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KPalindromeTest {

    @Test
    void isPalindrome() {
        assertEquals(KPalindrome.isPalindrome(1,"abba"),true);
        assertEquals(KPalindrome.isPalindrome(2,"abcca"),true);
        assertEquals(KPalindrome.isPalindrome(1,"abc"),false);
        assertEquals(KPalindrome.isPalindrome(1,"abb"),true);
        assertEquals(KPalindrome.isPalindrome(1,"z"),true);
        assertEquals(KPalindrome.isPalindrome(3,"hello"),true);
        assertEquals(KPalindrome.isPalindrome(1,"deeeee"),true);
        assertEquals(KPalindrome.isPalindrome(2,"zezezezeze"),true);
        assertEquals(KPalindrome.isPalindrome(1,"wwwwwss"),false);
        assertEquals(KPalindrome.isPalindrome(2,"hozmollomzoh"),true);
        assertEquals(KPalindrome.isPalindrome(2,"wnnzzzubmaqctx"),false);
    }
}