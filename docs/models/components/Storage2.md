# Storage2

Storage for the output files


## Fields

| Field                                                                                               | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `type`                                                                                              | [TranscodePayloadStorageType](../../models/components/TranscodePayloadStorageType.md)               | :heavy_check_mark:                                                                                  | Type of service used for output files                                                               |
| `credentials`                                                                                       | [TranscodePayloadStorageCredentials](../../models/components/TranscodePayloadStorageCredentials.md) | :heavy_check_mark:                                                                                  | Delegation proof for Livepeer to be able to upload to<br/>web3.storage<br/>                         |