# LastFailure

failure timestamp and error message with status code


## Fields

| Field                                                        | Type                                                         | Required                                                     | Description                                                  | Example                                                      |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `timestamp`                                                  | *Optional<? extends Double>*                                 | :heavy_minus_sign:                                           | Timestamp (in milliseconds) at which the webhook last failed | 1587667174725                                                |
| `error`                                                      | *Optional<? extends String>*                                 | :heavy_minus_sign:                                           | Webhook failure error message                                | Error message                                                |
| `response`                                                   | *Optional<? extends String>*                                 | :heavy_minus_sign:                                           | Webhook failure response                                     | Response body                                                |
| `statusCode`                                                 | *Optional<? extends Double>*                                 | :heavy_minus_sign:                                           | Webhook failure status code                                  | 500                                                          |