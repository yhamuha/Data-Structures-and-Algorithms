package lc.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BaseballGameTest {

    BaseballGame solution;
    @BeforeEach
    void Setup(){
    solution = new BaseballGame();
    }

    @Test
    void baseballTest1(){
        String[] s = {"5","2","C","D","+"};

        int expected = 30;
        int result = solution.calPoints(s);
        assertEquals(expected, result);
    }

    @Test
    void baseballTest2(){
        String[] s = {"1","C"};
        int expected = 0;
        int result = solution.calPoints(s);
        assertEquals(expected, result);
    }

}