/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import studio.livepeer.livepeer.utils.SpeakeasyMetadata;
import studio.livepeer.livepeer.utils.Utils;


public class UpdateWebhookRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    @SpeakeasyMetadata("request:mediaType=application/json")
    private studio.livepeer.livepeer.models.components.WebhookInput webhook;

    @JsonCreator
    public UpdateWebhookRequest(
            String id,
            studio.livepeer.livepeer.models.components.WebhookInput webhook) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(webhook, "webhook");
        this.id = id;
        this.webhook = webhook;
    }

    @JsonIgnore
    public String id() {
        return id;
    }

    @JsonIgnore
    public studio.livepeer.livepeer.models.components.WebhookInput webhook() {
        return webhook;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public UpdateWebhookRequest withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public UpdateWebhookRequest withWebhook(studio.livepeer.livepeer.models.components.WebhookInput webhook) {
        Utils.checkNotNull(webhook, "webhook");
        this.webhook = webhook;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateWebhookRequest other = (UpdateWebhookRequest) o;
        return 
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.webhook, other.webhook);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            id,
            webhook);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateWebhookRequest.class,
                "id", id,
                "webhook", webhook);
    }
    
    public final static class Builder {
 
        private String id;
 
        private studio.livepeer.livepeer.models.components.WebhookInput webhook;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder webhook(studio.livepeer.livepeer.models.components.WebhookInput webhook) {
            Utils.checkNotNull(webhook, "webhook");
            this.webhook = webhook;
            return this;
        }
        
        public UpdateWebhookRequest build() {
            return new UpdateWebhookRequest(
                id,
                webhook);
        }
    }
}

