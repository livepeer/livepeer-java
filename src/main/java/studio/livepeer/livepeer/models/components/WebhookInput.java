/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.components;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;
import studio.livepeer.livepeer.utils.Utils;

public class WebhookInput {

    @JsonProperty("name")
    private String name;

    /**
     * The ID of the project
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("projectId")
    private Optional<? extends String> projectId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("events")
    private Optional<? extends java.util.List<Events>> events;

    @JsonProperty("url")
    private String url;

    /**
     * shared secret used to sign the webhook payload
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sharedSecret")
    private Optional<? extends String> sharedSecret;

    /**
     * streamId of the stream on which the webhook is applied
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("streamId")
    private Optional<? extends String> streamId;

    @JsonCreator
    public WebhookInput(
            @JsonProperty("name") String name,
            @JsonProperty("projectId") Optional<? extends String> projectId,
            @JsonProperty("events") Optional<? extends java.util.List<Events>> events,
            @JsonProperty("url") String url,
            @JsonProperty("sharedSecret") Optional<? extends String> sharedSecret,
            @JsonProperty("streamId") Optional<? extends String> streamId) {
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(projectId, "projectId");
        Utils.checkNotNull(events, "events");
        Utils.checkNotNull(url, "url");
        Utils.checkNotNull(sharedSecret, "sharedSecret");
        Utils.checkNotNull(streamId, "streamId");
        this.name = name;
        this.projectId = projectId;
        this.events = events;
        this.url = url;
        this.sharedSecret = sharedSecret;
        this.streamId = streamId;
    }
    
    public WebhookInput(
            String name,
            String url) {
        this(name, Optional.empty(), Optional.empty(), url, Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public String name() {
        return name;
    }

    /**
     * The ID of the project
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> projectId() {
        return (Optional<String>) projectId;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.List<Events>> events() {
        return (Optional<java.util.List<Events>>) events;
    }

    @JsonIgnore
    public String url() {
        return url;
    }

    /**
     * shared secret used to sign the webhook payload
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> sharedSecret() {
        return (Optional<String>) sharedSecret;
    }

    /**
     * streamId of the stream on which the webhook is applied
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> streamId() {
        return (Optional<String>) streamId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public WebhookInput withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * The ID of the project
     */
    public WebhookInput withProjectId(String projectId) {
        Utils.checkNotNull(projectId, "projectId");
        this.projectId = Optional.ofNullable(projectId);
        return this;
    }

    /**
     * The ID of the project
     */
    public WebhookInput withProjectId(Optional<? extends String> projectId) {
        Utils.checkNotNull(projectId, "projectId");
        this.projectId = projectId;
        return this;
    }

    public WebhookInput withEvents(java.util.List<Events> events) {
        Utils.checkNotNull(events, "events");
        this.events = Optional.ofNullable(events);
        return this;
    }

    public WebhookInput withEvents(Optional<? extends java.util.List<Events>> events) {
        Utils.checkNotNull(events, "events");
        this.events = events;
        return this;
    }

    public WebhookInput withUrl(String url) {
        Utils.checkNotNull(url, "url");
        this.url = url;
        return this;
    }

    /**
     * shared secret used to sign the webhook payload
     */
    public WebhookInput withSharedSecret(String sharedSecret) {
        Utils.checkNotNull(sharedSecret, "sharedSecret");
        this.sharedSecret = Optional.ofNullable(sharedSecret);
        return this;
    }

    /**
     * shared secret used to sign the webhook payload
     */
    public WebhookInput withSharedSecret(Optional<? extends String> sharedSecret) {
        Utils.checkNotNull(sharedSecret, "sharedSecret");
        this.sharedSecret = sharedSecret;
        return this;
    }

    /**
     * streamId of the stream on which the webhook is applied
     */
    public WebhookInput withStreamId(String streamId) {
        Utils.checkNotNull(streamId, "streamId");
        this.streamId = Optional.ofNullable(streamId);
        return this;
    }

    /**
     * streamId of the stream on which the webhook is applied
     */
    public WebhookInput withStreamId(Optional<? extends String> streamId) {
        Utils.checkNotNull(streamId, "streamId");
        this.streamId = streamId;
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
        WebhookInput other = (WebhookInput) o;
        return 
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.projectId, other.projectId) &&
            java.util.Objects.deepEquals(this.events, other.events) &&
            java.util.Objects.deepEquals(this.url, other.url) &&
            java.util.Objects.deepEquals(this.sharedSecret, other.sharedSecret) &&
            java.util.Objects.deepEquals(this.streamId, other.streamId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            name,
            projectId,
            events,
            url,
            sharedSecret,
            streamId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(WebhookInput.class,
                "name", name,
                "projectId", projectId,
                "events", events,
                "url", url,
                "sharedSecret", sharedSecret,
                "streamId", streamId);
    }
    
    public final static class Builder {
 
        private String name;
 
        private Optional<? extends String> projectId = Optional.empty();
 
        private Optional<? extends java.util.List<Events>> events = Optional.empty();
 
        private String url;
 
        private Optional<? extends String> sharedSecret = Optional.empty();
 
        private Optional<? extends String> streamId = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * The ID of the project
         */
        public Builder projectId(String projectId) {
            Utils.checkNotNull(projectId, "projectId");
            this.projectId = Optional.ofNullable(projectId);
            return this;
        }

        /**
         * The ID of the project
         */
        public Builder projectId(Optional<? extends String> projectId) {
            Utils.checkNotNull(projectId, "projectId");
            this.projectId = projectId;
            return this;
        }

        public Builder events(java.util.List<Events> events) {
            Utils.checkNotNull(events, "events");
            this.events = Optional.ofNullable(events);
            return this;
        }

        public Builder events(Optional<? extends java.util.List<Events>> events) {
            Utils.checkNotNull(events, "events");
            this.events = events;
            return this;
        }

        public Builder url(String url) {
            Utils.checkNotNull(url, "url");
            this.url = url;
            return this;
        }

        /**
         * shared secret used to sign the webhook payload
         */
        public Builder sharedSecret(String sharedSecret) {
            Utils.checkNotNull(sharedSecret, "sharedSecret");
            this.sharedSecret = Optional.ofNullable(sharedSecret);
            return this;
        }

        /**
         * shared secret used to sign the webhook payload
         */
        public Builder sharedSecret(Optional<? extends String> sharedSecret) {
            Utils.checkNotNull(sharedSecret, "sharedSecret");
            this.sharedSecret = sharedSecret;
            return this;
        }

        /**
         * streamId of the stream on which the webhook is applied
         */
        public Builder streamId(String streamId) {
            Utils.checkNotNull(streamId, "streamId");
            this.streamId = Optional.ofNullable(streamId);
            return this;
        }

        /**
         * streamId of the stream on which the webhook is applied
         */
        public Builder streamId(Optional<? extends String> streamId) {
            Utils.checkNotNull(streamId, "streamId");
            this.streamId = streamId;
            return this;
        }
        
        public WebhookInput build() {
            return new WebhookInput(
                name,
                projectId,
                events,
                url,
                sharedSecret,
                streamId);
        }
    }
}

