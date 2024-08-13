/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.operations;

import java.lang.String;
import studio.livepeer.livepeer.models.components.StreamPatchPayload;
import studio.livepeer.livepeer.utils.Utils;

public class UpdateStreamRequestBuilder {

    private String id;
    private StreamPatchPayload streamPatchPayload;
    private final SDKMethodInterfaces.MethodCallUpdateStream sdk;

    public UpdateStreamRequestBuilder(SDKMethodInterfaces.MethodCallUpdateStream sdk) {
        this.sdk = sdk;
    }

    public UpdateStreamRequestBuilder id(java.lang.String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public UpdateStreamRequestBuilder streamPatchPayload(studio.livepeer.livepeer.models.components.StreamPatchPayload streamPatchPayload) {
        Utils.checkNotNull(streamPatchPayload, "streamPatchPayload");
        this.streamPatchPayload = streamPatchPayload;
        return this;
    }

    public UpdateStreamResponse call() throws Exception {

        return sdk.update(
            id,
            streamPatchPayload);
    }
}
