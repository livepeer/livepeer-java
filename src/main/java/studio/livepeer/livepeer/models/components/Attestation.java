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


public class Attestation {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<? extends String> id;

    /**
     * Video Metadata EIP-712 primaryType
     */
    @JsonProperty("primaryType")
    private PrimaryType primaryType;

    /**
     * Video Metadata EIP-712 domain
     */
    @JsonProperty("domain")
    private Domain domain;

    /**
     * Video Metadata EIP-712 message content
     */
    @JsonProperty("message")
    private Message message;

    /**
     * Video Metadata EIP-712 message signature
     */
    @JsonProperty("signature")
    private String signature;

    /**
     * Timestamp (in milliseconds) at which the object was created
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("createdAt")
    private Optional<? extends Double> createdAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("signatureType")
    private Optional<? extends SignatureType> signatureType;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("storage")
    private Optional<? extends AttestationStorage> storage;

    @JsonCreator
    public Attestation(
            @JsonProperty("id") Optional<? extends String> id,
            @JsonProperty("primaryType") PrimaryType primaryType,
            @JsonProperty("domain") Domain domain,
            @JsonProperty("message") Message message,
            @JsonProperty("signature") String signature,
            @JsonProperty("createdAt") Optional<? extends Double> createdAt,
            @JsonProperty("signatureType") Optional<? extends SignatureType> signatureType,
            @JsonProperty("storage") Optional<? extends AttestationStorage> storage) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(primaryType, "primaryType");
        Utils.checkNotNull(domain, "domain");
        Utils.checkNotNull(message, "message");
        Utils.checkNotNull(signature, "signature");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(signatureType, "signatureType");
        Utils.checkNotNull(storage, "storage");
        this.id = id;
        this.primaryType = primaryType;
        this.domain = domain;
        this.message = message;
        this.signature = signature;
        this.createdAt = createdAt;
        this.signatureType = signatureType;
        this.storage = storage;
    }
    
    public Attestation(
            PrimaryType primaryType,
            Domain domain,
            Message message,
            String signature) {
        this(Optional.empty(), primaryType, domain, message, signature, Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> id() {
        return (Optional<String>) id;
    }

    /**
     * Video Metadata EIP-712 primaryType
     */
    @JsonIgnore
    public PrimaryType primaryType() {
        return primaryType;
    }

    /**
     * Video Metadata EIP-712 domain
     */
    @JsonIgnore
    public Domain domain() {
        return domain;
    }

    /**
     * Video Metadata EIP-712 message content
     */
    @JsonIgnore
    public Message message() {
        return message;
    }

    /**
     * Video Metadata EIP-712 message signature
     */
    @JsonIgnore
    public String signature() {
        return signature;
    }

    /**
     * Timestamp (in milliseconds) at which the object was created
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Double> createdAt() {
        return (Optional<Double>) createdAt;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SignatureType> signatureType() {
        return (Optional<SignatureType>) signatureType;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AttestationStorage> storage() {
        return (Optional<AttestationStorage>) storage;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Attestation withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public Attestation withId(Optional<? extends String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * Video Metadata EIP-712 primaryType
     */
    public Attestation withPrimaryType(PrimaryType primaryType) {
        Utils.checkNotNull(primaryType, "primaryType");
        this.primaryType = primaryType;
        return this;
    }

    /**
     * Video Metadata EIP-712 domain
     */
    public Attestation withDomain(Domain domain) {
        Utils.checkNotNull(domain, "domain");
        this.domain = domain;
        return this;
    }

    /**
     * Video Metadata EIP-712 message content
     */
    public Attestation withMessage(Message message) {
        Utils.checkNotNull(message, "message");
        this.message = message;
        return this;
    }

    /**
     * Video Metadata EIP-712 message signature
     */
    public Attestation withSignature(String signature) {
        Utils.checkNotNull(signature, "signature");
        this.signature = signature;
        return this;
    }

    /**
     * Timestamp (in milliseconds) at which the object was created
     */
    public Attestation withCreatedAt(double createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }

