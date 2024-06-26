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
 * TaskStatus - Status of the task
 */

public class TaskStatus {

    /**
     * Phase of the task
     */
    @JsonProperty("phase")
    private TaskPhase phase;

    /**
     * Timestamp (in milliseconds) at which task was updated
     */
    @JsonProperty("updatedAt")
    private double updatedAt;

    /**
     * Current progress of the task in a 0-1 ratio
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("progress")
    private Optional<? extends Double> progress;

    /**
     * Error message if the task failed
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("errorMessage")
    private Optional<? extends String> errorMessage;

    /**
     * Number of retries done on the task
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("retries")
    private Optional<? extends Double> retries;

    @JsonCreator
    public TaskStatus(
            @JsonProperty("phase") TaskPhase phase,
            @JsonProperty("updatedAt") double updatedAt,
            @JsonProperty("progress") Optional<? extends Double> progress,
            @JsonProperty("errorMessage") Optional<? extends String> errorMessage,
            @JsonProperty("retries") Optional<? extends Double> retries) {
        Utils.checkNotNull(phase, "phase");
        Utils.checkNotNull(updatedAt, "updatedAt");
        Utils.checkNotNull(progress, "progress");
        Utils.checkNotNull(errorMessage, "errorMessage");
        Utils.checkNotNull(retries, "retries");
        this.phase = phase;
        this.updatedAt = updatedAt;
        this.progress = progress;
        this.errorMessage = errorMessage;
        this.retries = retries;
    }
    
    public TaskStatus(
            TaskPhase phase,
            double updatedAt) {
        this(phase, updatedAt, Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Phase of the task
     */
    @JsonIgnore
    public TaskPhase phase() {
        return phase;
    }

    /**
     * Timestamp (in milliseconds) at which task was updated
     */
    @JsonIgnore
    public double updatedAt() {
        return updatedAt;
    }

    /**
     * Current progress of the task in a 0-1 ratio
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Double> progress() {
        return (Optional<Double>) progress;
    }

    /**
     * Error message if the task failed
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> errorMessage() {
        return (Optional<String>) errorMessage;
    }

    /**
     * Number of retries done on the task
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Double> retries() {
        return (Optional<Double>) retries;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Phase of the task
     */
    public TaskStatus withPhase(TaskPhase phase) {
        Utils.checkNotNull(phase, "phase");
        this.phase = phase;
        return this;
    }

    /**
     * Timestamp (in milliseconds) at which task was updated
     */
    public TaskStatus withUpdatedAt(double updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Current progress of the task in a 0-1 ratio
     */
    public TaskStatus withProgress(double progress) {
        Utils.checkNotNull(progress, "progress");
        this.progress = Optional.ofNullable(progress);
        return this;
    }

    /**
     * Current progress of the task in a 0-1 ratio
     */
    public TaskStatus withProgress(Optional<? extends Double> progress) {
        Utils.checkNotNull(progress, "progress");
        this.progress = progress;
        return this;
    }

    /**
     * Error message if the task failed
     */
    public TaskStatus withErrorMessage(String errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = Optional.ofNullable(errorMessage);
        return this;
    }

    /**
     * Error message if the task failed
     */
    public TaskStatus withErrorMessage(Optional<? extends String> errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * Number of retries done on the task
     */
    public TaskStatus withRetries(double retries) {
        Utils.checkNotNull(retries, "retries");
        this.retries = Optional.ofNullable(retries);
        return this;
    }

    /**
     * Number of retries done on the task
     */
    public TaskStatus withRetries(Optional<? extends Double> retries) {
        Utils.checkNotNull(retries, "retries");
        this.retries = retries;
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
        TaskStatus other = (TaskStatus) o;
        return 
            java.util.Objects.deepEquals(this.phase, other.phase) &&
            java.util.Objects.deepEquals(this.updatedAt, other.updatedAt) &&
            java.util.Objects.deepEquals(this.progress, other.progress) &&
            java.util.Objects.deepEquals(this.errorMessage, other.errorMessage) &&
            java.util.Objects.deepEquals(this.retries, other.retries);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            phase,
            updatedAt,
            progress,
            errorMessage,
            retries);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TaskStatus.class,
                "phase", phase,
                "updatedAt", updatedAt,
                "progress", progress,
                "errorMessage", errorMessage,
                "retries", retries);
    }
    
    public final static class Builder {
 
        private TaskPhase phase;
 
        private Double updatedAt;
 
        private Optional<? extends Double> progress = Optional.empty();
 
        private Optional<? extends String> errorMessage = Optional.empty();
 
        private Optional<? extends Double> retries = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Phase of the task
         */
        public Builder phase(TaskPhase phase) {
            Utils.checkNotNull(phase, "phase");
            this.phase = phase;
            return this;
        }

        /**
         * Timestamp (in milliseconds) at which task was updated
         */
        public Builder updatedAt(double updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Current progress of the task in a 0-1 ratio
         */
        public Builder progress(double progress) {
            Utils.checkNotNull(progress, "progress");
            this.progress = Optional.ofNullable(progress);
            return this;
        }

        /**
         * Current progress of the task in a 0-1 ratio
         */
        public Builder progress(Optional<? extends Double> progress) {
            Utils.checkNotNull(progress, "progress");
            this.progress = progress;
            return this;
        }

        /**
         * Error message if the task failed
         */
        public Builder errorMessage(String errorMessage) {
            Utils.checkNotNull(errorMessage, "errorMessage");
            this.errorMessage = Optional.ofNullable(errorMessage);
            return this;
        }

        /**
         * Error message if the task failed
         */
        public Builder errorMessage(Optional<? extends String> errorMessage) {
            Utils.checkNotNull(errorMessage, "errorMessage");
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * Number of retries done on the task
         */
        public Builder retries(double retries) {
            Utils.checkNotNull(retries, "retries");
            this.retries = Optional.ofNullable(retries);
            return this;
        }

        /**
         * Number of retries done on the task
         */
        public Builder retries(Optional<? extends Double> retries) {
            Utils.checkNotNull(retries, "retries");
            this.retries = retries;
            return this;
        }
        
        public TaskStatus build() {
            return new TaskStatus(
                phase,
                updatedAt,
                progress,
                errorMessage,
                retries);
        }
    }
}

