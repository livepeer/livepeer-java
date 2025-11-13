# Session
(*session()*)

## Overview

Operations related to session api

### Available Operations

* [getClips](#getclips) - Retrieve clips of a session
* [getAll](#getall) - Retrieve sessions
* [get](#get) - Retrieve a session
* [getRecorded](#getrecorded) - Retrieve Recorded Sessions

## getClips

Retrieve clips of a session

### Example Usage

<!-- UsageSnippet language="java" operationID="getSessionClips" method="get" path="/session/{id}/clips" -->
```java
package hello.world;

import java.lang.Exception;
import studio.livepeer.livepeer.Livepeer;
import studio.livepeer.livepeer.models.operations.GetSessionClipsResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        Livepeer sdk = Livepeer.builder()
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        GetSessionClipsResponse res = sdk.session().getClips()
                .id("<id>")
                .call();

        if (res.data().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                | Type                     | Required                 | Description              |
| ------------------------ | ------------------------ | ------------------------ | ------------------------ |
| `id`                     | *String*                 | :heavy_check_mark:       | ID of the parent session |

### Response

**[GetSessionClipsResponse](../../models/operations/GetSessionClipsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/SDKException | 4XX, 5XX                   | \*/\*                      |

## getAll

Retrieve sessions

### Example Usage

<!-- UsageSnippet language="java" operationID="getSessions" method="get" path="/session" -->
```java
package hello.world;

import java.lang.Exception;
import studio.livepeer.livepeer.Livepeer;
import studio.livepeer.livepeer.models.operations.GetSessionsResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        Livepeer sdk = Livepeer.builder()
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        GetSessionsResponse res = sdk.session().getAll()
                .call();

        if (res.data().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[GetSessionsResponse](../../models/operations/GetSessionsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/SDKException | 4XX, 5XX                   | \*/\*                      |

## get

Retrieve a session

### Example Usage

<!-- UsageSnippet language="java" operationID="getSession" method="get" path="/session/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import studio.livepeer.livepeer.Livepeer;
import studio.livepeer.livepeer.models.operations.GetSessionResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        Livepeer sdk = Livepeer.builder()
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        GetSessionResponse res = sdk.session().get()
                .id("<id>")
                .call();

        if (res.session().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `id`               | *String*           | :heavy_check_mark: | ID of the session  |

### Response

**[GetSessionResponse](../../models/operations/GetSessionResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/SDKException | 4XX, 5XX                   | \*/\*                      |

## getRecorded

Retrieve Recorded Sessions

### Example Usage

<!-- UsageSnippet language="java" operationID="getRecordedSessions" method="get" path="/stream/{parentId}/sessions" -->
```java
package hello.world;

import java.lang.Exception;
import studio.livepeer.livepeer.Livepeer;
import studio.livepeer.livepeer.models.operations.GetRecordedSessionsResponse;
import studio.livepeer.livepeer.models.operations.Record;

public class Application {

    public static void main(String[] args) throws Exception {

        Livepeer sdk = Livepeer.builder()
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        GetRecordedSessionsResponse res = sdk.session().getRecorded()
                .parentId("<id>")
                .record(Record.of(true))
                .call();

        if (res.data().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                              | Type                                                                   | Required                                                               | Description                                                            | Example                                                                |
| ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| `parentId`                                                             | *String*                                                               | :heavy_check_mark:                                                     | ID of the parent stream                                                |                                                                        |
| `record`                                                               | [Optional\<Record>](../../models/operations/Record.md)                 | :heavy_minus_sign:                                                     | Flag indicating if the response should only include recorded<br/>sessions<br/> | true                                                                   |

### Response

**[GetRecordedSessionsResponse](../../models/operations/GetRecordedSessionsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/SDKException | 4XX, 5XX                   | \*/\*                      |