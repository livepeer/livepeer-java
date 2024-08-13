# AssetStatus

Status of the asset


## Fields

| Field                                                           | Type                                                            | Required                                                        | Description                                                     | Example                                                         |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `phase`                                                         | [AssetPhase](../../models/components/AssetPhase.md)             | :heavy_check_mark:                                              | Phase of the asset                                              |                                                                 |
| `updatedAt`                                                     | *double*                                                        | :heavy_check_mark:                                              | Timestamp (in milliseconds) at which the asset was last updated | 1587667174725                                                   |
| `progress`                                                      | *Optional<Double>*                                              | :heavy_minus_sign:                                              | Current progress of the task creating this asset.               |                                                                 |
| `errorMessage`                                                  | *Optional<String>*                                              | :heavy_minus_sign:                                              | Error message if the asset creation failed.                     |                                                                 |