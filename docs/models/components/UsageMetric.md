# UsageMetric

An individual metric about usage of a user.



## Fields

| Field                                     | Type                                      | Required                                  | Description                               | Example                                   |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| `userID`                                  | *Optional<? extends String>*              | :heavy_minus_sign:                        | The user ID associated with the metric    | 1bde4o2i6xycudoy                          |
| `creatorID`                               | *Optional<? extends String>*              | :heavy_minus_sign:                        | The creator ID associated with the metric | john@doe.com                              |
| `deliveryUsageMins`                       | *Optional<? extends Double>*              | :heavy_minus_sign:                        | Total minutes of delivery usage.          | 100                                       |
| `totalUsageMins`                          | *Optional<? extends Double>*              | :heavy_minus_sign:                        | Total transcoded minutes.                 | 100                                       |
| `storageUsageMins`                        | *Optional<? extends Double>*              | :heavy_minus_sign:                        | Total minutes of storage usage.           | 100                                       |