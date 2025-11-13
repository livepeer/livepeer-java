<!-- Start SDK Example Usage [usage] -->
```java
package hello.world;

import java.lang.Exception;
import java.util.List;
import java.util.Map;
import studio.livepeer.livepeer.Livepeer;
import studio.livepeer.livepeer.models.components.*;
import studio.livepeer.livepeer.models.operations.CreateStreamResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        Livepeer sdk = Livepeer.builder()
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        NewStreamPayload req = NewStreamPayload.builder()
                .name("test_stream")
                .pull(Pull.builder()
                    .source("https://myservice.com/live/stream.flv")
                    .headers(Map.ofEntries(
                        Map.entry("Authorization", "Bearer 123")))
                    .location(Location.builder()
                        .lat(39.739)
                        .lon(-104.988)
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
                            .profile("720p")
                            .id("PUSH123")
                            .build()))
                    .build())
                .build();

        CreateStreamResponse res = sdk.stream().create()
                .request(req)
                .call();

        if (res.stream().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->