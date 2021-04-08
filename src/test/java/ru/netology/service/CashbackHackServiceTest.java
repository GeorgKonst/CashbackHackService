package ru.netology.service;


import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldSpentZeroRub() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldSpentOneThousandRub() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldSpentLowerOneThousandRub() {
        CashbackHackService service = new CashbackHackService();
        int amount = 700;
        int actual = service.remain(amount);
        int expected = 300;
        assertEquals(actual, expected);
    }
    @Test
    public void shouldSpentOverOneThousandRub() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1300;
        int actual = service.remain(amount);
        int expected = 700;
        assertEquals(actual, expected);
    }
}