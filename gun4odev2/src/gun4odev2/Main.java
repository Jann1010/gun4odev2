package gun4odev2;

import java.time.LocalDate;

import gun4odev2.Abstract.BaseCustomerManager;
import gun4odev2.Concrete.NeroCustomerManager;
import gun4odev2.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.save(new Customer(1, "Engin", "Demiroð", LocalDate.of(1985, 1, 6), "28861499108"));
	}

}
