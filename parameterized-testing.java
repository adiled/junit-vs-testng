

/* ============================================
== JUNIT PARAMETERIZED TESTING - Version 4.5+
===============================================*/


@RunWith(Parameterized.class)
public class FibonacciTest {
    
    private Integer input;
    private Integer expected;

    @Parameters
    public static List data()
    {
        return Arrays.asList(new Integer[][] { { 0, 0 }, { 1, 1 }, { 2, 1 }, { 3, 2 }, { 4, 3 }, { 5, 5 }, { 6, 8 } });
    }

    @BeforeClass
    public static void beforeClass()
    {
        System.out.println("Before")
    }

    public FibonacciTest(Integer input, Integer expected)
    {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void FibonacciTest()
    {
        System.out.println("Input input + ". Expected: " + expected);
        // Assert.assertEquals(expected, Fibonacci.compute(input));
        // assertEquals(expected, Fibonacci.compute(input));
    }
}



/* ===================================================
== TestNG PARAMETERIZED TESTING - USING DATA PROVIDERS
====================================================== */

public class LookupServiceTests extends BaseTestCase
{

    @Test(dataProvider = "LookupValueProvider", dataProviderClass = LookupValueDataProvider.class)
    public void testGetAllLookupValues(String row, LookupValueRequest request, LookupValueResponse expectedResponse)
    {
        ILookupManager manager = super.getLookupManager();
        LookupValueResponse actualResponse = manager.getLookupValues(request);
        Assert.assertEquals(actualResponse.getStatus(), expectedResponse.getStatus());
    }
}
