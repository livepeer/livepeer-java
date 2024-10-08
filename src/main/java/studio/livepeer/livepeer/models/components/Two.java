/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import studio.livepeer.livepeer.utils.Utils;


public class Two {

    @JsonProperty("type")
    private AssetSourceType type;

    /**
     * ID of the session from which this asset was created
     */
    @JsonProperty("sessionId")
    private String sessionId;

    @JsonCreator
    public Two(
            @JsonProperty("type") AssetSourceType type,
            @JsonProperty("sessionId") String sessionId) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(sessionId, "sessionId");
        this.type = type;
        this.sessionId = sessionId;
    }

    @JsonIgnore
    public AssetSourceType type() {
        return type;
    }

    /**
     * ID of the session from which this asset was created
     */
    @JsonIgnore
    public String sessionId() {
        return sessionId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Two withType(AssetSourceType type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * ID of the session from which this asset was created
     */
    public Two withSessionId(String sessionId) {
        Utils.checkNotNull(sessionId, "sessionId");
        this.sessionId = sessionId;
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
        Two other = (Two) o;
        return 
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.sessionId, other.sessionId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            type,
            sessionId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Two.class,
                "type", type,
                "sessionId", sessionId);
    }
    
    public final static class Builder {
 
        private AssetSourceType type;
 
        private String sessionId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(AssetSourceType type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        /**
         * ID of the session from which this asset was created
         */
        public Builder sessionId(String sessionId) {
            Utils.checkNotNull(sessionId, "sessionId");
            this.sessionId = sessionId;
            return this;
        }
        
        public Two build() {
            return new Two(
                type,
                sessionId);
        }
    }
}

