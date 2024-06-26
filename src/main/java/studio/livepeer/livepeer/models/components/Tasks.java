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

public class Tasks {

    /**
     * ID of any currently running task that is exporting this
     * asset to IPFS.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pending")
    private Optional<? extends String> pending;

    /**
     * ID of the last task to run successfully, that created
     * the currently saved data.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("last")
    private Optional<? extends String> last;

    /**
     * ID of the last task to fail execution.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("failed")
    private Optional<? extends String> failed;

    @JsonCreator
    public Tasks(
            @JsonProperty("pending") Optional<? extends String> pending,
            @JsonProperty("last") Optional<? extends String> last,
            @JsonProperty("failed") Optional<? extends String> failed) {
        Utils.checkNotNull(pending, "pending");
        Utils.checkNotNull(last, "last");
        Utils.checkNotNull(failed, "failed");
        this.pending = pending;
        this.last = last;
        this.failed = failed;
    }
    
    public Tasks() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * ID of any currently running task that is exporting this
     * asset to IPFS.
     * 
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> pending() {
        return (Optional<String>) pending;
    }

    /**
     * ID of the last task to run successfully, that created
     * the currently saved data.
     * 
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> last() {
        return (Optional<String>) last;
    }

    /**
     * ID of the last task to fail execution.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> failed() {
        return (Optional<String>) failed;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * ID of any currently running task that is exporting this
     * asset to IPFS.
     * 
     */
    public Tasks withPending(String pending) {
        Utils.checkNotNull(pending, "pending");
        this.pending = Optional.ofNullable(pending);
        return this;
    }

    /**
     * ID of any currently running task that is exporting this
     * asset to IPFS.
     * 
     */
    public Tasks withPending(Optional<? extends String> pending) {
        Utils.checkNotNull(pending, "pending");
        this.pending = pending;
        return this;
    }

    /**
     * ID of the last task to run successfully, that created
     * the currently saved data.
     * 
     */
    public Tasks withLast(String last) {
        Utils.checkNotNull(last, "last");
        this.last = Optional.ofNullable(last);
        return this;
    }

    /**
     * ID of the last task to run successfully, that created
     * the currently saved data.
     * 
     */
    public Tasks withLast(Optional<? extends String> last) {
        Utils.checkNotNull(last, "last");
        this.last = last;
        return this;
    }

    /**
     * ID of the last task to fail execution.
     */
    public Tasks withFailed(String failed) {
        Utils.checkNotNull(failed, "failed");
        this.failed = Optional.ofNullable(failed);
        return this;
    }

    /**
     * ID of the last task to fail execution.
     */
    public Tasks withFailed(Optional<? extends String> failed) {
        Utils.checkNotNull(failed, "failed");
        this.failed = failed;
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
        Tasks other = (Tasks) o;
        return 
            java.util.Objects.deepEquals(this.pending, other.pending) &&
            java.util.Objects.deepEquals(this.last, other.last) &&
            java.util.Objects.deepEquals(this.failed, other.failed);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            pending,
            last,
            failed);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Tasks.class,
                "pending", pending,
                "last", last,
                "failed", failed);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> pending = Optional.empty();
 
        private Optional<? extends String> last = Optional.empty();
 
        private Optional<? extends String> failed = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * ID of any currently running task that is exporting this
         * asset to IPFS.
         * 
         */
        public Builder pending(String pending) {
            Utils.checkNotNull(pending, "pending");
            this.pending = Optional.ofNullable(pending);
            return this;
        }

        /**
         * ID of any currently running task that is exporting this
         * asset to IPFS.
         * 
         */
        public Builder pending(Optional<? extends String> pending) {
            Utils.checkNotNull(pending, "pending");
            this.pending = pending;
            return this;
        }

        /**
         * ID of the last task to run successfully, that created
         * the currently saved data.
         * 
         */
        public Builder last(String last) {
            Utils.checkNotNull(last, "last");
            this.last = Optional.ofNullable(last);
            return this;
        }

        /**
         * ID of the last task to run successfully, that created
         * the currently saved data.
         * 
         */
        public Builder last(Optional<? extends String> last) {
            Utils.checkNotNull(last, "last");
            this.last = last;
            return this;
        }

        /**
         * ID of the last task to fail execution.
         */
        public Builder failed(String failed) {
            Utils.checkNotNull(failed, "failed");
            this.failed = Optional.ofNullable(failed);
            return this;
        }

        /**
         * ID of the last task to fail execution.
         */
        public Builder failed(Optional<? extends String> failed) {
            Utils.checkNotNull(failed, "failed");
            this.failed = failed;
            return this;
        }
        
        public Tasks build() {
            return new Tasks(
                pending,
                last,
                failed);
        }
    }
}

