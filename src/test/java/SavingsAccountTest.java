import org.example.SavingsAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class SavingsAccountTest
{
    @Test
    public void testWithdraw()
    {
        System.out.println("Testing Withdraw");
        System.out.println("Tested withdraw");
        double openingBal = 4000;
        double amountToWithdraw = 2000;
        SavingsAccount acc2= new SavingsAccount(openingBal);
        Assertions.assertTrue(acc2 !=null);
        System.out.println("Object Creation Test case passed...");
        acc2.withdraw(amountToWithdraw);
        double expectedBal = openingBal-amountToWithdraw;
        Assertions.assertEquals(expectedBal,acc2.getBalance());
        System.out.println("Withdraw test case has been passed...");
        acc2.getBalance();
        System.out.println("Withdrawn tested");
    }
}
