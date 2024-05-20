# Metrics
(*metrics()*)

## Overview

Operations related to metrics api

### Available Operations

* [getViewership](#getviewership) - Query viewership metrics
* [getCreatorViewership](#getcreatorviewership) - Query creator viewership metrics
* [getPublicViewership](#getpublicviewership) - Query public total views metrics
* [getUsage](#getusage) - Query usage metrics

## getViewership

Requires a private (non-CORS) API key to be used.


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

            GetViewershipMetricsRequest req = GetViewershipMetricsRequest.builder()
                .build();

            GetViewershipMetricsResponse res = sdk.metrics().getViewership()
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

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                        | [studio.livepeer.livepeer.models.operations.GetViewershipMetricsRequest](../../models/operations/GetViewershipMetricsRequest.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


### Response

**[Optional<? extends studio.livepeer.livepeer.models.operations.GetViewershipMetricsResponse>](../../models/operations/GetViewershipMetricsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getCreatorViewership

Requires a proof of ownership to be sent in the request, which for now is just the assetId or streamId parameters (1 of those must be in the query-string).


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

            GetCreatorViewershipMetricsRequest req = GetCreatorViewershipMetricsRequest.builder()
                .build();

            GetCreatorViewershipMetricsResponse res = sdk.metrics().getCreatorViewership()
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

| Parameter                                                                                                                                      | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                      | [studio.livepeer.livepeer.models.operations.GetCreatorViewershipMetricsRequest](../../models/operations/GetCreatorViewershipMetricsRequest.md) | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |


### Response

**[Optional<? extends studio.livepeer.livepeer.models.operations.GetCreatorViewershipMetricsResponse>](../../models/operations/GetCreatorViewershipMetricsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getPublicViewership

Allows querying for the public metrics for viewership about a video.
This can be called from the frontend with a CORS key, or even
unauthenticated.


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

            GetPublicViewershipMetricsResponse res = sdk.metrics().getPublicViewership()
                .playbackId("<value>")
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

| Parameter                                                                                                                                             | Type                                                                                                                                                  | Required                                                                                                                                              | Description                                                                                                                                           |
| ----------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------- |
| `playbackId`                                                                                                                                          | *String*                                                                                                                                              | :heavy_check_mark:                                                                                                                                    | The playback ID to filter the query results. This can be a canonical<br/>playback ID from Livepeer assets or streams, or dStorage identifiers<br/>for assets<br/> |


### Response

**[Optional<? extends studio.livepeer.livepeer.models.operations.GetPublicViewershipMetricsResponse>](../../models/operations/GetPublicViewershipMetricsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getUsage

Query usage metrics

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

            GetUsageMetricsRequest req = GetUsageMetricsRequest.builder()
                .build();

            GetUsageMetricsResponse res = sdk.metrics().getUsage()
                .request(req)
                .call();

            if (res.usageMetric().isPresent()) {
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

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                              | [studio.livepeer.livepeer.models.operations.GetUsageMetricsRequest](../../models/operations/GetUsageMetricsRequest.md) | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |


### Response

**[Optional<? extends studio.livepeer.livepeer.models.operations.GetUsageMetricsResponse>](../../models/operations/GetUsageMetricsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
