package dsa.solutions.adobe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChristmasAtOfficeTest {

    @Test
    void totalStrings() {
        assertEquals(ChristmasAtOffice.totalStrings("abc"), 5);
        assertEquals(ChristmasAtOffice.totalStrings("aabc"), 8);
        assertEquals(ChristmasAtOffice.totalStrings("jim"), 5);
        assertEquals(ChristmasAtOffice.totalStrings("beet"), 9);
        assertEquals(ChristmasAtOffice.totalStrings("abcabc"), 11);
        assertEquals(ChristmasAtOffice.totalStrings("a"), 1);
        assertEquals(ChristmasAtOffice.totalStrings("abb"), 6);
        assertEquals(ChristmasAtOffice.totalStrings("abbab"), 15);
        assertEquals(ChristmasAtOffice.totalStrings("lmnlln"), 14);
        assertEquals(ChristmasAtOffice.totalStrings("qwqwqww"), 28);
        assertEquals(ChristmasAtOffice.totalStrings("abaaca"), 17);
        assertEquals(ChristmasAtOffice.totalStrings("sts"), 6);
        assertEquals(ChristmasAtOffice.totalStrings("dfaadaad"), 26);
        assertEquals(ChristmasAtOffice.totalStrings("bt"), 3);
        assertEquals(ChristmasAtOffice.totalStrings("xxeeexcexec"), 32);

    }
}