/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.operations;

import java.lang.String;
import studio.livepeer.livepeer.utils.Utils;

public class GetClipsRequestBuilder {

    private String id;
    private final SDKMethodInterfaces.MethodCallGetClips sdk;

    public GetClipsRequestBuilder(SDKMethodInterfaces.MethodCallGetClips sdk) {
        this.sdk = sdk;
    }

    public GetClipsRequestBuilder id(java.lang.String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public GetClipsResponse call() throws Exception {

        return sdk.getClips(
            id);
    }
}
