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


public class Task {

    /**
     * Task ID
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    /**
     * Type of the task
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<? extends TaskType> type;

    /**
     * Timestamp (in milliseconds) at which task was created
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("createdAt")
    private Optional<Double> createdAt;

    /**
     * Timestamp (in milliseconds) at which the task was scheduled for
     * execution (e.g. after file upload finished).
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("scheduledAt")
    private Optional<Double> scheduledAt;

    /**
     * ID of the input asset
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("inputAssetId")
    private Optional<String> inputAssetId;

    /**
     * ID of the output asset
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("outputAssetId")
    private Optional<String> outputAssetId;

    /**
     * ID of the requester hash(IP + SALT + PlaybackId)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("requesterId")
    private Optional<String> requesterId;

    /**
     * Parameters of the task
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("params")
    private Optional<? extends Params> params;

    /**
     * Status of the task
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private Optional<? extends TaskStatus> status;

    /**
     * Output of the task
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("output")
    private Optional<? extends Output> output;

    @JsonCreator
    public Task(
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("type") Optional<? extends TaskType> type,
            @JsonProperty("createdAt") Optional<Double> createdAt,
            @JsonProperty("scheduledAt") Optional<Double> scheduledAt,
            @JsonProperty("inputAssetId") Optional<String> inputAssetId,
            @JsonProperty("outputAssetId") Optional<String> outputAssetId,
            @JsonProperty("requesterId") Optional<String> requesterId,
            @JsonProperty("params") Optional<? extends Params> params,
            @JsonProperty("status") Optional<? extends TaskStatus> status,
            @JsonProperty("output") Optional<? extends Output> output) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(scheduledAt, "scheduledAt");
        Utils.checkNotNull(inputAssetId, "inputAssetId");
        Utils.checkNotNull(outputAssetId, "outputAssetId");
        Utils.checkNotNull(requesterId, "requesterId");
        Utils.checkNotNull(params, "params");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(output, "output");
        this.id = id;
        this.type = type;
        this.createdAt = createdAt;
        this.scheduledAt = scheduledAt;
        this.inputAssetId = inputAssetId;
        this.outputAssetId = outputAssetId;
        this.requesterId = requesterId;
        this.params = params;
        this.status = status;
        this.output = output;
    }
    
    public Task() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Task ID
     */
    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    /**
     * Type of the task
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<TaskType> type() {
        return (Optional<TaskType>) type;
    }

    /**
     * Timestamp (in milliseconds) at which task was created
     */
    @JsonIgnore
    public Optional<Double> createdAt() {
        return createdAt;
    }

    /**
     * Timestamp (in milliseconds) at which the task was scheduled for
     * execution (e.g. after file upload finished).
     * 
     */
    @JsonIgnore
    public Optional<Double> scheduledAt() {
        return scheduledAt;
    }

    /**
     * ID of the input asset
     */
    @JsonIgnore
    public Optional<String> inputAssetId() {
        return inputAssetId;
    }

    /**
     * ID of the output asset
     */
    @JsonIgnore
    public Optional<String> outputAssetId() {
        return outputAssetId;
    }

    /**
     * ID of the requester hash(IP + SALT + PlaybackId)
     */
    @JsonIgnore
    public Optional<String> requesterId() {
        return requesterId;
    }

