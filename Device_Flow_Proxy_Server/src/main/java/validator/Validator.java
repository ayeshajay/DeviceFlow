package validator;

public class Validator {

    public Validator() {

    }

    public boolean getClient_id(String client_id){
        return client_id.equals("realclient");
    }
    public boolean getDevice_code(String device_code){
        return device_code.equals("realdevice");
    }
    public boolean getGrant_type(String grant_type){
        return grant_type.equals("realgrant");
    }


}
