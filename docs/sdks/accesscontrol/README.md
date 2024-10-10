# AccessControl
(*accessControl()*)

## Overview

Operations related to access control/signing keys api

### Available Operations

* [create](#create) - Create a signing key
* [getAll](#getall) - Retrieves signing keys
* [delete](#delete) - Delete Signing Key
* [get](#get) - Retrieves a signing key
* [update](#update) - Update a signing key

## create

The publicKey is a representation of the public key, encoded as base 64 and is passed as a string, and  the privateKey is displayed only on creation. This is the only moment where the client can save the private key, otherwise it will be lost. Remember to decode your string when signing JWTs.
Up to 10 signing keys can be generated, after that you must delete at least one signing key to create a new one.


### Example Usage

```java
package hello.world;

import java.lang.Exception;
import studio.livepeer.livepeer.Livepeer;
import studio.livepeer.livepeer.models.operations.CreateSigningKeyResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        Livepeer sdk = Livepeer.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        CreateSigningKeyResponse res = sdk.accessControl().create()
                .call();

        if (res.signingKey().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[CreateSigningKeyResponse](../../models/operations/CreateSigningKeyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAll

Retrieves signing keys

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import studio.livepeer.livepeer.Livepeer;
import studio.livepeer.livepeer.models.operations.GetSigningKeysResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        Livepeer sdk = Livepeer.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        GetSigningKeysResponse res = sdk.accessControl().getAll()
                .call();

        if (res.data().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[GetSigningKeysResponse](../../models/operations/GetSigningKeysResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## delete

Delete Signing Key

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import studio.livepeer.livepeer.Livepeer;
import studio.livepeer.livepeer.models.operations.DeleteSigningKeyResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        Livepeer sdk = Livepeer.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        DeleteSigningKeyResponse res = sdk.accessControl().delete()
                .keyId("<id>")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter             | Type                  | Required              | Description           |
| --------------------- | --------------------- | --------------------- | --------------------- |
| `keyId`               | *String*              | :heavy_check_mark:    | ID of the signing key |

### Response

**[DeleteSigningKeyResponse](../../models/operations/DeleteSigningKeyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## get

Retrieves a signing key

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import studio.livepeer.livepeer.Livepeer;
import studio.livepeer.livepeer.models.operations.GetSigningKeyResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        Livepeer sdk = Livepeer.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        GetSigningKeyResponse res = sdk.accessControl().get()
                .keyId("<id>")
                .call();

        if (res.signingKey().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter             | Type                  | Required              | Description           |
| --------------------- | --------------------- | --------------------- | --------------------- |
| `keyId`               | *String*              | :heavy_check_mark:    | ID of the signing key |

### Response

**[GetSigningKeyResponse](../../models/operations/GetSigningKeyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## update

Update a signing key

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import studio.livepeer.livepeer.Livepeer;
import studio.livepeer.livepeer.models.operations.UpdateSigningKeyRequestBody;
import studio.livepeer.livepeer.models.operations.UpdateSigningKeyResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        Livepeer sdk = Livepeer.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        UpdateSigningKeyResponse res = sdk.accessControl().update()
                .keyId("<id>")
                .requestBody(UpdateSigningKeyRequestBody.builder()
                    .build())
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `keyId`                                                                               | *String*                                                                              | :heavy_check_mark:                                                                    | ID of the signing key                                                                 |
| `requestBody`                                                                         | [UpdateSigningKeyRequestBody](../../models/operations/UpdateSigningKeyRequestBody.md) | :heavy_check_mark:                                                                    | N/A                                                                                   |

### Response

**[UpdateSigningKeyResponse](../../models/operations/UpdateSigningKeyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |