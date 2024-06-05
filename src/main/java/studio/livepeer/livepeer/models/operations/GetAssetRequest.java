/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import studio.livepeer.livepeer.utils.SpeakeasyMetadata;
import studio.livepeer.livepeer.utils.Utils;

public class GetAssetRequest {

    /**
     * ID of the asset
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=assetId")
    private String assetId;

    @JsonCreator
    public GetAssetRequest(
            String assetId) {
        Utils.checkNotNull(assetId, "assetId");
        this.assetId = assetId;
    }

    /**
     * ID of the asset
     */
    @JsonIgnore
    public String assetId() {
        return assetId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * ID of the asset
     */
    public GetAssetRequest withAssetId(String assetId) {
        Utils.checkNotNull(assetId, "assetId");
        this.assetId = assetId;
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
        GetAssetRequest other = (GetAssetRequest) o;
        return 
            java.util.Objects.deepEquals(this.assetId, other.assetId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            assetId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetAssetRequest.class,
                "assetId", assetId);
    }
    
    public final static class Builder {
 
        private String assetId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * ID of the asset
         */
        public Builder assetId(String assetId) {
            Utils.checkNotNull(assetId, "assetId");
            this.assetId = assetId;
            return this;
        }
        
        public GetAssetRequest build() {
            return new GetAssetRequest(
                assetId);
        }
    }
}

