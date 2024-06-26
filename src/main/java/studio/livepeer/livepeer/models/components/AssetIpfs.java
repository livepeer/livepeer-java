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

public class AssetIpfs {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("spec")
    private Optional<? extends AssetSpec> spec;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("$ref")
    private Optional<? extends java.lang.Object> dollarRef;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("nftMetadata")
    private Optional<? extends IpfsFileInfo> nftMetadata;

    /**
     * Timestamp (in milliseconds) at which IPFS export task was
     * updated
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updatedAt")
    private Optional<? extends Double> updatedAt;

    @JsonCreator
    public AssetIpfs(
            @JsonProperty("spec") Optional<? extends AssetSpec> spec,
            @JsonProperty("$ref") Optional<? extends java.lang.Object> dollarRef,
            @JsonProperty("nftMetadata") Optional<? extends IpfsFileInfo> nftMetadata,
            @JsonProperty("updatedAt") Optional<? extends Double> updatedAt) {
        Utils.checkNotNull(spec, "spec");
        Utils.checkNotNull(dollarRef, "dollarRef");
        Utils.checkNotNull(nftMetadata, "nftMetadata");
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.spec = spec;
        this.dollarRef = dollarRef;
        this.nftMetadata = nftMetadata;
        this.updatedAt = updatedAt;
    }
    
    public AssetIpfs() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AssetSpec> spec() {
        return (Optional<AssetSpec>) spec;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.lang.Object> dollarRef() {
        return (Optional<java.lang.Object>) dollarRef;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<IpfsFileInfo> nftMetadata() {
        return (Optional<IpfsFileInfo>) nftMetadata;
    }

    /**
     * Timestamp (in milliseconds) at which IPFS export task was
     * updated
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

    public AssetIpfs withSpec(AssetSpec spec) {
        Utils.checkNotNull(spec, "spec");
        this.spec = Optional.ofNullable(spec);
        return this;
    }

    public AssetIpfs withSpec(Optional<? extends AssetSpec> spec) {
        Utils.checkNotNull(spec, "spec");
        this.spec = spec;
        return this;
    }

    public AssetIpfs withDollarRef(java.lang.Object dollarRef) {
        Utils.checkNotNull(dollarRef, "dollarRef");
        this.dollarRef = Optional.ofNullable(dollarRef);
        return this;
    }

    public AssetIpfs withDollarRef(Optional<? extends java.lang.Object> dollarRef) {
        Utils.checkNotNull(dollarRef, "dollarRef");
        this.dollarRef = dollarRef;
        return this;
    }

    public AssetIpfs withNftMetadata(IpfsFileInfo nftMetadata) {
        Utils.checkNotNull(nftMetadata, "nftMetadata");
        this.nftMetadata = Optional.ofNullable(nftMetadata);
        return this;
    }

    public AssetIpfs withNftMetadata(Optional<? extends IpfsFileInfo> nftMetadata) {
        Utils.checkNotNull(nftMetadata, "nftMetadata");
        this.nftMetadata = nftMetadata;
        return this;
    }

    /**
     * Timestamp (in milliseconds) at which IPFS export task was
     * updated
     * 
     */
    public AssetIpfs withUpdatedAt(double updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = Optional.ofNullable(updatedAt);
        return this;
    }

    /**
     * Timestamp (in milliseconds) at which IPFS export task was
     * updated
     * 
     */
    public AssetIpfs withUpdatedAt(Optional<? extends Double> updatedAt) {
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
        AssetIpfs other = (AssetIpfs) o;
        return 
            java.util.Objects.deepEquals(this.spec, other.spec) &&
            java.util.Objects.deepEquals(this.dollarRef, other.dollarRef) &&
            java.util.Objects.deepEquals(this.nftMetadata, other.nftMetadata) &&
            java.util.Objects.deepEquals(this.updatedAt, other.updatedAt);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            spec,
            dollarRef,
            nftMetadata,
            updatedAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AssetIpfs.class,
                "spec", spec,
                "dollarRef", dollarRef,
                "nftMetadata", nftMetadata,
                "updatedAt", updatedAt);
    }
    
    public final static class Builder {
 
        private Optional<? extends AssetSpec> spec = Optional.empty();
 
        private Optional<? extends java.lang.Object> dollarRef = Optional.empty();
 
        private Optional<? extends IpfsFileInfo> nftMetadata = Optional.empty();
 
        private Optional<? extends Double> updatedAt = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder spec(AssetSpec spec) {
            Utils.checkNotNull(spec, "spec");
            this.spec = Optional.ofNullable(spec);
            return this;
        }

        public Builder spec(Optional<? extends AssetSpec> spec) {
            Utils.checkNotNull(spec, "spec");
            this.spec = spec;
            return this;
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

        public Builder nftMetadata(IpfsFileInfo nftMetadata) {
            Utils.checkNotNull(nftMetadata, "nftMetadata");
            this.nftMetadata = Optional.ofNullable(nftMetadata);
            return this;
        }

        public Builder nftMetadata(Optional<? extends IpfsFileInfo> nftMetadata) {
            Utils.checkNotNull(nftMetadata, "nftMetadata");
            this.nftMetadata = nftMetadata;
            return this;
        }

        /**
         * Timestamp (in milliseconds) at which IPFS export task was
         * updated
         * 
         */
        public Builder updatedAt(double updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = Optional.ofNullable(updatedAt);
            return this;
        }

        /**
         * Timestamp (in milliseconds) at which IPFS export task was
         * updated
         * 
         */
        public Builder updatedAt(Optional<? extends Double> updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = updatedAt;
            return this;
        }
        
        public AssetIpfs build() {
            return new AssetIpfs(
                spec,
                dollarRef,
                nftMetadata,
                updatedAt);
        }
    }
}

