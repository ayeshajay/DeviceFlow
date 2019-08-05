package sourceproxy;

public class TokenEndpoint {

    String access_token;
    String token_type;
    Integer expires_in;
//     String Error;


    public TokenEndpoint(String access_token,String token_type,Integer expires_in) {

        this.access_token = access_token;
        this.token_type = token_type;
        this.expires_in = expires_in;

    }

//    public TokenEndpoint(String Error){
//        this.Error = Error;
//    }


    public String getAccess_token(){
        return access_token;
    }
    public String getToken_type(){
        return token_type;
    }
    public Integer getExpires_in(){
        return expires_in;
    }

}
