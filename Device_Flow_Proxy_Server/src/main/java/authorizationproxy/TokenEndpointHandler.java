package authorizationproxy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import parameters.DeviceFlowParameters;
import validator.Validator;

import javax.ws.rs.core.Response;

@RestController
public class TokenEndpointHandler {

    private DeviceFlowParameters deviceFlowParameters = new DeviceFlowParameters();
    private Validator validator = new Validator();

    @RequestMapping("/TokenEndpoint")
    public Response tokenEndpoint(@RequestParam String client_id,
                                  @RequestParam String device_code,
                                  @RequestParam String grant_type) {

        if (validator.getClient_id(client_id) && validator.getDevice_code(device_code) &&
                validator.getGrant_type(grant_type)){


//            return new TokenEndpoint(String.format(deviceFlowParameters.getAccessToken()),
//                    String.format(deviceFlowParameters.getTokenType()), deviceFlowParameters.getExpiresIn());
            return Response.status(Response.Status.OK).entity("fine").build();

        }
//        else if(validator.getClient_id(client_id)){
//            throw new IllegalArgumentException();
//        }
//        else if(validator.getDevice_code(device_code)){
//            throw new IllegalArgumentException();
//        }
        else
            throw new IllegalArgumentException();


    }

}
