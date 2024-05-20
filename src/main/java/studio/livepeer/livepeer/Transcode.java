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
import studio.livepeer.livepeer.utils.SerializedBody;
import studio.livepeer.livepeer.utils.Utils;

/**
 * Operations related to transcode api
 */
public class Transcode implements
            MethodCallTranscodeVideo {

    private final SDKConfiguration sdkConfiguration;

    Transcode(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    /**
     * Transcode a video
     * `POST /transcode` transcodes a video file and uploads the results to the
     * specified storage service.
     * \
     * \
     * Transcoding is asynchronous so you will need to check the status of the
     * task in order to determine when transcoding is complete. The `id` field
     * in the response is the unique ID for the transcoding `Task`. The task
     * status can be queried using the [GET tasks
     * endpoint](https://docs.livepeer.org/reference/api/get-tasks):
     * \
     * \
     * When `status.phase` is `completed`,  transcoding will be complete and
     * the results will be stored in the storage service and the specified
     * output location.
     * \
     * \
     * The results will be available under `params.outputs.hls.path` and
     * `params.outputs.mp4.path` in the specified storage service.
     * ## Input
     * \
     * This endpoint currently supports the following inputs:
     * - HTTP
     * - S3 API Compatible Service
     * \
     * \
     * **HTTP**
     * \
     * A public HTTP URL can be used to read a video file.
     * ```json
     * {
     *     "url": "https://www.example.com/video.mp4"
     * }
     * ```
     * | Name | Type   | Description                          |
     * | ---- | ------ | ------------------------------------ |
     * | url  | string | A public HTTP URL for the video file. |
     * 
     * Note: For IPFS HTTP gateway URLs, the API currently only supports “path
     * style” URLs and does not support “subdomain style” URLs. The API will
     * support both styles of URLs in a future update.
     * \
     * \
     * **S3 API Compatible Service**
     * \
     * \
     * S3 credentials can be used to authenticate with a S3 API compatible
     * service to read a video file.
     * 
     * ```json
     * {
     *     "type": "s3",
     *     "endpoint": "https://gateway.storjshare.io",
     *     "credentials": {
     *         "accessKeyId": "$ACCESS_KEY_ID",
     *         "secretAccessKey": "$SECRET_ACCESS_KEY"
     *     },
     *     "bucket": "inbucket",
     *     "path": "/video/source.mp4"
     * }
     * ```
     * 
     * 
     * ## Storage
     * \
     * This endpoint currently supports the following storage services:
     * - S3 API Compatible Service
     * - Web3 Storage
     * \
     * \
     * **S3 API Compatible Service**
     * ```json
     * {
     *   "type": "s3",
     *     "endpoint": "https://gateway.storjshare.io",
     *     "credentials": {
     *         "accessKeyId": "$ACCESS_KEY_ID",
     *         "secretAccessKey": "$SECRET_ACCESS_KEY"
     *     },
     *     "bucket": "mybucket"
     * }
     * ```
     * 
     * **Web3 Storage**
     * 
     * ```json
     * {
     *   "type": "web3.storage",
     *     "credentials": {
     *         "proof": "$UCAN_DELEGATION_PROOF",
     *     }
     * }
     * ```
     * 
     * 
     * 
     * ## Outputs
     * \
     * This endpoint currently supports the following output types:
     * - HLS
     * - MP4
     * 
     * **HLS**
     * 
     * ```json
     * {
     *   "hls": {
     *         "path": "/samplevideo/hls"
     *     }
     * }
     * ```
     * 
     * 
     * **MP4**
     * 
     * ```json
     * {
     *   "mp4": {
     *         "path": "/samplevideo/mp4"
     *     }
     * }
     * ```
     * 
     * @return The call builder
     */
    public studio.livepeer.livepeer.models.operations.TranscodeVideoRequestBuilder create() {
        return new studio.livepeer.livepeer.models.operations.TranscodeVideoRequestBuilder(this);
    }

    /**
     * Transcode a video
     * `POST /transcode` transcodes a video file and uploads the results to the
     * specified storage service.
     * \
     * \
     * Transcoding is asynchronous so you will need to check the status of the
     * task in order to determine when transcoding is complete. The `id` field
     * in the response is the unique ID for the transcoding `Task`. The task
     * status can be queried using the [GET tasks
     * endpoint](https://docs.livepeer.org/reference/api/get-tasks):
     * \
     * \
     * When `status.phase` is `completed`,  transcoding will be complete and
     * the results will be stored in the storage service and the specified
     * output location.
     * \
     * \
     * The results will be available under `params.outputs.hls.path` and
     * `params.outputs.mp4.path` in the specified storage service.
     * ## Input
     * \
     * This endpoint currently supports the following inputs:
     * - HTTP
     * - S3 API Compatible Service
     * \
     * \
     * **HTTP**
     * \
     * A public HTTP URL can be used to read a video file.
     * ```json
     * {
     *     "url": "https://www.example.com/video.mp4"
     * }
     * ```
     * | Name | Type   | Description                          |
     * | ---- | ------ | ------------------------------------ |
     * | url  | string | A public HTTP URL for the video file. |
     * 
     * Note: For IPFS HTTP gateway URLs, the API currently only supports “path
     * style” URLs and does not support “subdomain style” URLs. The API will
     * support both styles of URLs in a future update.
     * \
     * \
     * **S3 API Compatible Service**
     * \
     * \
     * S3 credentials can be used to authenticate with a S3 API compatible
     * service to read a video file.
     * 
     * ```json
     * {
     *     "type": "s3",
     *     "endpoint": "https://gateway.storjshare.io",
     *     "credentials": {
     *         "accessKeyId": "$ACCESS_KEY_ID",
     *         "secretAccessKey": "$SECRET_ACCESS_KEY"
     *     },
     *     "bucket": "inbucket",
     *     "path": "/video/source.mp4"
     * }
     * ```
     * 
     * 
     * ## Storage
     * \
     * This endpoint currently supports the following storage services:
     * - S3 API Compatible Service
     * - Web3 Storage
     * \
     * \
     * **S3 API Compatible Service**
     * ```json
     * {
     *   "type": "s3",
     *     "endpoint": "https://gateway.storjshare.io",
     *     "credentials": {
     *         "accessKeyId": "$ACCESS_KEY_ID",
     *         "secretAccessKey": "$SECRET_ACCESS_KEY"
     *     },
     *     "bucket": "mybucket"
     * }
     * ```
     * 
     * **Web3 Storage**
     * 
     * ```json
     * {
     *   "type": "web3.storage",
     *     "credentials": {
     *         "proof": "$UCAN_DELEGATION_PROOF",
     *     }
     * }
     * ```
     * 
     * 
     * 
     * ## Outputs
     * \
     * This endpoint currently supports the following output types:
     * - HLS
     * - MP4
     * 
     * **HLS**
     * 
     * ```json
     * {
     *   "hls": {
     *         "path": "/samplevideo/hls"
     *     }
     * }
     * ```
     * 
     * 
     * **MP4**
     * 
     * ```json
     * {
     *   "mp4": {
     *         "path": "/samplevideo/mp4"
     *     }
     * }
     * ```
     * 
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public studio.livepeer.livepeer.models.operations.TranscodeVideoResponse create(
            studio.livepeer.livepeer.models.components.TranscodePayload request) throws Exception {
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/transcode");
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(request, Utils.JsonShape.DEFAULT,
            new TypeReference<studio.livepeer.livepeer.models.components.TranscodePayload>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, "request", "json", false);
        if (_serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        _req.setBody(Optional.ofNullable(_serializedRequestBody));
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl("transcodeVideo", sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("transcodeVideo", sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("transcodeVideo", sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("transcodeVideo", sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        studio.livepeer.livepeer.models.operations.TranscodeVideoResponse.Builder _resBuilder = 
            studio.livepeer.livepeer.models.operations.TranscodeVideoResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        studio.livepeer.livepeer.models.operations.TranscodeVideoResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ObjectMapper _mapper = JSON.getMapper();
                studio.livepeer.livepeer.models.components.Task _out = _mapper.readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<studio.livepeer.livepeer.models.components.Task>() {});
                _res.withTask(java.util.Optional.ofNullable(_out));
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
