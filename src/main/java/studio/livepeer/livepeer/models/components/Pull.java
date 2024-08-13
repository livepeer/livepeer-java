/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import studio.livepeer.livepeer.utils.Utils;

/**
 * Pull - Configuration for a stream that should be actively pulled from an
 * external source, rather than pushed to Livepeer. If specified, the
 * stream will not have a streamKey.
 */

public class Pull {

    /**
     * URL from which to pull from.
     */
    @JsonProperty("source")
    private String source;

    /**
     * Headers to be sent with the request to the pull source.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("headers")
    private Optional<? extends Map<String, String>> headers;

    /**
     * Indicates whether the stream will be pulled from a mobile source.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("isMobile")
    private Optional<? extends IsMobile> isMobile;

    /**
     * Approximate location of the pull source. The location is used to
     * determine the closest Livepeer region to pull the stream from.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("location")
    private Optional<? extends Location> location;

    @JsonCreator
    public Pull(
            @JsonProperty("source") String source,
            @JsonProperty("headers") Optional<? extends Map<String, String>> headers,
            @JsonProperty("isMobile") Optional<? extends IsMobile> isMobile,
            @JsonProperty("location") Optional<? extends Location> location) {
        Utils.checkNotNull(source, "source");
        Utils.checkNotNull(headers, "headers");
        Utils.checkNotNull(isMobile, "isMobile");
        Utils.checkNotNull(location, "location");
        this.source = source;
        this.headers = headers;
        this.isMobile = isMobile;
        this.location = location;
    }
    
    public Pull(
            String source) {
        this(source, Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * URL from which to pull from.
     */
    @JsonIgnore
    public String source() {
        return source;
    }

    /**
     * Headers to be sent with the request to the pull source.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, String>> headers() {
        return (Optional<Map<String, String>>) headers;
    }

    /**
     * Indicates whether the stream will be pulled from a mobile source.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<IsMobile> isMobile() {
        return (Optional<IsMobile>) isMobile;
    }

    /**
     * Approximate location of the pull source. The location is used to
     * determine the closest Livepeer region to pull the stream from.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Location> location() {
        return (Optional<Location>) location;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * URL from which to pull from.
     */
    public Pull withSource(String source) {
        Utils.checkNotNull(source, "source");
        this.source = source;
        return this;
    }

    /**
     * Headers to be sent with the request to the pull source.
     */
    public Pull withHeaders(Map<String, String> headers) {
        Utils.checkNotNull(headers, "headers");
        this.headers = Optional.ofNullable(headers);
        return this;
    }

    /**
     * Headers to be sent with the request to the pull source.
     */
    public Pull withHeaders(Optional<? extends Map<String, String>> headers) {
        Utils.checkNotNull(headers, "headers");
        this.headers = headers;
        return this;
    }

    /**
     * Indicates whether the stream will be pulled from a mobile source.
     */
    public Pull withIsMobile(IsMobile isMobile) {
        Utils.checkNotNull(isMobile, "isMobile");
        this.isMobile = Optional.ofNullable(isMobile);
        return this;
    }

    /**
     * Indicates whether the stream will be pulled from a mobile source.
     */
    public Pull withIsMobile(Optional<? extends IsMobile> isMobile) {
        Utils.checkNotNull(isMobile, "isMobile");
        this.isMobile = isMobile;
        return this;
    }

    /**
     * Approximate location of the pull source. The location is used to
     * determine the closest Livepeer region to pull the stream from.
     */
    public Pull withLocation(Location location) {
        Utils.checkNotNull(location, "location");
        this.location = Optional.ofNullable(location);
        return this;
    }

    /**
     * Approximate location of the pull source. The location is used to
     * determine the closest Livepeer region to pull the stream from.
     */
    public Pull withLocation(Optional<? extends Location> location) {
        Utils.checkNotNull(location, "location");
        this.location = location;
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
        Pull other = (Pull) o;
        return 
            Objects.deepEquals(this.source, other.source) &&
            Objects.deepEquals(this.headers, other.headers) &&
            Objects.deepEquals(this.isMobile, other.isMobile) &&
            Objects.deepEquals(this.location, other.location);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            source,
            headers,
            isMobile,
            location);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Pull.class,
                "source", source,
                "headers", headers,
                "isMobile", isMobile,
                "location", location);
    }
    
    public final static class Builder {
 
        private String source;
 
        private Optional<? extends Map<String, String>> headers = Optional.empty();
 
        private Optional<? extends IsMobile> isMobile = Optional.empty();
 
        private Optional<? extends Location> location = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * URL from which to pull from.
         */
        public Builder source(String source) {
            Utils.checkNotNull(source, "source");
            this.source = source;
            return this;
        }

        /**
         * Headers to be sent with the request to the pull source.
         */
        public Builder headers(Map<String, String> headers) {
            Utils.checkNotNull(headers, "headers");
            this.headers = Optional.ofNullable(headers);
            return this;
        }

        /**
         * Headers to be sent with the request to the pull source.
         */
        public Builder headers(Optional<? extends Map<String, String>> headers) {
            Utils.checkNotNull(headers, "headers");
            this.headers = headers;
            return this;
        }

        /**
         * Indicates whether the stream will be pulled from a mobile source.
         */
        public Builder isMobile(IsMobile isMobile) {
            Utils.checkNotNull(isMobile, "isMobile");
            this.isMobile = Optional.ofNullable(isMobile);
            return this;
        }

        /**
         * Indicates whether the stream will be pulled from a mobile source.
         */
        public Builder isMobile(Optional<? extends IsMobile> isMobile) {
            Utils.checkNotNull(isMobile, "isMobile");
            this.isMobile = isMobile;
            return this;
        }

        /**
         * Approximate location of the pull source. The location is used to
         * determine the closest Livepeer region to pull the stream from.
         */
        public Builder location(Location location) {
            Utils.checkNotNull(location, "location");
            this.location = Optional.ofNullable(location);
            return this;
        }

        /**
         * Approximate location of the pull source. The location is used to
         * determine the closest Livepeer region to pull the stream from.
         */
        public Builder location(Optional<? extends Location> location) {
            Utils.checkNotNull(location, "location");
            this.location = location;
            return this;
        }
        
        public Pull build() {
            return new Pull(
                source,
                headers,
                isMobile,
                location);
        }
    }
}

