# TaskExportData

Parameters for the export-data task


## Fields

| Field                                                                     | Type                                                                      | Required                                                                  | Description                                                               | Example                                                                   |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `content`                                                                 | [Content](../../models/components/Content.md)                             | :heavy_check_mark:                                                        | File content to store into IPFS                                           | {<br/>"data": "Hello, World!"<br/>}                                       |
| `ipfs`                                                                    | [Optional<IpfsExportParams>](../../models/components/IpfsExportParams.md) | :heavy_minus_sign:                                                        | N/A                                                                       |                                                                           |
| `type`                                                                    | *Optional<String>*                                                        | :heavy_minus_sign:                                                        | Optional type of content                                                  | text/plain                                                                |
| `id`                                                                      | *Optional<String>*                                                        | :heavy_minus_sign:                                                        | Optional ID of the content                                                | 09F8B46C-61A0-4254-9875-F71F4C605BC7                                      |