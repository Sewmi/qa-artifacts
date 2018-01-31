package org.sample.client;

import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import org.apache.axis2.transport.http.HttpTransportProperties;
import org.wso2.carbon.identity.application.common.model.xsd.ServiceProvider;
import org.wso2.carbon.identity.application.mgt.stub.IdentityApplicationManagementServiceIdentityApplicationManagementException;
import org.wso2.carbon.identity.application.mgt.stub.IdentityApplicationManagementServiceStub;

import java.rmi.RemoteException;


/**
 * Created by sewmini on 1/28/18.
 * This is a sample client to update service provider (admin_DefaultApplication_SANDBOX) description created in WSO2 identity server.
 */
public class IdentityApplicationManagementServiceClient {

    private String username = "admin";
    private String password = "admin";
    private IdentityApplicationManagementServiceStub stub = null;
    private String applicationManagmentHostUrl = "https://localhost:9444//services/IdentityApplicationManagementService";

    public static void main(String[] args){

        IdentityApplicationManagementServiceClient serviceClient = new IdentityApplicationManagementServiceClient();
        ServiceProvider serviceProvider = serviceClient.getServiceProvider("admin_DefaultApplication_SANDBOX");
        if (serviceProvider !=null){
            serviceClient.printSPInfo(serviceProvider);
            serviceProvider.setDescription("My updated description of the SP1.");
            serviceClient.updateServiceProvider(serviceProvider);
        }else{
            System.out.println("Error: SP = null.");
        }
        serviceProvider = serviceClient.getServiceProvider("admin_DefaultApplication_SANDBOX");
        if (serviceProvider !=null){
            serviceClient.printSPInfo(serviceProvider);
        }else{
            System.out.println("Error: SP = null. Cannot print service provider details");
        }
    }

    public  IdentityApplicationManagementServiceClient(){
        try {
            stub = new IdentityApplicationManagementServiceStub(null, applicationManagmentHostUrl);
            ServiceClient client = stub._getServiceClient();
            authenticate(client);
        } catch (AxisFault axisFault) {
            System.out.println("Error while creating the service Stub and the client");
            axisFault.printStackTrace();
        }

    }

    private void authenticate(ServiceClient client) {
        Options option = client.getOptions();
        HttpTransportProperties.Authenticator auth = new HttpTransportProperties.Authenticator();
        auth.setUsername(username);
        auth.setPassword(password);
        auth.setPreemptiveAuthentication(true);
        option.setProperty(org.apache.axis2.transport.http.HTTPConstants.AUTHENTICATE, auth);
        option.setManageSession(true);
    }

    public ServiceProvider getServiceProvider(String serviceProviderName){
        ServiceProvider serviceProvider=null;
        try{
            serviceProvider = stub.getApplication(serviceProviderName);
        }catch (AxisFault axisFault) {
            System.out.println("axisFault" + axisFault.getMessage());
            axisFault.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (IdentityApplicationManagementServiceIdentityApplicationManagementException e) {
            e.printStackTrace();
        }
        return serviceProvider;
    }

    public void updateServiceProvider(ServiceProvider serviceProviderNeedToBeUpdated){
        try {
            stub.updateApplication(serviceProviderNeedToBeUpdated);
        } catch (RemoteException e) {
            System.out.println("Error while updating service provider " + serviceProviderNeedToBeUpdated.getApplicationName());
            e.printStackTrace();
        } catch (IdentityApplicationManagementServiceIdentityApplicationManagementException e) {
            System.out.println("Error while updating service provider " + serviceProviderNeedToBeUpdated.getApplicationName());
            e.printStackTrace();
        }

    }

    private void printSPInfo(ServiceProvider serviceProvider) {
        System.out.println("######" + "\n" +
                "App ID:" + serviceProvider.getApplicationID() + "\n" +
                "App Name:" + serviceProvider.getApplicationName() + "\n" +
                "App Description:" + serviceProvider.getDescription());
    }
}


