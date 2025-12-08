package allure_tests;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

@Epic("Math Epic")
@Feature("Math feature")


public class AllureTest {

    @Test
    @Description("it additional test")
    @Severity(SeverityLevel.NORMAL)
    @Story("basic math operation")
    public void additional(){
        int a = 2, b = 3;
        int sum = a+b;
        Allure.step("first sep sum = a+b");
        Assert.assertEquals(sum, 5);
    }


    @Test
    @Description("it, additional negative test")
    @Severity(SeverityLevel.CRITICAL)
    @Story("basic math operation")
    public void additionalNegative(){
        int a = 2, b = 3;
        Allure.step("get a and b");
        int sum = a+b;
        Allure.step("first sep sum = a+b");
        Assert.assertEquals(sum, 6);
    }
}
