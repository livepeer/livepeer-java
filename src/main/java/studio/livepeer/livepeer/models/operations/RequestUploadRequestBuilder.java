/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.operations;

import studio.livepeer.livepeer.models.components.NewAssetPayload;
import studio.livepeer.livepeer.utils.Utils;

public class RequestUploadRequestBuilder {

    private NewAssetPayload request;
    private final SDKMethodInterfaces.MethodCallRequestUpload sdk;

    public RequestUploadRequestBuilder(SDKMethodInterfaces.MethodCallRequestUpload sdk) {
        this.sdk = sdk;
    }

    public RequestUploadRequestBuilder request(NewAssetPayload request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public RequestUploadResponse call() throws Exception {

        return sdk.create(
            request);
    }
}
