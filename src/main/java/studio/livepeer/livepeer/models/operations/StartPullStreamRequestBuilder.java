/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.operations;

import java.lang.String;
import studio.livepeer.livepeer.utils.Utils;

public class StartPullStreamRequestBuilder {

    private String id;
    private final SDKMethodInterfaces.MethodCallStartPullStream sdk;

    public StartPullStreamRequestBuilder(SDKMethodInterfaces.MethodCallStartPullStream sdk) {
        this.sdk = sdk;
    }

    public StartPullStreamRequestBuilder id(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public StartPullStreamResponse call() throws Exception {

        return sdk.startPull(
            id);
    }
}
