package dsa.solutions.goldmansachs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class QueriesOnStringsListTest {
    ArrayList<ArrayList<String>> list = null;
    ArrayList<String> ans = null;
    @Test
    void stringQueries() {
        list = new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList("Add", "code")),
                new ArrayList<>(Arrays.asList("GetMaxKey")),
                new ArrayList<>(Arrays.asList("GetMinKey"))
        ));
        ans = new ArrayList<>(List.of(new String[]{"code", "code"}));
        assertEquals(QueriesOnStringsList.stringQueries(list),ans);

        list = new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList("Add", "abc")),
                new ArrayList<>(Arrays.asList("Add", "aaa")),
                new ArrayList<>(Arrays.asList("Add", "pqrs")),
                new ArrayList<>(Arrays.asList("Rem", "pqrs")),
                new ArrayList<>(Arrays.asList("Add", "abc")),
                new ArrayList<>(Arrays.asList("Add", "cd")),
                new ArrayList<>(Arrays.asList("GetMaxKey")),
                new ArrayList<>(Arrays.asList("Rem", "abc")),
                new ArrayList<>(Arrays.asList("GetMinKey"))
        ));
        ans = new ArrayList<>(List.of(new String[]{"abc", "aaa"}));
        assertEquals(QueriesOnStringsList.stringQueries(list),ans);

        list = new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList("Add", "code")),
                new ArrayList<>(Arrays.asList("Add","ing")),
                new ArrayList<>(Arrays.asList("Add","ninja")),
                new ArrayList<>(Arrays.asList("Add","ing")),
                new ArrayList<>(Arrays.asList("Rem","code")),
                new ArrayList<>(Arrays.asList("GetMinKey")),
                new ArrayList<>(Arrays.asList("Add","ninja")),
                new ArrayList<>(Arrays.asList("GetMaxKey"))
        ));
        ans = new ArrayList<>(List.of(new String[]{"ninja", "ing"}));
        assertEquals(QueriesOnStringsList.stringQueries(list),ans);

        list = new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList("Add", "njm")),
                new ArrayList<>(Arrays.asList("Add", "njm")),
                new ArrayList<>(Arrays.asList("Rem", "njm")),
                new ArrayList<>(Arrays.asList("Rem", "njm")),
                new ArrayList<>(Arrays.asList("Add", "njm")),
                new ArrayList<>(Arrays.asList("GetMaxKey"))
        ));
        ans = new ArrayList<>(List.of(new String[]{"njm"}));
        assertEquals(QueriesOnStringsList.stringQueries(list),ans);

        list = new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList("Add", "u")),
                new ArrayList<>(Arrays.asList("Add", "u")),
                new ArrayList<>(Arrays.asList("GetMinKey")),
                new ArrayList<>(Arrays.asList("Rem", "u")),
                new ArrayList<>(Arrays.asList("GetMinKey"))
        ));
        ans = new ArrayList<>(List.of(new String[]{"u","u"}));
        assertEquals(QueriesOnStringsList.stringQueries(list),ans);
    }
}