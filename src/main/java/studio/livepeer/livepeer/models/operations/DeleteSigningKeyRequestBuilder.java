/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.operations;

import java.lang.String;
import studio.livepeer.livepeer.utils.Utils;

public class DeleteSigningKeyRequestBuilder {

    private String keyId;
    private final SDKMethodInterfaces.MethodCallDeleteSigningKey sdk;

    public DeleteSigningKeyRequestBuilder(SDKMethodInterfaces.MethodCallDeleteSigningKey sdk) {
        this.sdk = sdk;
    }

    public DeleteSigningKeyRequestBuilder keyId(java.lang.String keyId) {
        Utils.checkNotNull(keyId, "keyId");
        this.keyId = keyId;
        return this;
    }

    public DeleteSigningKeyResponse call() throws Exception {

        return sdk.delete(
            keyId);
    }
}
