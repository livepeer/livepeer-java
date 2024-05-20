# RoomUserPayload


## Fields

| Field                                                          | Type                                                           | Required                                                       | Description                                                    | Example                                                        |
| -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- |
| `name`                                                         | *String*                                                       | :heavy_check_mark:                                             | Display name                                                   | name                                                           |
| `canPublish`                                                   | *Optional<? extends Boolean>*                                  | :heavy_minus_sign:                                             | Whether a user is allowed to publish audio/video tracks        | true                                                           |
| `canPublishData`                                               | *Optional<? extends Boolean>*                                  | :heavy_minus_sign:                                             | Whether a user is allowed to publish data messages to the room | true                                                           |
| `metadata`                                                     | *Optional<? extends String>*                                   | :heavy_minus_sign:                                             | User defined payload to store for the participant              |                                                                |