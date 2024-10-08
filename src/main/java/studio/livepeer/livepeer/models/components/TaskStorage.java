/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
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
    private Optional<String> url;

    @JsonCreator
    public TaskStorage(
            @JsonProperty("url") Optional<String> url) {
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
    @JsonIgnore
    public Optional<String> url() {
        return url;
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
    public TaskStorage withUrl(Optional<String> url) {
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
            Objects.deepEquals(this.url, other.url);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            url);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TaskStorage.class,
                "url", url);
    }
    
    public final static class Builder {
 
        private Optional<String> url = Optional.empty();  
        
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
        public Builder url(Optional<String> url) {
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