    /**
     * Parameters of the task
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Params> params() {
        return (Optional<Params>) params;
    }

    /**
     * Status of the task
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<TaskStatus> status() {
        return (Optional<TaskStatus>) status;
    }

    /**
     * Output of the task
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Output> output() {
        return (Optional<Output>) output;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Task ID
     */
    public Task withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * Task ID
     */
    public Task withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * Type of the task
     */
    public Task withType(TaskType type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    /**
     * Type of the task
     */
    public Task withType(Optional<? extends TaskType> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * Timestamp (in milliseconds) at which task was created
     */
    public Task withCreatedAt(double createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }

    /**
     * Timestamp (in milliseconds) at which task was created
     */
    public Task withCreatedAt(Optional<Double> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Timestamp (in milliseconds) at which the task was scheduled for
     * execution (e.g. after file upload finished).
     * 
     */
    public Task withScheduledAt(double scheduledAt) {
        Utils.checkNotNull(scheduledAt, "scheduledAt");
        this.scheduledAt = Optional.ofNullable(scheduledAt);
        return this;
    }

    /**
     * Timestamp (in milliseconds) at which the task was scheduled for
     * execution (e.g. after file upload finished).
     * 
     */
    public Task withScheduledAt(Optional<Double> scheduledAt) {
        Utils.checkNotNull(scheduledAt, "scheduledAt");
        this.scheduledAt = scheduledAt;
        return this;
    }

    /**
     * ID of the input asset
     */
    public Task withInputAssetId(String inputAssetId) {
        Utils.checkNotNull(inputAssetId, "inputAssetId");
        this.inputAssetId = Optional.ofNullable(inputAssetId);
        return this;
    }

    /**
     * ID of the input asset
     */
    public Task withInputAssetId(Optional<String> inputAssetId) {
        Utils.checkNotNull(inputAssetId, "inputAssetId");
        this.inputAssetId = inputAssetId;
        return this;
    }

    /**
     * ID of the output asset
     */
    public Task withOutputAssetId(String outputAssetId) {
        Utils.checkNotNull(outputAssetId, "outputAssetId");
        this.outputAssetId = Optional.ofNullable(outputAssetId);
        return this;
    }

    /**
     * ID of the output asset
     */
    public Task withOutputAssetId(Optional<String> outputAssetId) {
        Utils.checkNotNull(outputAssetId, "outputAssetId");
        this.outputAssetId = outputAssetId;
        return this;
    }

    /**
     * ID of the requester hash(IP + SALT + PlaybackId)
     */
    public Task withRequesterId(String requesterId) {
        Utils.checkNotNull(requesterId, "requesterId");
        this.requesterId = Optional.ofNullable(requesterId);
        return this;
    }

    /**
     * ID of the requester hash(IP + SALT + PlaybackId)
     */
    public Task withRequesterId(Optional<String> requesterId) {
        Utils.checkNotNull(requesterId, "requesterId");
        this.requesterId = requesterId;
        return this;
    }

    /**
     * Parameters of the task
     */
    public Task withParams(Params params) {
        Utils.checkNotNull(params, "params");
        this.params = Optional.ofNullable(params);
        return this;
    }

    /**
     * Parameters of the task
     */
    public Task withParams(Optional<? extends Params> params) {
        Utils.checkNotNull(params, "params");
        this.params = params;
        return this;
    }

    /**
     * Status of the task
     */
    public Task withStatus(TaskStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }

    /**
     * Status of the task
     */
    public Task withStatus(Optional<? extends TaskStatus> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    /**
     * Output of the task
     */
    public Task withOutput(Output output) {
        Utils.checkNotNull(output, "output");
        this.output = Optional.ofNullable(output);
        return this;
    }

    /**
     * Output of the task
     */
    public Task withOutput(Optional<? extends Output> output) {
        Utils.checkNotNull(output, "output");
        this.output = output;
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
        Task other = (Task) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.scheduledAt, other.scheduledAt) &&
            Objects.deepEquals(this.inputAssetId, other.inputAssetId) &&
            Objects.deepEquals(this.outputAssetId, other.outputAssetId) &&
            Objects.deepEquals(this.requesterId, other.requesterId) &&
            Objects.deepEquals(this.params, other.params) &&
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.output, other.output);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            type,
            createdAt,
            scheduledAt,
            inputAssetId,
            outputAssetId,
            requesterId,
            params,
            status,
            output);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Task.class,
                "id", id,
                "type", type,
                "createdAt", createdAt,
                "scheduledAt", scheduledAt,
                "inputAssetId", inputAssetId,
                "outputAssetId", outputAssetId,
                "requesterId", requesterId,
                "params", params,
                "status", status,
                "output", output);
    }
    
    public final static class Builder {
 
        private Optional<String> id = Optional.empty();
 
        private Optional<? extends TaskType> type = Optional.empty();
 
        private Optional<Double> createdAt = Optional.empty();
 
        private Optional<Double> scheduledAt = Optional.empty();
 
        private Optional<String> inputAssetId = Optional.empty();
 
