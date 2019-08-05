package authorizationproxy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import parameters.DeviceFlowParameters;
import sourceproxy.DeviceAuthEndpoint;
import validator.Validator;
import javax.ws.rs.core.Response;

@RestController
public class DeviceAuthEndpointHandler {

    private static String DEVICE_CODE;
    private static String USER_CODE;
    private static String VERIFICATION_URI;
    private static String VERIFICATION_URI_COMPLETE;

    private DeviceFlowParameters deviceFlowParameters = new DeviceFlowParameters();
    private Validator validatorinstance = new Validator();

    @RequestMapping("/DeviceAuthEndpoint")
    public Response deviceauthendpoint(@RequestParam() String client_id ) {

        if(validatorinstance.getClient_id(client_id)) {

            return Response.status(Response.Status.OK).entity(new DeviceAuthEndpoint(
                    String.format(deviceFlowParameters.getDeviceCode()),
                    String.format(deviceFlowParameters.getUserCode()),
                    String.format(deviceFlowParameters.getVerificationUri()),
                    String.format(deviceFlowParameters.getVerificationUriComplete()))).build();
//           return new DeviceAuthEndpoint(
//                    String.format(DEVICE_CODE), String.format(USER_CODE), String.format(VERIFICATION_URI),
//                    String.format(VERIFICATION_URI_COMPLETE));
        }
        else {

//            return Response.status(Response.Status.BAD_REQUEST).build();
                return null;
        }
    }

}
