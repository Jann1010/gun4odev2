package gun4odev2.Abstract;

import gun4odev2.Entities.Customer;

public interface CustomerCheckService {
	boolean checkIfRealPerson(Customer customer);
}
