

/* ============================================
== JUnit PARAMETERIZED TESTING - Version 4.5+
===============================================*/


@RunWith(Parameterized.class)
public class FibonacciTest {
    
    private Integer input, expected;

    @Parameters
    public static List data() {
        return Arrays.asList(new Integer[][] { { 0, 0 }, { 1, 1 }, { 2, 1 }, { 3, 2 }, { 4, 3 }, { 5, 5 }, { 6, 8 } });
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before")
    }

    public FibonacciTest(Integer input, Integer expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void FibonacciTest() {
        System.out.println("Input: " + input + " Expected: " + expected);
        Assert.assertEquals(expected, Fibonacci.compute(input));
        assertEquals(expected, Fibonacci.compute(input));
    }
}



/* ===================================================
== TestNG PARAMETERIZED TESTING - USING DATA PROVIDERS
====================================================== */

public class ParamTestWithDataProvider1 {
   private PrimeNumberChecker primeNumberChecker;
   
   @BeforeMethod
   public void initialize() {
      primeNumberChecker = new PrimeNumberChecker();
   }
   
   // Set the Data Provider
   @DataProvider(name = "dpname")
   public static Object[][] primeNumbers() {
      return new Object[][] {{2, true}, {6, false}, {19, true}, {22, false}, {23, true}};
   }

   // Use the Data Provider
   @Test(dataProvider = "dpname")
   public void testPrimeNumberChecker(Integer inputNumber, Boolean expectedResult) {
      System.out.println(inputNumber + " " + expectedResult);
      
      Assert.assertEquals(expectedResult, primeNumberChecker.validate(inputNumber));
   }
}
