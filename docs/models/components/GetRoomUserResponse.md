# GetRoomUserResponse


## Fields

| Field                                                   | Type                                                    | Required                                                | Description                                             | Example                                                 |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `id`                                                    | *Optional<String>*                                      | :heavy_minus_sign:                                      | The ID of the user                                      | d32ae9e6-c459-4931-9898-e86e2f5e7e16                    |
| `joinedAt`                                              | *Optional<Long>*                                        | :heavy_minus_sign:                                      | Timestamp (in milliseconds) at which the user joined    | 1687517025261                                           |
| `name`                                                  | *Optional<String>*                                      | :heavy_minus_sign:                                      | The display name of the user                            | name                                                    |
| `isPublisher`                                           | *Optional<Boolean>*                                     | :heavy_minus_sign:                                      | Whether a user is allowed to publish audio/video tracks | true                                                    |
| `metadata`                                              | *Optional<String>*                                      | :heavy_minus_sign:                                      | User defined payload to store for the participant       |                                                         |