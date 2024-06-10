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
/**
 * StreamRecordingSpec - Configuration for recording the stream. This can only be set if
 * `record` is true.
 * 
 */

public class StreamRecordingSpec {

    /**
     * Profiles to record the stream in. If not specified, the stream
     * will be recorded in the same profiles as the stream itself. Keep
     * in mind that the source rendition will always be recorded.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("profiles")
    private Optional<? extends java.util.List<FfmpegProfile>> profiles;

    @JsonCreator
    public StreamRecordingSpec(
            @JsonProperty("profiles") Optional<? extends java.util.List<FfmpegProfile>> profiles) {
        Utils.checkNotNull(profiles, "profiles");
        this.profiles = profiles;
    }
    
    public StreamRecordingSpec() {
        this(Optional.empty());
    }

    /**
     * Profiles to record the stream in. If not specified, the stream
     * will be recorded in the same profiles as the stream itself. Keep
     * in mind that the source rendition will always be recorded.
     * 
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.List<FfmpegProfile>> profiles() {
        return (Optional<java.util.List<FfmpegProfile>>) profiles;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Profiles to record the stream in. If not specified, the stream
     * will be recorded in the same profiles as the stream itself. Keep
     * in mind that the source rendition will always be recorded.
     * 
     */
    public StreamRecordingSpec withProfiles(java.util.List<FfmpegProfile> profiles) {
        Utils.checkNotNull(profiles, "profiles");
        this.profiles = Optional.ofNullable(profiles);
        return this;
    }

    /**
     * Profiles to record the stream in. If not specified, the stream
     * will be recorded in the same profiles as the stream itself. Keep
     * in mind that the source rendition will always be recorded.
     * 
     */
    public StreamRecordingSpec withProfiles(Optional<? extends java.util.List<FfmpegProfile>> profiles) {
        Utils.checkNotNull(profiles, "profiles");
        this.profiles = profiles;
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
        StreamRecordingSpec other = (StreamRecordingSpec) o;
        return 
            java.util.Objects.deepEquals(this.profiles, other.profiles);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            profiles);
    }
    
    @Override
    public String toString() {
        return Utils.toString(StreamRecordingSpec.class,
                "profiles", profiles);
    }
    
    public final static class Builder {
 
        private Optional<? extends java.util.List<FfmpegProfile>> profiles = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Profiles to record the stream in. If not specified, the stream
         * will be recorded in the same profiles as the stream itself. Keep
         * in mind that the source rendition will always be recorded.
         * 
         */
        public Builder profiles(java.util.List<FfmpegProfile> profiles) {
            Utils.checkNotNull(profiles, "profiles");
            this.profiles = Optional.ofNullable(profiles);
            return this;
        }

        /**
         * Profiles to record the stream in. If not specified, the stream
         * will be recorded in the same profiles as the stream itself. Keep
         * in mind that the source rendition will always be recorded.
         * 
         */
        public Builder profiles(Optional<? extends java.util.List<FfmpegProfile>> profiles) {
            Utils.checkNotNull(profiles, "profiles");
            this.profiles = profiles;
            return this;
        }
        
        public StreamRecordingSpec build() {
            return new StreamRecordingSpec(
                profiles);
        }
    }
}

