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


public class Ipfs1 {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("spec")
    private JsonNullable<? extends Spec> spec;

    @JsonCreator
    public Ipfs1(
            @JsonProperty("spec") JsonNullable<? extends Spec> spec) {
        Utils.checkNotNull(spec, "spec");
        this.spec = spec;
    }
    
    public Ipfs1() {
        this(JsonNullable.undefined());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<Spec> spec() {
        return (JsonNullable<Spec>) spec;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Ipfs1 withSpec(Spec spec) {
        Utils.checkNotNull(spec, "spec");
        this.spec = JsonNullable.of(spec);
        return this;
    }

    public Ipfs1 withSpec(JsonNullable<? extends Spec> spec) {
        Utils.checkNotNull(spec, "spec");
        this.spec = spec;
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
        Ipfs1 other = (Ipfs1) o;
        return 
            java.util.Objects.deepEquals(this.spec, other.spec);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            spec);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Ipfs1.class,
                "spec", spec);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends Spec> spec = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder spec(Spec spec) {
            Utils.checkNotNull(spec, "spec");
            this.spec = JsonNullable.of(spec);
            return this;
        }

        public Builder spec(JsonNullable<? extends Spec> spec) {
            Utils.checkNotNull(spec, "spec");
            this.spec = spec;
            return this;
        }
        
        public Ipfs1 build() {
            return new Ipfs1(
                spec);
        }
    }
}

