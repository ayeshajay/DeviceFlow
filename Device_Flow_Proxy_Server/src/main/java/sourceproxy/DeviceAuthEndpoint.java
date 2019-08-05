package sourceproxy;

public class DeviceAuthEndpoint {

    private final String device_code;
    private final String user_code;
    private final String verification_uri;
    private final String verification_uri_complete;


    public DeviceAuthEndpoint(String device_code,String user_code,String verification_uri, String verification_uri_complete) {

        this.device_code = device_code;
        this.user_code = user_code;
        this.verification_uri = verification_uri;
        this.verification_uri_complete = verification_uri_complete;

    }


    public String getDevice_code(){
        return device_code;
    }
    public String getUser_code(){
        return user_code;
    }
    public String getVerification_uri(){
        return verification_uri;
    }
    public String getVerification_uri_complete(){
        return verification_uri_complete;
    }

}


