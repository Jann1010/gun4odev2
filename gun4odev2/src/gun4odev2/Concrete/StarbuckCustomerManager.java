package gun4odev2.Concrete;

import gun4odev2.Abstract.BaseCustomerManager;
import gun4odev2.Abstract.CustomerCheckService;
import gun4odev2.Entities.Customer;

public class StarbuckCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService customerCheckService;
	
	public StarbuckCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		if (customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		}
		else {
			System.out.println("Not a valid person");
		}
	}
}
