package Dice;

import Dice.Cup;
import Dice.Die;
import Game.MonopolyGameTest;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class CupTest {

    @Test
    void aCupShouldRollDice() {
        MonopolyGameTest.FakeDie fd1 = new MonopolyGameTest.FakeDie();
        fd1.setFaceValue(6);
        MonopolyGameTest.FakeDie fd2 = new MonopolyGameTest.FakeDie();
        fd2.setFaceValue(4);

        LinkedList<Die> dice = new LinkedList<>();
        dice.add(fd1);
        dice.add(fd2);

        Cup cup = new Cup(dice);

        cup.roll();

        assertEquals(10, cup.getTotal());

    }

}