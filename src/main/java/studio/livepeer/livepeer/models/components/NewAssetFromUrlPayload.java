/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import studio.livepeer.livepeer.utils.Utils;


public class NewAssetFromUrlPayload {

    /**
     * The name of the asset. This is not necessarily the filename - it can be a custom name or title.
     * 
     */
    @JsonProperty("name")
    private String name;

    /**
     * Whether to generate MP4s for the asset.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("staticMp4")
    private Optional<Boolean> staticMp4;

    /**
     * Whether the playback policy for an asset or stream is public or signed
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("playbackPolicy")
    private JsonNullable<? extends PlaybackPolicy> playbackPolicy;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("creatorId")
    private Optional<? extends InputCreatorId> creatorId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("storage")
    private Optional<? extends Storage> storage;

    /**
     * URL where the asset contents can be retrieved, e.g. `https://s3.amazonaws.com/my-bucket/path/filename.mp4`.
     * For an IPFS source, this should be similar to: `ipfs://{CID}`. For an Arweave
     * source: `ar://{CID}`.
     * 
     */
    @JsonProperty("url")
    private String url;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("encryption")
    private Optional<? extends Encryption> encryption;

    /**
     * Decides if the output video should include C2PA signature
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("c2pa")
    private Optional<Boolean> c2pa;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("profiles")
    private JsonNullable<? extends List<TranscodeProfile>> profiles;

    /**
     * How many seconds the duration of each output segment should be
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("targetSegmentSizeSecs")
    private Optional<Double> targetSegmentSizeSecs;

    @JsonCreator
    public NewAssetFromUrlPayload(
            @JsonProperty("name") String name,
            @JsonProperty("staticMp4") Optional<Boolean> staticMp4,
            @JsonProperty("playbackPolicy") JsonNullable<? extends PlaybackPolicy> playbackPolicy,
            @JsonProperty("creatorId") Optional<? extends InputCreatorId> creatorId,
            @JsonProperty("storage") Optional<? extends Storage> storage,
            @JsonProperty("url") String url,
            @JsonProperty("encryption") Optional<? extends Encryption> encryption,
            @JsonProperty("c2pa") Optional<Boolean> c2pa,
            @JsonProperty("profiles") JsonNullable<? extends List<TranscodeProfile>> profiles,
            @JsonProperty("targetSegmentSizeSecs") Optional<Double> targetSegmentSizeSecs) {
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(staticMp4, "staticMp4");
        Utils.checkNotNull(playbackPolicy, "playbackPolicy");
        Utils.checkNotNull(creatorId, "creatorId");
        Utils.checkNotNull(storage, "storage");
        Utils.checkNotNull(url, "url");
        Utils.checkNotNull(encryption, "encryption");
        Utils.checkNotNull(c2pa, "c2pa");
        Utils.checkNotNull(profiles, "profiles");
        Utils.checkNotNull(targetSegmentSizeSecs, "targetSegmentSizeSecs");
        this.name = name;
        this.staticMp4 = staticMp4;
        this.playbackPolicy = playbackPolicy;
        this.creatorId = creatorId;
        this.storage = storage;
        this.url = url;
        this.encryption = encryption;
        this.c2pa = c2pa;
        this.profiles = profiles;
        this.targetSegmentSizeSecs = targetSegmentSizeSecs;
    }
    
    public NewAssetFromUrlPayload(
            String name,
            String url) {
        this(name, Optional.empty(), JsonNullable.undefined(), Optional.empty(), Optional.empty(), url, Optional.empty(), Optional.empty(), JsonNullable.undefined(), Optional.empty());
    }

    /**
     * The name of the asset. This is not necessarily the filename - it can be a custom name or title.
     * 
     */
    @JsonIgnore
    public String name() {
        return name;
    }

