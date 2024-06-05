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
 * ClipStrategy - Strategy to use for clipping the asset. If not specified, the default strategy that Catalyst is configured for will be used. This field only available for admin users, and is only used for E2E testing.
 */

public class ClipStrategy {

    /**
     * The start timestamp of the clip in Unix milliseconds. _See the ClipTrigger in the UI Kit for an example of how this is calculated (for HLS, it uses `Program Date-Time` tags, and for WebRTC, it uses the latency from server to client at stream startup)._
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("startTime")
    private Optional<? extends Double> startTime;

    /**
     * The end timestamp of the clip in Unix milliseconds. _See the ClipTrigger in the UI Kit for an example of how this is calculated (for HLS, it uses `Program Date-Time` tags, and for WebRTC, it uses the latency from server to client at stream startup)._
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("endTime")
    private Optional<? extends Double> endTime;

    /**
     * The playback ID of the stream or stream recording to clip. Asset playback IDs are not supported yet.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("playbackId")
    private Optional<? extends String> playbackId;

    @JsonCreator
    public ClipStrategy(
            @JsonProperty("startTime") Optional<? extends Double> startTime,
            @JsonProperty("endTime") Optional<? extends Double> endTime,
            @JsonProperty("playbackId") Optional<? extends String> playbackId) {
        Utils.checkNotNull(startTime, "startTime");
        Utils.checkNotNull(endTime, "endTime");
        Utils.checkNotNull(playbackId, "playbackId");
        this.startTime = startTime;
        this.endTime = endTime;
        this.playbackId = playbackId;
    }
    
    public ClipStrategy() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The start timestamp of the clip in Unix milliseconds. _See the ClipTrigger in the UI Kit for an example of how this is calculated (for HLS, it uses `Program Date-Time` tags, and for WebRTC, it uses the latency from server to client at stream startup)._
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Double> startTime() {
        return (Optional<Double>) startTime;
    }

    /**
     * The end timestamp of the clip in Unix milliseconds. _See the ClipTrigger in the UI Kit for an example of how this is calculated (for HLS, it uses `Program Date-Time` tags, and for WebRTC, it uses the latency from server to client at stream startup)._
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Double> endTime() {
        return (Optional<Double>) endTime;
    }

    /**
     * The playback ID of the stream or stream recording to clip. Asset playback IDs are not supported yet.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> playbackId() {
        return (Optional<String>) playbackId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The start timestamp of the clip in Unix milliseconds. _See the ClipTrigger in the UI Kit for an example of how this is calculated (for HLS, it uses `Program Date-Time` tags, and for WebRTC, it uses the latency from server to client at stream startup)._
     */
    public ClipStrategy withStartTime(double startTime) {
        Utils.checkNotNull(startTime, "startTime");
        this.startTime = Optional.ofNullable(startTime);
        return this;
    }

    /**
     * The start timestamp of the clip in Unix milliseconds. _See the ClipTrigger in the UI Kit for an example of how this is calculated (for HLS, it uses `Program Date-Time` tags, and for WebRTC, it uses the latency from server to client at stream startup)._
     */
    public ClipStrategy withStartTime(Optional<? extends Double> startTime) {
        Utils.checkNotNull(startTime, "startTime");
        this.startTime = startTime;
        return this;
    }

    /**
     * The end timestamp of the clip in Unix milliseconds. _See the ClipTrigger in the UI Kit for an example of how this is calculated (for HLS, it uses `Program Date-Time` tags, and for WebRTC, it uses the latency from server to client at stream startup)._
     */
    public ClipStrategy withEndTime(double endTime) {
        Utils.checkNotNull(endTime, "endTime");
        this.endTime = Optional.ofNullable(endTime);
        return this;
    }

