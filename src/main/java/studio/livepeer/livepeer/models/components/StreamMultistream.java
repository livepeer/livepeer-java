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

public class StreamMultistream {

    /**
     * References to targets where this stream will be simultaneously
     * streamed to
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("targets")
    private Optional<? extends java.util.List<TargetOutput>> targets;

    @JsonCreator
    public StreamMultistream(
            @JsonProperty("targets") Optional<? extends java.util.List<TargetOutput>> targets) {
        Utils.checkNotNull(targets, "targets");
        this.targets = targets;
    }
    
    public StreamMultistream() {
        this(Optional.empty());
    }

    /**
     * References to targets where this stream will be simultaneously
     * streamed to
     * 
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.List<TargetOutput>> targets() {
        return (Optional<java.util.List<TargetOutput>>) targets;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * References to targets where this stream will be simultaneously
     * streamed to
     * 
     */
    public StreamMultistream withTargets(java.util.List<TargetOutput> targets) {
        Utils.checkNotNull(targets, "targets");
        this.targets = Optional.ofNullable(targets);
        return this;
    }

    /**
     * References to targets where this stream will be simultaneously
     * streamed to
     * 
     */
    public StreamMultistream withTargets(Optional<? extends java.util.List<TargetOutput>> targets) {
        Utils.checkNotNull(targets, "targets");
        this.targets = targets;
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
        StreamMultistream other = (StreamMultistream) o;
        return 
            java.util.Objects.deepEquals(this.targets, other.targets);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            targets);
    }
    
    @Override
    public String toString() {
        return Utils.toString(StreamMultistream.class,
                "targets", targets);
    }
    
    public final static class Builder {
 
        private Optional<? extends java.util.List<TargetOutput>> targets = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * References to targets where this stream will be simultaneously
         * streamed to
         * 
         */
        public Builder targets(java.util.List<TargetOutput> targets) {
            Utils.checkNotNull(targets, "targets");
            this.targets = Optional.ofNullable(targets);
            return this;
        }

        /**
         * References to targets where this stream will be simultaneously
         * streamed to
         * 
         */
        public Builder targets(Optional<? extends java.util.List<TargetOutput>> targets) {
            Utils.checkNotNull(targets, "targets");
            this.targets = targets;
            return this;
        }
        
        public StreamMultistream build() {
            return new StreamMultistream(
                targets);
        }
    }
}

