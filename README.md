# Livepeer Java SDK

The Livepeer Java SDK provides convenient access to the Livepeer Studio API from
applications written in Java.

## Documentation

For full documentation and examples, please visit [docs.livepeer.org](https://docs.livepeer.org/sdks/javascript/).

<!-- Start SDK Installation [installation] -->
## SDK Installation

### Getting started

JDK 11 or later is required.

The samples below show how a published SDK artifact is used:

Gradle:
```groovy
implementation 'studio.livepeer:livepeer:0.4.0'
```

Maven:
```xml
<dependency>
    <groupId>studio.livepeer</groupId>
    <artifactId>livepeer</artifactId>
    <version>0.4.0</version>
</dependency>
```

### How to build
After cloning the git repository to your file system you can build the SDK artifact from source to the `build` directory by running `./gradlew build` on *nix systems or `gradlew.bat` on Windows systems.

If you wish to build from source and publish the SDK artifact to your local Maven repository (on your filesystem) then use the following command (after cloning the git repo locally):

On *nix:
```bash
./gradlew publishToMavenLocal -Pskip.signing
```
On Windows:
```bash
gradlew.bat publishToMavenLocal -Pskip.signing
```
<!-- End SDK Installation [installation] -->

<!-- Start SDK Example Usage [usage] -->
## SDK Example Usage

### Example

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
<!-- End SDK Example Usage [usage] -->

<!-- Start Available Resources and Operations [operations] -->
## Available Resources and Operations

### [stream()](docs/sdks/stream/README.md)

* [create](docs/sdks/stream/README.md#create) - Create a stream
* [getAll](docs/sdks/stream/README.md#getall) - Retrieve streams
* [get](docs/sdks/stream/README.md#get) - Retrieve a stream
* [update](docs/sdks/stream/README.md#update) - Update a stream
* [delete](docs/sdks/stream/README.md#delete) - Delete a stream
* [terminate](docs/sdks/stream/README.md#terminate) - Terminates a live stream
* [startPull](docs/sdks/stream/README.md#startpull) - Start ingest for a pull stream
* [createClip](docs/sdks/stream/README.md#createclip) - Create a clip
* [getClips](docs/sdks/stream/README.md#getclips) - Retrieve clips of a livestream
* [addMultistreamTarget](docs/sdks/stream/README.md#addmultistreamtarget) - Add a multistream target
* [removeMultistreamTarget](docs/sdks/stream/README.md#removemultistreamtarget) - Remove a multistream target

### [multistream()](docs/sdks/multistream/README.md)

* [getAll](docs/sdks/multistream/README.md#getall) - Retrieve Multistream Targets
* [create](docs/sdks/multistream/README.md#create) - Create a multistream target
* [get](docs/sdks/multistream/README.md#get) - Retrieve a multistream target
* [update](docs/sdks/multistream/README.md#update) - Update Multistream Target
* [delete](docs/sdks/multistream/README.md#delete) - Delete a multistream target

### [webhook()](docs/sdks/webhook/README.md)

* [getAll](docs/sdks/webhook/README.md#getall) - Retrieve a Webhook
* [create](docs/sdks/webhook/README.md#create) - Create a webhook
* [get](docs/sdks/webhook/README.md#get) - Retrieve a webhook
* [update](docs/sdks/webhook/README.md#update) - Update a webhook
* [delete](docs/sdks/webhook/README.md#delete) - Delete a webhook
* [getLogs](docs/sdks/webhook/README.md#getlogs) - Retrieve webhook logs
* [getLog](docs/sdks/webhook/README.md#getlog) - Retrieve a webhook log
* [resendLog](docs/sdks/webhook/README.md#resendlog) - Resend a webhook

### [asset()](docs/sdks/asset/README.md)

* [getAll](docs/sdks/asset/README.md#getall) - Retrieve assets
* [create](docs/sdks/asset/README.md#create) - Upload an asset
* [createViaUrl](docs/sdks/asset/README.md#createviaurl) - Upload asset via URL
* [get](docs/sdks/asset/README.md#get) - Retrieves an asset
* [update](docs/sdks/asset/README.md#update) - Patch an asset
* [delete](docs/sdks/asset/README.md#delete) - Delete an asset

### [session()](docs/sdks/session/README.md)

* [getClips](docs/sdks/session/README.md#getclips) - Retrieve clips of a session
* [getAll](docs/sdks/session/README.md#getall) - Retrieve sessions
* [get](docs/sdks/session/README.md#get) - Retrieve a session
* [getRecorded](docs/sdks/session/README.md#getrecorded) - Retrieve Recorded Sessions

### [room()](docs/sdks/room/README.md)

* [~~create~~](docs/sdks/room/README.md#create) - Create a room :warning: **Deprecated**
* [~~get~~](docs/sdks/room/README.md#get) - Retrieve a room :warning: **Deprecated**
* [~~delete~~](docs/sdks/room/README.md#delete) - Delete a room :warning: **Deprecated**
* [~~startEgress~~](docs/sdks/room/README.md#startegress) - Start room RTMP egress :warning: **Deprecated**
* [~~stopEgress~~](docs/sdks/room/README.md#stopegress) - Stop room RTMP egress :warning: **Deprecated**
* [~~createUser~~](docs/sdks/room/README.md#createuser) - Create a room user :warning: **Deprecated**
* [~~getUser~~](docs/sdks/room/README.md#getuser) - Get user details :warning: **Deprecated**
* [~~updateUser~~](docs/sdks/room/README.md#updateuser) - Update a room user :warning: **Deprecated**
* [~~deleteUser~~](docs/sdks/room/README.md#deleteuser) - Remove a user from the room :warning: **Deprecated**

### [metrics()](docs/sdks/metrics/README.md)

* [getRealtimeViewership](docs/sdks/metrics/README.md#getrealtimeviewership) - Query realtime viewership
* [getViewership](docs/sdks/metrics/README.md#getviewership) - Query viewership metrics
* [getCreatorViewership](docs/sdks/metrics/README.md#getcreatorviewership) - Query creator viewership metrics
* [getPublicViewership](docs/sdks/metrics/README.md#getpublicviewership) - Query public total views metrics
* [getUsage](docs/sdks/metrics/README.md#getusage) - Query usage metrics

### [accessControl()](docs/sdks/accesscontrol/README.md)

* [create](docs/sdks/accesscontrol/README.md#create) - Create a signing key
* [getAll](docs/sdks/accesscontrol/README.md#getall) - Retrieves signing keys
* [delete](docs/sdks/accesscontrol/README.md#delete) - Delete Signing Key
* [get](docs/sdks/accesscontrol/README.md#get) - Retrieves a signing key
* [update](docs/sdks/accesscontrol/README.md#update) - Update a signing key

### [task()](docs/sdks/task/README.md)

* [getAll](docs/sdks/task/README.md#getall) - Retrieve Tasks
* [get](docs/sdks/task/README.md#get) - Retrieve a Task

### [transcode()](docs/sdks/transcode/README.md)

* [create](docs/sdks/transcode/README.md#create) - Transcode a video

### [playback()](docs/sdks/playback/README.md)

* [get](docs/sdks/playback/README.md#get) - Retrieve Playback Info
<!-- End Available Resources and Operations [operations] -->

<!-- Start Error Handling [errors] -->
## Error Handling

Handling errors in this SDK should largely match your expectations.  All operations return a response object or raise an error.  If Error objects are specified in your OpenAPI Spec, the SDK will throw the appropriate Exception type.

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 404                    | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

### Example

```java
package hello.world;

import java.lang.Exception;
import studio.livepeer.livepeer.Livepeer;
import studio.livepeer.livepeer.models.errors.SDKError;
import studio.livepeer.livepeer.models.operations.GetPlaybackInfoResponse;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            Livepeer sdk = Livepeer.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .build();

            GetPlaybackInfoResponse res = sdk.playback().get()
                .id("<value>")
                .call();

            if (res.playbackInfo().isPresent()) {
                // handle response
            }
        } catch (studio.livepeer.livepeer.models.errors.Error e) {
            // handle exception
            throw e;
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
<!-- End Error Handling [errors] -->

<!-- Start Server Selection [server] -->
## Server Selection

### Select Server by Index

You can override the default server globally by passing a server index to the `serverIndex` builder method when initializing the SDK client instance. The selected server will then be used as the default on the operations that use it. This table lists the indexes associated with the available servers:

| # | Server | Variables |
| - | ------ | --------- |
| 0 | `https://livepeer.studio/api` | None |

#### Example

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
                .serverIndex(0)
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


### Override Server URL Per-Client

The default server can also be overridden globally by passing a URL to the `serverURL` builder method when initializing the SDK client instance. For example:
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
                .serverURL("https://livepeer.studio/api")
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
<!-- End Server Selection [server] -->

<!-- Start Authentication [security] -->
## Authentication

### Per-Client Security Schemes

This SDK supports the following security scheme globally:

| Name        | Type        | Scheme      |
| ----------- | ----------- | ----------- |
| `apiKey`    | http        | HTTP Bearer |

To authenticate with the API the `apiKey` parameter must be set when initializing the SDK client instance. For example:
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
<!-- End Authentication [security] -->

<!-- Placeholder for Future Speakeasy SDK Sections -->

# Development

## Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally
looking for the latest version.

## Contributions

While we value open-source contributions to this SDK, this library is generated programmatically.
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release!

### SDK Created by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
