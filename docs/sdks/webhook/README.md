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

<!-- UsageSnippet language="java" operationID="getWebhooks" method="get" path="/webhook" -->
```java
package hello.world;

import java.lang.Exception;
import studio.livepeer.livepeer.Livepeer;
import studio.livepeer.livepeer.models.operations.GetWebhooksResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        Livepeer sdk = Livepeer.builder()
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        GetWebhooksResponse res = sdk.webhook().getAll()
                .call();

        if (res.data().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[GetWebhooksResponse](../../models/operations/GetWebhooksResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/SDKException | 4XX, 5XX                   | \*/\*                      |

## create

To create a new webhook, you need to make an API call with the events you want to listen for and the URL that will be called when those events occur.


### Example Usage

<!-- UsageSnippet language="java" operationID="createWebhook" method="post" path="/webhook" -->
```java
package hello.world;

import java.lang.Exception;
import java.util.List;
import studio.livepeer.livepeer.Livepeer;
import studio.livepeer.livepeer.models.components.Events;
import studio.livepeer.livepeer.models.components.WebhookInput;
import studio.livepeer.livepeer.models.operations.CreateWebhookResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        Livepeer sdk = Livepeer.builder()
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
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

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/SDKException | 4XX, 5XX                   | \*/\*                      |

## get

Retrieve a webhook

### Example Usage

<!-- UsageSnippet language="java" operationID="getWebhook" method="get" path="/webhook/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import studio.livepeer.livepeer.Livepeer;
import studio.livepeer.livepeer.models.operations.GetWebhookResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        Livepeer sdk = Livepeer.builder()
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        GetWebhookResponse res = sdk.webhook().get()
                .id("<id>")
                .call();

        if (res.webhook().isPresent()) {
            // handle response
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

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/SDKException | 4XX, 5XX                   | \*/\*                      |

## update

Update a webhook

### Example Usage

<!-- UsageSnippet language="java" operationID="updateWebhook" method="put" path="/webhook/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import java.util.List;
import studio.livepeer.livepeer.Livepeer;
import studio.livepeer.livepeer.models.components.Events;
import studio.livepeer.livepeer.models.components.WebhookInput;
import studio.livepeer.livepeer.models.operations.UpdateWebhookResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        Livepeer sdk = Livepeer.builder()
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        UpdateWebhookResponse res = sdk.webhook().update()
                .id("<id>")
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

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/SDKException | 4XX, 5XX                   | \*/\*                      |

## delete

Delete a webhook

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteWebhook" method="delete" path="/webhook/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import studio.livepeer.livepeer.Livepeer;
import studio.livepeer.livepeer.models.operations.DeleteWebhookResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        Livepeer sdk = Livepeer.builder()
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        DeleteWebhookResponse res = sdk.webhook().delete()
                .id("<id>")
                .call();

        if (res.webhook().isPresent()) {
            // handle response
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

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/SDKException | 4XX, 5XX                   | \*/\*                      |

## getLogs

Retrieve webhook logs

### Example Usage

<!-- UsageSnippet language="java" operationID="getWebhookLogs" method="get" path="/webhook/{id}/log" -->
```java
package hello.world;

import java.lang.Exception;
import studio.livepeer.livepeer.Livepeer;
import studio.livepeer.livepeer.models.operations.GetWebhookLogsResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        Livepeer sdk = Livepeer.builder()
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        GetWebhookLogsResponse res = sdk.webhook().getLogs()
                .id("<id>")
                .call();

        if (res.data().isPresent()) {
            // handle response
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

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/SDKException | 4XX, 5XX                   | \*/\*                      |

## getLog

Retrieve a webhook log

### Example Usage

<!-- UsageSnippet language="java" operationID="getWebhookLog" method="get" path="/webhook/{id}/log/{logId}" -->
```java
package hello.world;

import java.lang.Exception;
import studio.livepeer.livepeer.Livepeer;
import studio.livepeer.livepeer.models.operations.GetWebhookLogResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        Livepeer sdk = Livepeer.builder()
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        GetWebhookLogResponse res = sdk.webhook().getLog()
                .id("<id>")
                .logId("<id>")
                .call();

        if (res.webhookLog().isPresent()) {
            // handle response
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

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/SDKException | 4XX, 5XX                   | \*/\*                      |

## resendLog

Use this API to resend the same webhook request. This is useful when
developing and debugging, allowing you to easily repeat the same webhook
to check or fix the behaviour in your handler.


### Example Usage

<!-- UsageSnippet language="java" operationID="resendWebhook" method="post" path="/webhook/{id}/log/{logId}/resend" -->
```java
package hello.world;

import java.lang.Exception;
import studio.livepeer.livepeer.Livepeer;
import studio.livepeer.livepeer.models.operations.ResendWebhookResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        Livepeer sdk = Livepeer.builder()
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        ResendWebhookResponse res = sdk.webhook().resendLog()
                .id("<id>")
                .logId("<id>")
                .call();

        if (res.webhookLog().isPresent()) {
            // handle response
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

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/SDKException | 4XX, 5XX                   | \*/\*                      |