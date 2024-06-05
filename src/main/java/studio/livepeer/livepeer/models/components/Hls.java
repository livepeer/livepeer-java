/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.components;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import studio.livepeer.livepeer.utils.Utils;
/**
 * Hls - HLS output format
 */

public class Hls {

    /**
     * Path for the HLS output
     */
    @JsonProperty("path")
    private String path;

    @JsonCreator
    public Hls(
            @JsonProperty("path") String path) {
        Utils.checkNotNull(path, "path");
        this.path = path;
    }

    /**
     * Path for the HLS output
     */
    @JsonIgnore
    public String path() {
        return path;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Path for the HLS output
     */
    public Hls withPath(String path) {
        Utils.checkNotNull(path, "path");
        this.path = path;
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
        Hls other = (Hls) o;
        return 
            java.util.Objects.deepEquals(this.path, other.path);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            path);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Hls.class,
                "path", path);
    }
    
    public final static class Builder {
 
        private String path;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Path for the HLS output
         */
        public Builder path(String path) {
            Utils.checkNotNull(path, "path");
            this.path = path;
            return this;
        }
        
        public Hls build() {
            return new Hls(
                path);
        }
    }
}

