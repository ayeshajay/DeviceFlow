package parameters;

public class DeviceFlowParameters{

    private static final String CLIENT_ID = "realclient";
    private static final String DEVICE_CODE = "realdevicecode";
    private static final String USER_CODE = "realusercode";
    private static final String VERIFICATION_URI = "https://example.com/device";
    private static final String VERIFICATION_URI_COMPLETE = VERIFICATION_URI + "?" + "user_code=" + USER_CODE;
    private static final String ACCESS_TOKEN = "realaccesstoken";
    private static final String TOKEN_TYPE = "Bearer";
    private static final Integer EXPIRES_IN = 5;
    private static final String Errors = "Invalid request";

    public DeviceFlowParameters(){
    }

    public String getClientId(){
        return CLIENT_ID;
    }
    public String getDeviceCode(){
        return DEVICE_CODE;
    }
    public String getUserCode(){
        return USER_CODE;
    }
    public String getVerificationUri(){
        return VERIFICATION_URI;
    }
    public String getVerificationUriComplete(){
        return VERIFICATION_URI_COMPLETE;
    }
    public String getAccessToken(){
        return ACCESS_TOKEN;
    }
    public Integer getExpiresIn(){
        return EXPIRES_IN;
    }
    public String getTokenType(){
        return TOKEN_TYPE;
    }

}
