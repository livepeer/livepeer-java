/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import studio.livepeer.livepeer.utils.Utils;


public class TranscodePayload {

    @JsonProperty("input")
    private Input input;

    @JsonProperty("storage")
    private TranscodePayloadStorage storage;

    /**
     * Output formats
     */
    @JsonProperty("outputs")
    private Outputs outputs;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("profiles")
    private Optional<? extends List<TranscodeProfile>> profiles;

    /**
     * How many seconds the duration of each output segment should be
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("targetSegmentSizeSecs")
    private Optional<Double> targetSegmentSizeSecs;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("creatorId")
    private Optional<? extends InputCreatorId> creatorId;

    /**
     * Decides if the output video should include C2PA signature
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("c2pa")
    private Optional<Boolean> c2pa;

    @JsonCreator
    public TranscodePayload(
            @JsonProperty("input") Input input,
            @JsonProperty("storage") TranscodePayloadStorage storage,
            @JsonProperty("outputs") Outputs outputs,
            @JsonProperty("profiles") Optional<? extends List<TranscodeProfile>> profiles,
            @JsonProperty("targetSegmentSizeSecs") Optional<Double> targetSegmentSizeSecs,
            @JsonProperty("creatorId") Optional<? extends InputCreatorId> creatorId,
            @JsonProperty("c2pa") Optional<Boolean> c2pa) {
        Utils.checkNotNull(input, "input");
        Utils.checkNotNull(storage, "storage");
        Utils.checkNotNull(outputs, "outputs");
        Utils.checkNotNull(profiles, "profiles");
        Utils.checkNotNull(targetSegmentSizeSecs, "targetSegmentSizeSecs");
        Utils.checkNotNull(creatorId, "creatorId");
        Utils.checkNotNull(c2pa, "c2pa");
        this.input = input;
        this.storage = storage;
        this.outputs = outputs;
        this.profiles = profiles;
        this.targetSegmentSizeSecs = targetSegmentSizeSecs;
        this.creatorId = creatorId;
        this.c2pa = c2pa;
    }
    
    public TranscodePayload(
            Input input,
            TranscodePayloadStorage storage,
            Outputs outputs) {
        this(input, storage, outputs, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Input input() {
        return input;
    }

    @JsonIgnore
    public TranscodePayloadStorage storage() {
        return storage;
    }

    /**
     * Output formats
     */
    @JsonIgnore
    public Outputs outputs() {
        return outputs;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<TranscodeProfile>> profiles() {
        return (Optional<List<TranscodeProfile>>) profiles;
    }

    /**
     * How many seconds the duration of each output segment should be
     */
    @JsonIgnore
    public Optional<Double> targetSegmentSizeSecs() {
        return targetSegmentSizeSecs;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<InputCreatorId> creatorId() {
        return (Optional<InputCreatorId>) creatorId;
    }

    /**
     * Decides if the output video should include C2PA signature
     */
    @JsonIgnore
    public Optional<Boolean> c2pa() {
        return c2pa;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public TranscodePayload withInput(Input input) {
        Utils.checkNotNull(input, "input");
        this.input = input;
        return this;
    }

    public TranscodePayload withStorage(TranscodePayloadStorage storage) {
        Utils.checkNotNull(storage, "storage");
        this.storage = storage;
        return this;
    }

    /**
     * Output formats
     */
    public TranscodePayload withOutputs(Outputs outputs) {
        Utils.checkNotNull(outputs, "outputs");
        this.outputs = outputs;
        return this;
    }

    public TranscodePayload withProfiles(List<TranscodeProfile> profiles) {
        Utils.checkNotNull(profiles, "profiles");
        this.profiles = Optional.ofNullable(profiles);
        return this;
    }

    public TranscodePayload withProfiles(Optional<? extends List<TranscodeProfile>> profiles) {
        Utils.checkNotNull(profiles, "profiles");
        this.profiles = profiles;
        return this;
    }

    /**
     * How many seconds the duration of each output segment should be
     */
    public TranscodePayload withTargetSegmentSizeSecs(double targetSegmentSizeSecs) {
        Utils.checkNotNull(targetSegmentSizeSecs, "targetSegmentSizeSecs");
        this.targetSegmentSizeSecs = Optional.ofNullable(targetSegmentSizeSecs);
        return this;
    }

    /**
     * How many seconds the duration of each output segment should be
     */
    public TranscodePayload withTargetSegmentSizeSecs(Optional<Double> targetSegmentSizeSecs) {
        Utils.checkNotNull(targetSegmentSizeSecs, "targetSegmentSizeSecs");
        this.targetSegmentSizeSecs = targetSegmentSizeSecs;
        return this;
    }

    public TranscodePayload withCreatorId(InputCreatorId creatorId) {
        Utils.checkNotNull(creatorId, "creatorId");
        this.creatorId = Optional.ofNullable(creatorId);
        return this;
    }

    public TranscodePayload withCreatorId(Optional<? extends InputCreatorId> creatorId) {
        Utils.checkNotNull(creatorId, "creatorId");
        this.creatorId = creatorId;
        return this;
    }

    /**
     * Decides if the output video should include C2PA signature
     */
    public TranscodePayload withC2pa(boolean c2pa) {
        Utils.checkNotNull(c2pa, "c2pa");
        this.c2pa = Optional.ofNullable(c2pa);
        return this;
    }

    /**
     * Decides if the output video should include C2PA signature
     */
    public TranscodePayload withC2pa(Optional<Boolean> c2pa) {
        Utils.checkNotNull(c2pa, "c2pa");
        this.c2pa = c2pa;
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
        TranscodePayload other = (TranscodePayload) o;
        return 
            Objects.deepEquals(this.input, other.input) &&
            Objects.deepEquals(this.storage, other.storage) &&
            Objects.deepEquals(this.outputs, other.outputs) &&
            Objects.deepEquals(this.profiles, other.profiles) &&
            Objects.deepEquals(this.targetSegmentSizeSecs, other.targetSegmentSizeSecs) &&
            Objects.deepEquals(this.creatorId, other.creatorId) &&
            Objects.deepEquals(this.c2pa, other.c2pa);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            input,
            storage,
            outputs,
            profiles,
            targetSegmentSizeSecs,
            creatorId,
            c2pa);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TranscodePayload.class,
                "input", input,
                "storage", storage,
                "outputs", outputs,
                "profiles", profiles,
                "targetSegmentSizeSecs", targetSegmentSizeSecs,
                "creatorId", creatorId,
                "c2pa", c2pa);
    }
    
    public final static class Builder {
 
        private Input input;
 
        private TranscodePayloadStorage storage;
 
        private Outputs outputs;
 
        private Optional<? extends List<TranscodeProfile>> profiles = Optional.empty();
 
        private Optional<Double> targetSegmentSizeSecs = Optional.empty();
 
        private Optional<? extends InputCreatorId> creatorId = Optional.empty();
 
        private Optional<Boolean> c2pa = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder input(Input input) {
            Utils.checkNotNull(input, "input");
            this.input = input;
            return this;
        }

        public Builder storage(TranscodePayloadStorage storage) {
            Utils.checkNotNull(storage, "storage");
            this.storage = storage;
            return this;
        }

        /**
         * Output formats
         */
        public Builder outputs(Outputs outputs) {
            Utils.checkNotNull(outputs, "outputs");
            this.outputs = outputs;
            return this;
        }

        public Builder profiles(List<TranscodeProfile> profiles) {
            Utils.checkNotNull(profiles, "profiles");
            this.profiles = Optional.ofNullable(profiles);
            return this;
        }

        public Builder profiles(Optional<? extends List<TranscodeProfile>> profiles) {
            Utils.checkNotNull(profiles, "profiles");
            this.profiles = profiles;
            return this;
        }

        /**
         * How many seconds the duration of each output segment should be
         */
        public Builder targetSegmentSizeSecs(double targetSegmentSizeSecs) {
            Utils.checkNotNull(targetSegmentSizeSecs, "targetSegmentSizeSecs");
            this.targetSegmentSizeSecs = Optional.ofNullable(targetSegmentSizeSecs);
            return this;
        }

        /**
         * How many seconds the duration of each output segment should be
         */
        public Builder targetSegmentSizeSecs(Optional<Double> targetSegmentSizeSecs) {
            Utils.checkNotNull(targetSegmentSizeSecs, "targetSegmentSizeSecs");
            this.targetSegmentSizeSecs = targetSegmentSizeSecs;
            return this;
        }

        public Builder creatorId(InputCreatorId creatorId) {
            Utils.checkNotNull(creatorId, "creatorId");
            this.creatorId = Optional.ofNullable(creatorId);
            return this;
        }

        public Builder creatorId(Optional<? extends InputCreatorId> creatorId) {
            Utils.checkNotNull(creatorId, "creatorId");
            this.creatorId = creatorId;
            return this;
        }

        /**
         * Decides if the output video should include C2PA signature
         */
        public Builder c2pa(boolean c2pa) {
            Utils.checkNotNull(c2pa, "c2pa");
            this.c2pa = Optional.ofNullable(c2pa);
            return this;
        }

        /**
         * Decides if the output video should include C2PA signature
         */
        public Builder c2pa(Optional<Boolean> c2pa) {
            Utils.checkNotNull(c2pa, "c2pa");
            this.c2pa = c2pa;
            return this;
        }
        
        public TranscodePayload build() {
            return new TranscodePayload(
                input,
                storage,
                outputs,
                profiles,
                targetSegmentSizeSecs,
                creatorId,
                c2pa);
        }
    }
}

