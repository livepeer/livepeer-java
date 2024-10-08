/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.operations;

import studio.livepeer.livepeer.utils.Utils;

public class GetCreatorViewershipMetricsRequestBuilder {

    private GetCreatorViewershipMetricsRequest request;
    private final SDKMethodInterfaces.MethodCallGetCreatorViewershipMetrics sdk;

    public GetCreatorViewershipMetricsRequestBuilder(SDKMethodInterfaces.MethodCallGetCreatorViewershipMetrics sdk) {
        this.sdk = sdk;
    }

    public GetCreatorViewershipMetricsRequestBuilder request(studio.livepeer.livepeer.models.operations.GetCreatorViewershipMetricsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetCreatorViewershipMetricsResponse call() throws Exception {

        return sdk.getCreatorViewership(
            request);
    }
}
