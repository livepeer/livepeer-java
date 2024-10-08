/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.operations;

import studio.livepeer.livepeer.models.components.NewStreamPayload;
import studio.livepeer.livepeer.utils.Utils;

public class CreateStreamRequestBuilder {

    private NewStreamPayload request;
    private final SDKMethodInterfaces.MethodCallCreateStream sdk;

    public CreateStreamRequestBuilder(SDKMethodInterfaces.MethodCallCreateStream sdk) {
        this.sdk = sdk;
    }

    public CreateStreamRequestBuilder request(studio.livepeer.livepeer.models.components.NewStreamPayload request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreateStreamResponse call() throws Exception {

        return sdk.create(
            request);
    }
}
