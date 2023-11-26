package dsa.solutions.microsoft;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonsterGameTest {

    @Test
    void countMonsters() {
        Assertions.assertEquals(MonsterGame.countMonsters(2,4),2);
        Assertions.assertEquals(MonsterGame.countMonsters(1,5),1);
        Assertions.assertEquals(MonsterGame.countMonsters(10,5),1);
        Assertions.assertEquals(MonsterGame.countMonsters(4,4),0);
        Assertions.assertEquals(MonsterGame.countMonsters(10,6),0);
        Assertions.assertEquals(MonsterGame.countMonsters(10,7),5);
        Assertions.assertEquals(MonsterGame.countMonsters(9,10),4);
    }
}