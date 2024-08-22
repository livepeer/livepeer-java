# Stream
(*stream()*)

## Overview

Operations related to livestream api

### Available Operations

* [create](#create) - Create a stream
* [getAll](#getall) - Retrieve streams
* [get](#get) - Retrieve a stream
* [update](#update) - Update a stream
* [delete](#delete) - Delete a stream
* [terminate](#terminate) - Terminates a live stream
* [startPull](#startpull) - Start ingest for a pull stream
* [createClip](#createclip) - Create a clip
* [getClips](#getclips) - Retrieve clips of a livestream
* [addMultistreamTarget](#addmultistreamtarget) - Add a multistream target
* [removeMultistreamTarget](#removemultistreamtarget) - Remove a multistream target

## create

The only parameter you are required to set is the name of your stream,
but we also highly recommend that you define transcoding profiles
parameter that suits your specific broadcasting configuration.
\
\
If you do not define transcoding rendition profiles when creating the
stream, a default set of profiles will be used. These profiles include
240p,  360p, 480p and 720p.
\
\
The playback policy is set to public by default for new streams. It can
also be added upon the creation of a new stream by adding
`"playbackPolicy": {"type": "jwt"}`


### Example Usage

```java
package hello.world;

import java.lang.Exception;
import java.util.List;
import java.util.Map;
import studio.livepeer.livepeer.Livepeer;
import studio.livepeer.livepeer.models.components.FfmpegProfile;
import studio.livepeer.livepeer.models.components.Location;
import studio.livepeer.livepeer.models.components.Multistream;
import studio.livepeer.livepeer.models.components.NewStreamPayload;
import studio.livepeer.livepeer.models.components.NewStreamPayloadRecordingSpec;
import studio.livepeer.livepeer.models.components.PlaybackPolicy;
import studio.livepeer.livepeer.models.components.Profile;
import studio.livepeer.livepeer.models.components.Pull;
import studio.livepeer.livepeer.models.components.Target;
import studio.livepeer.livepeer.models.components.TargetSpec;
import studio.livepeer.livepeer.models.components.TranscodeProfile;
import studio.livepeer.livepeer.models.components.TranscodeProfileEncoder;
import studio.livepeer.livepeer.models.components.TranscodeProfileProfile;
import studio.livepeer.livepeer.models.components.Type;
import studio.livepeer.livepeer.models.errors.SDKError;
import studio.livepeer.livepeer.models.operations.CreateStreamResponse;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            Livepeer sdk = Livepeer.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .build();

            NewStreamPayload req = NewStreamPayload.builder()
                .name("test_stream")
                .pull(Pull.builder()
                    .source("https://myservice.com/live/stream.flv")
                    .headers(Map.ofEntries(
                        Map.entry("Authorization", "Bearer 123")))
                    .location(Location.builder()
                        .lat(39.739d)
                        .lon(-104.988d)
                        .build())
                    .build())
                .playbackPolicy(PlaybackPolicy.builder()
                    .type(Type.WEBHOOK)
                    .webhookId("1bde4o2i6xycudoy")
                    .webhookContext(Map.ofEntries(
                        Map.entry("streamerId", "my-custom-id")))
                    .refreshInterval(600d)
                    .build())
                .profiles(List.of(
                    FfmpegProfile.builder()
                        .width(1280L)
                        .name("720p")
                        .height(720L)
                        .bitrate(3000000L)
                        .fps(30L)
                        .fpsDen(1L)
                        .quality(23L)
                        .gop("2")
                        .profile(Profile.H264_BASELINE)
                        .build()))
                .record(false)
                .recordingSpec(NewStreamPayloadRecordingSpec.builder()
                    .profiles(List.of(
                        TranscodeProfile.builder()
                            .bitrate(3000000L)
                            .width(1280L)
                            .name("720p")
                            .height(720L)
                            .quality(23L)
                            .fps(30L)
                            .fpsDen(1L)
                            .gop("2")
                            .profile(TranscodeProfileProfile.H264_BASELINE)
                            .encoder(TranscodeProfileEncoder.H264)
                            .build()))
                    .build())
                .multistream(Multistream.builder()
                    .targets(List.of(
                        Target.builder()
                            .profile("720p0")
                            .videoOnly(false)
                            .id("PUSH123")
                            .spec(TargetSpec.builder()
                                .url("rtmps://live.my-service.tv/channel/secretKey")
                                .name("My target")
                                .build())
                            .build()))
                    .build())
                .build();

            CreateStreamResponse res = sdk.stream().create()
                .request(req)
                .call();

            if (res.stream().isPresent()) {
                // handle response
            }
        } catch (SDKError e) {
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

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `request`                                                   | [NewStreamPayload](../../models/shared/NewStreamPayload.md) | :heavy_check_mark:                                          | The request object to use for the request.                  |

### Response

**[CreateStreamResponse](../../models/operations/CreateStreamResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## getAll

Retrieve streams

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import studio.livepeer.livepeer.Livepeer;
import studio.livepeer.livepeer.models.errors.SDKError;
import studio.livepeer.livepeer.models.operations.GetStreamsResponse;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            Livepeer sdk = Livepeer.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .build();

            GetStreamsResponse res = sdk.stream().getAll()
                .streamsonly("<value>")
                .call();

            if (res.data().isPresent()) {
                // handle response
            }
        } catch (SDKError e) {
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
| `streamsonly`      | *Optional<String>* | :heavy_minus_sign: | N/A                |

### Response

**[GetStreamsResponse](../../models/operations/GetStreamsResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## get

Retrieve a stream

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import studio.livepeer.livepeer.Livepeer;
import studio.livepeer.livepeer.models.errors.SDKError;
import studio.livepeer.livepeer.models.operations.GetStreamResponse;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            Livepeer sdk = Livepeer.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .build();

            GetStreamResponse res = sdk.stream().get()
                .id("<value>")
                .call();

            if (res.stream().isPresent()) {
                // handle response
            }
        } catch (SDKError e) {
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
| `id`               | *String*           | :heavy_check_mark: | ID of the stream   |

### Response

**[GetStreamResponse](../../models/operations/GetStreamResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## update

Update a stream

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import java.util.List;
import java.util.Map;
import studio.livepeer.livepeer.Livepeer;
import studio.livepeer.livepeer.models.components.FfmpegProfile;
import studio.livepeer.livepeer.models.components.Multistream;
import studio.livepeer.livepeer.models.components.PlaybackPolicy;
import studio.livepeer.livepeer.models.components.Profile;
import studio.livepeer.livepeer.models.components.RecordingSpec;
import studio.livepeer.livepeer.models.components.StreamPatchPayload;
import studio.livepeer.livepeer.models.components.Target;
import studio.livepeer.livepeer.models.components.TargetSpec;
import studio.livepeer.livepeer.models.components.TranscodeProfile;
import studio.livepeer.livepeer.models.components.TranscodeProfileEncoder;
import studio.livepeer.livepeer.models.components.TranscodeProfileProfile;
import studio.livepeer.livepeer.models.components.Type;
import studio.livepeer.livepeer.models.errors.SDKError;
import studio.livepeer.livepeer.models.operations.UpdateStreamResponse;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            Livepeer sdk = Livepeer.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .build();

            UpdateStreamResponse res = sdk.stream().update()
                .id("<value>")
                .streamPatchPayload(StreamPatchPayload.builder()
                    .record(false)
                    .multistream(Multistream.builder()
                        .targets(List.of(
                            Target.builder()
                                .profile("720p0")
                                .videoOnly(false)
                                .id("PUSH123")
                                .spec(TargetSpec.builder()
                                    .url("rtmps://live.my-service.tv/channel/secretKey")
                                    .name("My target")
                                    .build())
                                .build()))
                        .build())
                    .playbackPolicy(PlaybackPolicy.builder()
                        .type(Type.WEBHOOK)
                        .webhookId("1bde4o2i6xycudoy")
                        .webhookContext(Map.ofEntries(
                            Map.entry("streamerId", "my-custom-id")))
                        .refreshInterval(600d)
                        .build())
                    .profiles(List.of(
                        FfmpegProfile.builder()
                            .width(1280L)
                            .name("720p")
                            .height(720L)
                            .bitrate(3000000L)
                            .fps(30L)
                            .fpsDen(1L)
                            .quality(23L)
                            .gop("2")
                            .profile(Profile.H264_BASELINE)
                            .build()))
                    .recordingSpec(RecordingSpec.builder()
                        .profiles(List.of(
                            TranscodeProfile.builder()
                                .bitrate(3000000L)
                                .width(1280L)
                                .name("720p")
                                .height(720L)
                                .quality(23L)
                                .fps(30L)
                                .fpsDen(1L)
                                .gop("2")
                                .profile(TranscodeProfileProfile.H264_BASELINE)
                                .encoder(TranscodeProfileEncoder.H264)
                                .build()))
                        .build())
                    .build())
                .call();

            // handle response
        } catch (SDKError e) {
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

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `id`                                                                | *String*                                                            | :heavy_check_mark:                                                  | ID of the stream                                                    |
| `streamPatchPayload`                                                | [StreamPatchPayload](../../models/components/StreamPatchPayload.md) | :heavy_check_mark:                                                  | N/A                                                                 |

### Response

**[UpdateStreamResponse](../../models/operations/UpdateStreamResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## delete

This will also suspend any active stream sessions, so make sure to wait
until the stream has finished. To explicitly interrupt an active
session, consider instead updating the suspended field in the stream
using the PATCH stream API.


### Example Usage

```java
package hello.world;

import java.lang.Exception;
import studio.livepeer.livepeer.Livepeer;
import studio.livepeer.livepeer.models.errors.SDKError;
import studio.livepeer.livepeer.models.operations.DeleteStreamResponse;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            Livepeer sdk = Livepeer.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .build();

            DeleteStreamResponse res = sdk.stream().delete()
                .id("<value>")
                .call();

            // handle response
        } catch (SDKError e) {
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
| `id`               | *String*           | :heavy_check_mark: | ID of the stream   |

### Response

**[DeleteStreamResponse](../../models/operations/DeleteStreamResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## terminate

`DELETE /stream/{id}/terminate` can be used to terminate an ongoing
session on a live stream. Unlike suspending the stream, it allows the
streamer to restart streaming even immediately, but it will force
terminate the current session and stop the recording.
\
\
A 204 No Content status response indicates the stream was successfully
terminated.


### Example Usage

```java
package hello.world;

import java.lang.Exception;
import studio.livepeer.livepeer.Livepeer;
import studio.livepeer.livepeer.models.errors.SDKError;
import studio.livepeer.livepeer.models.operations.TerminateStreamResponse;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            Livepeer sdk = Livepeer.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .build();

            TerminateStreamResponse res = sdk.stream().terminate()
                .id("<value>")
                .call();

            // handle response
        } catch (SDKError e) {
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
| `id`               | *String*           | :heavy_check_mark: | ID of the stream   |

### Response

**[TerminateStreamResponse](../../models/operations/TerminateStreamResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## startPull

`POST /stream/{id}/start-pull` can be used to start ingest for a stream
configured with a pull source. If the stream has recording configured,
it will also start recording.
\
\
A 204 No Content status response indicates the stream was successfully
started.


### Example Usage

```java
package hello.world;

import java.lang.Exception;
import studio.livepeer.livepeer.Livepeer;
import studio.livepeer.livepeer.models.errors.SDKError;
import studio.livepeer.livepeer.models.operations.StartPullStreamResponse;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            Livepeer sdk = Livepeer.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .build();

            StartPullStreamResponse res = sdk.stream().startPull()
                .id("<value>")
                .call();

            // handle response
        } catch (SDKError e) {
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
| `id`               | *String*           | :heavy_check_mark: | ID of the stream   |

### Response

**[StartPullStreamResponse](../../models/operations/StartPullStreamResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## createClip

Create a clip

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import studio.livepeer.livepeer.Livepeer;
import studio.livepeer.livepeer.models.components.ClipPayload;
import studio.livepeer.livepeer.models.errors.SDKError;
import studio.livepeer.livepeer.models.operations.CreateClipResponse;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            Livepeer sdk = Livepeer.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .build();

            ClipPayload req = ClipPayload.builder()
                .playbackId("eaw4nk06ts2d0mzb")
                .startTime(1587667174725d)
                .endTime(1587667174725d)
                .name("My Clip")
                .sessionId("de7818e7-610a-4057-8f6f-b785dc1e6f88")
                .build();

            CreateClipResponse res = sdk.stream().createClip()
                .request(req)
                .call();

            if (res.data().isPresent()) {
                // handle response
            }
        } catch (SDKError e) {
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

| Parameter                                         | Type                                              | Required                                          | Description                                       |
| ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- |
| `request`                                         | [ClipPayload](../../models/shared/ClipPayload.md) | :heavy_check_mark:                                | The request object to use for the request.        |

### Response

**[CreateClipResponse](../../models/operations/CreateClipResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## getClips

Retrieve clips of a livestream

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import studio.livepeer.livepeer.Livepeer;
import studio.livepeer.livepeer.models.errors.SDKError;
import studio.livepeer.livepeer.models.operations.GetClipsResponse;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            Livepeer sdk = Livepeer.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .build();

            GetClipsResponse res = sdk.stream().getClips()
                .id("<value>")
                .call();

            if (res.data().isPresent()) {
                // handle response
            }
        } catch (SDKError e) {
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

| Parameter                                              | Type                                                   | Required                                               | Description                                            |
| ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ |
| `id`                                                   | *String*                                               | :heavy_check_mark:                                     | ID of the parent stream or playbackId of parent stream |

### Response

**[GetClipsResponse](../../models/operations/GetClipsResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## addMultistreamTarget

Add a multistream target

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import studio.livepeer.livepeer.Livepeer;
import studio.livepeer.livepeer.models.components.TargetAddPayload;
import studio.livepeer.livepeer.models.components.TargetAddPayloadSpec;
import studio.livepeer.livepeer.models.errors.SDKError;
import studio.livepeer.livepeer.models.operations.AddMultistreamTargetResponse;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            Livepeer sdk = Livepeer.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .build();

            AddMultistreamTargetResponse res = sdk.stream().addMultistreamTarget()
                .id("<value>")
                .targetAddPayload(TargetAddPayload.builder()
                    .profile("720p0")
                    .videoOnly(false)
                    .id("PUSH123")
                    .spec(TargetAddPayloadSpec.builder()
                        .url("rtmps://live.my-service.tv/channel/secretKey")
                        .name("My target")
                        .build())
                    .build())
                .call();

            // handle response
        } catch (SDKError e) {
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

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `id`                                                            | *String*                                                        | :heavy_check_mark:                                              | ID of the parent stream                                         |
| `targetAddPayload`                                              | [TargetAddPayload](../../models/components/TargetAddPayload.md) | :heavy_check_mark:                                              | N/A                                                             |

### Response

**[AddMultistreamTargetResponse](../../models/operations/AddMultistreamTargetResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## removeMultistreamTarget

Remove a multistream target

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import studio.livepeer.livepeer.Livepeer;
import studio.livepeer.livepeer.models.errors.SDKError;
import studio.livepeer.livepeer.models.operations.RemoveMultistreamTargetResponse;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            Livepeer sdk = Livepeer.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .build();

            RemoveMultistreamTargetResponse res = sdk.stream().removeMultistreamTarget()
                .id("<value>")
                .targetId("<value>")
                .call();

            // handle response
        } catch (SDKError e) {
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

| Parameter                    | Type                         | Required                     | Description                  |
| ---------------------------- | ---------------------------- | ---------------------------- | ---------------------------- |
| `id`                         | *String*                     | :heavy_check_mark:           | ID of the parent stream      |
| `targetId`                   | *String*                     | :heavy_check_mark:           | ID of the multistream target |

### Response

**[RemoveMultistreamTargetResponse](../../models/operations/RemoveMultistreamTargetResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |
