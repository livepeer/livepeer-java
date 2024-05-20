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
 * TaskOutputs - Output formats
 */

public class TaskOutputs {

    /**
     * HLS output format
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hls")
    private Optional<? extends TaskHls> hls;

    /**
     * MP4 output format
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mp4")
    private Optional<? extends TaskMp4> mp4;

    @JsonCreator
    public TaskOutputs(
            @JsonProperty("hls") Optional<? extends TaskHls> hls,
            @JsonProperty("mp4") Optional<? extends TaskMp4> mp4) {
        Utils.checkNotNull(hls, "hls");
        Utils.checkNotNull(mp4, "mp4");
        this.hls = hls;
        this.mp4 = mp4;
    }
    
    public TaskOutputs() {
        this(Optional.empty(), Optional.empty());
    }

    /**
     * HLS output format
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<TaskHls> hls() {
        return (Optional<TaskHls>) hls;
    }

    /**
     * MP4 output format
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<TaskMp4> mp4() {
        return (Optional<TaskMp4>) mp4;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HLS output format
     */
    public TaskOutputs withHls(TaskHls hls) {
        Utils.checkNotNull(hls, "hls");
        this.hls = Optional.ofNullable(hls);
        return this;
    }

    /**
     * HLS output format
     */
    public TaskOutputs withHls(Optional<? extends TaskHls> hls) {
        Utils.checkNotNull(hls, "hls");
        this.hls = hls;
        return this;
    }

    /**
     * MP4 output format
     */
    public TaskOutputs withMp4(TaskMp4 mp4) {
        Utils.checkNotNull(mp4, "mp4");
        this.mp4 = Optional.ofNullable(mp4);
        return this;
    }

    /**
     * MP4 output format
     */
    public TaskOutputs withMp4(Optional<? extends TaskMp4> mp4) {
        Utils.checkNotNull(mp4, "mp4");
        this.mp4 = mp4;
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
        TaskOutputs other = (TaskOutputs) o;
        return 
            java.util.Objects.deepEquals(this.hls, other.hls) &&
            java.util.Objects.deepEquals(this.mp4, other.mp4);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            hls,
            mp4);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TaskOutputs.class,
                "hls", hls,
                "mp4", mp4);
    }
    
    public final static class Builder {
 
        private Optional<? extends TaskHls> hls = Optional.empty();
 
        private Optional<? extends TaskMp4> mp4 = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * HLS output format
         */
        public Builder hls(TaskHls hls) {
            Utils.checkNotNull(hls, "hls");
            this.hls = Optional.ofNullable(hls);
            return this;
        }

        /**
         * HLS output format
         */
        public Builder hls(Optional<? extends TaskHls> hls) {
            Utils.checkNotNull(hls, "hls");
            this.hls = hls;
            return this;
        }

        /**
         * MP4 output format
         */
        public Builder mp4(TaskMp4 mp4) {
            Utils.checkNotNull(mp4, "mp4");
            this.mp4 = Optional.ofNullable(mp4);
            return this;
        }

        /**
         * MP4 output format
         */
        public Builder mp4(Optional<? extends TaskMp4> mp4) {
            Utils.checkNotNull(mp4, "mp4");
            this.mp4 = mp4;
            return this;
        }
        
        public TaskOutputs build() {
            return new TaskOutputs(
                hls,
                mp4);
        }
    }
}

