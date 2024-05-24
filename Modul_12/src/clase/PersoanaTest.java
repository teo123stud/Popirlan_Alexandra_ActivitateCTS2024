package clase;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersoanaTest {
    // teste corectitudine
    @Test
    public void getSexReturnFeminin6() {
        Persoana persoanaF = new Persoana("Maria", "6020311659866");
        assertEquals(persoanaF.getSex(), "F");
    }
    @Test
    public void getSexReturnFeminin4() {
        Persoana persoanaF = new Persoana("Maria", "4020311659866");
        assertEquals(persoanaF.getSex(), "F");
    }
    @Test
    public void getSexReturnFeminin2() {
        Persoana persoanaF = new Persoana("Maria", "2020311659866");
        assertEquals(persoanaF.getSex(), "F");
    }

    @Test
    public void getSexReturnMasculin5() {
        Persoana persoanaM = new Persoana("Marian", "5020311659866");
        assertEquals(persoanaM.getSex(), "M");
    }
    @Test
    public void getSexReturnMasculin3() {
        Persoana persoanaM = new Persoana("Marian", "3020311659866");
        assertEquals(persoanaM.getSex(), "M");
    }
    @Test
    public void getSexReturnMasculin1() {
        Persoana persoanaM = new Persoana("Marian", "1020311659866");
        assertEquals(persoanaM.getSex(), "M");
    }

    @Test
    public void getSexReturnNA() {
        Persoana persoanaNA = new Persoana("Marian", "9020311659866");
        assertEquals(persoanaNA.getSex(), "N/A");
    }

    // teste boundary - pentru valorile 1 si 6
    @Test
    public void getSexReturnLimitaInferioara() {
        Persoana persoanaM = new Persoana("Marian", "1020311659866");
        assertEquals(persoanaM.getSex(), "M");
    }
    @Test
    public void getSexReturnLimitaSuperioara() {
        Persoana persoanaM = new Persoana("Marian", "6020311659866");
        assertEquals(persoanaM.getSex(), "F");
    }

    @Test
    public void getSexParitate() {
        Persoana pers2 = new Persoana("Andrei", "5020311659866");
        String sex;
        if(Integer.valueOf(pers2.CNP.charAt(0))%2 ==0){
            sex = String.valueOf('F');
        } else{
            sex = String.valueOf('M');
        }
        assertEquals(pers2.getSex(), sex);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void getSexErrorCNP() {
        Persoana pers = new Persoana("Andrei", "9020311659866");
        pers.getSex();
    }

    @org.junit.Test(expected = NullPointerException.class)
    public void getSexErrorInvalidCharacter() {
        Persoana pers = new Persoana("Andrei", "");
        pers.getSex();
    }

    @org.junit.Test(timeout = 200)
    public void getSexPerformance() {
        Persoana pers = new Persoana("Andrei", "6021118410090");
        pers.getSex();
    }

    @org.junit.Test
    public void getSexCorrect() {
        Persoana pers = new Persoana("Andrei", "1021118410090");
        assertEquals(1, pers.getSex().length());
    }

    @org.junit.Test
    public void getSexCorrectByLetter() {
        Persoana pers = new Persoana("Andrei", "3021118410090");
        boolean isCorrect = pers.getSex().toLowerCase().equals("m") || pers.getSex().toLowerCase().equals("f");
        assertTrue(isCorrect);
    }

    @org.junit.Test
    public void getSexOrdering() {
        Persoana pers1 = new Persoana("Andrei", "5021118410090");
        Persoana pers2 = new Persoana("Andrei", "6021118410090");
        assertTrue(pers2.getSex().compareTo(pers1.getSex()) < 0);
    }

    @org.junit.Test
    public void getSexRange() {
        Persoana pers1 = new Persoana("Andrei", "8021118410090");
        assertEquals(true, pers1.getSex().equals("F"));
    }

    @org.junit.Test(expected = NullPointerException.class)
    public void getSexExistance() {
        Persoana pers1 = new Persoana("Andrei", null);
        pers1.getSex();
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void getSexCardinality() {
        Persoana pers1 = new Persoana("Andrei", "046545675456");
        pers1.getSex();
    }

}