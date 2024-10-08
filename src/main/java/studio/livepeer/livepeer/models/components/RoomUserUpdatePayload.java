/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import studio.livepeer.livepeer.utils.LazySingletonValue;
import studio.livepeer.livepeer.utils.Utils;


public class RoomUserUpdatePayload {

    /**
     * Whether a user is allowed to publish audio/video tracks (i.e. their microphone and webcam)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("canPublish")
    private Optional<Boolean> canPublish;

    /**
     * Whether a user is allowed to publish data messages to the room
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("canPublishData")
    private Optional<Boolean> canPublishData;

    /**
     * User defined payload to store for the participant
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    private Optional<String> metadata;

    @JsonCreator
    public RoomUserUpdatePayload(
            @JsonProperty("canPublish") Optional<Boolean> canPublish,
            @JsonProperty("canPublishData") Optional<Boolean> canPublishData,
            @JsonProperty("metadata") Optional<String> metadata) {
        Utils.checkNotNull(canPublish, "canPublish");
        Utils.checkNotNull(canPublishData, "canPublishData");
        Utils.checkNotNull(metadata, "metadata");
        this.canPublish = canPublish;
        this.canPublishData = canPublishData;
        this.metadata = metadata;
    }
    
    public RoomUserUpdatePayload() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Whether a user is allowed to publish audio/video tracks (i.e. their microphone and webcam)
     */
    @JsonIgnore
    public Optional<Boolean> canPublish() {
        return canPublish;
    }

    /**
     * Whether a user is allowed to publish data messages to the room
     */
    @JsonIgnore
    public Optional<Boolean> canPublishData() {
        return canPublishData;
    }

    /**
     * User defined payload to store for the participant
     */
    @JsonIgnore
    public Optional<String> metadata() {
        return metadata;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Whether a user is allowed to publish audio/video tracks (i.e. their microphone and webcam)
     */
    public RoomUserUpdatePayload withCanPublish(boolean canPublish) {
        Utils.checkNotNull(canPublish, "canPublish");
        this.canPublish = Optional.ofNullable(canPublish);
        return this;
    }

    /**
     * Whether a user is allowed to publish audio/video tracks (i.e. their microphone and webcam)
     */
    public RoomUserUpdatePayload withCanPublish(Optional<Boolean> canPublish) {
        Utils.checkNotNull(canPublish, "canPublish");
        this.canPublish = canPublish;
        return this;
    }

    /**
     * Whether a user is allowed to publish data messages to the room
     */
    public RoomUserUpdatePayload withCanPublishData(boolean canPublishData) {
        Utils.checkNotNull(canPublishData, "canPublishData");
        this.canPublishData = Optional.ofNullable(canPublishData);
        return this;
    }

    /**
     * Whether a user is allowed to publish data messages to the room
     */
    public RoomUserUpdatePayload withCanPublishData(Optional<Boolean> canPublishData) {
        Utils.checkNotNull(canPublishData, "canPublishData");
        this.canPublishData = canPublishData;
        return this;
    }

    /**
     * User defined payload to store for the participant
     */
    public RoomUserUpdatePayload withMetadata(String metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }

    /**
     * User defined payload to store for the participant
     */
    public RoomUserUpdatePayload withMetadata(Optional<String> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
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
        RoomUserUpdatePayload other = (RoomUserUpdatePayload) o;
        return 
            Objects.deepEquals(this.canPublish, other.canPublish) &&
            Objects.deepEquals(this.canPublishData, other.canPublishData) &&
            Objects.deepEquals(this.metadata, other.metadata);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            canPublish,
            canPublishData,
            metadata);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RoomUserUpdatePayload.class,
                "canPublish", canPublish,
                "canPublishData", canPublishData,
                "metadata", metadata);
    }
    
    public final static class Builder {
 
        private Optional<Boolean> canPublish;
 
        private Optional<Boolean> canPublishData;
 
        private Optional<String> metadata = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Whether a user is allowed to publish audio/video tracks (i.e. their microphone and webcam)
         */
        public Builder canPublish(boolean canPublish) {
            Utils.checkNotNull(canPublish, "canPublish");
            this.canPublish = Optional.ofNullable(canPublish);
            return this;
        }

        /**
         * Whether a user is allowed to publish audio/video tracks (i.e. their microphone and webcam)
         */
        public Builder canPublish(Optional<Boolean> canPublish) {
            Utils.checkNotNull(canPublish, "canPublish");
            this.canPublish = canPublish;
            return this;
        }

        /**
         * Whether a user is allowed to publish data messages to the room
         */
        public Builder canPublishData(boolean canPublishData) {
            Utils.checkNotNull(canPublishData, "canPublishData");
            this.canPublishData = Optional.ofNullable(canPublishData);
            return this;
        }

        /**
         * Whether a user is allowed to publish data messages to the room
         */
        public Builder canPublishData(Optional<Boolean> canPublishData) {
            Utils.checkNotNull(canPublishData, "canPublishData");
            this.canPublishData = canPublishData;
            return this;
        }

        /**
         * User defined payload to store for the participant
         */
        public Builder metadata(String metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        /**
         * User defined payload to store for the participant
         */
        public Builder metadata(Optional<String> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }
        
        public RoomUserUpdatePayload build() {
            if (canPublish == null) {
                canPublish = _SINGLETON_VALUE_CanPublish.value();
            }
            if (canPublishData == null) {
                canPublishData = _SINGLETON_VALUE_CanPublishData.value();
            }
            return new RoomUserUpdatePayload(
                canPublish,
                canPublishData,
                metadata);
        }

        private static final LazySingletonValue<Optional<Boolean>> _SINGLETON_VALUE_CanPublish =
                new LazySingletonValue<>(
                        "canPublish",
                        "true",
                        new TypeReference<Optional<Boolean>>() {});

        private static final LazySingletonValue<Optional<Boolean>> _SINGLETON_VALUE_CanPublishData =
                new LazySingletonValue<>(
                        "canPublishData",
                        "true",
                        new TypeReference<Optional<Boolean>>() {});
    }
}

