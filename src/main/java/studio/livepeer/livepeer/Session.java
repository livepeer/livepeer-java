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
 * Operations related to session api
 */
public class Session implements
            MethodCallGetSessionClips,
            MethodCallGetSessions,
            MethodCallGetSession,
            MethodCallGetRecordedSessions {

    private final SDKConfiguration sdkConfiguration;

    Session(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * Retrieve clips of a session
     * @return The call builder
     */
    public studio.livepeer.livepeer.models.operations.GetSessionClipsRequestBuilder getClips() {
        return new studio.livepeer.livepeer.models.operations.GetSessionClipsRequestBuilder(this);
    }

    /**
     * Retrieve clips of a session
     * @param id ID of the parent session
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public studio.livepeer.livepeer.models.operations.GetSessionClipsResponse getClips(
            String id) throws Exception {
        studio.livepeer.livepeer.models.operations.GetSessionClipsRequest request =
            studio.livepeer.livepeer.models.operations.GetSessionClipsRequest
                .builder()
                .id(id)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                studio.livepeer.livepeer.models.operations.GetSessionClipsRequest.class,
                _baseUrl,
                "/session/{id}/clips",
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
                  new BeforeRequestContextImpl("getSessionClips", Optional.empty(), sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("getSessionClips", Optional.empty(), sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("getSessionClips", Optional.empty(), sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("getSessionClips", Optional.empty(), sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        studio.livepeer.livepeer.models.operations.GetSessionClipsResponse.Builder _resBuilder = 
            studio.livepeer.livepeer.models.operations.GetSessionClipsResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        studio.livepeer.livepeer.models.operations.GetSessionClipsResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                java.util.List<studio.livepeer.livepeer.models.components.Asset> _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<java.util.List<studio.livepeer.livepeer.models.components.Asset>>() {});
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
                studio.livepeer.livepeer.models.errors.Error _out = Utils.mapper().readValue(
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
     * Retrieve sessions
     * @return The call builder
     */
    public studio.livepeer.livepeer.models.operations.GetSessionsRequestBuilder getAll() {
        return new studio.livepeer.livepeer.models.operations.GetSessionsRequestBuilder(this);
    }

    /**
     * Retrieve sessions
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public studio.livepeer.livepeer.models.operations.GetSessionsResponse getAllDirect() throws Exception {
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/session");
        
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
                  new BeforeRequestContextImpl("getSessions", Optional.empty(), sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("getSessions", Optional.empty(), sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("getSessions", Optional.empty(), sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("getSessions", Optional.empty(), sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        studio.livepeer.livepeer.models.operations.GetSessionsResponse.Builder _resBuilder = 
            studio.livepeer.livepeer.models.operations.GetSessionsResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        studio.livepeer.livepeer.models.operations.GetSessionsResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                java.util.List<studio.livepeer.livepeer.models.components.Session> _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<java.util.List<studio.livepeer.livepeer.models.components.Session>>() {});
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
                studio.livepeer.livepeer.models.errors.Error _out = Utils.mapper().readValue(
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
     * Retrieve a session
     * @return The call builder
     */
    public studio.livepeer.livepeer.models.operations.GetSessionRequestBuilder get() {
        return new studio.livepeer.livepeer.models.operations.GetSessionRequestBuilder(this);
    }

    /**
     * Retrieve a session
     * @param id ID of the session
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public studio.livepeer.livepeer.models.operations.GetSessionResponse get(
            String id) throws Exception {
        studio.livepeer.livepeer.models.operations.GetSessionRequest request =
            studio.livepeer.livepeer.models.operations.GetSessionRequest
                .builder()
                .id(id)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                studio.livepeer.livepeer.models.operations.GetSessionRequest.class,
                _baseUrl,
                "/session/{id}",
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
                  new BeforeRequestContextImpl("getSession", Optional.empty(), sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("getSession", Optional.empty(), sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("getSession", Optional.empty(), sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("getSession", Optional.empty(), sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        studio.livepeer.livepeer.models.operations.GetSessionResponse.Builder _resBuilder = 
            studio.livepeer.livepeer.models.operations.GetSessionResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        studio.livepeer.livepeer.models.operations.GetSessionResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                studio.livepeer.livepeer.models.components.Session _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<studio.livepeer.livepeer.models.components.Session>() {});
                _res.withSession(java.util.Optional.ofNullable(_out));
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
                studio.livepeer.livepeer.models.errors.Error _out = Utils.mapper().readValue(
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
     * Retrieve Recorded Sessions
     * @return The call builder
     */
    public studio.livepeer.livepeer.models.operations.GetRecordedSessionsRequestBuilder getRecorded() {
        return new studio.livepeer.livepeer.models.operations.GetRecordedSessionsRequestBuilder(this);
    }

    /**
     * Retrieve Recorded Sessions
     * @param parentId ID of the parent stream
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public studio.livepeer.livepeer.models.operations.GetRecordedSessionsResponse getRecorded(
            String parentId) throws Exception {
        return getRecorded(parentId, Optional.empty());
    }
    /**
     * Retrieve Recorded Sessions
     * @param parentId ID of the parent stream
     * @param record Flag indicating if the response should only include recorded
    sessions

     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public studio.livepeer.livepeer.models.operations.GetRecordedSessionsResponse getRecorded(
            String parentId,
            Optional<? extends studio.livepeer.livepeer.models.operations.Record> record) throws Exception {
        studio.livepeer.livepeer.models.operations.GetRecordedSessionsRequest request =
            studio.livepeer.livepeer.models.operations.GetRecordedSessionsRequest
                .builder()
                .parentId(parentId)
                .record(record)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                studio.livepeer.livepeer.models.operations.GetRecordedSessionsRequest.class,
                _baseUrl,
                "/stream/{parentId}/sessions",
                request, null);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        _req.addQueryParams(Utils.getQueryParams(
                studio.livepeer.livepeer.models.operations.GetRecordedSessionsRequest.class,
                request, 
                null));

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl("getRecordedSessions", Optional.empty(), sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("getRecordedSessions", Optional.empty(), sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("getRecordedSessions", Optional.empty(), sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("getRecordedSessions", Optional.empty(), sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        studio.livepeer.livepeer.models.operations.GetRecordedSessionsResponse.Builder _resBuilder = 
            studio.livepeer.livepeer.models.operations.GetRecordedSessionsResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        studio.livepeer.livepeer.models.operations.GetRecordedSessionsResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                java.util.List<studio.livepeer.livepeer.models.components.Session> _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<java.util.List<studio.livepeer.livepeer.models.components.Session>>() {});
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
                studio.livepeer.livepeer.models.errors.Error _out = Utils.mapper().readValue(
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
