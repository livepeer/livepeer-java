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
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import studio.livepeer.livepeer.models.components.ViewershipMetric;
import studio.livepeer.livepeer.models.errors.Error;
import studio.livepeer.livepeer.utils.Response;
import studio.livepeer.livepeer.utils.Utils;


public class GetCreatorViewershipMetricsResponse implements Response {

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
     * A list of Metric objects
     */
    private Optional<? extends List<ViewershipMetric>> data;

    /**
     * Error
     */
    private Optional<? extends Error> error;

    @JsonCreator
    public GetCreatorViewershipMetricsResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends List<ViewershipMetric>> data,
            Optional<? extends Error> error) {
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
    
    public GetCreatorViewershipMetricsResponse(
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
     * A list of Metric objects
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<ViewershipMetric>> data() {
        return (Optional<List<ViewershipMetric>>) data;
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
    public GetCreatorViewershipMetricsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetCreatorViewershipMetricsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetCreatorViewershipMetricsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * A list of Metric objects
     */
    public GetCreatorViewershipMetricsResponse withData(List<ViewershipMetric> data) {
        Utils.checkNotNull(data, "data");
        this.data = Optional.ofNullable(data);
        return this;
    }

    /**
     * A list of Metric objects
     */
    public GetCreatorViewershipMetricsResponse withData(Optional<? extends List<ViewershipMetric>> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
        return this;
    }

    /**
     * Error
     */
    public GetCreatorViewershipMetricsResponse withError(Error error) {
        Utils.checkNotNull(error, "error");
        this.error = Optional.ofNullable(error);
        return this;
    }

    /**
     * Error
     */
    public GetCreatorViewershipMetricsResponse withError(Optional<? extends Error> error) {
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
        GetCreatorViewershipMetricsResponse other = (GetCreatorViewershipMetricsResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.data, other.data) &&
            Objects.deepEquals(this.error, other.error);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            data,
            error);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetCreatorViewershipMetricsResponse.class,
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
 
        private Optional<? extends List<ViewershipMetric>> data = Optional.empty();
 
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
         * A list of Metric objects
         */
        public Builder data(List<ViewershipMetric> data) {
            Utils.checkNotNull(data, "data");
            this.data = Optional.ofNullable(data);
            return this;
        }

        /**
         * A list of Metric objects
         */
        public Builder data(Optional<? extends List<ViewershipMetric>> data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
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
        
        public GetCreatorViewershipMetricsResponse build() {
            return new GetCreatorViewershipMetricsResponse(
                contentType,
                statusCode,
                rawResponse,
                data,
                error);
        }
    }
}

