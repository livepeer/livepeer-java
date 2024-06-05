/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.components;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import studio.livepeer.livepeer.utils.Utils;
/**
 * Storage1 - Storage for the output files
 */

public class Storage1 {

    /**
     * Type of service used for output files
     */
    @JsonProperty("type")
    private StorageType type;

    /**
     * Service endpoint URL (AWS S3 endpoint list: https://docs.aws.amazon.com/general/latest/gr/s3.html, GCP S3 endpoint: https://storage.googleapis.com, Storj: https://gateway.storjshare.io)
     */
    @JsonProperty("endpoint")
    private String endpoint;

    /**
     * Bucket with output files
     */
    @JsonProperty("bucket")
    private String bucket;

    /**
     * Credentials for the output video storage
     */
    @JsonProperty("credentials")
    private StorageCredentials credentials;

    @JsonCreator
    public Storage1(
            @JsonProperty("type") StorageType type,
            @JsonProperty("endpoint") String endpoint,
            @JsonProperty("bucket") String bucket,
            @JsonProperty("credentials") StorageCredentials credentials) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(endpoint, "endpoint");
        Utils.checkNotNull(bucket, "bucket");
        Utils.checkNotNull(credentials, "credentials");
        this.type = type;
        this.endpoint = endpoint;
        this.bucket = bucket;
        this.credentials = credentials;
    }

    /**
     * Type of service used for output files
     */
    @JsonIgnore
    public StorageType type() {
        return type;
    }

    /**
     * Service endpoint URL (AWS S3 endpoint list: https://docs.aws.amazon.com/general/latest/gr/s3.html, GCP S3 endpoint: https://storage.googleapis.com, Storj: https://gateway.storjshare.io)
     */
    @JsonIgnore
    public String endpoint() {
        return endpoint;
    }

    /**
     * Bucket with output files
     */
    @JsonIgnore
    public String bucket() {
        return bucket;
    }

    /**
     * Credentials for the output video storage
     */
    @JsonIgnore
    public StorageCredentials credentials() {
        return credentials;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Type of service used for output files
     */
    public Storage1 withType(StorageType type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * Service endpoint URL (AWS S3 endpoint list: https://docs.aws.amazon.com/general/latest/gr/s3.html, GCP S3 endpoint: https://storage.googleapis.com, Storj: https://gateway.storjshare.io)
     */
    public Storage1 withEndpoint(String endpoint) {
        Utils.checkNotNull(endpoint, "endpoint");
        this.endpoint = endpoint;
        return this;
    }

    /**
     * Bucket with output files
     */
    public Storage1 withBucket(String bucket) {
        Utils.checkNotNull(bucket, "bucket");
        this.bucket = bucket;
        return this;
    }

    /**
     * Credentials for the output video storage
     */
    public Storage1 withCredentials(StorageCredentials credentials) {
        Utils.checkNotNull(credentials, "credentials");
        this.credentials = credentials;
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
        Storage1 other = (Storage1) o;
        return 
            java.util.Objects.deepEquals(this.type, other.type) &&
            java.util.Objects.deepEquals(this.endpoint, other.endpoint) &&
            java.util.Objects.deepEquals(this.bucket, other.bucket) &&
            java.util.Objects.deepEquals(this.credentials, other.credentials);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            type,
            endpoint,
            bucket,
            credentials);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Storage1.class,
                "type", type,
                "endpoint", endpoint,
                "bucket", bucket,
                "credentials", credentials);
    }
    
    public final static class Builder {
 
        private StorageType type;
 
        private String endpoint;
 
        private String bucket;
 
        private StorageCredentials credentials;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Type of service used for output files
         */
        public Builder type(StorageType type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        /**
         * Service endpoint URL (AWS S3 endpoint list: https://docs.aws.amazon.com/general/latest/gr/s3.html, GCP S3 endpoint: https://storage.googleapis.com, Storj: https://gateway.storjshare.io)
         */
        public Builder endpoint(String endpoint) {
            Utils.checkNotNull(endpoint, "endpoint");
            this.endpoint = endpoint;
            return this;
        }

        /**
         * Bucket with output files
         */
        public Builder bucket(String bucket) {
            Utils.checkNotNull(bucket, "bucket");
            this.bucket = bucket;
            return this;
        }

        /**
         * Credentials for the output video storage
         */
        public Builder credentials(StorageCredentials credentials) {
            Utils.checkNotNull(credentials, "credentials");
            this.credentials = credentials;
            return this;
        }
        
        public Storage1 build() {
            return new Storage1(
                type,
                endpoint,
                bucket,
                credentials);
        }
    }
}

