# Multistream
(*multistream()*)

## Overview

Operations related to multistream api

### Available Operations

* [getAll](#getall) - Retrieve Multistream Targets
* [create](#create) - Create a multistream target
* [get](#get) - Retrieve a multistream target
* [update](#update) - Update Multistream Target
* [delete](#delete) - Delete a multistream target

## getAll

Retrieve Multistream Targets

### Example Usage

<!-- UsageSnippet language="java" operationID="getMultistreamTargets" method="get" path="/multistream/target" -->
```java
package hello.world;

import java.lang.Exception;
import studio.livepeer.livepeer.Livepeer;
import studio.livepeer.livepeer.models.operations.GetMultistreamTargetsResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        Livepeer sdk = Livepeer.builder()
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        GetMultistreamTargetsResponse res = sdk.multistream().getAll()
                .call();

        if (res.data().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[GetMultistreamTargetsResponse](../../models/operations/GetMultistreamTargetsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## create

Create a multistream target

### Example Usage

<!-- UsageSnippet language="java" operationID="createMultistreamTarget" method="post" path="/multistream/target" -->
```java
package hello.world;

import java.lang.Exception;
import studio.livepeer.livepeer.Livepeer;
import studio.livepeer.livepeer.models.components.MultistreamTargetInput;
import studio.livepeer.livepeer.models.operations.CreateMultistreamTargetResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        Livepeer sdk = Livepeer.builder()
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        MultistreamTargetInput req = MultistreamTargetInput.builder()
                .url("rtmps://live.my-service.tv/channel/secretKey")
                .build();

        CreateMultistreamTargetResponse res = sdk.multistream().create()
                .request(req)
                .call();

        if (res.multistreamTarget().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [MultistreamTargetInput](../../models/shared/MultistreamTargetInput.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[CreateMultistreamTargetResponse](../../models/operations/CreateMultistreamTargetResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## get

Retrieve a multistream target

### Example Usage

<!-- UsageSnippet language="java" operationID="getMultistreamTarget" method="get" path="/multistream/target/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import studio.livepeer.livepeer.Livepeer;
import studio.livepeer.livepeer.models.operations.GetMultistreamTargetResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        Livepeer sdk = Livepeer.builder()
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        GetMultistreamTargetResponse res = sdk.multistream().get()
                .id("<id>")
                .call();

        if (res.multistreamTarget().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                    | Type                         | Required                     | Description                  |
| ---------------------------- | ---------------------------- | ---------------------------- | ---------------------------- |
| `id`                         | *String*                     | :heavy_check_mark:           | ID of the multistream target |

### Response

**[GetMultistreamTargetResponse](../../models/operations/GetMultistreamTargetResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## update

Update Multistream Target

### Example Usage

<!-- UsageSnippet language="java" operationID="updateMultistreamTarget" method="patch" path="/multistream/target/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import studio.livepeer.livepeer.Livepeer;
import studio.livepeer.livepeer.models.components.MultistreamTargetInput;
import studio.livepeer.livepeer.models.operations.UpdateMultistreamTargetResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        Livepeer sdk = Livepeer.builder()
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        UpdateMultistreamTargetResponse res = sdk.multistream().update()
                .id("<id>")
                .multistreamTarget(MultistreamTargetInput.builder()
                    .url("rtmps://live.my-service.tv/channel/secretKey")
                    .build())
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `id`                                                                        | *String*                                                                    | :heavy_check_mark:                                                          | ID of the multistream target                                                |
| `multistreamTarget`                                                         | [MultistreamTargetInput](../../models/components/MultistreamTargetInput.md) | :heavy_check_mark:                                                          | N/A                                                                         |

### Response

**[UpdateMultistreamTargetResponse](../../models/operations/UpdateMultistreamTargetResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## delete

Make sure to remove any references to the target on existing
streams before actually deleting it from the API.


### Example Usage

<!-- UsageSnippet language="java" operationID="deleteMultistreamTarget" method="delete" path="/multistream/target/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import studio.livepeer.livepeer.Livepeer;
import studio.livepeer.livepeer.models.operations.DeleteMultistreamTargetResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        Livepeer sdk = Livepeer.builder()
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        DeleteMultistreamTargetResponse res = sdk.multistream().delete()
                .id("<id>")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                    | Type                         | Required                     | Description                  |
| ---------------------------- | ---------------------------- | ---------------------------- | ---------------------------- |
| `id`                         | *String*                     | :heavy_check_mark:           | ID of the multistream target |

### Response

**[DeleteMultistreamTargetResponse](../../models/operations/DeleteMultistreamTargetResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |