/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.operations;

import java.lang.String;
import studio.livepeer.livepeer.utils.Utils;

public class DeleteWebhookRequestBuilder {

    private String id;
    private final SDKMethodInterfaces.MethodCallDeleteWebhook sdk;

    public DeleteWebhookRequestBuilder(SDKMethodInterfaces.MethodCallDeleteWebhook sdk) {
        this.sdk = sdk;
    }

    public DeleteWebhookRequestBuilder id(java.lang.String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public DeleteWebhookResponse call() throws Exception {

        return sdk.delete(
            id);
    }
}
