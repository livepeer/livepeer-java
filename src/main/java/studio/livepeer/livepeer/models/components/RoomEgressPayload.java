/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import studio.livepeer.livepeer.utils.Utils;


public class RoomEgressPayload {

    /**
     * The ID of the Livepeer Stream to stream to
     */
    @JsonProperty("streamId")
    private String streamId;

    @JsonCreator
    public RoomEgressPayload(
            @JsonProperty("streamId") String streamId) {
        Utils.checkNotNull(streamId, "streamId");
        this.streamId = streamId;
    }

    /**
     * The ID of the Livepeer Stream to stream to
     */
    @JsonIgnore
    public String streamId() {
        return streamId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The ID of the Livepeer Stream to stream to
     */
    public RoomEgressPayload withStreamId(String streamId) {
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
        RoomEgressPayload other = (RoomEgressPayload) o;
        return 
            Objects.deepEquals(this.streamId, other.streamId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            streamId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RoomEgressPayload.class,
                "streamId", streamId);
    }
    
    public final static class Builder {
 
        private String streamId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The ID of the Livepeer Stream to stream to
         */
        public Builder streamId(String streamId) {
            Utils.checkNotNull(streamId, "streamId");
            this.streamId = streamId;
            return this;
        }
        
        public RoomEgressPayload build() {
            return new RoomEgressPayload(
                streamId);
        }
    }
}

