/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.operations;

import java.lang.String;
import studio.livepeer.livepeer.utils.Utils;

public class GetSigningKeyRequestBuilder {

    private String keyId;
    private final SDKMethodInterfaces.MethodCallGetSigningKey sdk;

    public GetSigningKeyRequestBuilder(SDKMethodInterfaces.MethodCallGetSigningKey sdk) {
        this.sdk = sdk;
    }

    public GetSigningKeyRequestBuilder keyId(java.lang.String keyId) {
        Utils.checkNotNull(keyId, "keyId");
        this.keyId = keyId;
        return this;
    }

    public GetSigningKeyResponse call() throws Exception {

        return sdk.get(
            keyId);
    }
}
