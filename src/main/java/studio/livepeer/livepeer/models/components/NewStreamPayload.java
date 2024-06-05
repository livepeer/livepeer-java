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
import org.openapitools.jackson.nullable.JsonNullable;
import studio.livepeer.livepeer.utils.Utils;

public class NewStreamPayload {

    @JsonProperty("name")
    private String name;

    /**
     * Configuration for a stream that should be actively pulled from an
     * external source, rather than pushed to Livepeer. If specified, the
     * stream will not have a streamKey.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pull")
    private Optional<? extends Pull> pull;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("creatorId")
    private Optional<? extends InputCreatorId> creatorId;

    /**
     * Whether the playback policy for an asset or stream is public or signed
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("playbackPolicy")
    private JsonNullable<? extends PlaybackPolicy> playbackPolicy;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("profiles")
    private JsonNullable<? extends java.util.List<FfmpegProfile>> profiles;

    /**
     * Should this stream be recorded? Uses default settings. For more
     * customization, create and configure an object store.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("record")
    private Optional<? extends Boolean> record;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("multistream")
    private Optional<? extends Multistream> multistream;

    /**
     * User input tags associated with the stream
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("userTags")
    private Optional<? extends java.util.Map<String, UserTags>> userTags;

    @JsonCreator
    public NewStreamPayload(
            @JsonProperty("name") String name,
            @JsonProperty("pull") Optional<? extends Pull> pull,
            @JsonProperty("creatorId") Optional<? extends InputCreatorId> creatorId,
            @JsonProperty("playbackPolicy") JsonNullable<? extends PlaybackPolicy> playbackPolicy,
            @JsonProperty("profiles") JsonNullable<? extends java.util.List<FfmpegProfile>> profiles,
            @JsonProperty("record") Optional<? extends Boolean> record,
            @JsonProperty("multistream") Optional<? extends Multistream> multistream,
            @JsonProperty("userTags") Optional<? extends java.util.Map<String, UserTags>> userTags) {
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(pull, "pull");
        Utils.checkNotNull(creatorId, "creatorId");
        Utils.checkNotNull(playbackPolicy, "playbackPolicy");
        Utils.checkNotNull(profiles, "profiles");
        Utils.checkNotNull(record, "record");
        Utils.checkNotNull(multistream, "multistream");
        Utils.checkNotNull(userTags, "userTags");
        this.name = name;
        this.pull = pull;
        this.creatorId = creatorId;
        this.playbackPolicy = playbackPolicy;
        this.profiles = profiles;
        this.record = record;
        this.multistream = multistream;
        this.userTags = userTags;
    }
    
    public NewStreamPayload(
            String name) {
        this(name, Optional.empty(), Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public String name() {
        return name;
    }

    /**
     * Configuration for a stream that should be actively pulled from an
     * external source, rather than pushed to Livepeer. If specified, the
     * stream will not have a streamKey.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Pull> pull() {
        return (Optional<Pull>) pull;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<InputCreatorId> creatorId() {
        return (Optional<InputCreatorId>) creatorId;
    }

    /**
     * Whether the playback policy for an asset or stream is public or signed
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<PlaybackPolicy> playbackPolicy() {
        return (JsonNullable<PlaybackPolicy>) playbackPolicy;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<java.util.List<FfmpegProfile>> profiles() {
        return (JsonNullable<java.util.List<FfmpegProfile>>) profiles;
    }

    /**
     * Should this stream be recorded? Uses default settings. For more
     * customization, create and configure an object store.
     * 
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> record() {
        return (Optional<Boolean>) record;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Multistream> multistream() {
        return (Optional<Multistream>) multistream;
    }

    /**
     * User input tags associated with the stream
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.Map<String, UserTags>> userTags() {
        return (Optional<java.util.Map<String, UserTags>>) userTags;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public NewStreamPayload withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * Configuration for a stream that should be actively pulled from an
     * external source, rather than pushed to Livepeer. If specified, the
     * stream will not have a streamKey.
     */
    public NewStreamPayload withPull(Pull pull) {
        Utils.checkNotNull(pull, "pull");
        this.pull = Optional.ofNullable(pull);
        return this;
    }

