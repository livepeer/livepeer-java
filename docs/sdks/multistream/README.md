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

```java
package hello.world;

import java.lang.Exception;
import studio.livepeer.livepeer.Livepeer;
import studio.livepeer.livepeer.models.errors.SDKError;
import studio.livepeer.livepeer.models.operations.GetMultistreamTargetsResponse;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            Livepeer sdk = Livepeer.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .build();

            GetMultistreamTargetsResponse res = sdk.multistream().getAll()
                .call();

            if (res.data().isPresent()) {
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

### Response

**[GetMultistreamTargetsResponse](../../models/operations/GetMultistreamTargetsResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## create

Create a multistream target

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import studio.livepeer.livepeer.Livepeer;
import studio.livepeer.livepeer.models.components.MultistreamTargetInput;
import studio.livepeer.livepeer.models.errors.SDKError;
import studio.livepeer.livepeer.models.operations.CreateMultistreamTargetResponse;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            Livepeer sdk = Livepeer.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
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

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [MultistreamTargetInput](../../models/shared/MultistreamTargetInput.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[CreateMultistreamTargetResponse](../../models/operations/CreateMultistreamTargetResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## get

Retrieve a multistream target

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import studio.livepeer.livepeer.Livepeer;
import studio.livepeer.livepeer.models.errors.SDKError;
import studio.livepeer.livepeer.models.operations.GetMultistreamTargetResponse;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            Livepeer sdk = Livepeer.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .build();

            GetMultistreamTargetResponse res = sdk.multistream().get()
                .id("<value>")
                .call();

            if (res.multistreamTarget().isPresent()) {
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

### Parameters

| Parameter                    | Type                         | Required                     | Description                  |
| ---------------------------- | ---------------------------- | ---------------------------- | ---------------------------- |
| `id`                         | *String*                     | :heavy_check_mark:           | ID of the multistream target |

### Response

**[GetMultistreamTargetResponse](../../models/operations/GetMultistreamTargetResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## update

Update Multistream Target

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import studio.livepeer.livepeer.Livepeer;
import studio.livepeer.livepeer.models.components.MultistreamTargetPatchPayload;
import studio.livepeer.livepeer.models.errors.SDKError;
import studio.livepeer.livepeer.models.operations.UpdateMultistreamTargetResponse;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            Livepeer sdk = Livepeer.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .build();

            UpdateMultistreamTargetResponse res = sdk.multistream().update()
                .id("<value>")
                .multistreamTargetPatchPayload(MultistreamTargetPatchPayload.builder()
                    .url("rtmps://live.my-service.tv/channel/secretKey")
                    .build())
                .call();

            // handle response
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

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `id`                                                                                      | *String*                                                                                  | :heavy_check_mark:                                                                        | ID of the multistream target                                                              |
| `multistreamTargetPatchPayload`                                                           | [MultistreamTargetPatchPayload](../../models/components/MultistreamTargetPatchPayload.md) | :heavy_check_mark:                                                                        | N/A                                                                                       |

### Response

**[UpdateMultistreamTargetResponse](../../models/operations/UpdateMultistreamTargetResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## delete

Make sure to remove any references to the target on existing
streams before actually deleting it from the API.


### Example Usage

```java
package hello.world;

import java.lang.Exception;
import studio.livepeer.livepeer.Livepeer;
import studio.livepeer.livepeer.models.errors.SDKError;
import studio.livepeer.livepeer.models.operations.DeleteMultistreamTargetResponse;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            Livepeer sdk = Livepeer.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .build();

            DeleteMultistreamTargetResponse res = sdk.multistream().delete()
                .id("<value>")
                .call();

            // handle response
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

### Parameters

| Parameter                    | Type                         | Required                     | Description                  |
| ---------------------------- | ---------------------------- | ---------------------------- | ---------------------------- |
| `id`                         | *String*                     | :heavy_check_mark:           | ID of the multistream target |

### Response

**[DeleteMultistreamTargetResponse](../../models/operations/DeleteMultistreamTargetResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |
