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


public class TaskOutputIpfs {

    /**
     * IPFS CID of the exported data
     */
    @JsonProperty("cid")
    private String cid;

    @JsonCreator
    public TaskOutputIpfs(
            @JsonProperty("cid") String cid) {
        Utils.checkNotNull(cid, "cid");
        this.cid = cid;
    }

    /**
     * IPFS CID of the exported data
     */
    @JsonIgnore
    public String cid() {
        return cid;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * IPFS CID of the exported data
     */
    public TaskOutputIpfs withCid(String cid) {
        Utils.checkNotNull(cid, "cid");
        this.cid = cid;
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
        TaskOutputIpfs other = (TaskOutputIpfs) o;
        return 
            java.util.Objects.deepEquals(this.cid, other.cid);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            cid);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TaskOutputIpfs.class,
                "cid", cid);
    }
    
    public final static class Builder {
 
        private String cid;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * IPFS CID of the exported data
         */
        public Builder cid(String cid) {
            Utils.checkNotNull(cid, "cid");
            this.cid = cid;
            return this;
        }
        
        public TaskOutputIpfs build() {
            return new TaskOutputIpfs(
                cid);
        }
    }
}