        private Optional<String> outputAssetId = Optional.empty();
 
        private Optional<String> requesterId = Optional.empty();
 
        private Optional<? extends Params> params = Optional.empty();
 
        private Optional<? extends TaskStatus> status = Optional.empty();
 
        private Optional<? extends Output> output = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Task ID
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        /**
         * Task ID
         */
        public Builder id(Optional<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * Type of the task
         */
        public Builder type(TaskType type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        /**
         * Type of the task
         */
        public Builder type(Optional<? extends TaskType> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        /**
         * Timestamp (in milliseconds) at which task was created
         */
        public Builder createdAt(double createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = Optional.ofNullable(createdAt);
            return this;
        }

        /**
         * Timestamp (in milliseconds) at which task was created
         */
        public Builder createdAt(Optional<Double> createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Timestamp (in milliseconds) at which the task was scheduled for
         * execution (e.g. after file upload finished).
         * 
         */
        public Builder scheduledAt(double scheduledAt) {
            Utils.checkNotNull(scheduledAt, "scheduledAt");
            this.scheduledAt = Optional.ofNullable(scheduledAt);
            return this;
        }

        /**
         * Timestamp (in milliseconds) at which the task was scheduled for
         * execution (e.g. after file upload finished).
         * 
         */
        public Builder scheduledAt(Optional<Double> scheduledAt) {
            Utils.checkNotNull(scheduledAt, "scheduledAt");
            this.scheduledAt = scheduledAt;
            return this;
        }

        /**
         * ID of the input asset
         */
        public Builder inputAssetId(String inputAssetId) {
            Utils.checkNotNull(inputAssetId, "inputAssetId");
            this.inputAssetId = Optional.ofNullable(inputAssetId);
            return this;
        }

        /**
         * ID of the input asset
         */
        public Builder inputAssetId(Optional<String> inputAssetId) {
            Utils.checkNotNull(inputAssetId, "inputAssetId");
            this.inputAssetId = inputAssetId;
            return this;
        }

        /**
         * ID of the output asset
         */
        public Builder outputAssetId(String outputAssetId) {
            Utils.checkNotNull(outputAssetId, "outputAssetId");
            this.outputAssetId = Optional.ofNullable(outputAssetId);
            return this;
        }

        /**
         * ID of the output asset
         */
        public Builder outputAssetId(Optional<String> outputAssetId) {
            Utils.checkNotNull(outputAssetId, "outputAssetId");
            this.outputAssetId = outputAssetId;
            return this;
        }

        /**
         * ID of the requester hash(IP + SALT + PlaybackId)
         */
        public Builder requesterId(String requesterId) {
            Utils.checkNotNull(requesterId, "requesterId");
            this.requesterId = Optional.ofNullable(requesterId);
            return this;
        }

        /**
         * ID of the requester hash(IP + SALT + PlaybackId)
         */
        public Builder requesterId(Optional<String> requesterId) {
            Utils.checkNotNull(requesterId, "requesterId");
            this.requesterId = requesterId;
            return this;
        }

        /**
         * Parameters of the task
         */
        public Builder params(Params params) {
            Utils.checkNotNull(params, "params");
            this.params = Optional.ofNullable(params);
            return this;
        }

        /**
         * Parameters of the task
         */
        public Builder params(Optional<? extends Params> params) {
            Utils.checkNotNull(params, "params");
            this.params = params;
            return this;
        }

        /**
         * Status of the task
         */
        public Builder status(TaskStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }

        /**
         * Status of the task
         */
        public Builder status(Optional<? extends TaskStatus> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        /**
         * Output of the task
         */
        public Builder output(Output output) {
            Utils.checkNotNull(output, "output");
            this.output = Optional.ofNullable(output);
            return this;
        }

        /**
         * Output of the task
         */
        public Builder output(Optional<? extends Output> output) {
            Utils.checkNotNull(output, "output");
            this.output = output;
            return this;
        }
        
        public Task build() {
            return new Task(
                id,
                type,
                createdAt,
                scheduledAt,
                inputAssetId,
                outputAssetId,
                requesterId,
                params,
                status,
                output);
        }
    }
}

