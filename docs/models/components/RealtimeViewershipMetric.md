# RealtimeViewershipMetric

An individual metric about realtime viewership of a stream/asset.



## Fields

| Field                                       | Type                                        | Required                                    | Description                                 | Example                                     |
| ------------------------------------------- | ------------------------------------------- | ------------------------------------------- | ------------------------------------------- | ------------------------------------------- |
| `playbackId`                                | *Optional<String>*                          | :heavy_minus_sign:                          | The playback ID associated with the metric. | 1bde4o2i6xycudoy                            |
| `device`                                    | *Optional<String>*                          | :heavy_minus_sign:                          | The device used by the viewer.              | iPhone                                      |
| `browser`                                   | *Optional<String>*                          | :heavy_minus_sign:                          | The browser used by the viewer.             | Safari                                      |
| `country`                                   | *Optional<String>*                          | :heavy_minus_sign:                          | The country where the viewer is located.    | United States                               |
| `viewCount`                                 | *long*                                      | :heavy_check_mark:                          | The number of views for the stream/asset.   | 100                                         |
| `errorRate`                                 | *double*                                    | :heavy_check_mark:                          | The error rate for the stream/asset.        | 0.1                                         |