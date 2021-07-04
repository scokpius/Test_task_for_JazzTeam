package tests;

import calculations.Function;
import org.junit.Assert;
import org.junit.Test;



public class FunctionTest {
    private static final String MSG = "Test execution for Function is not correct!";
    private Function function;


    @Test
    public void verifyCalculatingTheCostOfCarInsuranceMin() {
        function = new Function(3, 0,85);
        Assert.assertEquals(MSG,  function.getAuto_insurance_cost(),210,0);
    }
    @Test
    public void verifyCalculatingTheCostOfCarInsurance() {
        function = new Function(0, 1,140);
        Assert.assertEquals(MSG,  function.getAuto_insurance_cost(), 651,0);
    }
}
