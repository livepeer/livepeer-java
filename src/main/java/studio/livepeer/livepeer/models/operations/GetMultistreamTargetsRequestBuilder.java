/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.operations;


public class GetMultistreamTargetsRequestBuilder {

    private final SDKMethodInterfaces.MethodCallGetMultistreamTargets sdk;

    public GetMultistreamTargetsRequestBuilder(SDKMethodInterfaces.MethodCallGetMultistreamTargets sdk) {
        this.sdk = sdk;
    }

    public GetMultistreamTargetsResponse call() throws Exception {

        return sdk.getAllDirect();
    }
}
