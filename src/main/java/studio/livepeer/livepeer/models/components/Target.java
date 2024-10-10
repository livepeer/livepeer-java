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
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;
import studio.livepeer.livepeer.utils.LazySingletonValue;
import studio.livepeer.livepeer.utils.Utils;


public class Target {

    /**
     * Name of transcoding profile that should be sent. Use
     * "source" for pushing source stream data
     * 
     */
    @JsonProperty("profile")
    private String profile;

    /**
     * If true, the stream audio will be muted and only silent
     * video will be pushed to the target.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("videoOnly")
    private Optional<Boolean> videoOnly;

    /**
     * ID of multistream target object where to push this stream
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    /**
     * Inline multistream target object. Will automatically
     * create the target resource to be used by the created
     * stream.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("spec")
    private Optional<? extends TargetSpec> spec;

    @JsonCreator
    public Target(
            @JsonProperty("profile") String profile,
            @JsonProperty("videoOnly") Optional<Boolean> videoOnly,
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("spec") Optional<? extends TargetSpec> spec) {
        Utils.checkNotNull(profile, "profile");
        Utils.checkNotNull(videoOnly, "videoOnly");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(spec, "spec");
        this.profile = profile;
        this.videoOnly = videoOnly;
        this.id = id;
        this.spec = spec;
    }
    
    public Target(
            String profile) {
        this(profile, Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Name of transcoding profile that should be sent. Use
     * "source" for pushing source stream data
     * 
     */
    @JsonIgnore
    public String profile() {
        return profile;
    }

    /**
     * If true, the stream audio will be muted and only silent
     * video will be pushed to the target.
     * 
     */
    @JsonIgnore
    public Optional<Boolean> videoOnly() {
        return videoOnly;
    }

    /**
     * ID of multistream target object where to push this stream
     */
    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    /**
     * Inline multistream target object. Will automatically
     * create the target resource to be used by the created
     * stream.
     * 
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<TargetSpec> spec() {
        return (Optional<TargetSpec>) spec;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Name of transcoding profile that should be sent. Use
     * "source" for pushing source stream data
     * 
     */
    public Target withProfile(String profile) {
        Utils.checkNotNull(profile, "profile");
        this.profile = profile;
        return this;
    }

    /**
     * If true, the stream audio will be muted and only silent
     * video will be pushed to the target.
     * 
     */
    public Target withVideoOnly(boolean videoOnly) {
        Utils.checkNotNull(videoOnly, "videoOnly");
        this.videoOnly = Optional.ofNullable(videoOnly);
        return this;
    }

    /**
     * If true, the stream audio will be muted and only silent
     * video will be pushed to the target.
     * 
     */
    public Target withVideoOnly(Optional<Boolean> videoOnly) {
        Utils.checkNotNull(videoOnly, "videoOnly");
        this.videoOnly = videoOnly;
        return this;
    }

    /**
     * ID of multistream target object where to push this stream
     */
    public Target withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * ID of multistream target object where to push this stream
     */
    public Target withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * Inline multistream target object. Will automatically
     * create the target resource to be used by the created
     * stream.
     * 
     */
    public Target withSpec(TargetSpec spec) {
        Utils.checkNotNull(spec, "spec");
        this.spec = Optional.ofNullable(spec);
        return this;
    }

    /**
     * Inline multistream target object. Will automatically
     * create the target resource to be used by the created
     * stream.
     * 
     */
    public Target withSpec(Optional<? extends TargetSpec> spec) {
        Utils.checkNotNull(spec, "spec");
        this.spec = spec;
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
        Target other = (Target) o;
        return 
            Objects.deepEquals(this.profile, other.profile) &&
            Objects.deepEquals(this.videoOnly, other.videoOnly) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.spec, other.spec);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            profile,
            videoOnly,
            id,
            spec);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Target.class,
                "profile", profile,
                "videoOnly", videoOnly,
                "id", id,
                "spec", spec);
    }
    
    public final static class Builder {
 
        private String profile;
 
        private Optional<Boolean> videoOnly;
 
        private Optional<String> id = Optional.empty();
 
        private Optional<? extends TargetSpec> spec = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Name of transcoding profile that should be sent. Use
         * "source" for pushing source stream data
         * 
         */
        public Builder profile(String profile) {
            Utils.checkNotNull(profile, "profile");
            this.profile = profile;
            return this;
        }

        /**
         * If true, the stream audio will be muted and only silent
         * video will be pushed to the target.
         * 
         */
        public Builder videoOnly(boolean videoOnly) {
            Utils.checkNotNull(videoOnly, "videoOnly");
            this.videoOnly = Optional.ofNullable(videoOnly);
            return this;
        }

        /**
         * If true, the stream audio will be muted and only silent
         * video will be pushed to the target.
         * 
         */
        public Builder videoOnly(Optional<Boolean> videoOnly) {
            Utils.checkNotNull(videoOnly, "videoOnly");
            this.videoOnly = videoOnly;
            return this;
        }

        /**
         * ID of multistream target object where to push this stream
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        /**
         * ID of multistream target object where to push this stream
         */
        public Builder id(Optional<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * Inline multistream target object. Will automatically
         * create the target resource to be used by the created
         * stream.
         * 
         */
        public Builder spec(TargetSpec spec) {
            Utils.checkNotNull(spec, "spec");
            this.spec = Optional.ofNullable(spec);
            return this;
        }

        /**
         * Inline multistream target object. Will automatically
         * create the target resource to be used by the created
         * stream.
         * 
         */
        public Builder spec(Optional<? extends TargetSpec> spec) {
            Utils.checkNotNull(spec, "spec");
            this.spec = spec;
            return this;
        }
        
        public Target build() {
            if (videoOnly == null) {
                videoOnly = _SINGLETON_VALUE_VideoOnly.value();
            }            return new Target(
                profile,
                videoOnly,
                id,
                spec);
        }

        private static final LazySingletonValue<Optional<Boolean>> _SINGLETON_VALUE_VideoOnly =
                new LazySingletonValue<>(
                        "videoOnly",
                        "false",
                        new TypeReference<Optional<Boolean>>() {});
    }
}

