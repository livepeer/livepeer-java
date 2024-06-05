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
import org.openapitools.jackson.nullable.JsonNullable;
import studio.livepeer.livepeer.utils.Utils;

public class NewAssetPayloadStorage {

    /**
     * Set to true to make default export to IPFS. To customize the
     * pinned files, specify an object with a spec field. False or null
     * means to unpin from IPFS, but it's unsupported right now.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ipfs")
    private JsonNullable<? extends NewAssetPayloadIpfs> ipfs;

    @JsonCreator
    public NewAssetPayloadStorage(
            @JsonProperty("ipfs") JsonNullable<? extends NewAssetPayloadIpfs> ipfs) {
        Utils.checkNotNull(ipfs, "ipfs");
        this.ipfs = ipfs;
    }
    
    public NewAssetPayloadStorage() {
        this(JsonNullable.undefined());
    }

    /**
     * Set to true to make default export to IPFS. To customize the
     * pinned files, specify an object with a spec field. False or null
     * means to unpin from IPFS, but it's unsupported right now.
     * 
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<NewAssetPayloadIpfs> ipfs() {
        return (JsonNullable<NewAssetPayloadIpfs>) ipfs;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Set to true to make default export to IPFS. To customize the
     * pinned files, specify an object with a spec field. False or null
     * means to unpin from IPFS, but it's unsupported right now.
     * 
     */
    public NewAssetPayloadStorage withIpfs(NewAssetPayloadIpfs ipfs) {
        Utils.checkNotNull(ipfs, "ipfs");
        this.ipfs = JsonNullable.of(ipfs);
        return this;
    }

    /**
     * Set to true to make default export to IPFS. To customize the
     * pinned files, specify an object with a spec field. False or null
     * means to unpin from IPFS, but it's unsupported right now.
     * 
     */
    public NewAssetPayloadStorage withIpfs(JsonNullable<? extends NewAssetPayloadIpfs> ipfs) {
        Utils.checkNotNull(ipfs, "ipfs");
        this.ipfs = ipfs;
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
        NewAssetPayloadStorage other = (NewAssetPayloadStorage) o;
        return 
            java.util.Objects.deepEquals(this.ipfs, other.ipfs);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            ipfs);
    }
    
    @Override
    public String toString() {
        return Utils.toString(NewAssetPayloadStorage.class,
                "ipfs", ipfs);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends NewAssetPayloadIpfs> ipfs = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Set to true to make default export to IPFS. To customize the
         * pinned files, specify an object with a spec field. False or null
         * means to unpin from IPFS, but it's unsupported right now.
         * 
         */
        public Builder ipfs(NewAssetPayloadIpfs ipfs) {
            Utils.checkNotNull(ipfs, "ipfs");
            this.ipfs = JsonNullable.of(ipfs);
            return this;
        }

        /**
         * Set to true to make default export to IPFS. To customize the
         * pinned files, specify an object with a spec field. False or null
         * means to unpin from IPFS, but it's unsupported right now.
         * 
         */
        public Builder ipfs(JsonNullable<? extends NewAssetPayloadIpfs> ipfs) {
            Utils.checkNotNull(ipfs, "ipfs");
            this.ipfs = ipfs;
            return this;
        }
        
        public NewAssetPayloadStorage build() {
            return new NewAssetPayloadStorage(
                ipfs);
        }
    }
}

