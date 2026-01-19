# Task

## Overview

Operations related to tasks api

### Available Operations

* [getAll](#getall) - Retrieve Tasks
* [get](#get) - Retrieve a Task

## getAll

Retrieve Tasks

### Example Usage

<!-- UsageSnippet language="java" operationID="getTasks" method="get" path="/task" -->
```java
package hello.world;

import java.lang.Exception;
import studio.livepeer.livepeer.Livepeer;
import studio.livepeer.livepeer.models.operations.GetTasksResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        Livepeer sdk = Livepeer.builder()
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        GetTasksResponse res = sdk.task().getAll()
                .call();

        if (res.data().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[GetTasksResponse](../../models/operations/GetTasksResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/SDKException | 4XX, 5XX                   | \*/\*                      |

## get

Retrieve a Task

### Example Usage

<!-- UsageSnippet language="java" operationID="getTask" method="get" path="/task/{taskId}" -->
```java
package hello.world;

import java.lang.Exception;
import studio.livepeer.livepeer.Livepeer;
import studio.livepeer.livepeer.models.operations.GetTaskResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        Livepeer sdk = Livepeer.builder()
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        GetTaskResponse res = sdk.task().get()
                .taskId("<id>")
                .call();

        if (res.task().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `taskId`           | *String*           | :heavy_check_mark: | ID of the task     |

### Response

**[GetTaskResponse](../../models/operations/GetTaskResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/SDKException | 4XX, 5XX                   | \*/\*                      |