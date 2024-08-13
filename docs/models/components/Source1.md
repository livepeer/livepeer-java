# Source1


## Fields

| Field                                                                     | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `type`                                                                    | [SourceType](../../models/components/SourceType.md)                       | :heavy_check_mark:                                                        | N/A                                                                       |
| `url`                                                                     | *String*                                                                  | :heavy_check_mark:                                                        | URL from which the asset was uploaded.                                    |
| `gatewayUrl`                                                              | *Optional<String>*                                                        | :heavy_minus_sign:                                                        | Gateway URL from asset if parsed from provided URL on upload.             |
| `encryption`                                                              | [Optional<EncryptionOutput>](../../models/components/EncryptionOutput.md) | :heavy_minus_sign:                                                        | N/A                                                                       |