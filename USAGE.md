<!-- Start SDK Example Usage [usage] -->
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