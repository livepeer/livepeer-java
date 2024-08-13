# Request


## Fields

| Field                               | Type                                | Required                            | Description                         | Example                             |
| ----------------------------------- | ----------------------------------- | ----------------------------------- | ----------------------------------- | ----------------------------------- |
| `url`                               | *Optional<String>*                  | :heavy_minus_sign:                  | URL used for the request            | https://my-service.com/webhook      |
| `method`                            | *Optional<String>*                  | :heavy_minus_sign:                  | HTTP request method                 | POST                                |
| `headers`                           | Map<String, *String*>               | :heavy_minus_sign:                  | HTTP request headers                | {<br/>"User-Agent": "livepeer.studio"<br/>} |
| `body`                              | *Optional<String>*                  | :heavy_minus_sign:                  | request body                        | {"event": "stream.started"}         |