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


public class Storage {

    /**
     * Set to true to make default export to IPFS. To customize the
     * pinned files, specify an object with a spec field. False or null
     * means to unpin from IPFS, but it's unsupported right now.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ipfs")
    private JsonNullable<? extends Ipfs> ipfs;

    @JsonCreator
    public Storage(
            @JsonProperty("ipfs") JsonNullable<? extends Ipfs> ipfs) {
        Utils.checkNotNull(ipfs, "ipfs");
        this.ipfs = ipfs;
    }
    
    public Storage() {
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
    public JsonNullable<Ipfs> ipfs() {
        return (JsonNullable<Ipfs>) ipfs;
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
    public Storage withIpfs(Ipfs ipfs) {
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
    public Storage withIpfs(JsonNullable<? extends Ipfs> ipfs) {
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
        Storage other = (Storage) o;
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
        return Utils.toString(Storage.class,
                "ipfs", ipfs);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends Ipfs> ipfs = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Set to true to make default export to IPFS. To customize the
         * pinned files, specify an object with a spec field. False or null
         * means to unpin from IPFS, but it's unsupported right now.
         * 
         */
        public Builder ipfs(Ipfs ipfs) {
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
        public Builder ipfs(JsonNullable<? extends Ipfs> ipfs) {
            Utils.checkNotNull(ipfs, "ipfs");
            this.ipfs = ipfs;
            return this;
        }
        
        public Storage build() {
            return new Storage(
                ipfs);
        }
    }
}

