# Task
(*task()*)

## Overview

Operations related to tasks api

### Available Operations

* [getAll](#getall) - Retrieve Tasks
* [get](#get) - Retrieve a Task

## getAll

Retrieve Tasks

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import studio.livepeer.livepeer.Livepeer;
import studio.livepeer.livepeer.models.operations.GetTasksResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        Livepeer sdk = Livepeer.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
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

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## get

Retrieve a Task

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import studio.livepeer.livepeer.Livepeer;
import studio.livepeer.livepeer.models.operations.GetTaskResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        Livepeer sdk = Livepeer.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
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

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |