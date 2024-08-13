# Status

status of webhook


## Fields

| Field                                                                | Type                                                                 | Required                                                             | Description                                                          | Example                                                              |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `lastFailure`                                                        | [Optional<LastFailure>](../../models/components/LastFailure.md)      | :heavy_minus_sign:                                                   | failure timestamp and error message with status code                 |                                                                      |
| `lastTriggeredAt`                                                    | *Optional<Double>*                                                   | :heavy_minus_sign:                                                   | Timestamp (in milliseconds) at which the webhook last was<br/>triggered<br/> | 1587667174725                                                        |