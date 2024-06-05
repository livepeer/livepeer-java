/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.operations;

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
/**
 * UploadAssetDataOutput - Upload started
 */

public class UploadAssetDataOutput {

    @JsonProperty("asset")
    private studio.livepeer.livepeer.models.components.Asset asset;

    @JsonProperty("task")
    private UploadAssetAssetTask task;

    @JsonCreator
    public UploadAssetDataOutput(
            @JsonProperty("asset") studio.livepeer.livepeer.models.components.Asset asset,
            @JsonProperty("task") UploadAssetAssetTask task) {
        Utils.checkNotNull(asset, "asset");
        Utils.checkNotNull(task, "task");
        this.asset = asset;
        this.task = task;
    }

    @JsonIgnore
    public studio.livepeer.livepeer.models.components.Asset asset() {
        return asset;
    }

    @JsonIgnore
    public UploadAssetAssetTask task() {
        return task;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public UploadAssetDataOutput withAsset(studio.livepeer.livepeer.models.components.Asset asset) {
        Utils.checkNotNull(asset, "asset");
        this.asset = asset;
        return this;
    }

    public UploadAssetDataOutput withTask(UploadAssetAssetTask task) {
        Utils.checkNotNull(task, "task");
        this.task = task;
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
        UploadAssetDataOutput other = (UploadAssetDataOutput) o;
        return 
            java.util.Objects.deepEquals(this.asset, other.asset) &&
            java.util.Objects.deepEquals(this.task, other.task);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            asset,
            task);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UploadAssetDataOutput.class,
                "asset", asset,
                "task", task);
    }
    
    public final static class Builder {
 
        private studio.livepeer.livepeer.models.components.Asset asset;
 
        private UploadAssetAssetTask task;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder asset(studio.livepeer.livepeer.models.components.Asset asset) {
            Utils.checkNotNull(asset, "asset");
            this.asset = asset;
            return this;
        }

        public Builder task(UploadAssetAssetTask task) {
            Utils.checkNotNull(task, "task");
            this.task = task;
            return this;
        }
        
        public UploadAssetDataOutput build() {
            return new UploadAssetDataOutput(
                asset,
                task);
        }
    }
}