    /**
     * Whether to generate MP4s for the asset.
     */
    @JsonIgnore
    public Optional<Boolean> staticMp4() {
        return staticMp4;
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
    public Optional<InputCreatorId> creatorId() {
        return (Optional<InputCreatorId>) creatorId;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Storage> storage() {
        return (Optional<Storage>) storage;
    }

    /**
     * URL where the asset contents can be retrieved, e.g. `https://s3.amazonaws.com/my-bucket/path/filename.mp4`.
     * For an IPFS source, this should be similar to: `ipfs://{CID}`. For an Arweave
     * source: `ar://{CID}`.
     * 
     */
    @JsonIgnore
    public String url() {
        return url;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Encryption> encryption() {
        return (Optional<Encryption>) encryption;
    }

    /**
     * Decides if the output video should include C2PA signature
     */
    @JsonIgnore
    public Optional<Boolean> c2pa() {
        return c2pa;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<TranscodeProfile>> profiles() {
        return (JsonNullable<List<TranscodeProfile>>) profiles;
    }

    /**
     * How many seconds the duration of each output segment should be
     */
    @JsonIgnore
    public Optional<Double> targetSegmentSizeSecs() {
        return targetSegmentSizeSecs;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The name of the asset. This is not necessarily the filename - it can be a custom name or title.
     * 
     */
    public NewAssetFromUrlPayload withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * Whether to generate MP4s for the asset.
     */
    public NewAssetFromUrlPayload withStaticMp4(boolean staticMp4) {
        Utils.checkNotNull(staticMp4, "staticMp4");
        this.staticMp4 = Optional.ofNullable(staticMp4);
        return this;
    }

    /**
     * Whether to generate MP4s for the asset.
     */
    public NewAssetFromUrlPayload withStaticMp4(Optional<Boolean> staticMp4) {
        Utils.checkNotNull(staticMp4, "staticMp4");
        this.staticMp4 = staticMp4;
        return this;
    }

    /**
     * Whether the playback policy for an asset or stream is public or signed
     */
    public NewAssetFromUrlPayload withPlaybackPolicy(PlaybackPolicy playbackPolicy) {
        Utils.checkNotNull(playbackPolicy, "playbackPolicy");
        this.playbackPolicy = JsonNullable.of(playbackPolicy);
        return this;
    }

    /**
     * Whether the playback policy for an asset or stream is public or signed
     */
    public NewAssetFromUrlPayload withPlaybackPolicy(JsonNullable<? extends PlaybackPolicy> playbackPolicy) {
        Utils.checkNotNull(playbackPolicy, "playbackPolicy");
        this.playbackPolicy = playbackPolicy;
        return this;
    }

    public NewAssetFromUrlPayload withCreatorId(InputCreatorId creatorId) {
        Utils.checkNotNull(creatorId, "creatorId");
        this.creatorId = Optional.ofNullable(creatorId);
        return this;
    }

    public NewAssetFromUrlPayload withCreatorId(Optional<? extends InputCreatorId> creatorId) {
        Utils.checkNotNull(creatorId, "creatorId");
        this.creatorId = creatorId;
        return this;
    }

    public NewAssetFromUrlPayload withStorage(Storage storage) {
        Utils.checkNotNull(storage, "storage");
        this.storage = Optional.ofNullable(storage);
        return this;
    }

    public NewAssetFromUrlPayload withStorage(Optional<? extends Storage> storage) {
        Utils.checkNotNull(storage, "storage");
        this.storage = storage;
        return this;
    }

    /**
     * URL where the asset contents can be retrieved, e.g. `https://s3.amazonaws.com/my-bucket/path/filename.mp4`.
     * For an IPFS source, this should be similar to: `ipfs://{CID}`. For an Arweave
     * source: `ar://{CID}`.
     * 
     */
    public NewAssetFromUrlPayload withUrl(String url) {
        Utils.checkNotNull(url, "url");
        this.url = url;
        return this;
    }

    public NewAssetFromUrlPayload withEncryption(Encryption encryption) {
        Utils.checkNotNull(encryption, "encryption");
        this.encryption = Optional.ofNullable(encryption);
        return this;
    }

    public NewAssetFromUrlPayload withEncryption(Optional<? extends Encryption> encryption) {
        Utils.checkNotNull(encryption, "encryption");
        this.encryption = encryption;
        return this;
    }

    /**
     * Decides if the output video should include C2PA signature
     */
    public NewAssetFromUrlPayload withC2pa(boolean c2pa) {
        Utils.checkNotNull(c2pa, "c2pa");
        this.c2pa = Optional.ofNullable(c2pa);
        return this;
    }

    /**
     * Decides if the output video should include C2PA signature
     */
    public NewAssetFromUrlPayload withC2pa(Optional<Boolean> c2pa) {
        Utils.checkNotNull(c2pa, "c2pa");
        this.c2pa = c2pa;
        return this;
    }

    public NewAssetFromUrlPayload withProfiles(List<TranscodeProfile> profiles) {
        Utils.checkNotNull(profiles, "profiles");
        this.profiles = JsonNullable.of(profiles);
        return this;
    }

    public NewAssetFromUrlPayload withProfiles(JsonNullable<? extends List<TranscodeProfile>> profiles) {
        Utils.checkNotNull(profiles, "profiles");
        this.profiles = profiles;
        return this;
    }

    /**
     * How many seconds the duration of each output segment should be
     */
    public NewAssetFromUrlPayload withTargetSegmentSizeSecs(double targetSegmentSizeSecs) {
        Utils.checkNotNull(targetSegmentSizeSecs, "targetSegmentSizeSecs");
        this.targetSegmentSizeSecs = Optional.ofNullable(targetSegmentSizeSecs);
        return this;
    }

    /**
     * How many seconds the duration of each output segment should be
     */
    public NewAssetFromUrlPayload withTargetSegmentSizeSecs(Optional<Double> targetSegmentSizeSecs) {
        Utils.checkNotNull(targetSegmentSizeSecs, "targetSegmentSizeSecs");
        this.targetSegmentSizeSecs = targetSegmentSizeSecs;
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
        NewAssetFromUrlPayload other = (NewAssetFromUrlPayload) o;
        return 
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.staticMp4, other.staticMp4) &&
            Objects.deepEquals(this.playbackPolicy, other.playbackPolicy) &&
            Objects.deepEquals(this.creatorId, other.creatorId) &&
            Objects.deepEquals(this.storage, other.storage) &&
            Objects.deepEquals(this.url, other.url) &&
            Objects.deepEquals(this.encryption, other.encryption) &&
            Objects.deepEquals(this.c2pa, other.c2pa) &&
            Objects.deepEquals(this.profiles, other.profiles) &&
            Objects.deepEquals(this.targetSegmentSizeSecs, other.targetSegmentSizeSecs);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            name,
            staticMp4,
            playbackPolicy,
            creatorId,
            storage,
            url,
            encryption,
            c2pa,
            profiles,
            targetSegmentSizeSecs);
    }
    
    @Override
    public String toString() {
        return Utils.toString(NewAssetFromUrlPayload.class,
                "name", name,
                "staticMp4", staticMp4,
                "playbackPolicy", playbackPolicy,
                "creatorId", creatorId,
                "storage", storage,
                "url", url,
                "encryption", encryption,
                "c2pa", c2pa,
                "profiles", profiles,
                "targetSegmentSizeSecs", targetSegmentSizeSecs);
    }
    
    public final static class Builder {
 
        private String name;
 
        private Optional<Boolean> staticMp4 = Optional.empty();
 
        private JsonNullable<? extends PlaybackPolicy> playbackPolicy = JsonNullable.undefined();
 
        private Optional<? extends InputCreatorId> creatorId = Optional.empty();
 
        private Optional<? extends Storage> storage = Optional.empty();
 
        private String url;
 
        private Optional<? extends Encryption> encryption = Optional.empty();
 
        private Optional<Boolean> c2pa = Optional.empty();
 
        private JsonNullable<? extends List<TranscodeProfile>> profiles = JsonNullable.undefined();
 
        private Optional<Double> targetSegmentSizeSecs = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The name of the asset. This is not necessarily the filename - it can be a custom name or title.
         * 
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * Whether to generate MP4s for the asset.
         */
        public Builder staticMp4(boolean staticMp4) {
            Utils.checkNotNull(staticMp4, "staticMp4");
            this.staticMp4 = Optional.ofNullable(staticMp4);
            return this;
        }

        /**
         * Whether to generate MP4s for the asset.
         */
        public Builder staticMp4(Optional<Boolean> staticMp4) {
            Utils.checkNotNull(staticMp4, "staticMp4");
            this.staticMp4 = staticMp4;
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

        public Builder storage(Storage storage) {
            Utils.checkNotNull(storage, "storage");
            this.storage = Optional.ofNullable(storage);
            return this;
        }

        public Builder storage(Optional<? extends Storage> storage) {
            Utils.checkNotNull(storage, "storage");
            this.storage = storage;
            return this;
        }

        /**
         * URL where the asset contents can be retrieved, e.g. `https://s3.amazonaws.com/my-bucket/path/filename.mp4`.
         * For an IPFS source, this should be similar to: `ipfs://{CID}`. For an Arweave
         * source: `ar://{CID}`.
         * 
         */
        public Builder url(String url) {
            Utils.checkNotNull(url, "url");
            this.url = url;
            return this;
        }

        public Builder encryption(Encryption encryption) {
            Utils.checkNotNull(encryption, "encryption");
            this.encryption = Optional.ofNullable(encryption);
            return this;
        }

        public Builder encryption(Optional<? extends Encryption> encryption) {
            Utils.checkNotNull(encryption, "encryption");
            this.encryption = encryption;
            return this;
        }

        /**
         * Decides if the output video should include C2PA signature
         */
        public Builder c2pa(boolean c2pa) {
            Utils.checkNotNull(c2pa, "c2pa");
            this.c2pa = Optional.ofNullable(c2pa);
            return this;
        }

        /**
         * Decides if the output video should include C2PA signature
         */
        public Builder c2pa(Optional<Boolean> c2pa) {
            Utils.checkNotNull(c2pa, "c2pa");
            this.c2pa = c2pa;
            return this;
        }

        public Builder profiles(List<TranscodeProfile> profiles) {
            Utils.checkNotNull(profiles, "profiles");
            this.profiles = JsonNullable.of(profiles);
            return this;
        }

        public Builder profiles(JsonNullable<? extends List<TranscodeProfile>> profiles) {
            Utils.checkNotNull(profiles, "profiles");
            this.profiles = profiles;
            return this;
        }

        /**
         * How many seconds the duration of each output segment should be
         */
        public Builder targetSegmentSizeSecs(double targetSegmentSizeSecs) {
            Utils.checkNotNull(targetSegmentSizeSecs, "targetSegmentSizeSecs");
            this.targetSegmentSizeSecs = Optional.ofNullable(targetSegmentSizeSecs);
            return this;
        }

        /**
         * How many seconds the duration of each output segment should be
         */
        public Builder targetSegmentSizeSecs(Optional<Double> targetSegmentSizeSecs) {
            Utils.checkNotNull(targetSegmentSizeSecs, "targetSegmentSizeSecs");
            this.targetSegmentSizeSecs = targetSegmentSizeSecs;
            return this;
        }
        
        public NewAssetFromUrlPayload build() {
            return new NewAssetFromUrlPayload(
                name,
                staticMp4,
                playbackPolicy,
                creatorId,
                storage,
                url,
                encryption,
                c2pa,
                profiles,
                targetSegmentSizeSecs);
        }
    }
}

