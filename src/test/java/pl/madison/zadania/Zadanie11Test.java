package pl.madison.zadania;

import org.junit.Test;

import static org.junit.Assert.*;

public class Zadanie11Test {
    Zadanie11 zadanie11 = new Zadanie11();
    @Test
    public void test1() throws Exception {
        int wynik = zadanie11.najwiekszaLiczbaPodzielnaPrzez3(new Integer(1), new Integer(3),
                new Integer(6), new Integer(12), new Integer(15));
        assertEquals(15, wynik);
    }

    @Test
    public void test2() throws Exception {
        int wynik = zadanie11.najwiekszaLiczbaPodzielnaPrzez3(1,2,1,4,7);
        assertEquals(0, wynik);
    }

    @Test
    public void test3() throws Exception {
        int wynik = zadanie11.najwiekszaLiczbaPodzielnaPrzez3(1,2,3,5,6);
        assertNotEquals(1, wynik);
    }

    @Test
    public void test4() throws Exception {
        int wynik = zadanie11.najwiekszaLiczbaPodzielnaPrzez3(33, 15, 12, 3, 0);
        assertEquals(33, wynik);
    }

    @Test
    public void test5() throws Exception {
        int wynik = zadanie11.najwiekszaLiczbaPodzielnaPrzez3(-33, -15, -12, -3, 3);
        assertEquals(3, wynik);
    }

    @Test
    public void test6() throws Exception {
        int wynik = zadanie11.najwiekszaLiczbaPodzielnaPrzez3(-33, -15, -12, -3, 0);
        assertEquals(0, wynik);
    }

    @Test
    public void test7() throws Exception {
        int wynik = zadanie11.najwiekszaLiczbaPodzielnaPrzez3(-33, -15, 33, -3, 0);
        assertEquals(33, wynik);
    }
}