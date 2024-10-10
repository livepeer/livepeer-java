/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.operations;

import studio.livepeer.livepeer.models.components.MultistreamTargetInput;
import studio.livepeer.livepeer.utils.Utils;

public class CreateMultistreamTargetRequestBuilder {

    private MultistreamTargetInput request;
    private final SDKMethodInterfaces.MethodCallCreateMultistreamTarget sdk;

    public CreateMultistreamTargetRequestBuilder(SDKMethodInterfaces.MethodCallCreateMultistreamTarget sdk) {
        this.sdk = sdk;
    }

    public CreateMultistreamTargetRequestBuilder request(MultistreamTargetInput request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreateMultistreamTargetResponse call() throws Exception {

        return sdk.create(
            request);
    }
}
