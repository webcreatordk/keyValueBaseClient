
package webservices;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "ServiceNotInitializedException", targetNamespace = "http://webServices/")
public class ServiceNotInitializedException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ServiceNotInitializedException faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public ServiceNotInitializedException_Exception(String message, ServiceNotInitializedException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public ServiceNotInitializedException_Exception(String message, ServiceNotInitializedException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: webservices.ServiceNotInitializedException
     */
    public ServiceNotInitializedException getFaultInfo() {
        return faultInfo;
    }

}
