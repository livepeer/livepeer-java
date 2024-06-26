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

public class SigningKey {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<? extends String> id;

    /**
     * Name of the signing key
     */
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
     * Timestamp (in milliseconds) at which the signing-key was created
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("createdAt")
    private Optional<? extends Double> createdAt;

    /**
     * Timestamp (in milliseconds) at which the signing-key was last used
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lastSeen")
    private Optional<? extends Double> lastSeen;

    @JsonProperty("publicKey")
    private String publicKey;

    /**
     * Disable the signing key to allow rotation safely
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("disabled")
    private Optional<? extends Boolean> disabled;

    /**
     * The ID of the project
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("projectId")
    private Optional<? extends String> projectId;

    @JsonCreator
    public SigningKey(
            @JsonProperty("id") Optional<? extends String> id,
            @JsonProperty("name") Optional<? extends String> name,
            @JsonProperty("userId") Optional<? extends String> userId,
            @JsonProperty("createdAt") Optional<? extends Double> createdAt,
            @JsonProperty("lastSeen") Optional<? extends Double> lastSeen,
            @JsonProperty("publicKey") String publicKey,
            @JsonProperty("disabled") Optional<? extends Boolean> disabled,
            @JsonProperty("projectId") Optional<? extends String> projectId) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(userId, "userId");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(lastSeen, "lastSeen");
        Utils.checkNotNull(publicKey, "publicKey");
        Utils.checkNotNull(disabled, "disabled");
        Utils.checkNotNull(projectId, "projectId");
        this.id = id;
        this.name = name;
        this.userId = userId;
        this.createdAt = createdAt;
        this.lastSeen = lastSeen;
        this.publicKey = publicKey;
        this.disabled = disabled;
        this.projectId = projectId;
    }
    
    public SigningKey(
            String publicKey) {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), publicKey, Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> id() {
        return (Optional<String>) id;
    }

    /**
     * Name of the signing key
     */
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
     * Timestamp (in milliseconds) at which the signing-key was created
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Double> createdAt() {
        return (Optional<Double>) createdAt;
    }

