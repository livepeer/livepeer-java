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


public class AttestationIpfs {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("$ref")
    private Optional<? extends java.lang.Object> dollarRef;

    /**
     * Timestamp (in milliseconds) at which IPFS export task was updated
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updatedAt")
    private Optional<? extends Double> updatedAt;

    @JsonCreator
    public AttestationIpfs(
            @JsonProperty("$ref") Optional<? extends java.lang.Object> dollarRef,
            @JsonProperty("updatedAt") Optional<? extends Double> updatedAt) {
        Utils.checkNotNull(dollarRef, "dollarRef");
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.dollarRef = dollarRef;
        this.updatedAt = updatedAt;
    }
    
    public AttestationIpfs() {
        this(Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.lang.Object> dollarRef() {
        return (Optional<java.lang.Object>) dollarRef;
    }

    /**
     * Timestamp (in milliseconds) at which IPFS export task was updated
     * 
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Double> updatedAt() {
        return (Optional<Double>) updatedAt;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public AttestationIpfs withDollarRef(java.lang.Object dollarRef) {
        Utils.checkNotNull(dollarRef, "dollarRef");
        this.dollarRef = Optional.ofNullable(dollarRef);
        return this;
    }

    public AttestationIpfs withDollarRef(Optional<? extends java.lang.Object> dollarRef) {
        Utils.checkNotNull(dollarRef, "dollarRef");
        this.dollarRef = dollarRef;
        return this;
    }

    /**
     * Timestamp (in milliseconds) at which IPFS export task was updated
     * 
     */
    public AttestationIpfs withUpdatedAt(double updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = Optional.ofNullable(updatedAt);
        return this;
    }

    /**
     * Timestamp (in milliseconds) at which IPFS export task was updated
     * 
     */
    public AttestationIpfs withUpdatedAt(Optional<? extends Double> updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = updatedAt;
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
        AttestationIpfs other = (AttestationIpfs) o;
        return 
            java.util.Objects.deepEquals(this.dollarRef, other.dollarRef) &&
            java.util.Objects.deepEquals(this.updatedAt, other.updatedAt);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            dollarRef,
            updatedAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AttestationIpfs.class,
                "dollarRef", dollarRef,
                "updatedAt", updatedAt);
    }
    
    public final static class Builder {
 
        private Optional<? extends java.lang.Object> dollarRef = Optional.empty();
 
        private Optional<? extends Double> updatedAt = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder dollarRef(java.lang.Object dollarRef) {
            Utils.checkNotNull(dollarRef, "dollarRef");
            this.dollarRef = Optional.ofNullable(dollarRef);
            return this;
        }

        public Builder dollarRef(Optional<? extends java.lang.Object> dollarRef) {
            Utils.checkNotNull(dollarRef, "dollarRef");
            this.dollarRef = dollarRef;
            return this;
        }

        /**
         * Timestamp (in milliseconds) at which IPFS export task was updated
         * 
         */
        public Builder updatedAt(double updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = Optional.ofNullable(updatedAt);
            return this;
        }

        /**
         * Timestamp (in milliseconds) at which IPFS export task was updated
         * 
         */
        public Builder updatedAt(Optional<? extends Double> updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = updatedAt;
            return this;
        }
        
        public AttestationIpfs build() {
            return new AttestationIpfs(
                dollarRef,
                updatedAt);
        }
    }
}

