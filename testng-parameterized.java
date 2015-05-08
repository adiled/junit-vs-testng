

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
