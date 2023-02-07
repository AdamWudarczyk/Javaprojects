import org.testng.annotations.Test;
import static org.testng.Assert.*;
import org.example.Customer;

//Example of positive and negative test cases 

public class CustomerTest {
    @Test
    public void testGetCustomerId() {
        Customer customer = new Customer(1, "Paul Dorn", 100, 150);
        assertEquals(customer.getCustomerId(), 1);
    }

    @Test
    public void testGetCustomerName() {
        Customer customer = new Customer(1, "Ralf Loauren", 100, 150);
        assertEquals(customer.getCustomerName(), "Karl Berg");
    }

    @Test
    public void testGetUnitsConsumed() {
        Customer customer = new Customer(1, "John Doe", 100, 150);
        assertEquals(customer.getUnitsConsumed(), 50);
    }

    @Test
    public void testGetAmount() {
        Customer customer = new Customer(1, "John Doe", 100, 150);
        assertEquals(customer.getAmount(), 500);
    }
}
