# WebhookInput


## Fields

| Field                                                  | Type                                                   | Required                                               | Description                                            | Example                                                |
| ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ |
| `name`                                                 | *String*                                               | :heavy_check_mark:                                     | N/A                                                    | test_webhook                                           |
| `projectId`                                            | *Optional<String>*                                     | :heavy_minus_sign:                                     | The ID of the project                                  | aac12556-4d65-4d34-9fb6-d1f0985eb0a9                   |
| `events`                                               | List<[Events](../../models/components/Events.md)>      | :heavy_minus_sign:                                     | N/A                                                    | [<br/>"stream.started",<br/>"stream.idle"<br/>]        |
| `url`                                                  | *String*                                               | :heavy_check_mark:                                     | N/A                                                    | https://my-service.com/webhook                         |
| `sharedSecret`                                         | *Optional<String>*                                     | :heavy_minus_sign:                                     | shared secret used to sign the webhook payload         | my-secret                                              |
| `streamId`                                             | *Optional<String>*                                     | :heavy_minus_sign:                                     | streamId of the stream on which the webhook is applied | de7818e7-610a-4057-8f6f-b785dc1e6f88                   |