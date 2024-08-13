/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.operations;

import studio.livepeer.livepeer.models.components.ClipPayload;
import studio.livepeer.livepeer.utils.Utils;

public class CreateClipRequestBuilder {

    private ClipPayload request;
    private final SDKMethodInterfaces.MethodCallCreateClip sdk;

    public CreateClipRequestBuilder(SDKMethodInterfaces.MethodCallCreateClip sdk) {
        this.sdk = sdk;
    }

    public CreateClipRequestBuilder request(studio.livepeer.livepeer.models.components.ClipPayload request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreateClipResponse call() throws Exception {

        return sdk.createClip(
            request);
    }
}
