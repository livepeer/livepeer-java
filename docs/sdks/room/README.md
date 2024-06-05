# Room
(*room()*)

## Overview

Operations related to rooms api

### Available Operations

* [~~create~~](#create) - Create a room :warning: **Deprecated**
* [~~get~~](#get) - Retrieve a room :warning: **Deprecated**
* [~~delete~~](#delete) - Delete a room :warning: **Deprecated**
* [~~startEgress~~](#startegress) - Start room RTMP egress :warning: **Deprecated**
* [~~stopEgress~~](#stopegress) - Stop room RTMP egress :warning: **Deprecated**
* [~~createUser~~](#createuser) - Create a room user :warning: **Deprecated**
* [~~getUser~~](#getuser) - Get user details :warning: **Deprecated**
* [~~updateUser~~](#updateuser) - Update a room user :warning: **Deprecated**
* [~~deleteUser~~](#deleteuser) - Remove a user from the room :warning: **Deprecated**

## ~~create~~

Create a multiparticipant livestreaming room.


> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

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

            CreateRoomResponse res = sdk.room().create()
                .call();

            if (res.createRoomResponse().isPresent()) {
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


### Response

**[Optional<? extends studio.livepeer.livepeer.models.operations.CreateRoomResponse>](../../models/operations/CreateRoomResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## ~~get~~

Retrieve a room

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

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

            GetRoomResponse res = sdk.room().get()
                .id("<value>")
                .call();

            if (res.room().isPresent()) {
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

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `id`               | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends studio.livepeer.livepeer.models.operations.GetRoomResponse>](../../models/operations/GetRoomResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## ~~delete~~

Delete a room

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

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

            DeleteRoomResponse res = sdk.room().delete()
                .id("<value>")
                .call();

            // handle response
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

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `id`               | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends studio.livepeer.livepeer.models.operations.DeleteRoomResponse>](../../models/operations/DeleteRoomResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## ~~startEgress~~

Create a livestream for your room.
This allows you to leverage livestreaming features like recording and HLS output.


> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

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

            StartRoomEgressResponse res = sdk.room().startEgress()
                .id("<value>")
                .roomEgressPayload(RoomEgressPayload.builder()
                    .streamId("aac12556-4d65-4d34-9fb6-d1f0985eb0a9")
                    .build())
                .call();

            // handle response
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

| Parameter                                                                                                    | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `id`                                                                                                         | *String*                                                                                                     | :heavy_check_mark:                                                                                           | N/A                                                                                                          |
| `roomEgressPayload`                                                                                          | [studio.livepeer.livepeer.models.components.RoomEgressPayload](../../models/components/RoomEgressPayload.md) | :heavy_check_mark:                                                                                           | N/A                                                                                                          |


### Response

**[Optional<? extends studio.livepeer.livepeer.models.operations.StartRoomEgressResponse>](../../models/operations/StartRoomEgressResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## ~~stopEgress~~

Stop room RTMP egress

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

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

            StopRoomEgressResponse res = sdk.room().stopEgress()
                .id("<value>")
                .call();

            // handle response
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

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `id`               | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends studio.livepeer.livepeer.models.operations.StopRoomEgressResponse>](../../models/operations/StopRoomEgressResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## ~~createUser~~

Call this endpoint to add a user to a room, specifying a display name at a minimum.
The response will contain a joining URL for Livepeer's default meeting app.
Alternatively the joining token can be used with a custom app.


> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

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

            CreateRoomUserResponse res = sdk.room().createUser()
                .id("<value>")
                .roomUserPayload(RoomUserPayload.builder()
                    .name("name")
                    .canPublish(true)
                    .canPublishData(true)
                    .build())
                .call();

            if (res.roomUserResponse().isPresent()) {
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

| Parameter                                                                                                | Type                                                                                                     | Required                                                                                                 | Description                                                                                              |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                     | *String*                                                                                                 | :heavy_check_mark:                                                                                       | N/A                                                                                                      |
| `roomUserPayload`                                                                                        | [studio.livepeer.livepeer.models.components.RoomUserPayload](../../models/components/RoomUserPayload.md) | :heavy_check_mark:                                                                                       | N/A                                                                                                      |


### Response

**[Optional<? extends studio.livepeer.livepeer.models.operations.CreateRoomUserResponse>](../../models/operations/CreateRoomUserResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## ~~getUser~~

Get user details

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

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

            GetRoomUserResponse res = sdk.room().getUser()
                .id("<value>")
                .userId("<value>")
                .call();

            if (res.getRoomUserResponse().isPresent()) {
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

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `id`               | *String*           | :heavy_check_mark: | N/A                |
| `userId`           | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends studio.livepeer.livepeer.models.operations.GetRoomUserResponse>](../../models/operations/GetRoomUserResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## ~~updateUser~~

Update properties for a user.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

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

            UpdateRoomUserResponse res = sdk.room().updateUser()
                .id("<value>")
                .userId("<value>")
                .roomUserUpdatePayload(RoomUserUpdatePayload.builder()
                    .canPublish(true)
                    .canPublishData(true)
                    .build())
                .call();

            // handle response
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

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                 | *String*                                                                                                             | :heavy_check_mark:                                                                                                   | N/A                                                                                                                  |
| `userId`                                                                                                             | *String*                                                                                                             | :heavy_check_mark:                                                                                                   | N/A                                                                                                                  |
| `roomUserUpdatePayload`                                                                                              | [studio.livepeer.livepeer.models.components.RoomUserUpdatePayload](../../models/components/RoomUserUpdatePayload.md) | :heavy_check_mark:                                                                                                   | N/A                                                                                                                  |


### Response

**[Optional<? extends studio.livepeer.livepeer.models.operations.UpdateRoomUserResponse>](../../models/operations/UpdateRoomUserResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## ~~deleteUser~~

Remove a user from the room

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

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

            DeleteRoomUserResponse res = sdk.room().deleteUser()
                .id("<value>")
                .userId("<value>")
                .call();

            // handle response
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

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `id`               | *String*           | :heavy_check_mark: | N/A                |
| `userId`           | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends studio.livepeer.livepeer.models.operations.DeleteRoomUserResponse>](../../models/operations/DeleteRoomUserResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
