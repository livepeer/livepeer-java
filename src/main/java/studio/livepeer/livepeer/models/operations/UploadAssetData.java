/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import studio.livepeer.livepeer.models.components.Asset;
import studio.livepeer.livepeer.utils.Utils;

/**
 * UploadAssetData - Upload in progress
 */

public class UploadAssetData {

    @JsonProperty("asset")
    private Asset asset;

    @JsonProperty("task")
    private UploadAssetTask task;

    @JsonCreator
    public UploadAssetData(
            @JsonProperty("asset") Asset asset,
            @JsonProperty("task") UploadAssetTask task) {
        Utils.checkNotNull(asset, "asset");
        Utils.checkNotNull(task, "task");
        this.asset = asset;
        this.task = task;
    }

    @JsonIgnore
    public Asset asset() {
        return asset;
    }

    @JsonIgnore
    public UploadAssetTask task() {
        return task;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public UploadAssetData withAsset(Asset asset) {
        Utils.checkNotNull(asset, "asset");
        this.asset = asset;
        return this;
    }

    public UploadAssetData withTask(UploadAssetTask task) {
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
        UploadAssetData other = (UploadAssetData) o;
        return 
            Objects.deepEquals(this.asset, other.asset) &&
            Objects.deepEquals(this.task, other.task);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            asset,
            task);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UploadAssetData.class,
                "asset", asset,
                "task", task);
    }
    
    public final static class Builder {
 
        private Asset asset;
 
        private UploadAssetTask task;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder asset(Asset asset) {
            Utils.checkNotNull(asset, "asset");
            this.asset = asset;
            return this;
        }

        public Builder task(UploadAssetTask task) {
            Utils.checkNotNull(task, "task");
            this.task = task;
            return this;
        }
        
        public UploadAssetData build() {
            return new UploadAssetData(
                asset,
                task);
        }
    }
}