    /**
     * Configuration for a stream that should be actively pulled from an
     * external source, rather than pushed to Livepeer. If specified, the
     * stream will not have a streamKey.
     */
    public NewStreamPayload withPull(Optional<? extends Pull> pull) {
        Utils.checkNotNull(pull, "pull");
        this.pull = pull;
        return this;
    }

    public NewStreamPayload withCreatorId(InputCreatorId creatorId) {
        Utils.checkNotNull(creatorId, "creatorId");
        this.creatorId = Optional.ofNullable(creatorId);
        return this;
    }

    public NewStreamPayload withCreatorId(Optional<? extends InputCreatorId> creatorId) {
        Utils.checkNotNull(creatorId, "creatorId");
        this.creatorId = creatorId;
        return this;
    }

    /**
     * Whether the playback policy for an asset or stream is public or signed
     */
    public NewStreamPayload withPlaybackPolicy(PlaybackPolicy playbackPolicy) {
        Utils.checkNotNull(playbackPolicy, "playbackPolicy");
        this.playbackPolicy = JsonNullable.of(playbackPolicy);
        return this;
    }

    /**
     * Whether the playback policy for an asset or stream is public or signed
     */
    public NewStreamPayload withPlaybackPolicy(JsonNullable<? extends PlaybackPolicy> playbackPolicy) {
        Utils.checkNotNull(playbackPolicy, "playbackPolicy");
        this.playbackPolicy = playbackPolicy;
        return this;
    }

    public NewStreamPayload withProfiles(java.util.List<FfmpegProfile> profiles) {
        Utils.checkNotNull(profiles, "profiles");
        this.profiles = JsonNullable.of(profiles);
        return this;
    }

    public NewStreamPayload withProfiles(JsonNullable<? extends java.util.List<FfmpegProfile>> profiles) {
        Utils.checkNotNull(profiles, "profiles");
        this.profiles = profiles;
        return this;
    }

    /**
     * Should this stream be recorded? Uses default settings. For more
     * customization, create and configure an object store.
     * 
     */
    public NewStreamPayload withRecord(boolean record) {
        Utils.checkNotNull(record, "record");
        this.record = Optional.ofNullable(record);
        return this;
    }

    /**
     * Should this stream be recorded? Uses default settings. For more
     * customization, create and configure an object store.
     * 
     */
    public NewStreamPayload withRecord(Optional<? extends Boolean> record) {
        Utils.checkNotNull(record, "record");
        this.record = record;
        return this;
    }

    public NewStreamPayload withMultistream(Multistream multistream) {
        Utils.checkNotNull(multistream, "multistream");
        this.multistream = Optional.ofNullable(multistream);
        return this;
    }

    public NewStreamPayload withMultistream(Optional<? extends Multistream> multistream) {
        Utils.checkNotNull(multistream, "multistream");
        this.multistream = multistream;
        return this;
    }

    /**
     * User input tags associated with the stream
     */
    public NewStreamPayload withUserTags(java.util.Map<String, UserTags> userTags) {
        Utils.checkNotNull(userTags, "userTags");
        this.userTags = Optional.ofNullable(userTags);
        return this;
    }

