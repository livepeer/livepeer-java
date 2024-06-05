# Asset
(*asset()*)

## Overview

Operations related to asset/vod api

### Available Operations

* [getAll](#getall) - Retrieve assets
* [create](#create) - Upload an asset
* [createViaUrl](#createviaurl) - Upload asset via URL
* [get](#get) - Retrieves an asset
* [update](#update) - Patch an asset
* [delete](#delete) - Delete an asset

## getAll

Retrieve assets

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
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
import studio.livepeer.livepeer.utils.EventStream;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            Livepeer sdk = Livepeer.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .build();

            GetAssetsResponse res = sdk.asset().getAll()
                .call();

            if (res.data().isPresent()) {
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


### Response

**[Optional<? extends studio.livepeer.livepeer.models.operations.GetAssetsResponse>](../../models/operations/GetAssetsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## create

To upload an asset, your first need to request for a direct upload URL
and only then actually upload the contents of the asset.
\
\
Once you created a upload link, you have 2 options, resumable or direct
upload. For a more reliable experience, you should use resumable uploads
which will work better for users with unreliable or slow network
connections. If you want a simpler implementation though, you should
just use a direct upload.


## Direct Upload
For a direct upload, make a PUT request to the URL received in the url
field of the response above, with the raw video file as the request
body. response above:


## Resumable Upload
Livepeer supports resumable uploads via Tus. This section provides a
simple example of how to use tus-js-client to upload a video file.
\
\
From the previous section, we generated a URL to upload a video file to
Livepeer on POST /api/asset/request-upload. You should use the
tusEndpoint field of the response to upload the video file and track the
progress:

```
# This assumes there is an `input` element of `type="file"` with id
`fileInput` in the HTML


const input = document.getElementById('fileInput');

const file = input.files[0];

const upload = new tus.Upload(file, {
  endpoint: tusEndpoint, // URL from `tusEndpoint` field in the
`/request-upload` response
  metadata: {
    filename,
    filetype: 'video/mp4',
  },
  uploadSize: file.size,
  onError(err) {
    console.error('Error uploading file:', err);
  },
  onProgress(bytesUploaded, bytesTotal) {
    const percentage = ((bytesUploaded / bytesTotal) * 100).toFixed(2);
    console.log('Uploaded ' + percentage + '%');
  },
  onSuccess() {
    console.log('Upload finished:', upload.url);
  },
});

const previousUploads = await upload.findPreviousUploads();

if (previousUploads.length > 0) {
  upload.resumeFromPreviousUpload(previousUploads[0]);
}

upload.start();

```

> Note: If you are using tus from node.js, you need to add a custom URL
storage to enable resuming from previous uploads. On the browser, this
is enabled by default using local storage. In node.js, add urlStorage:
new tus.FileUrlStorage("path/to/tmp/file"), to the UploadFile object
definition above.


### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
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
import studio.livepeer.livepeer.utils.EventStream;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            Livepeer sdk = Livepeer.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .build();

            NewAssetPayload req = NewAssetPayload.builder()
                .name("filename.mp4")
                .staticMp4(true)
                .playbackPolicy(PlaybackPolicy.builder()
                    .type(Type.WEBHOOK)
                    .webhookId("1bde4o2i6xycudoy")
                    .webhookContext(java.util.Map.ofEntries(
                        entry("streamerId", "my-custom-id")))
                    .refreshInterval(600d)
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

            RequestUploadResponse res = sdk.asset().create()
                .request(req)
                .call();

            if (res.data().isPresent()) {
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

| Parameter                                                                                            | Type                                                                                                 | Required                                                                                             | Description                                                                                          |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `request`                                                                                            | [studio.livepeer.livepeer.models.components.NewAssetPayload](../../models/shared/NewAssetPayload.md) | :heavy_check_mark:                                                                                   | The request object to use for the request.                                                           |


### Response

**[Optional<? extends studio.livepeer.livepeer.models.operations.RequestUploadResponse>](../../models/operations/RequestUploadResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## createViaUrl

Upload asset via URL

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
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
import studio.livepeer.livepeer.utils.EventStream;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            Livepeer sdk = Livepeer.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .build();

            NewAssetFromUrlPayload req = NewAssetFromUrlPayload.builder()
                .name("filename.mp4")
                .url("https://s3.amazonaws.com/my-bucket/path/filename.mp4")
                .staticMp4(true)
                .playbackPolicy(PlaybackPolicy.builder()
                    .type(Type.WEBHOOK)
                    .webhookId("1bde4o2i6xycudoy")
                    .webhookContext(java.util.Map.ofEntries(
                        entry("streamerId", "my-custom-id")))
                    .refreshInterval(600d)
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

            UploadAssetResponse res = sdk.asset().createViaUrl()
                .request(req)
                .call();

            if (res.twoHundredApplicationJsonData().isPresent()) {
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

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [studio.livepeer.livepeer.models.components.NewAssetFromUrlPayload](../../models/shared/NewAssetFromUrlPayload.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[Optional<? extends studio.livepeer.livepeer.models.operations.UploadAssetResponse>](../../models/operations/UploadAssetResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## get

Retrieves an asset

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
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
import studio.livepeer.livepeer.utils.EventStream;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            Livepeer sdk = Livepeer.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .build();

            GetAssetResponse res = sdk.asset().get()
                .assetId("<value>")
                .call();

            if (res.asset().isPresent()) {
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

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `assetId`          | *String*           | :heavy_check_mark: | ID of the asset    |


### Response

**[Optional<? extends studio.livepeer.livepeer.models.operations.GetAssetResponse>](../../models/operations/GetAssetResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## update

Patch an asset

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
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
import studio.livepeer.livepeer.utils.EventStream;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            Livepeer sdk = Livepeer.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .build();

            UpdateAssetResponse res = sdk.asset().update()
                .assetId("<value>")
                .assetPatchPayload(AssetPatchPayload.builder()
                    .name("filename.mp4")
                    .playbackPolicy(PlaybackPolicy.builder()
                        .type(Type.WEBHOOK)
                        .webhookId("1bde4o2i6xycudoy")
                        .webhookContext(java.util.Map.ofEntries(
                            entry("streamerId", "my-custom-id")))
                        .refreshInterval(600d)
                        .build())
                    .build())
                .call();

            if (res.asset().isPresent()) {
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

| Parameter                                                                                                    | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `assetId`                                                                                                    | *String*                                                                                                     | :heavy_check_mark:                                                                                           | ID of the asset                                                                                              |
| `assetPatchPayload`                                                                                          | [studio.livepeer.livepeer.models.components.AssetPatchPayload](../../models/components/AssetPatchPayload.md) | :heavy_check_mark:                                                                                           | N/A                                                                                                          |


### Response

**[Optional<? extends studio.livepeer.livepeer.models.operations.UpdateAssetResponse>](../../models/operations/UpdateAssetResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## delete

Delete an asset

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
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
import studio.livepeer.livepeer.utils.EventStream;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            Livepeer sdk = Livepeer.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .build();

            DeleteAssetResponse res = sdk.asset().delete()
                .assetId("<value>")
                .call();

            // handle response
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

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `assetId`          | *String*           | :heavy_check_mark: | ID of the asset    |


### Response

**[Optional<? extends studio.livepeer.livepeer.models.operations.DeleteAssetResponse>](../../models/operations/DeleteAssetResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
