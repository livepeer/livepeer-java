/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.operations;

import java.lang.String;
import studio.livepeer.livepeer.utils.Utils;

public class GetWebhookLogsRequestBuilder {

    private String id;
    private final SDKMethodInterfaces.MethodCallGetWebhookLogs sdk;

    public GetWebhookLogsRequestBuilder(SDKMethodInterfaces.MethodCallGetWebhookLogs sdk) {
        this.sdk = sdk;
    }

    public GetWebhookLogsRequestBuilder id(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public GetWebhookLogsResponse call() throws Exception {

        return sdk.getLogs(
            id);
    }
}
