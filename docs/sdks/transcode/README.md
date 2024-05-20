# Transcode
(*transcode()*)

## Overview

Operations related to transcode api

### Available Operations

* [create](#create) - Transcode a video

## create

`POST /transcode` transcodes a video file and uploads the results to the
specified storage service.
\
\
Transcoding is asynchronous so you will need to check the status of the
task in order to determine when transcoding is complete. The `id` field
in the response is the unique ID for the transcoding `Task`. The task
status can be queried using the [GET tasks
endpoint](https://docs.livepeer.org/reference/api/get-tasks):
\
\
When `status.phase` is `completed`,  transcoding will be complete and
the results will be stored in the storage service and the specified
output location.
\
\
The results will be available under `params.outputs.hls.path` and
`params.outputs.mp4.path` in the specified storage service.
## Input
\
This endpoint currently supports the following inputs:
- HTTP
- S3 API Compatible Service
\
\
**HTTP**
\
A public HTTP URL can be used to read a video file.
```json
{
    "url": "https://www.example.com/video.mp4"
}
```
| Name | Type   | Description                          |
| ---- | ------ | ------------------------------------ |
| url  | string | A public HTTP URL for the video file. |

Note: For IPFS HTTP gateway URLs, the API currently only supports “path
style” URLs and does not support “subdomain style” URLs. The API will
support both styles of URLs in a future update.
\
\
**S3 API Compatible Service**
\
\
S3 credentials can be used to authenticate with a S3 API compatible
service to read a video file.

```json
{
    "type": "s3",
    "endpoint": "https://gateway.storjshare.io",
    "credentials": {
        "accessKeyId": "$ACCESS_KEY_ID",
        "secretAccessKey": "$SECRET_ACCESS_KEY"
    },
    "bucket": "inbucket",
    "path": "/video/source.mp4"
}
```


## Storage
\
This endpoint currently supports the following storage services:
- S3 API Compatible Service
- Web3 Storage
\
\
**S3 API Compatible Service**
```json
{
  "type": "s3",
    "endpoint": "https://gateway.storjshare.io",
    "credentials": {
        "accessKeyId": "$ACCESS_KEY_ID",
        "secretAccessKey": "$SECRET_ACCESS_KEY"
    },
    "bucket": "mybucket"
}
```

**Web3 Storage**

```json
{
  "type": "web3.storage",
    "credentials": {
        "proof": "$UCAN_DELEGATION_PROOF",
    }
}
```



## Outputs
\
This endpoint currently supports the following output types:
- HLS
- MP4

**HLS**

```json
{
  "hls": {
        "path": "/samplevideo/hls"
    }
}
```


**MP4**

```json
{
  "mp4": {
        "path": "/samplevideo/mp4"
    }
}
```


### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;
import studio.livepeer.livepeer.Livepeer;
import studio.livepeer.livepeer.models.components.*;
import studio.livepeer.livepeer.models.components.Security;
import studio.livepeer.livepeer.models.operations.*;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            Livepeer sdk = Livepeer.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .build();

            TranscodePayload req = TranscodePayload.builder()
                .input(Input.of(Input1.builder()
                            .url("https://s3.amazonaws.com/bucket/file.mp4")
                            .build()))
                .storage(TranscodePayloadStorage.of(Storage1.builder()
                            .type(StorageType.S3)
                            .endpoint("https://gateway.storjshare.io")
                            .bucket("outputbucket")
                            .credentials(StorageCredentials.builder()
                                    .accessKeyId("AKIAIOSFODNN7EXAMPLE")
                                    .secretAccessKey("wJalrXUtnFEMI/K7MDENG/bPxRfiCYEXAMPLEKEY")
                                    .build())
                            .build()))
                .outputs(Outputs.builder()
                        .hls(Hls.builder()
                            .path("/samplevideo/hls")
                            .build())
                        .mp4(Mp4.builder()
                            .path("/samplevideo/mp4")
                            .build())
                        .fmp4(Fmp4.builder()
                            .path("/samplevideo/fmp4")
                            .build())
                        .build())
                .profiles(java.util.List.of(
                    TranscodeProfile.builder()
                        .bitrate(3000000L)
                        .width(1280L)
                        .name("720p")
                        .quality(23L)
                        .fps(30L)
                        .fpsDen(1L)
                        .gop("2")
                        .profile(TranscodeProfileProfile.H264_BASELINE)
                        .encoder(TranscodeProfileEncoder.H264)
                        .build()))
                .build();

            TranscodeVideoResponse res = sdk.transcode().create()
                .request(req)
                .call();

            if (res.task().isPresent()) {
                // handle response
            }
        } catch (studio.livepeer.livepeer.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }
    }
}
```

### Parameters

| Parameter                                                                                              | Type                                                                                                   | Required                                                                                               | Description                                                                                            |
| ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ |
| `request`                                                                                              | [studio.livepeer.livepeer.models.components.TranscodePayload](../../models/shared/TranscodePayload.md) | :heavy_check_mark:                                                                                     | The request object to use for the request.                                                             |


### Response

**[Optional<? extends studio.livepeer.livepeer.models.operations.TranscodeVideoResponse>](../../models/operations/TranscodeVideoResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