    /**
     * Timestamp (in milliseconds) at which the signing-key was last used
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Double> lastSeen() {
        return (Optional<Double>) lastSeen;
    }

    @JsonIgnore
    public String publicKey() {
        return publicKey;
    }

    /**
     * Disable the signing key to allow rotation safely
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> disabled() {
        return (Optional<Boolean>) disabled;
    }

    /**
     * The ID of the project
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> projectId() {
        return (Optional<String>) projectId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SigningKey withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public SigningKey withId(Optional<? extends String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * Name of the signing key
     */
    public SigningKey withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * Name of the signing key
     */
    public SigningKey withName(Optional<? extends String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public SigningKey withUserId(String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = Optional.ofNullable(userId);
        return this;
    }

    /**
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public SigningKey withUserId(Optional<? extends String> userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = userId;
        return this;
    }

    /**
     * Timestamp (in milliseconds) at which the signing-key was created
     */
    public SigningKey withCreatedAt(double createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }

    /**
     * Timestamp (in milliseconds) at which the signing-key was created
     */
    public SigningKey withCreatedAt(Optional<? extends Double> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Timestamp (in milliseconds) at which the signing-key was last used
     */
    public SigningKey withLastSeen(double lastSeen) {
        Utils.checkNotNull(lastSeen, "lastSeen");
        this.lastSeen = Optional.ofNullable(lastSeen);
        return this;
    }

    /**
     * Timestamp (in milliseconds) at which the signing-key was last used
     */
    public SigningKey withLastSeen(Optional<? extends Double> lastSeen) {
        Utils.checkNotNull(lastSeen, "lastSeen");
        this.lastSeen = lastSeen;
        return this;
    }

    public SigningKey withPublicKey(String publicKey) {
        Utils.checkNotNull(publicKey, "publicKey");
        this.publicKey = publicKey;
        return this;
    }

    /**
     * Disable the signing key to allow rotation safely
     */
    public SigningKey withDisabled(boolean disabled) {
        Utils.checkNotNull(disabled, "disabled");
        this.disabled = Optional.ofNullable(disabled);
        return this;
    }

    /**
     * Disable the signing key to allow rotation safely
     */
    public SigningKey withDisabled(Optional<? extends Boolean> disabled) {
        Utils.checkNotNull(disabled, "disabled");
        this.disabled = disabled;
        return this;
    }

    /**
     * The ID of the project
     */
    public SigningKey withProjectId(String projectId) {
        Utils.checkNotNull(projectId, "projectId");
        this.projectId = Optional.ofNullable(projectId);
        return this;
    }

    /**
     * The ID of the project
     */
    public SigningKey withProjectId(Optional<? extends String> projectId) {
        Utils.checkNotNull(projectId, "projectId");
        this.projectId = projectId;
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
        SigningKey other = (SigningKey) o;
        return 
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.userId, other.userId) &&
            java.util.Objects.deepEquals(this.createdAt, other.createdAt) &&
            java.util.Objects.deepEquals(this.lastSeen, other.lastSeen) &&
            java.util.Objects.deepEquals(this.publicKey, other.publicKey) &&
            java.util.Objects.deepEquals(this.disabled, other.disabled) &&
            java.util.Objects.deepEquals(this.projectId, other.projectId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            id,
            name,
            userId,
            createdAt,
            lastSeen,
            publicKey,
            disabled,
            projectId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SigningKey.class,
                "id", id,
                "name", name,
                "userId", userId,
                "createdAt", createdAt,
                "lastSeen", lastSeen,
                "publicKey", publicKey,
                "disabled", disabled,
                "projectId", projectId);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> id = Optional.empty();
 
        private Optional<? extends String> name = Optional.empty();
 
        @Deprecated
        private Optional<? extends String> userId = Optional.empty();
 
        private Optional<? extends Double> createdAt = Optional.empty();
 
        private Optional<? extends Double> lastSeen = Optional.empty();
 
        private String publicKey;
 
        private Optional<? extends Boolean> disabled = Optional.empty();
 
        private Optional<? extends String> projectId = Optional.empty();  
        
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

        /**
         * Name of the signing key
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        /**
         * Name of the signing key
         */
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
         * Timestamp (in milliseconds) at which the signing-key was created
         */
        public Builder createdAt(double createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = Optional.ofNullable(createdAt);
            return this;
        }

        /**
         * Timestamp (in milliseconds) at which the signing-key was created
         */
        public Builder createdAt(Optional<? extends Double> createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Timestamp (in milliseconds) at which the signing-key was last used
         */
        public Builder lastSeen(double lastSeen) {
            Utils.checkNotNull(lastSeen, "lastSeen");
            this.lastSeen = Optional.ofNullable(lastSeen);
            return this;
        }

        /**
         * Timestamp (in milliseconds) at which the signing-key was last used
         */
        public Builder lastSeen(Optional<? extends Double> lastSeen) {
            Utils.checkNotNull(lastSeen, "lastSeen");
            this.lastSeen = lastSeen;
            return this;
        }

        public Builder publicKey(String publicKey) {
            Utils.checkNotNull(publicKey, "publicKey");
            this.publicKey = publicKey;
            return this;
        }

        /**
         * Disable the signing key to allow rotation safely
         */
        public Builder disabled(boolean disabled) {
            Utils.checkNotNull(disabled, "disabled");
            this.disabled = Optional.ofNullable(disabled);
            return this;
        }

        /**
         * Disable the signing key to allow rotation safely
         */
        public Builder disabled(Optional<? extends Boolean> disabled) {
            Utils.checkNotNull(disabled, "disabled");
            this.disabled = disabled;
            return this;
        }

        /**
         * The ID of the project
         */
        public Builder projectId(String projectId) {
            Utils.checkNotNull(projectId, "projectId");
            this.projectId = Optional.ofNullable(projectId);
            return this;
        }

        /**
         * The ID of the project
         */
        public Builder projectId(Optional<? extends String> projectId) {
            Utils.checkNotNull(projectId, "projectId");
            this.projectId = projectId;
            return this;
        }
        
        public SigningKey build() {
            return new SigningKey(
                id,
                name,
                userId,
                createdAt,
                lastSeen,
                publicKey,
                disabled,
                projectId);
        }
    }
}

