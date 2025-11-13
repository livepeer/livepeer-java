# Metrics
(*metrics()*)

## Overview

Operations related to metrics api

### Available Operations

* [getRealtimeViewership](#getrealtimeviewership) - Query realtime viewership
* [getViewership](#getviewership) - Query viewership metrics
* [getCreatorViewership](#getcreatorviewership) - Query creator viewership metrics
* [getPublicViewership](#getpublicviewership) - Query public total views metrics
* [getUsage](#getusage) - Query usage metrics

## getRealtimeViewership

Requires a private (non-CORS) API key to be used.


### Example Usage

<!-- UsageSnippet language="java" operationID="getRealtimeViewershipNow" method="get" path="/data/views/now" -->
```java
package hello.world;

import java.lang.Exception;
import studio.livepeer.livepeer.Livepeer;
import studio.livepeer.livepeer.models.operations.GetRealtimeViewershipNowResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        Livepeer sdk = Livepeer.builder()
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        GetRealtimeViewershipNowResponse res = sdk.metrics().getRealtimeViewership()
                .call();

        if (res.data().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                             | Type                                                                                                                                                  | Required                                                                                                                                              | Description                                                                                                                                           |
| ----------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------- |
| `playbackId`                                                                                                                                          | *Optional\<String>*                                                                                                                                   | :heavy_minus_sign:                                                                                                                                    | The playback ID to filter the query results. This can be a canonical<br/>playback ID from Livepeer assets or streams, or dStorage identifiers<br/>for assets<br/> |
| `creatorId`                                                                                                                                           | *Optional\<String>*                                                                                                                                   | :heavy_minus_sign:                                                                                                                                    | The creator ID to filter the query results                                                                                                            |
| `breakdownBy`                                                                                                                                         | List\<[BreakdownBy](../../models/operations/BreakdownBy.md)>                                                                                          | :heavy_minus_sign:                                                                                                                                    | The list of fields to break down the query results. Specify this<br/>query-string multiple times to break down by multiple fields.<br/>               |

### Response

**[GetRealtimeViewershipNowResponse](../../models/operations/GetRealtimeViewershipNowResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/SDKException | 4XX, 5XX                   | \*/\*                      |

## getViewership

Requires a private (non-CORS) API key to be used.


### Example Usage

<!-- UsageSnippet language="java" operationID="getViewershipMetrics" method="get" path="/data/views/query" -->
```java
package hello.world;

import java.lang.Exception;
import studio.livepeer.livepeer.Livepeer;
import studio.livepeer.livepeer.models.operations.GetViewershipMetricsResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        Livepeer sdk = Livepeer.builder()
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        GetViewershipMetricsResponse res = sdk.metrics().getViewership()
                .call();

        if (res.data().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetViewershipMetricsRequest](../../models/operations/GetViewershipMetricsRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetViewershipMetricsResponse](../../models/operations/GetViewershipMetricsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/SDKException | 4XX, 5XX                   | \*/\*                      |

## getCreatorViewership

Requires a proof of ownership to be sent in the request, which for now is just the assetId or streamId parameters (1 of those must be in the query-string).


### Example Usage

<!-- UsageSnippet language="java" operationID="getCreatorViewershipMetrics" method="get" path="/data/views/query/creator" -->
```java
package hello.world;

import java.lang.Exception;
import studio.livepeer.livepeer.Livepeer;
import studio.livepeer.livepeer.models.operations.GetCreatorViewershipMetricsResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        Livepeer sdk = Livepeer.builder()
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        GetCreatorViewershipMetricsResponse res = sdk.metrics().getCreatorViewership()
                .call();

        if (res.data().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [GetCreatorViewershipMetricsRequest](../../models/operations/GetCreatorViewershipMetricsRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[GetCreatorViewershipMetricsResponse](../../models/operations/GetCreatorViewershipMetricsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/SDKException | 4XX, 5XX                   | \*/\*                      |

## getPublicViewership

Allows querying for the public metrics for viewership about a video.
This can be called from the frontend with a CORS key, or even
unauthenticated.


### Example Usage

<!-- UsageSnippet language="java" operationID="getPublicViewershipMetrics" method="get" path="/data/views/query/total/{playbackId}" -->
```java
package hello.world;

import java.lang.Exception;
import studio.livepeer.livepeer.Livepeer;
import studio.livepeer.livepeer.models.operations.GetPublicViewershipMetricsResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        Livepeer sdk = Livepeer.builder()
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        GetPublicViewershipMetricsResponse res = sdk.metrics().getPublicViewership()
                .playbackId("<id>")
                .call();

        if (res.data().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                             | Type                                                                                                                                                  | Required                                                                                                                                              | Description                                                                                                                                           |
| ----------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------- |
| `playbackId`                                                                                                                                          | *String*                                                                                                                                              | :heavy_check_mark:                                                                                                                                    | The playback ID to filter the query results. This can be a canonical<br/>playback ID from Livepeer assets or streams, or dStorage identifiers<br/>for assets<br/> |

### Response

**[GetPublicViewershipMetricsResponse](../../models/operations/GetPublicViewershipMetricsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/SDKException | 4XX, 5XX                   | \*/\*                      |

## getUsage

Query usage metrics

### Example Usage

<!-- UsageSnippet language="java" operationID="getUsageMetrics" method="get" path="/data/usage/query" -->
```java
package hello.world;

import java.lang.Exception;
import studio.livepeer.livepeer.Livepeer;
import studio.livepeer.livepeer.models.operations.GetUsageMetricsResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        Livepeer sdk = Livepeer.builder()
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        GetUsageMetricsResponse res = sdk.metrics().getUsage()
                .call();

        if (res.usageMetric().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetUsageMetricsRequest](../../models/operations/GetUsageMetricsRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetUsageMetricsResponse](../../models/operations/GetUsageMetricsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/SDKException | 4XX, 5XX                   | \*/\*                      |