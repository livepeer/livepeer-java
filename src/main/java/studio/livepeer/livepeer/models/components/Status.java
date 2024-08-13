/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;
import studio.livepeer.livepeer.utils.Utils;

/**
 * Status - status of webhook
 */

public class Status {

    /**
     * failure timestamp and error message with status code
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lastFailure")
    private Optional<? extends LastFailure> lastFailure;

    /**
     * Timestamp (in milliseconds) at which the webhook last was
     * triggered
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lastTriggeredAt")
    private Optional<Double> lastTriggeredAt;

    @JsonCreator
    public Status(
            @JsonProperty("lastFailure") Optional<? extends LastFailure> lastFailure,
            @JsonProperty("lastTriggeredAt") Optional<Double> lastTriggeredAt) {
        Utils.checkNotNull(lastFailure, "lastFailure");
        Utils.checkNotNull(lastTriggeredAt, "lastTriggeredAt");
        this.lastFailure = lastFailure;
        this.lastTriggeredAt = lastTriggeredAt;
    }
    
    public Status() {
        this(Optional.empty(), Optional.empty());
    }

    /**
     * failure timestamp and error message with status code
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<LastFailure> lastFailure() {
        return (Optional<LastFailure>) lastFailure;
    }

    /**
     * Timestamp (in milliseconds) at which the webhook last was
     * triggered
     * 
     */
    @JsonIgnore
    public Optional<Double> lastTriggeredAt() {
        return lastTriggeredAt;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * failure timestamp and error message with status code
     */
    public Status withLastFailure(LastFailure lastFailure) {
        Utils.checkNotNull(lastFailure, "lastFailure");
        this.lastFailure = Optional.ofNullable(lastFailure);
        return this;
    }

    /**
     * failure timestamp and error message with status code
     */
    public Status withLastFailure(Optional<? extends LastFailure> lastFailure) {
        Utils.checkNotNull(lastFailure, "lastFailure");
        this.lastFailure = lastFailure;
        return this;
    }

    /**
     * Timestamp (in milliseconds) at which the webhook last was
     * triggered
     * 
     */
    public Status withLastTriggeredAt(double lastTriggeredAt) {
        Utils.checkNotNull(lastTriggeredAt, "lastTriggeredAt");
        this.lastTriggeredAt = Optional.ofNullable(lastTriggeredAt);
        return this;
    }

    /**
     * Timestamp (in milliseconds) at which the webhook last was
     * triggered
     * 
     */
    public Status withLastTriggeredAt(Optional<Double> lastTriggeredAt) {
        Utils.checkNotNull(lastTriggeredAt, "lastTriggeredAt");
        this.lastTriggeredAt = lastTriggeredAt;
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
        Status other = (Status) o;
        return 
            Objects.deepEquals(this.lastFailure, other.lastFailure) &&
            Objects.deepEquals(this.lastTriggeredAt, other.lastTriggeredAt);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            lastFailure,
            lastTriggeredAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Status.class,
                "lastFailure", lastFailure,
                "lastTriggeredAt", lastTriggeredAt);
    }
    
    public final static class Builder {
 
        private Optional<? extends LastFailure> lastFailure = Optional.empty();
 
        private Optional<Double> lastTriggeredAt = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * failure timestamp and error message with status code
         */
        public Builder lastFailure(LastFailure lastFailure) {
            Utils.checkNotNull(lastFailure, "lastFailure");
            this.lastFailure = Optional.ofNullable(lastFailure);
            return this;
        }

        /**
         * failure timestamp and error message with status code
         */
        public Builder lastFailure(Optional<? extends LastFailure> lastFailure) {
            Utils.checkNotNull(lastFailure, "lastFailure");
            this.lastFailure = lastFailure;
            return this;
        }

        /**
         * Timestamp (in milliseconds) at which the webhook last was
         * triggered
         * 
         */
        public Builder lastTriggeredAt(double lastTriggeredAt) {
            Utils.checkNotNull(lastTriggeredAt, "lastTriggeredAt");
            this.lastTriggeredAt = Optional.ofNullable(lastTriggeredAt);
            return this;
        }

        /**
         * Timestamp (in milliseconds) at which the webhook last was
         * triggered
         * 
         */
        public Builder lastTriggeredAt(Optional<Double> lastTriggeredAt) {
            Utils.checkNotNull(lastTriggeredAt, "lastTriggeredAt");
            this.lastTriggeredAt = lastTriggeredAt;
            return this;
        }
        
        public Status build() {
            return new Status(
                lastFailure,
                lastTriggeredAt);
        }
    }
}

