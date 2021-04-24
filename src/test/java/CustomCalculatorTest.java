import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CustomCalculatorTest {

    private CustomCalculator customCalculator;

    //더하기 테스트를 진행합니다.
    @Test
    public void testAdd() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.add(10,10);
        /* 테스트 코드 입력 */
        assertTrue(result == 20);
    }

    //빼기 테스트 작성
    @Test
    public void testSubtract() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.subtract(30,10);
        assertTrue(result == 20);
    }

    //곱하기 테스트 작성
    @Test
    public void testMultiply() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.multiply(2,3);
        assertTrue(result==6);
    }

    //나누기 테스트 작성
    @Test
    public void testDivide() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.divide(25,5);
        assertTrue(result==5);
    }
}