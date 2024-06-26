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

public class MultistreamTarget {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<? extends String> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<? extends String> name;

    /**
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("userId")
    @Deprecated
    private Optional<? extends String> userId;

    /**
     * If true then this multistream target will not be used for pushing
     * even if it is configured in a stream object.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("disabled")
    private Optional<? extends Boolean> disabled;

    /**
     * Timestamp (in milliseconds) at which multistream target object was
     * created
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("createdAt")
    private Optional<? extends Double> createdAt;

    @JsonCreator
    public MultistreamTarget(
            @JsonProperty("id") Optional<? extends String> id,
            @JsonProperty("name") Optional<? extends String> name,
            @JsonProperty("userId") Optional<? extends String> userId,
            @JsonProperty("disabled") Optional<? extends Boolean> disabled,
            @JsonProperty("createdAt") Optional<? extends Double> createdAt) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(userId, "userId");
        Utils.checkNotNull(disabled, "disabled");
        Utils.checkNotNull(createdAt, "createdAt");
        this.id = id;
        this.name = name;
        this.userId = userId;
        this.disabled = disabled;
        this.createdAt = createdAt;
    }
    
    public MultistreamTarget() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> id() {
        return (Optional<String>) id;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> name() {
        return (Optional<String>) name;
    }

    /**
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> userId() {
        return (Optional<String>) userId;
    }

    /**
     * If true then this multistream target will not be used for pushing
     * even if it is configured in a stream object.
     * 
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> disabled() {
        return (Optional<Boolean>) disabled;
    }

    /**
     * Timestamp (in milliseconds) at which multistream target object was
     * created
     * 
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Double> createdAt() {
        return (Optional<Double>) createdAt;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public MultistreamTarget withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public MultistreamTarget withId(Optional<? extends String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public MultistreamTarget withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    public MultistreamTarget withName(Optional<? extends String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public MultistreamTarget withUserId(String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = Optional.ofNullable(userId);
        return this;
    }

    /**
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public MultistreamTarget withUserId(Optional<? extends String> userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = userId;
        return this;
    }

    /**
     * If true then this multistream target will not be used for pushing
     * even if it is configured in a stream object.
     * 
     */
    public MultistreamTarget withDisabled(boolean disabled) {
        Utils.checkNotNull(disabled, "disabled");
        this.disabled = Optional.ofNullable(disabled);
        return this;
    }

    /**
     * If true then this multistream target will not be used for pushing
     * even if it is configured in a stream object.
     * 
     */
    public MultistreamTarget withDisabled(Optional<? extends Boolean> disabled) {
        Utils.checkNotNull(disabled, "disabled");
        this.disabled = disabled;
        return this;
    }

    /**
     * Timestamp (in milliseconds) at which multistream target object was
     * created
     * 
     */
    public MultistreamTarget withCreatedAt(double createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }

    /**
     * Timestamp (in milliseconds) at which multistream target object was
     * created
     * 
     */
    public MultistreamTarget withCreatedAt(Optional<? extends Double> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
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
        MultistreamTarget other = (MultistreamTarget) o;
        return 
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.userId, other.userId) &&
            java.util.Objects.deepEquals(this.disabled, other.disabled) &&
            java.util.Objects.deepEquals(this.createdAt, other.createdAt);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            id,
            name,
            userId,
            disabled,
            createdAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(MultistreamTarget.class,
                "id", id,
                "name", name,
                "userId", userId,
                "disabled", disabled,
                "createdAt", createdAt);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> id = Optional.empty();
 
        private Optional<? extends String> name = Optional.empty();
 
        @Deprecated
        private Optional<? extends String> userId = Optional.empty();
 
        private Optional<? extends Boolean> disabled = Optional.empty();
 
        private Optional<? extends Double> createdAt = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        public Builder id(Optional<? extends String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        public Builder name(Optional<? extends String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder userId(String userId) {
            Utils.checkNotNull(userId, "userId");
            this.userId = Optional.ofNullable(userId);
            return this;
        }

        /**
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder userId(Optional<? extends String> userId) {
            Utils.checkNotNull(userId, "userId");
            this.userId = userId;
            return this;
        }

        /**
         * If true then this multistream target will not be used for pushing
         * even if it is configured in a stream object.
         * 
         */
        public Builder disabled(boolean disabled) {
            Utils.checkNotNull(disabled, "disabled");
            this.disabled = Optional.ofNullable(disabled);
            return this;
        }

        /**
         * If true then this multistream target will not be used for pushing
         * even if it is configured in a stream object.
         * 
         */
        public Builder disabled(Optional<? extends Boolean> disabled) {
            Utils.checkNotNull(disabled, "disabled");
            this.disabled = disabled;
            return this;
        }

        /**
         * Timestamp (in milliseconds) at which multistream target object was
         * created
         * 
         */
        public Builder createdAt(double createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = Optional.ofNullable(createdAt);
            return this;
        }

        /**
         * Timestamp (in milliseconds) at which multistream target object was
         * created
         * 
         */
        public Builder createdAt(Optional<? extends Double> createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }
        
        public MultistreamTarget build() {
            return new MultistreamTarget(
                id,
                name,
                userId,
                disabled,
                createdAt);
        }
    }
}

