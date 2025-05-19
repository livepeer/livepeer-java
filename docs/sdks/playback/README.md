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

import java.lang.Exception;
import studio.livepeer.livepeer.Livepeer;
import studio.livepeer.livepeer.models.errors.Error;
import studio.livepeer.livepeer.models.operations.GetPlaybackInfoResponse;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        Livepeer sdk = Livepeer.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        GetPlaybackInfoResponse res = sdk.playback().get()
                .id("<id>")
                .call();

        if (res.playbackInfo().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                              | Type                                                                   | Required                                                               | Description                                                            |
| ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| `id`                                                                   | *String*                                                               | :heavy_check_mark:                                                     | The playback ID from the asset or livestream, e.g. `eaw4nk06ts2d0mzb`. |

### Response

**[GetPlaybackInfoResponse](../../models/operations/GetPlaybackInfoResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 404                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |