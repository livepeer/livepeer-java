# Playback
(*playback()*)

## Overview

Operations related to playback api

### Available Operations

* [get](#get) - Retrieve Playback Info

## get

Retrieve Playback Info

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

            GetPlaybackInfoResponse res = sdk.playback().get()
                .id("<value>")
                .call();

            if (res.playbackInfo().isPresent()) {
                // handle response
            }
        } catch (studio.livepeer.livepeer.models.errors.Error e) {
            // handle exception
            throw e;
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

| Parameter                                                              | Type                                                                   | Required                                                               | Description                                                            |
| ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| `id`                                                                   | *String*                                                               | :heavy_check_mark:                                                     | The playback ID from the asset or livestream, e.g. `eaw4nk06ts2d0mzb`. |


### Response

**[Optional<? extends studio.livepeer.livepeer.models.operations.GetPlaybackInfoResponse>](../../models/operations/GetPlaybackInfoResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 404                    | application/json       |
| models/errors/SDKError | 4xx-5xx                | */*                    |
