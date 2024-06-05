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
 * Export - Output of the export task
 */

public class Export {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ipfs")
    private Optional<? extends TaskIpfs> ipfs;

    @JsonCreator
    public Export(
            @JsonProperty("ipfs") Optional<? extends TaskIpfs> ipfs) {
        Utils.checkNotNull(ipfs, "ipfs");
        this.ipfs = ipfs;
    }
    
    public Export() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<TaskIpfs> ipfs() {
        return (Optional<TaskIpfs>) ipfs;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Export withIpfs(TaskIpfs ipfs) {
        Utils.checkNotNull(ipfs, "ipfs");
        this.ipfs = Optional.ofNullable(ipfs);
        return this;
    }

    public Export withIpfs(Optional<? extends TaskIpfs> ipfs) {
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
        Export other = (Export) o;
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
        return Utils.toString(Export.class,
                "ipfs", ipfs);
    }
    
    public final static class Builder {
 
        private Optional<? extends TaskIpfs> ipfs = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder ipfs(TaskIpfs ipfs) {
            Utils.checkNotNull(ipfs, "ipfs");
            this.ipfs = Optional.ofNullable(ipfs);
            return this;
        }

        public Builder ipfs(Optional<? extends TaskIpfs> ipfs) {
            Utils.checkNotNull(ipfs, "ipfs");
            this.ipfs = ipfs;
            return this;
        }
        
        public Export build() {
            return new Export(
                ipfs);
        }
    }
}

