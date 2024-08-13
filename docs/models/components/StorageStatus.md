# StorageStatus


## Fields

| Field                                              | Type                                               | Required                                           | Description                                        | Example                                            |
| -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- |
| `phase`                                            | [Phase](../../models/components/Phase.md)          | :heavy_check_mark:                                 | Phase of the asset storage                         | ready                                              |
| `progress`                                         | *Optional<Double>*                                 | :heavy_minus_sign:                                 | Current progress of the task updating the storage. | 0.5                                                |
| `errorMessage`                                     | *Optional<String>*                                 | :heavy_minus_sign:                                 | Error message if the last storage changed failed.  | Failed to update storage                           |
| `tasks`                                            | [Tasks](../../models/components/Tasks.md)          | :heavy_check_mark:                                 | N/A                                                |                                                    |