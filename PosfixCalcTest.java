import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author Renatto Guzmán
 *
 */
class PosfixCalcTest {

    @Test
    void testEvaluateSuma() {
        PosfixCalc myPosfixCalc = new PosfixCalc();
        assertEquals(4, myPosfixCalc.Evaluate("2 2 +"));
    }


    @Test
    void testEvaluateResta() {
        PosfixCalc myPosfixCalc = new PosfixCalc();
        assertEquals(5, myPosfixCalc.Evaluate("9 4 -"));
    }


    @Test
    void testEvaluateMultiplicacion() {
        PosfixCalc myPosfixCalc = new PosfixCalc();
        assertEquals(12, myPosfixCalc.Evaluate("3 4 *"));
    }

    @Test
    void testEvaluateDivision() {
        PosfixCalc myPosfixCalc = new PosfixCalc();
        assertEquals(4, myPosfixCalc.Evaluate("8 2 /"));
    }
}
