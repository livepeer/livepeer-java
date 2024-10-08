/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.operations;

import studio.livepeer.livepeer.utils.Utils;

public class GetViewershipMetricsRequestBuilder {

    private GetViewershipMetricsRequest request;
    private final SDKMethodInterfaces.MethodCallGetViewershipMetrics sdk;

    public GetViewershipMetricsRequestBuilder(SDKMethodInterfaces.MethodCallGetViewershipMetrics sdk) {
        this.sdk = sdk;
    }

    public GetViewershipMetricsRequestBuilder request(studio.livepeer.livepeer.models.operations.GetViewershipMetricsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetViewershipMetricsResponse call() throws Exception {

        return sdk.getViewership(
            request);
    }
}
