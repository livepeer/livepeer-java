/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.http.HttpResponse;
import java.util.Optional;
import studio.livepeer.livepeer.utils.Utils;


public class CreateClipResponse implements studio.livepeer.livepeer.utils.Response {

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
     * Success
     */
    private Optional<? extends CreateClipData> data;

    /**
     * Error
     */
    private Optional<? extends studio.livepeer.livepeer.models.errors.Error> error;

    @JsonCreator
    public CreateClipResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends CreateClipData> data,
            Optional<? extends studio.livepeer.livepeer.models.errors.Error> error) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(data, "data");
        Utils.checkNotNull(error, "error");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.data = data;
        this.error = error;
    }
    
    public CreateClipResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, statusCode, rawResponse, Optional.empty(), Optional.empty());
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
     * Success
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CreateClipData> data() {
        return (Optional<CreateClipData>) data;
    }

    /**
     * Error
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<studio.livepeer.livepeer.models.errors.Error> error() {
        return (Optional<studio.livepeer.livepeer.models.errors.Error>) error;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public CreateClipResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public CreateClipResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public CreateClipResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Success
     */
    public CreateClipResponse withData(CreateClipData data) {
        Utils.checkNotNull(data, "data");
        this.data = Optional.ofNullable(data);
        return this;
    }

    /**
     * Success
     */
    public CreateClipResponse withData(Optional<? extends CreateClipData> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
        return this;
    }

    /**
     * Error
     */
    public CreateClipResponse withError(studio.livepeer.livepeer.models.errors.Error error) {
        Utils.checkNotNull(error, "error");
        this.error = Optional.ofNullable(error);
        return this;
    }

    /**
     * Error
     */
    public CreateClipResponse withError(Optional<? extends studio.livepeer.livepeer.models.errors.Error> error) {
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
        CreateClipResponse other = (CreateClipResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            java.util.Objects.deepEquals(this.data, other.data) &&
            java.util.Objects.deepEquals(this.error, other.error);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            data,
            error);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateClipResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "data", data,
                "error", error);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends CreateClipData> data = Optional.empty();
 
        private Optional<? extends studio.livepeer.livepeer.models.errors.Error> error = Optional.empty();  
        
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
         * Success
         */
        public Builder data(CreateClipData data) {
            Utils.checkNotNull(data, "data");
            this.data = Optional.ofNullable(data);
            return this;
        }

        /**
         * Success
         */
        public Builder data(Optional<? extends CreateClipData> data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }

        /**
         * Error
         */
        public Builder error(studio.livepeer.livepeer.models.errors.Error error) {
            Utils.checkNotNull(error, "error");
            this.error = Optional.ofNullable(error);
            return this;
        }

        /**
         * Error
         */
        public Builder error(Optional<? extends studio.livepeer.livepeer.models.errors.Error> error) {
            Utils.checkNotNull(error, "error");
            this.error = error;
            return this;
        }
        
        public CreateClipResponse build() {
            return new CreateClipResponse(
                contentType,
                statusCode,
                rawResponse,
                data,
                error);
        }
    }
}

