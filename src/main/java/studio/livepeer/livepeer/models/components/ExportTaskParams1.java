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

public class ExportTaskParams1 {

    /**
     * custom URL parameters for the export task
     */
    @JsonProperty("custom")
    private Custom custom;

    @JsonCreator
    public ExportTaskParams1(
            @JsonProperty("custom") Custom custom) {
        Utils.checkNotNull(custom, "custom");
        this.custom = custom;
    }

    /**
     * custom URL parameters for the export task
     */
    @JsonIgnore
    public Custom custom() {
        return custom;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * custom URL parameters for the export task
     */
    public ExportTaskParams1 withCustom(Custom custom) {
        Utils.checkNotNull(custom, "custom");
        this.custom = custom;
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
        ExportTaskParams1 other = (ExportTaskParams1) o;
        return 
            java.util.Objects.deepEquals(this.custom, other.custom);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            custom);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ExportTaskParams1.class,
                "custom", custom);
    }
    
    public final static class Builder {
 
        private Custom custom;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * custom URL parameters for the export task
         */
        public Builder custom(Custom custom) {
            Utils.checkNotNull(custom, "custom");
            this.custom = custom;
            return this;
        }
        
        public ExportTaskParams1 build() {
            return new ExportTaskParams1(
                custom);
        }
    }
}

