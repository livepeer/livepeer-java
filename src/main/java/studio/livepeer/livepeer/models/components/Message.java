/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.components;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import studio.livepeer.livepeer.utils.Utils;
/**
 * Message - Video Metadata EIP-712 message content
 */

public class Message {

    @JsonProperty("video")
    private String video;

    @JsonProperty("attestations")
    private java.util.List<Attestations> attestations;

    @JsonProperty("signer")
    private String signer;

    @JsonProperty("timestamp")
    private double timestamp;

    @JsonCreator
    public Message(
            @JsonProperty("video") String video,
            @JsonProperty("attestations") java.util.List<Attestations> attestations,
            @JsonProperty("signer") String signer,
            @JsonProperty("timestamp") double timestamp) {
        Utils.checkNotNull(video, "video");
        Utils.checkNotNull(attestations, "attestations");
        Utils.checkNotNull(signer, "signer");
        Utils.checkNotNull(timestamp, "timestamp");
        this.video = video;
        this.attestations = attestations;
        this.signer = signer;
        this.timestamp = timestamp;
    }

    @JsonIgnore
    public String video() {
        return video;
    }

    @JsonIgnore
    public java.util.List<Attestations> attestations() {
        return attestations;
    }

    @JsonIgnore
    public String signer() {
        return signer;
    }

    @JsonIgnore
    public double timestamp() {
        return timestamp;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Message withVideo(String video) {
        Utils.checkNotNull(video, "video");
        this.video = video;
        return this;
    }

    public Message withAttestations(java.util.List<Attestations> attestations) {
        Utils.checkNotNull(attestations, "attestations");
        this.attestations = attestations;
        return this;
    }

    public Message withSigner(String signer) {
        Utils.checkNotNull(signer, "signer");
        this.signer = signer;
        return this;
    }

    public Message withTimestamp(double timestamp) {
        Utils.checkNotNull(timestamp, "timestamp");
        this.timestamp = timestamp;
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
        Message other = (Message) o;
        return 
            java.util.Objects.deepEquals(this.video, other.video) &&
            java.util.Objects.deepEquals(this.attestations, other.attestations) &&
            java.util.Objects.deepEquals(this.signer, other.signer) &&
            java.util.Objects.deepEquals(this.timestamp, other.timestamp);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            video,
            attestations,
            signer,
            timestamp);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Message.class,
                "video", video,
                "attestations", attestations,
                "signer", signer,
                "timestamp", timestamp);
    }
    
    public final static class Builder {
 
        private String video;
 
        private java.util.List<Attestations> attestations;
 
        private String signer;
 
        private Double timestamp;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder video(String video) {
            Utils.checkNotNull(video, "video");
            this.video = video;
            return this;
        }

        public Builder attestations(java.util.List<Attestations> attestations) {
            Utils.checkNotNull(attestations, "attestations");
            this.attestations = attestations;
            return this;
        }

        public Builder signer(String signer) {
            Utils.checkNotNull(signer, "signer");
            this.signer = signer;
            return this;
        }

        public Builder timestamp(double timestamp) {
            Utils.checkNotNull(timestamp, "timestamp");
            this.timestamp = timestamp;
            return this;
        }
        
        public Message build() {
            return new Message(
                video,
                attestations,
                signer,
                timestamp);
        }
    }
}

