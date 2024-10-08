/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
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
    private Optional<Double> startTime;

    /**
     * The end timestamp of the clip in Unix milliseconds. _See the ClipTrigger in the UI Kit for an example of how this is calculated (for HLS, it uses `Program Date-Time` tags, and for WebRTC, it uses the latency from server to client at stream startup)._
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("endTime")
    private Optional<Double> endTime;

    /**
     * The playback ID of the stream or stream recording to clip. Asset playback IDs are not supported yet.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("playbackId")
    private Optional<String> playbackId;

    @JsonCreator
    public ClipStrategy(
            @JsonProperty("startTime") Optional<Double> startTime,
            @JsonProperty("endTime") Optional<Double> endTime,
            @JsonProperty("playbackId") Optional<String> playbackId) {
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
    @JsonIgnore
    public Optional<Double> startTime() {
        return startTime;
    }

    /**
     * The end timestamp of the clip in Unix milliseconds. _See the ClipTrigger in the UI Kit for an example of how this is calculated (for HLS, it uses `Program Date-Time` tags, and for WebRTC, it uses the latency from server to client at stream startup)._
     */
    @JsonIgnore
    public Optional<Double> endTime() {
        return endTime;
    }

    /**
     * The playback ID of the stream or stream recording to clip. Asset playback IDs are not supported yet.
     */
    @JsonIgnore
    public Optional<String> playbackId() {
        return playbackId;
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
    public ClipStrategy withStartTime(Optional<Double> startTime) {
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
    public ClipStrategy withEndTime(Optional<Double> endTime) {
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
    public ClipStrategy withPlaybackId(Optional<String> playbackId) {
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
            Objects.deepEquals(this.startTime, other.startTime) &&
            Objects.deepEquals(this.endTime, other.endTime) &&
            Objects.deepEquals(this.playbackId, other.playbackId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
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
 
        private Optional<Double> startTime = Optional.empty();
 
        private Optional<Double> endTime = Optional.empty();
 
        private Optional<String> playbackId = Optional.empty();  
        
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
        public Builder startTime(Optional<Double> startTime) {
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
        public Builder endTime(Optional<Double> endTime) {
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
        public Builder playbackId(Optional<String> playbackId) {
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

