package webservicesClient;

import webservices.FileNotFoundException_Exception;
import webservices.IOException_Exception;
import webservices.KVBServer;
import webservices.KVBServerService;
import webservices.KeyImpl;
import webservices.KeyNotFoundException_Exception;
import webservices.ServiceAlreadyInitializedException_Exception;
import webservices.ServiceInitializingException_Exception;
import webservices.ServiceNotInitializedException_Exception;

public class KVBClient {

	/**
	 * @param args
	 * @throws ServiceNotInitializedException_Exception 
	 * @throws KeyNotFoundException_Exception 
	 * @throws IOException_Exception 
	 * @throws ServiceInitializingException_Exception 
	 * @throws ServiceAlreadyInitializedException_Exception 
	 * @throws FileNotFoundException_Exception 
	 */
	public static void main(String[] args) throws IOException_Exception, KeyNotFoundException_Exception, ServiceNotInitializedException_Exception, FileNotFoundException_Exception, ServiceAlreadyInitializedException_Exception, ServiceInitializingException_Exception {
		// TODO Auto-generated method stub
		KVBServerService kvbService=new KVBServerService();
		KVBServer kvb=kvbService.getKVBServerPort();
		
		kvb.init("testinitdata");
		//KeyImpl test1 = new KeyImpl(2);

		kvb.read(new KeyImpl());
//		kvb.read(new KeyImpl(12));
	}
}