    /**
     * Timestamp (in milliseconds) at which the object was created
     */
    public Attestation withCreatedAt(Optional<? extends Double> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public Attestation withSignatureType(SignatureType signatureType) {
        Utils.checkNotNull(signatureType, "signatureType");
        this.signatureType = Optional.ofNullable(signatureType);
        return this;
    }

    public Attestation withSignatureType(Optional<? extends SignatureType> signatureType) {
        Utils.checkNotNull(signatureType, "signatureType");
        this.signatureType = signatureType;
        return this;
    }

    public Attestation withStorage(AttestationStorage storage) {
        Utils.checkNotNull(storage, "storage");
        this.storage = Optional.ofNullable(storage);
        return this;
    }

    public Attestation withStorage(Optional<? extends AttestationStorage> storage) {
        Utils.checkNotNull(storage, "storage");
        this.storage = storage;
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
        Attestation other = (Attestation) o;
        return 
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.primaryType, other.primaryType) &&
            java.util.Objects.deepEquals(this.domain, other.domain) &&
            java.util.Objects.deepEquals(this.message, other.message) &&
            java.util.Objects.deepEquals(this.signature, other.signature) &&
            java.util.Objects.deepEquals(this.createdAt, other.createdAt) &&
            java.util.Objects.deepEquals(this.signatureType, other.signatureType) &&
            java.util.Objects.deepEquals(this.storage, other.storage);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            id,
            primaryType,
            domain,
            message,
            signature,
            createdAt,
            signatureType,
            storage);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Attestation.class,
                "id", id,
                "primaryType", primaryType,
                "domain", domain,
                "message", message,
                "signature", signature,
                "createdAt", createdAt,
                "signatureType", signatureType,
                "storage", storage);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> id = Optional.empty();
 
        private PrimaryType primaryType;
 
        private Domain domain;
 
        private Message message;
 
        private String signature;
 
        private Optional<? extends Double> createdAt = Optional.empty();
 
        private Optional<? extends SignatureType> signatureType = Optional.empty();
 
        private Optional<? extends AttestationStorage> storage = Optional.empty();  
        
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
         * Video Metadata EIP-712 primaryType
         */
        public Builder primaryType(PrimaryType primaryType) {
            Utils.checkNotNull(primaryType, "primaryType");
            this.primaryType = primaryType;
            return this;
        }

        /**
         * Video Metadata EIP-712 domain
         */
        public Builder domain(Domain domain) {
            Utils.checkNotNull(domain, "domain");
            this.domain = domain;
            return this;
        }

        /**
         * Video Metadata EIP-712 message content
         */
        public Builder message(Message message) {
            Utils.checkNotNull(message, "message");
            this.message = message;
            return this;
        }

        /**
         * Video Metadata EIP-712 message signature
         */
        public Builder signature(String signature) {
            Utils.checkNotNull(signature, "signature");
            this.signature = signature;
            return this;
        }

        /**
         * Timestamp (in milliseconds) at which the object was created
         */
        public Builder createdAt(double createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = Optional.ofNullable(createdAt);
            return this;
        }

        /**
         * Timestamp (in milliseconds) at which the object was created
         */
        public Builder createdAt(Optional<? extends Double> createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }

        public Builder signatureType(SignatureType signatureType) {
            Utils.checkNotNull(signatureType, "signatureType");
            this.signatureType = Optional.ofNullable(signatureType);
            return this;
        }

        public Builder signatureType(Optional<? extends SignatureType> signatureType) {
            Utils.checkNotNull(signatureType, "signatureType");
            this.signatureType = signatureType;
            return this;
        }

        public Builder storage(AttestationStorage storage) {
            Utils.checkNotNull(storage, "storage");
            this.storage = Optional.ofNullable(storage);
            return this;
        }

        public Builder storage(Optional<? extends AttestationStorage> storage) {
            Utils.checkNotNull(storage, "storage");
            this.storage = storage;
            return this;
        }
        
        public Attestation build() {
            return new Attestation(
                id,
                primaryType,
                domain,
                message,
                signature,
                createdAt,
                signatureType,
                storage);
        }
    }
}

