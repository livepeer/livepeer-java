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
 * Outputs - Output formats
 */

public class Outputs {

    /**
     * HLS output format
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hls")
    private Optional<? extends Hls> hls;

    /**
     * MP4 output format
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mp4")
    private Optional<? extends Mp4> mp4;

    /**
     * FMP4 output format
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("fmp4")
    private Optional<? extends Fmp4> fmp4;

    @JsonCreator
    public Outputs(
            @JsonProperty("hls") Optional<? extends Hls> hls,
            @JsonProperty("mp4") Optional<? extends Mp4> mp4,
            @JsonProperty("fmp4") Optional<? extends Fmp4> fmp4) {
        Utils.checkNotNull(hls, "hls");
        Utils.checkNotNull(mp4, "mp4");
        Utils.checkNotNull(fmp4, "fmp4");
        this.hls = hls;
        this.mp4 = mp4;
        this.fmp4 = fmp4;
    }
    
    public Outputs() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * HLS output format
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Hls> hls() {
        return (Optional<Hls>) hls;
    }

    /**
     * MP4 output format
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Mp4> mp4() {
        return (Optional<Mp4>) mp4;
    }

    /**
     * FMP4 output format
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Fmp4> fmp4() {
        return (Optional<Fmp4>) fmp4;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HLS output format
     */
    public Outputs withHls(Hls hls) {
        Utils.checkNotNull(hls, "hls");
        this.hls = Optional.ofNullable(hls);
        return this;
    }

    /**
     * HLS output format
     */
    public Outputs withHls(Optional<? extends Hls> hls) {
        Utils.checkNotNull(hls, "hls");
        this.hls = hls;
        return this;
    }

    /**
     * MP4 output format
     */
    public Outputs withMp4(Mp4 mp4) {
        Utils.checkNotNull(mp4, "mp4");
        this.mp4 = Optional.ofNullable(mp4);
        return this;
    }

    /**
     * MP4 output format
     */
    public Outputs withMp4(Optional<? extends Mp4> mp4) {
        Utils.checkNotNull(mp4, "mp4");
        this.mp4 = mp4;
        return this;
    }

    /**
     * FMP4 output format
     */
    public Outputs withFmp4(Fmp4 fmp4) {
        Utils.checkNotNull(fmp4, "fmp4");
        this.fmp4 = Optional.ofNullable(fmp4);
        return this;
    }

    /**
     * FMP4 output format
     */
    public Outputs withFmp4(Optional<? extends Fmp4> fmp4) {
        Utils.checkNotNull(fmp4, "fmp4");
        this.fmp4 = fmp4;
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
        Outputs other = (Outputs) o;
        return 
            java.util.Objects.deepEquals(this.hls, other.hls) &&
            java.util.Objects.deepEquals(this.mp4, other.mp4) &&
            java.util.Objects.deepEquals(this.fmp4, other.fmp4);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            hls,
            mp4,
            fmp4);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Outputs.class,
                "hls", hls,
                "mp4", mp4,
                "fmp4", fmp4);
    }
    
    public final static class Builder {
 
        private Optional<? extends Hls> hls = Optional.empty();
 
        private Optional<? extends Mp4> mp4 = Optional.empty();
 
        private Optional<? extends Fmp4> fmp4 = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * HLS output format
         */
        public Builder hls(Hls hls) {
            Utils.checkNotNull(hls, "hls");
            this.hls = Optional.ofNullable(hls);
            return this;
        }

        /**
         * HLS output format
         */
        public Builder hls(Optional<? extends Hls> hls) {
            Utils.checkNotNull(hls, "hls");
            this.hls = hls;
            return this;
        }

        /**
         * MP4 output format
         */
        public Builder mp4(Mp4 mp4) {
            Utils.checkNotNull(mp4, "mp4");
            this.mp4 = Optional.ofNullable(mp4);
            return this;
        }

        /**
         * MP4 output format
         */
        public Builder mp4(Optional<? extends Mp4> mp4) {
            Utils.checkNotNull(mp4, "mp4");
            this.mp4 = mp4;
            return this;
        }

        /**
         * FMP4 output format
         */
        public Builder fmp4(Fmp4 fmp4) {
            Utils.checkNotNull(fmp4, "fmp4");
            this.fmp4 = Optional.ofNullable(fmp4);
            return this;
        }

        /**
         * FMP4 output format
         */
        public Builder fmp4(Optional<? extends Fmp4> fmp4) {
            Utils.checkNotNull(fmp4, "fmp4");
            this.fmp4 = fmp4;
            return this;
        }
        
        public Outputs build() {
            return new Outputs(
                hls,
                mp4,
                fmp4);
        }
    }
}

