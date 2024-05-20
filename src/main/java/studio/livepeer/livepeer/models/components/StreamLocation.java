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
 * StreamLocation - Approximate location of the pull source. The location is used to
 * determine the closest Livepeer region to pull the stream from.
 */

public class StreamLocation {

    /**
     * Latitude of the pull source in degrees. North is positive,
     * south is negative.
     */
    @JsonProperty("lat")
    private double lat;

    /**
     * Longitude of the pull source in degrees. East is positive,
     * west is negative.
     */
    @JsonProperty("lon")
    private double lon;

    @JsonCreator
    public StreamLocation(
            @JsonProperty("lat") double lat,
            @JsonProperty("lon") double lon) {
        Utils.checkNotNull(lat, "lat");
        Utils.checkNotNull(lon, "lon");
        this.lat = lat;
        this.lon = lon;
    }

    /**
     * Latitude of the pull source in degrees. North is positive,
     * south is negative.
     */
    @JsonIgnore
    public double lat() {
        return lat;
    }

    /**
     * Longitude of the pull source in degrees. East is positive,
     * west is negative.
     */
    @JsonIgnore
    public double lon() {
        return lon;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Latitude of the pull source in degrees. North is positive,
     * south is negative.
     */
    public StreamLocation withLat(double lat) {
        Utils.checkNotNull(lat, "lat");
        this.lat = lat;
        return this;
    }

    /**
     * Longitude of the pull source in degrees. East is positive,
     * west is negative.
     */
    public StreamLocation withLon(double lon) {
        Utils.checkNotNull(lon, "lon");
        this.lon = lon;
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
        StreamLocation other = (StreamLocation) o;
        return 
            java.util.Objects.deepEquals(this.lat, other.lat) &&
            java.util.Objects.deepEquals(this.lon, other.lon);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            lat,
            lon);
    }
    
    @Override
    public String toString() {
        return Utils.toString(StreamLocation.class,
                "lat", lat,
                "lon", lon);
    }
    
    public final static class Builder {
 
        private Double lat;
 
        private Double lon;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Latitude of the pull source in degrees. North is positive,
         * south is negative.
         */
        public Builder lat(double lat) {
            Utils.checkNotNull(lat, "lat");
            this.lat = lat;
            return this;
        }

        /**
         * Longitude of the pull source in degrees. East is positive,
         * west is negative.
         */
        public Builder lon(double lon) {
            Utils.checkNotNull(lon, "lon");
            this.lon = lon;
            return this;
        }
        
        public StreamLocation build() {
            return new StreamLocation(
                lat,
                lon);
        }
    }
}

