package gun4odev2.Adapters;

import gun4odev2.Abstract.CustomerCheckService;
import gun4odev2.Entities.Customer;
import java.rmi.RemoteException;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
}
