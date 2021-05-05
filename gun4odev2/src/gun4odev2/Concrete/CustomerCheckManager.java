package gun4odev2.Concrete;

import gun4odev2.Abstract.CustomerCheckService;
import gun4odev2.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
	}
		
}
