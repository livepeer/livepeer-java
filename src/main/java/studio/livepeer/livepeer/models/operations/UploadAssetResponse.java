/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.Objects;
import java.util.Optional;
import studio.livepeer.livepeer.models.errors.Error;
import studio.livepeer.livepeer.utils.Response;
import studio.livepeer.livepeer.utils.Utils;


public class UploadAssetResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    /**
     * Upload in progress
     */
    private Optional<? extends UploadAssetData> twoHundredApplicationJsonData;

    /**
     * Upload started
     */
    private Optional<? extends UploadAssetDataOutput> twoHundredAndOneApplicationJsonData;

    /**
     * Error
     */
    private Optional<? extends Error> error;

    @JsonCreator
    public UploadAssetResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends UploadAssetData> twoHundredApplicationJsonData,
            Optional<? extends UploadAssetDataOutput> twoHundredAndOneApplicationJsonData,
            Optional<? extends Error> error) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(twoHundredApplicationJsonData, "twoHundredApplicationJsonData");
        Utils.checkNotNull(twoHundredAndOneApplicationJsonData, "twoHundredAndOneApplicationJsonData");
        Utils.checkNotNull(error, "error");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.twoHundredApplicationJsonData = twoHundredApplicationJsonData;
        this.twoHundredAndOneApplicationJsonData = twoHundredAndOneApplicationJsonData;
        this.error = error;
    }
    
    public UploadAssetResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, statusCode, rawResponse, Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * HTTP response content type for this operation
     */
    @JsonIgnore
    public String contentType() {
        return contentType;
    }

    /**
     * HTTP response status code for this operation
     */
    @JsonIgnore
    public int statusCode() {
        return statusCode;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    @JsonIgnore
    public HttpResponse<InputStream> rawResponse() {
        return rawResponse;
    }

    /**
     * Upload in progress
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<UploadAssetData> twoHundredApplicationJsonData() {
        return (Optional<UploadAssetData>) twoHundredApplicationJsonData;
    }

    /**
     * Upload started
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<UploadAssetDataOutput> twoHundredAndOneApplicationJsonData() {
        return (Optional<UploadAssetDataOutput>) twoHundredAndOneApplicationJsonData;
    }

    /**
     * Error
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Error> error() {
        return (Optional<Error>) error;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public UploadAssetResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public UploadAssetResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public UploadAssetResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Upload in progress
     */
    public UploadAssetResponse withTwoHundredApplicationJsonData(UploadAssetData twoHundredApplicationJsonData) {
        Utils.checkNotNull(twoHundredApplicationJsonData, "twoHundredApplicationJsonData");
        this.twoHundredApplicationJsonData = Optional.ofNullable(twoHundredApplicationJsonData);
        return this;
    }

    /**
     * Upload in progress
     */
    public UploadAssetResponse withTwoHundredApplicationJsonData(Optional<? extends UploadAssetData> twoHundredApplicationJsonData) {
        Utils.checkNotNull(twoHundredApplicationJsonData, "twoHundredApplicationJsonData");
        this.twoHundredApplicationJsonData = twoHundredApplicationJsonData;
        return this;
    }

    /**
     * Upload started
     */
    public UploadAssetResponse withTwoHundredAndOneApplicationJsonData(UploadAssetDataOutput twoHundredAndOneApplicationJsonData) {
        Utils.checkNotNull(twoHundredAndOneApplicationJsonData, "twoHundredAndOneApplicationJsonData");
        this.twoHundredAndOneApplicationJsonData = Optional.ofNullable(twoHundredAndOneApplicationJsonData);
        return this;
    }

    /**
     * Upload started
     */
    public UploadAssetResponse withTwoHundredAndOneApplicationJsonData(Optional<? extends UploadAssetDataOutput> twoHundredAndOneApplicationJsonData) {
        Utils.checkNotNull(twoHundredAndOneApplicationJsonData, "twoHundredAndOneApplicationJsonData");
        this.twoHundredAndOneApplicationJsonData = twoHundredAndOneApplicationJsonData;
        return this;
    }

    /**
     * Error
     */
    public UploadAssetResponse withError(Error error) {
        Utils.checkNotNull(error, "error");
        this.error = Optional.ofNullable(error);
        return this;
    }

    /**
     * Error
     */
    public UploadAssetResponse withError(Optional<? extends Error> error) {
        Utils.checkNotNull(error, "error");
        this.error = error;
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
        UploadAssetResponse other = (UploadAssetResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.twoHundredApplicationJsonData, other.twoHundredApplicationJsonData) &&
            Objects.deepEquals(this.twoHundredAndOneApplicationJsonData, other.twoHundredAndOneApplicationJsonData) &&
            Objects.deepEquals(this.error, other.error);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            twoHundredApplicationJsonData,
            twoHundredAndOneApplicationJsonData,
            error);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UploadAssetResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "twoHundredApplicationJsonData", twoHundredApplicationJsonData,
                "twoHundredAndOneApplicationJsonData", twoHundredAndOneApplicationJsonData,
                "error", error);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends UploadAssetData> twoHundredApplicationJsonData = Optional.empty();
 
        private Optional<? extends UploadAssetDataOutput> twoHundredAndOneApplicationJsonData = Optional.empty();
 
        private Optional<? extends Error> error = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * HTTP response content type for this operation
         */
        public Builder contentType(String contentType) {
            Utils.checkNotNull(contentType, "contentType");
            this.contentType = contentType;
            return this;
        }

        /**
         * HTTP response status code for this operation
         */
        public Builder statusCode(int statusCode) {
            Utils.checkNotNull(statusCode, "statusCode");
            this.statusCode = statusCode;
            return this;
        }

        /**
         * Raw HTTP response; suitable for custom response parsing
         */
        public Builder rawResponse(HttpResponse<InputStream> rawResponse) {
            Utils.checkNotNull(rawResponse, "rawResponse");
            this.rawResponse = rawResponse;
            return this;
        }

        /**
         * Upload in progress
         */
        public Builder twoHundredApplicationJsonData(UploadAssetData twoHundredApplicationJsonData) {
            Utils.checkNotNull(twoHundredApplicationJsonData, "twoHundredApplicationJsonData");
            this.twoHundredApplicationJsonData = Optional.ofNullable(twoHundredApplicationJsonData);
            return this;
        }

        /**
         * Upload in progress
         */
        public Builder twoHundredApplicationJsonData(Optional<? extends UploadAssetData> twoHundredApplicationJsonData) {
            Utils.checkNotNull(twoHundredApplicationJsonData, "twoHundredApplicationJsonData");
            this.twoHundredApplicationJsonData = twoHundredApplicationJsonData;
            return this;
        }

        /**
         * Upload started
         */
        public Builder twoHundredAndOneApplicationJsonData(UploadAssetDataOutput twoHundredAndOneApplicationJsonData) {
            Utils.checkNotNull(twoHundredAndOneApplicationJsonData, "twoHundredAndOneApplicationJsonData");
            this.twoHundredAndOneApplicationJsonData = Optional.ofNullable(twoHundredAndOneApplicationJsonData);
            return this;
        }

        /**
         * Upload started
         */
        public Builder twoHundredAndOneApplicationJsonData(Optional<? extends UploadAssetDataOutput> twoHundredAndOneApplicationJsonData) {
            Utils.checkNotNull(twoHundredAndOneApplicationJsonData, "twoHundredAndOneApplicationJsonData");
            this.twoHundredAndOneApplicationJsonData = twoHundredAndOneApplicationJsonData;
            return this;
        }

        /**
         * Error
         */
        public Builder error(Error error) {
            Utils.checkNotNull(error, "error");
            this.error = Optional.ofNullable(error);
            return this;
        }

        /**
         * Error
         */
        public Builder error(Optional<? extends Error> error) {
            Utils.checkNotNull(error, "error");
            this.error = error;
            return this;
        }
        
        public UploadAssetResponse build() {
            return new UploadAssetResponse(
                contentType,
                statusCode,
                rawResponse,
                twoHundredApplicationJsonData,
                twoHundredAndOneApplicationJsonData,
                error);
        }
    }
}

