/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;
import studio.livepeer.livepeer.utils.Utils;


public class Source1 {

    @JsonProperty("type")
    private SourceType type;

    /**
     * URL from which the asset was uploaded.
     */
    @JsonProperty("url")
    private String url;

    /**
     * Gateway URL from asset if parsed from provided URL on upload.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("gatewayUrl")
    private Optional<String> gatewayUrl;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("encryption")
    private Optional<? extends EncryptionOutput> encryption;

    @JsonCreator
    public Source1(
            @JsonProperty("type") SourceType type,
            @JsonProperty("url") String url,
            @JsonProperty("gatewayUrl") Optional<String> gatewayUrl,
            @JsonProperty("encryption") Optional<? extends EncryptionOutput> encryption) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(url, "url");
        Utils.checkNotNull(gatewayUrl, "gatewayUrl");
        Utils.checkNotNull(encryption, "encryption");
        this.type = type;
        this.url = url;
        this.gatewayUrl = gatewayUrl;
        this.encryption = encryption;
    }
    
    public Source1(
            SourceType type,
            String url) {
        this(type, url, Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public SourceType type() {
        return type;
    }

    /**
     * URL from which the asset was uploaded.
     */
    @JsonIgnore
    public String url() {
        return url;
    }

    /**
     * Gateway URL from asset if parsed from provided URL on upload.
     */
    @JsonIgnore
    public Optional<String> gatewayUrl() {
        return gatewayUrl;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<EncryptionOutput> encryption() {
        return (Optional<EncryptionOutput>) encryption;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Source1 withType(SourceType type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * URL from which the asset was uploaded.
     */
    public Source1 withUrl(String url) {
        Utils.checkNotNull(url, "url");
        this.url = url;
        return this;
    }

    /**
     * Gateway URL from asset if parsed from provided URL on upload.
     */
    public Source1 withGatewayUrl(String gatewayUrl) {
        Utils.checkNotNull(gatewayUrl, "gatewayUrl");
        this.gatewayUrl = Optional.ofNullable(gatewayUrl);
        return this;
    }

    /**
     * Gateway URL from asset if parsed from provided URL on upload.
     */
    public Source1 withGatewayUrl(Optional<String> gatewayUrl) {
        Utils.checkNotNull(gatewayUrl, "gatewayUrl");
        this.gatewayUrl = gatewayUrl;
        return this;
    }

    public Source1 withEncryption(EncryptionOutput encryption) {
        Utils.checkNotNull(encryption, "encryption");
        this.encryption = Optional.ofNullable(encryption);
        return this;
    }

    public Source1 withEncryption(Optional<? extends EncryptionOutput> encryption) {
        Utils.checkNotNull(encryption, "encryption");
        this.encryption = encryption;
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
        Source1 other = (Source1) o;
        return 
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.url, other.url) &&
            Objects.deepEquals(this.gatewayUrl, other.gatewayUrl) &&
            Objects.deepEquals(this.encryption, other.encryption);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            type,
            url,
            gatewayUrl,
            encryption);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Source1.class,
                "type", type,
                "url", url,
                "gatewayUrl", gatewayUrl,
                "encryption", encryption);
    }
    
    public final static class Builder {
 
        private SourceType type;
 
        private String url;
 
        private Optional<String> gatewayUrl = Optional.empty();
 
        private Optional<? extends EncryptionOutput> encryption = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(SourceType type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        /**
         * URL from which the asset was uploaded.
         */
        public Builder url(String url) {
            Utils.checkNotNull(url, "url");
            this.url = url;
            return this;
        }

        /**
         * Gateway URL from asset if parsed from provided URL on upload.
         */
        public Builder gatewayUrl(String gatewayUrl) {
            Utils.checkNotNull(gatewayUrl, "gatewayUrl");
            this.gatewayUrl = Optional.ofNullable(gatewayUrl);
            return this;
        }

        /**
         * Gateway URL from asset if parsed from provided URL on upload.
         */
        public Builder gatewayUrl(Optional<String> gatewayUrl) {
            Utils.checkNotNull(gatewayUrl, "gatewayUrl");
            this.gatewayUrl = gatewayUrl;
            return this;
        }

        public Builder encryption(EncryptionOutput encryption) {
            Utils.checkNotNull(encryption, "encryption");
            this.encryption = Optional.ofNullable(encryption);
            return this;
        }

        public Builder encryption(Optional<? extends EncryptionOutput> encryption) {
            Utils.checkNotNull(encryption, "encryption");
            this.encryption = encryption;
            return this;
        }
        
        public Source1 build() {
            return new Source1(
                type,
                url,
                gatewayUrl,
                encryption);
        }
    }
}

