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
 * TaskStorage - Storage for the output files
 */

public class TaskStorage {

    /**
     * URL of the output storage, accepts object-store format
     * "s3+https"
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("url")
    private Optional<? extends String> url;

    @JsonCreator
    public TaskStorage(
            @JsonProperty("url") Optional<? extends String> url) {
        Utils.checkNotNull(url, "url");
        this.url = url;
    }
    
    public TaskStorage() {
        this(Optional.empty());
    }

    /**
     * URL of the output storage, accepts object-store format
     * "s3+https"
     * 
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> url() {
        return (Optional<String>) url;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * URL of the output storage, accepts object-store format
     * "s3+https"
     * 
     */
    public TaskStorage withUrl(String url) {
        Utils.checkNotNull(url, "url");
        this.url = Optional.ofNullable(url);
        return this;
    }

    /**
     * URL of the output storage, accepts object-store format
     * "s3+https"
     * 
     */
    public TaskStorage withUrl(Optional<? extends String> url) {
        Utils.checkNotNull(url, "url");
        this.url = url;
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
        TaskStorage other = (TaskStorage) o;
        return 
            java.util.Objects.deepEquals(this.url, other.url);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            url);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TaskStorage.class,
                "url", url);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> url = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * URL of the output storage, accepts object-store format
         * "s3+https"
         * 
         */
        public Builder url(String url) {
            Utils.checkNotNull(url, "url");
            this.url = Optional.ofNullable(url);
            return this;
        }

        /**
         * URL of the output storage, accepts object-store format
         * "s3+https"
         * 
         */
        public Builder url(Optional<? extends String> url) {
            Utils.checkNotNull(url, "url");
            this.url = url;
            return this;
        }
        
        public TaskStorage build() {
            return new TaskStorage(
                url);
        }
    }
}