    /**
     * The end timestamp of the clip in Unix milliseconds. _See the ClipTrigger in the UI Kit for an example of how this is calculated (for HLS, it uses `Program Date-Time` tags, and for WebRTC, it uses the latency from server to client at stream startup)._
     */
    public ClipStrategy withEndTime(Optional<? extends Double> endTime) {
        Utils.checkNotNull(endTime, "endTime");
        this.endTime = endTime;
        return this;
    }

    /**
     * The playback ID of the stream or stream recording to clip. Asset playback IDs are not supported yet.
     */
    public ClipStrategy withPlaybackId(String playbackId) {
        Utils.checkNotNull(playbackId, "playbackId");
        this.playbackId = Optional.ofNullable(playbackId);
        return this;
    }

    /**
     * The playback ID of the stream or stream recording to clip. Asset playback IDs are not supported yet.
     */
    public ClipStrategy withPlaybackId(Optional<? extends String> playbackId) {
        Utils.checkNotNull(playbackId, "playbackId");
        this.playbackId = playbackId;
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
        ClipStrategy other = (ClipStrategy) o;
        return 
            java.util.Objects.deepEquals(this.startTime, other.startTime) &&
            java.util.Objects.deepEquals(this.endTime, other.endTime) &&
            java.util.Objects.deepEquals(this.playbackId, other.playbackId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            startTime,
            endTime,
            playbackId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ClipStrategy.class,
                "startTime", startTime,
                "endTime", endTime,
                "playbackId", playbackId);
    }
    
    public final static class Builder {
 
        private Optional<? extends Double> startTime = Optional.empty();
 
        private Optional<? extends Double> endTime = Optional.empty();
 
        private Optional<? extends String> playbackId = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The start timestamp of the clip in Unix milliseconds. _See the ClipTrigger in the UI Kit for an example of how this is calculated (for HLS, it uses `Program Date-Time` tags, and for WebRTC, it uses the latency from server to client at stream startup)._
         */
        public Builder startTime(double startTime) {
            Utils.checkNotNull(startTime, "startTime");
            this.startTime = Optional.ofNullable(startTime);
            return this;
        }

        /**
         * The start timestamp of the clip in Unix milliseconds. _See the ClipTrigger in the UI Kit for an example of how this is calculated (for HLS, it uses `Program Date-Time` tags, and for WebRTC, it uses the latency from server to client at stream startup)._
         */
        public Builder startTime(Optional<? extends Double> startTime) {
            Utils.checkNotNull(startTime, "startTime");
            this.startTime = startTime;
            return this;
        }

        /**
         * The end timestamp of the clip in Unix milliseconds. _See the ClipTrigger in the UI Kit for an example of how this is calculated (for HLS, it uses `Program Date-Time` tags, and for WebRTC, it uses the latency from server to client at stream startup)._
         */
        public Builder endTime(double endTime) {
            Utils.checkNotNull(endTime, "endTime");
            this.endTime = Optional.ofNullable(endTime);
            return this;
        }

        /**
         * The end timestamp of the clip in Unix milliseconds. _See the ClipTrigger in the UI Kit for an example of how this is calculated (for HLS, it uses `Program Date-Time` tags, and for WebRTC, it uses the latency from server to client at stream startup)._
         */
        public Builder endTime(Optional<? extends Double> endTime) {
            Utils.checkNotNull(endTime, "endTime");
            this.endTime = endTime;
            return this;
        }

        /**
         * The playback ID of the stream or stream recording to clip. Asset playback IDs are not supported yet.
         */
        public Builder playbackId(String playbackId) {
            Utils.checkNotNull(playbackId, "playbackId");
            this.playbackId = Optional.ofNullable(playbackId);
            return this;
        }

        /**
         * The playback ID of the stream or stream recording to clip. Asset playback IDs are not supported yet.
         */
        public Builder playbackId(Optional<? extends String> playbackId) {
            Utils.checkNotNull(playbackId, "playbackId");
            this.playbackId = playbackId;
            return this;
        }
        
        public ClipStrategy build() {
            return new ClipStrategy(
                startTime,
                endTime,
                playbackId);
        }
    }
}

