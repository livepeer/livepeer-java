/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.operations;

import java.lang.String;
import studio.livepeer.livepeer.models.components.WebhookInput;
import studio.livepeer.livepeer.utils.Utils;

public class UpdateWebhookRequestBuilder {

    private String id;
    private WebhookInput webhook;
    private final SDKMethodInterfaces.MethodCallUpdateWebhook sdk;

    public UpdateWebhookRequestBuilder(SDKMethodInterfaces.MethodCallUpdateWebhook sdk) {
        this.sdk = sdk;
    }

    public UpdateWebhookRequestBuilder id(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public UpdateWebhookRequestBuilder webhook(WebhookInput webhook) {
        Utils.checkNotNull(webhook, "webhook");
        this.webhook = webhook;
        return this;
    }

    public UpdateWebhookResponse call() throws Exception {

        return sdk.update(
            id,
            webhook);
    }
}
