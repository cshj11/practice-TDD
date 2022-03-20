package practice.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class testMultiplication {
    /*
    다중 통화를 지원하는 보고서 만들기

    < 할일 목록 >
    $5 + 10CHF = $10(환율이 2:1일 경우)
    -- $5 * 2 = $10
    -- amount를 private으로 만들기
    -- Dollar 부작용(side effect)?
    Money 반올림?
    -- equals()
    hashcode()
    Equal null
    Equal object
    -- 5CHF * 2 = 10CHF
    Dollar/Franc 중복
    공용 equals
    공용 times
    */

    @Test
    public void testMultiplication(){
        Dollar five = new Dollar(5);
        assertEquals(new Dollar(10),five.times(2));
        assertEquals(new Dollar(15),five.times(3));
    }

    @Test
    public void testEquality(){
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }
}

