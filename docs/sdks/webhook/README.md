# Webhook
(*webhook()*)

## Overview

Operations related to webhook api

### Available Operations

* [getAll](#getall) - Retrieve a Webhook
* [create](#create) - Create a webhook
* [get](#get) - Retrieve a webhook
* [update](#update) - Update a webhook
* [delete](#delete) - Delete a webhook
* [getLogs](#getlogs) - Retrieve webhook logs
* [getLog](#getlog) - Retrieve a webhook log
* [resendLog](#resendlog) - Resend a webhook

## getAll

Retrieve a Webhook

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import studio.livepeer.livepeer.Livepeer;
import studio.livepeer.livepeer.models.errors.SDKError;
import studio.livepeer.livepeer.models.operations.GetWebhooksResponse;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            Livepeer sdk = Livepeer.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .build();

            GetWebhooksResponse res = sdk.webhook().getAll()
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

**[GetWebhooksResponse](../../models/operations/GetWebhooksResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## create

To create a new webhook, you need to make an API call with the events you want to listen for and the URL that will be called when those events occur.


### Example Usage

```java
package hello.world;

import java.lang.Exception;
import java.util.List;
import studio.livepeer.livepeer.Livepeer;
import studio.livepeer.livepeer.models.components.Events;
import studio.livepeer.livepeer.models.components.WebhookInput;
import studio.livepeer.livepeer.models.errors.SDKError;
import studio.livepeer.livepeer.models.operations.CreateWebhookResponse;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            Livepeer sdk = Livepeer.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .build();

            WebhookInput req = WebhookInput.builder()
                .name("test_webhook")
                .url("https://my-service.com/webhook")
                .projectId("aac12556-4d65-4d34-9fb6-d1f0985eb0a9")
                .events(List.of(
                    Events.STREAM_STARTED,
                    Events.STREAM_IDLE))
                .sharedSecret("my-secret")
                .streamId("de7818e7-610a-4057-8f6f-b785dc1e6f88")
                .build();

            CreateWebhookResponse res = sdk.webhook().create()
                .request(req)
                .call();

            if (res.webhook().isPresent()) {
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

| Parameter                                           | Type                                                | Required                                            | Description                                         |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `request`                                           | [WebhookInput](../../models/shared/WebhookInput.md) | :heavy_check_mark:                                  | The request object to use for the request.          |

### Response

**[CreateWebhookResponse](../../models/operations/CreateWebhookResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## get

Retrieve a webhook

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import studio.livepeer.livepeer.Livepeer;
import studio.livepeer.livepeer.models.errors.SDKError;
import studio.livepeer.livepeer.models.operations.GetWebhookResponse;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            Livepeer sdk = Livepeer.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .build();

            GetWebhookResponse res = sdk.webhook().get()
                .id("<value>")
                .call();

            if (res.webhook().isPresent()) {
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

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `id`               | *String*           | :heavy_check_mark: | N/A                |

### Response

**[GetWebhookResponse](../../models/operations/GetWebhookResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## update

Update a webhook

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import java.util.List;
import studio.livepeer.livepeer.Livepeer;
import studio.livepeer.livepeer.models.components.Events;
import studio.livepeer.livepeer.models.components.WebhookInput;
import studio.livepeer.livepeer.models.errors.SDKError;
import studio.livepeer.livepeer.models.operations.UpdateWebhookResponse;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            Livepeer sdk = Livepeer.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .build();

            UpdateWebhookResponse res = sdk.webhook().update()
                .id("<value>")
                .webhook(WebhookInput.builder()
                    .name("test_webhook")
                    .url("https://my-service.com/webhook")
                    .projectId("aac12556-4d65-4d34-9fb6-d1f0985eb0a9")
                    .events(List.of(
                        Events.STREAM_STARTED,
                        Events.STREAM_IDLE))
                    .sharedSecret("my-secret")
                    .streamId("de7818e7-610a-4057-8f6f-b785dc1e6f88")
                    .build())
                .call();

            if (res.webhook().isPresent()) {
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

| Parameter                                               | Type                                                    | Required                                                | Description                                             |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `id`                                                    | *String*                                                | :heavy_check_mark:                                      | N/A                                                     |
| `webhook`                                               | [WebhookInput](../../models/components/WebhookInput.md) | :heavy_check_mark:                                      | N/A                                                     |

### Response

**[UpdateWebhookResponse](../../models/operations/UpdateWebhookResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## delete

Delete a webhook

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import studio.livepeer.livepeer.Livepeer;
import studio.livepeer.livepeer.models.errors.SDKError;
import studio.livepeer.livepeer.models.operations.DeleteWebhookResponse;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            Livepeer sdk = Livepeer.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .build();

            DeleteWebhookResponse res = sdk.webhook().delete()
                .id("<value>")
                .call();

            if (res.webhook().isPresent()) {
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

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `id`               | *String*           | :heavy_check_mark: | N/A                |

### Response

**[DeleteWebhookResponse](../../models/operations/DeleteWebhookResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## getLogs

Retrieve webhook logs

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import studio.livepeer.livepeer.Livepeer;
import studio.livepeer.livepeer.models.errors.SDKError;
import studio.livepeer.livepeer.models.operations.GetWebhookLogsResponse;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            Livepeer sdk = Livepeer.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .build();

            GetWebhookLogsResponse res = sdk.webhook().getLogs()
                .id("<value>")
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

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `id`               | *String*           | :heavy_check_mark: | N/A                |

### Response

**[GetWebhookLogsResponse](../../models/operations/GetWebhookLogsResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## getLog

Retrieve a webhook log

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import studio.livepeer.livepeer.Livepeer;
import studio.livepeer.livepeer.models.errors.SDKError;
import studio.livepeer.livepeer.models.operations.GetWebhookLogResponse;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            Livepeer sdk = Livepeer.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .build();

            GetWebhookLogResponse res = sdk.webhook().getLog()
                .id("<value>")
                .logId("<value>")
                .call();

            if (res.webhookLog().isPresent()) {
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

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `id`               | *String*           | :heavy_check_mark: | N/A                |
| `logId`            | *String*           | :heavy_check_mark: | N/A                |

### Response

**[GetWebhookLogResponse](../../models/operations/GetWebhookLogResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## resendLog

Use this API to resend the same webhook request. This is useful when
developing and debugging, allowing you to easily repeat the same webhook
to check or fix the behaviour in your handler.


### Example Usage

```java
package hello.world;

import java.lang.Exception;
import studio.livepeer.livepeer.Livepeer;
import studio.livepeer.livepeer.models.errors.SDKError;
import studio.livepeer.livepeer.models.operations.ResendWebhookResponse;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            Livepeer sdk = Livepeer.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .build();

            ResendWebhookResponse res = sdk.webhook().resendLog()
                .id("<value>")
                .logId("<value>")
                .call();

            if (res.webhookLog().isPresent()) {
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

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `id`               | *String*           | :heavy_check_mark: | N/A                |
| `logId`            | *String*           | :heavy_check_mark: | N/A                |

### Response

**[ResendWebhookResponse](../../models/operations/ResendWebhookResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |
