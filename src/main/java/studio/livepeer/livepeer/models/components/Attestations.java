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

public class Attestations {

    @JsonProperty("role")
    private String role;

    @JsonProperty("address")
    private String address;

    @JsonCreator
    public Attestations(
            @JsonProperty("role") String role,
            @JsonProperty("address") String address) {
        Utils.checkNotNull(role, "role");
        Utils.checkNotNull(address, "address");
        this.role = role;
        this.address = address;
    }

    @JsonIgnore
    public String role() {
        return role;
    }

    @JsonIgnore
    public String address() {
        return address;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Attestations withRole(String role) {
        Utils.checkNotNull(role, "role");
        this.role = role;
        return this;
    }

    public Attestations withAddress(String address) {
        Utils.checkNotNull(address, "address");
        this.address = address;
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
        Attestations other = (Attestations) o;
        return 
            java.util.Objects.deepEquals(this.role, other.role) &&
            java.util.Objects.deepEquals(this.address, other.address);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            role,
            address);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Attestations.class,
                "role", role,
                "address", address);
    }
    
    public final static class Builder {
 
        private String role;
 
        private String address;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder role(String role) {
            Utils.checkNotNull(role, "role");
            this.role = role;
            return this;
        }

        public Builder address(String address) {
            Utils.checkNotNull(address, "address");
            this.address = address;
            return this;
        }
        
        public Attestations build() {
            return new Attestations(
                role,
                address);
        }
    }
}

