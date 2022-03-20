package practice.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testMultiplication {
    /*
    다중 통화를 지원하는 보고서 만들기

    < 할일 목록 >
    $5 + 10CHF = $10(환율이 2:1일 경우)
    $5 * 2 = $10
    amount를 private으로 만들기
    Dollar 부작용(side effect)?
    Money 반올림?
    */

    @Test
    public void testMultiplication(){
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10,five.amount);
    }

}

