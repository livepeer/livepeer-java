/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package studio.livepeer.livepeer;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import org.apache.http.NameValuePair;
import org.openapitools.jackson.nullable.JsonNullable;
import studio.livepeer.livepeer.models.errors.SDKError;
import studio.livepeer.livepeer.models.operations.SDKMethodInterfaces.*;
import studio.livepeer.livepeer.utils.HTTPClient;
import studio.livepeer.livepeer.utils.HTTPRequest;
import studio.livepeer.livepeer.utils.Hook.AfterErrorContextImpl;
import studio.livepeer.livepeer.utils.Hook.AfterSuccessContextImpl;
import studio.livepeer.livepeer.utils.Hook.BeforeRequestContextImpl;
import studio.livepeer.livepeer.utils.JSON;
import studio.livepeer.livepeer.utils.Retries.NonRetryableException;
import studio.livepeer.livepeer.utils.Utils;

/**
 * Operations related to metrics api
 */
public class Metrics implements
            MethodCallGetViewershipMetrics,
            MethodCallGetCreatorViewershipMetrics,
            MethodCallGetPublicViewershipMetrics,
            MethodCallGetUsageMetrics {

    private final SDKConfiguration sdkConfiguration;

    Metrics(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    /**
     * Query viewership metrics
     * Requires a private (non-CORS) API key to be used.
     * 
     * @return The call builder
     */
    public studio.livepeer.livepeer.models.operations.GetViewershipMetricsRequestBuilder getViewership() {
        return new studio.livepeer.livepeer.models.operations.GetViewershipMetricsRequestBuilder(this);
    }

    /**
     * Query viewership metrics
     * Requires a private (non-CORS) API key to be used.
     * 
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public studio.livepeer.livepeer.models.operations.GetViewershipMetricsResponse getViewership(
            studio.livepeer.livepeer.models.operations.GetViewershipMetricsRequest request) throws Exception {
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/data/views/query");
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        _req.addQueryParams(Utils.getQueryParams(
                studio.livepeer.livepeer.models.operations.GetViewershipMetricsRequest.class,
                request, 
                null));

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl("getViewershipMetrics", sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("getViewershipMetrics", sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("getViewershipMetrics", sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("getViewershipMetrics", sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        studio.livepeer.livepeer.models.operations.GetViewershipMetricsResponse.Builder _resBuilder = 
            studio.livepeer.livepeer.models.operations.GetViewershipMetricsResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        studio.livepeer.livepeer.models.operations.GetViewershipMetricsResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ObjectMapper _mapper = JSON.getMapper();
                java.util.List<studio.livepeer.livepeer.models.components.ViewershipMetric> _out = _mapper.readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<java.util.List<studio.livepeer.livepeer.models.components.ViewershipMetric>>() {});
                _res.withData(java.util.Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.toByteArrayAndClose(_httpRes.body()));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX", "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.toByteArrayAndClose(_httpRes.body()));
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "default")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ObjectMapper _mapper = JSON.getMapper();
                studio.livepeer.livepeer.models.errors.Error _out = _mapper.readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<studio.livepeer.livepeer.models.errors.Error>() {});
                _res.withError(java.util.Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.toByteArrayAndClose(_httpRes.body()));
            }
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.toByteArrayAndClose(_httpRes.body()));
    }


    /**
     * Query creator viewership metrics
     * Requires a proof of ownership to be sent in the request, which for now is just the assetId or streamId parameters (1 of those must be in the query-string).
     * 
     * @return The call builder
     */
    public studio.livepeer.livepeer.models.operations.GetCreatorViewershipMetricsRequestBuilder getCreatorViewership() {
        return new studio.livepeer.livepeer.models.operations.GetCreatorViewershipMetricsRequestBuilder(this);
    }

    /**
     * Query creator viewership metrics
     * Requires a proof of ownership to be sent in the request, which for now is just the assetId or streamId parameters (1 of those must be in the query-string).
     * 
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public studio.livepeer.livepeer.models.operations.GetCreatorViewershipMetricsResponse getCreatorViewership(
            studio.livepeer.livepeer.models.operations.GetCreatorViewershipMetricsRequest request) throws Exception {
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/data/views/query/creator");
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        _req.addQueryParams(Utils.getQueryParams(
                studio.livepeer.livepeer.models.operations.GetCreatorViewershipMetricsRequest.class,
                request, 
                null));

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl("getCreatorViewershipMetrics", sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("getCreatorViewershipMetrics", sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("getCreatorViewershipMetrics", sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("getCreatorViewershipMetrics", sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        studio.livepeer.livepeer.models.operations.GetCreatorViewershipMetricsResponse.Builder _resBuilder = 
            studio.livepeer.livepeer.models.operations.GetCreatorViewershipMetricsResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        studio.livepeer.livepeer.models.operations.GetCreatorViewershipMetricsResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ObjectMapper _mapper = JSON.getMapper();
                java.util.List<studio.livepeer.livepeer.models.components.ViewershipMetric> _out = _mapper.readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<java.util.List<studio.livepeer.livepeer.models.components.ViewershipMetric>>() {});
                _res.withData(java.util.Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.toByteArrayAndClose(_httpRes.body()));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX", "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.toByteArrayAndClose(_httpRes.body()));
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "default")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ObjectMapper _mapper = JSON.getMapper();
                studio.livepeer.livepeer.models.errors.Error _out = _mapper.readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<studio.livepeer.livepeer.models.errors.Error>() {});
                _res.withError(java.util.Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.toByteArrayAndClose(_httpRes.body()));
            }
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.toByteArrayAndClose(_httpRes.body()));
    }


    /**
     * Query public total views metrics
     * Allows querying for the public metrics for viewership about a video.
     * This can be called from the frontend with a CORS key, or even
     * unauthenticated.
     * 
     * @return The call builder
     */
    public studio.livepeer.livepeer.models.operations.GetPublicViewershipMetricsRequestBuilder getPublicViewership() {
        return new studio.livepeer.livepeer.models.operations.GetPublicViewershipMetricsRequestBuilder(this);
    }

    /**
     * Query public total views metrics
     * Allows querying for the public metrics for viewership about a video.
     * This can be called from the frontend with a CORS key, or even
     * unauthenticated.
     * 
     * @param playbackId The playback ID to filter the query results. This can be a canonical
    playback ID from Livepeer assets or streams, or dStorage identifiers
    for assets

     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public studio.livepeer.livepeer.models.operations.GetPublicViewershipMetricsResponse getPublicViewership(
            String playbackId) throws Exception {
        studio.livepeer.livepeer.models.operations.GetPublicViewershipMetricsRequest request =
            studio.livepeer.livepeer.models.operations.GetPublicViewershipMetricsRequest
                .builder()
                .playbackId(playbackId)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                studio.livepeer.livepeer.models.operations.GetPublicViewershipMetricsRequest.class,
                _baseUrl,
                "/data/views/query/total/{playbackId}",
                request, null);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl("getPublicViewershipMetrics", sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("getPublicViewershipMetrics", sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("getPublicViewershipMetrics", sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("getPublicViewershipMetrics", sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        studio.livepeer.livepeer.models.operations.GetPublicViewershipMetricsResponse.Builder _resBuilder = 
            studio.livepeer.livepeer.models.operations.GetPublicViewershipMetricsResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        studio.livepeer.livepeer.models.operations.GetPublicViewershipMetricsResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ObjectMapper _mapper = JSON.getMapper();
                studio.livepeer.livepeer.models.operations.GetPublicViewershipMetricsData _out = _mapper.readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<studio.livepeer.livepeer.models.operations.GetPublicViewershipMetricsData>() {});
                _res.withData(java.util.Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.toByteArrayAndClose(_httpRes.body()));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX", "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.toByteArrayAndClose(_httpRes.body()));
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "default")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ObjectMapper _mapper = JSON.getMapper();
                studio.livepeer.livepeer.models.errors.Error _out = _mapper.readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<studio.livepeer.livepeer.models.errors.Error>() {});
                _res.withError(java.util.Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.toByteArrayAndClose(_httpRes.body()));
            }
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.toByteArrayAndClose(_httpRes.body()));
    }


    /**
     * Query usage metrics
     * @return The call builder
     */
    public studio.livepeer.livepeer.models.operations.GetUsageMetricsRequestBuilder getUsage() {
        return new studio.livepeer.livepeer.models.operations.GetUsageMetricsRequestBuilder(this);
    }

    /**
     * Query usage metrics
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public studio.livepeer.livepeer.models.operations.GetUsageMetricsResponse getUsage(
            studio.livepeer.livepeer.models.operations.GetUsageMetricsRequest request) throws Exception {
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/data/usage/query");
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        _req.addQueryParams(Utils.getQueryParams(
                studio.livepeer.livepeer.models.operations.GetUsageMetricsRequest.class,
                request, 
                null));

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl("getUsageMetrics", sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("getUsageMetrics", sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("getUsageMetrics", sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("getUsageMetrics", sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        studio.livepeer.livepeer.models.operations.GetUsageMetricsResponse.Builder _resBuilder = 
            studio.livepeer.livepeer.models.operations.GetUsageMetricsResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        studio.livepeer.livepeer.models.operations.GetUsageMetricsResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ObjectMapper _mapper = JSON.getMapper();
                studio.livepeer.livepeer.models.components.UsageMetric _out = _mapper.readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<studio.livepeer.livepeer.models.components.UsageMetric>() {});
                _res.withUsageMetric(java.util.Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.toByteArrayAndClose(_httpRes.body()));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX", "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.toByteArrayAndClose(_httpRes.body()));
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "default")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ObjectMapper _mapper = JSON.getMapper();
                studio.livepeer.livepeer.models.errors.Error _out = _mapper.readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<studio.livepeer.livepeer.models.errors.Error>() {});
                _res.withError(java.util.Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.toByteArrayAndClose(_httpRes.body()));
            }
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.toByteArrayAndClose(_httpRes.body()));
    }

}