    /**
     * User input tags associated with the stream
     */
    public NewStreamPayload withUserTags(Optional<? extends java.util.Map<String, UserTags>> userTags) {
        Utils.checkNotNull(userTags, "userTags");
        this.userTags = userTags;
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
        NewStreamPayload other = (NewStreamPayload) o;
        return 
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.pull, other.pull) &&
            java.util.Objects.deepEquals(this.creatorId, other.creatorId) &&
            java.util.Objects.deepEquals(this.playbackPolicy, other.playbackPolicy) &&
            java.util.Objects.deepEquals(this.profiles, other.profiles) &&
            java.util.Objects.deepEquals(this.record, other.record) &&
            java.util.Objects.deepEquals(this.multistream, other.multistream) &&
            java.util.Objects.deepEquals(this.userTags, other.userTags);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            name,
            pull,
            creatorId,
            playbackPolicy,
            profiles,
            record,
            multistream,
            userTags);
    }
    
    @Override
    public String toString() {
        return Utils.toString(NewStreamPayload.class,
                "name", name,
                "pull", pull,
                "creatorId", creatorId,
                "playbackPolicy", playbackPolicy,
                "profiles", profiles,
                "record", record,
                "multistream", multistream,
                "userTags", userTags);
    }
    
    public final static class Builder {
 
        private String name;
 
        private Optional<? extends Pull> pull = Optional.empty();
 
        private Optional<? extends InputCreatorId> creatorId = Optional.empty();
 
        private JsonNullable<? extends PlaybackPolicy> playbackPolicy = JsonNullable.undefined();
 
        private JsonNullable<? extends java.util.List<FfmpegProfile>> profiles = JsonNullable.undefined();
 
        private Optional<? extends Boolean> record = Optional.empty();
 
        private Optional<? extends Multistream> multistream = Optional.empty();
 
        private Optional<? extends java.util.Map<String, UserTags>> userTags = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * Configuration for a stream that should be actively pulled from an
         * external source, rather than pushed to Livepeer. If specified, the
         * stream will not have a streamKey.
         */
        public Builder pull(Pull pull) {
            Utils.checkNotNull(pull, "pull");
            this.pull = Optional.ofNullable(pull);
            return this;
        }

        /**
         * Configuration for a stream that should be actively pulled from an
         * external source, rather than pushed to Livepeer. If specified, the
         * stream will not have a streamKey.
         */
        public Builder pull(Optional<? extends Pull> pull) {
            Utils.checkNotNull(pull, "pull");
            this.pull = pull;
            return this;
        }

        public Builder creatorId(InputCreatorId creatorId) {
            Utils.checkNotNull(creatorId, "creatorId");
            this.creatorId = Optional.ofNullable(creatorId);
            return this;
        }

        public Builder creatorId(Optional<? extends InputCreatorId> creatorId) {
            Utils.checkNotNull(creatorId, "creatorId");
            this.creatorId = creatorId;
            return this;
        }

        /**
         * Whether the playback policy for an asset or stream is public or signed
         */
        public Builder playbackPolicy(PlaybackPolicy playbackPolicy) {
            Utils.checkNotNull(playbackPolicy, "playbackPolicy");
            this.playbackPolicy = JsonNullable.of(playbackPolicy);
            return this;
        }

        /**
         * Whether the playback policy for an asset or stream is public or signed
         */
        public Builder playbackPolicy(JsonNullable<? extends PlaybackPolicy> playbackPolicy) {
            Utils.checkNotNull(playbackPolicy, "playbackPolicy");
            this.playbackPolicy = playbackPolicy;
            return this;
        }

        public Builder profiles(java.util.List<FfmpegProfile> profiles) {
            Utils.checkNotNull(profiles, "profiles");
            this.profiles = JsonNullable.of(profiles);
            return this;
        }

        public Builder profiles(JsonNullable<? extends java.util.List<FfmpegProfile>> profiles) {
            Utils.checkNotNull(profiles, "profiles");
            this.profiles = profiles;
            return this;
        }

        /**
         * Should this stream be recorded? Uses default settings. For more
         * customization, create and configure an object store.
         * 
         */
        public Builder record(boolean record) {
            Utils.checkNotNull(record, "record");
            this.record = Optional.ofNullable(record);
            return this;
        }

        /**
         * Should this stream be recorded? Uses default settings. For more
         * customization, create and configure an object store.
         * 
         */
        public Builder record(Optional<? extends Boolean> record) {
            Utils.checkNotNull(record, "record");
            this.record = record;
            return this;
        }

        public Builder multistream(Multistream multistream) {
            Utils.checkNotNull(multistream, "multistream");
            this.multistream = Optional.ofNullable(multistream);
            return this;
        }

        public Builder multistream(Optional<? extends Multistream> multistream) {
            Utils.checkNotNull(multistream, "multistream");
            this.multistream = multistream;
            return this;
        }

        /**
         * User input tags associated with the stream
         */
        public Builder userTags(java.util.Map<String, UserTags> userTags) {
            Utils.checkNotNull(userTags, "userTags");
            this.userTags = Optional.ofNullable(userTags);
            return this;
        }

        /**
         * User input tags associated with the stream
         */
        public Builder userTags(Optional<? extends java.util.Map<String, UserTags>> userTags) {
            Utils.checkNotNull(userTags, "userTags");
            this.userTags = userTags;
            return this;
        }
        
        public NewStreamPayload build() {
            return new NewStreamPayload(
                name,
                pull,
                creatorId,
                playbackPolicy,
                profiles,
                record,
                multistream,
                userTags);
        }
    }
}

