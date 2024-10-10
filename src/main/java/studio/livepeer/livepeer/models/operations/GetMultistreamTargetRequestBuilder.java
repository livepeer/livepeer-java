/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.operations;

import java.lang.String;
import studio.livepeer.livepeer.utils.Utils;

public class GetMultistreamTargetRequestBuilder {

    private String id;
    private final SDKMethodInterfaces.MethodCallGetMultistreamTarget sdk;

    public GetMultistreamTargetRequestBuilder(SDKMethodInterfaces.MethodCallGetMultistreamTarget sdk) {
        this.sdk = sdk;
    }

    public GetMultistreamTargetRequestBuilder id(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public GetMultistreamTargetResponse call() throws Exception {

        return sdk.get(
            id);
    }
}
