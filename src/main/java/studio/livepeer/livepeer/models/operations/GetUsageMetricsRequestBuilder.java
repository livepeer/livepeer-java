/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.operations;

import studio.livepeer.livepeer.utils.Utils;

public class GetUsageMetricsRequestBuilder {

    private GetUsageMetricsRequest request;
    private final SDKMethodInterfaces.MethodCallGetUsageMetrics sdk;

    public GetUsageMetricsRequestBuilder(SDKMethodInterfaces.MethodCallGetUsageMetrics sdk) {
        this.sdk = sdk;
    }

    public GetUsageMetricsRequestBuilder request(studio.livepeer.livepeer.models.operations.GetUsageMetricsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetUsageMetricsResponse call() throws Exception {

        return sdk.getUsage(
            request);
    }
}
