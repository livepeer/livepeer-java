/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.operations;

import java.lang.String;
import java.util.List;
import java.util.Optional;
import studio.livepeer.livepeer.utils.Utils;

public class GetRealtimeViewershipNowRequestBuilder {

    private Optional<String> playbackId = Optional.empty();
    private Optional<String> creatorId = Optional.empty();
    private Optional<? extends List<BreakdownBy>> breakdownBy = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetRealtimeViewershipNow sdk;

    public GetRealtimeViewershipNowRequestBuilder(SDKMethodInterfaces.MethodCallGetRealtimeViewershipNow sdk) {
        this.sdk = sdk;
    }
                
    public GetRealtimeViewershipNowRequestBuilder playbackId(java.lang.String playbackId) {
        Utils.checkNotNull(playbackId, "playbackId");
        this.playbackId = Optional.of(playbackId);
        return this;
    }

    public GetRealtimeViewershipNowRequestBuilder playbackId(java.util.Optional<java.lang.String> playbackId) {
        Utils.checkNotNull(playbackId, "playbackId");
        this.playbackId = playbackId;
        return this;
    }
                
    public GetRealtimeViewershipNowRequestBuilder creatorId(java.lang.String creatorId) {
        Utils.checkNotNull(creatorId, "creatorId");
        this.creatorId = Optional.of(creatorId);
        return this;
    }

    public GetRealtimeViewershipNowRequestBuilder creatorId(java.util.Optional<java.lang.String> creatorId) {
        Utils.checkNotNull(creatorId, "creatorId");
        this.creatorId = creatorId;
        return this;
    }
                
    public GetRealtimeViewershipNowRequestBuilder breakdownBy(java.util.List<studio.livepeer.livepeer.models.operations.BreakdownBy> breakdownBy) {
        Utils.checkNotNull(breakdownBy, "breakdownBy");
        this.breakdownBy = Optional.of(breakdownBy);
        return this;
    }

    public GetRealtimeViewershipNowRequestBuilder breakdownBy(java.util.Optional<? extends java.util.List<studio.livepeer.livepeer.models.operations.BreakdownBy>> breakdownBy) {
        Utils.checkNotNull(breakdownBy, "breakdownBy");
        this.breakdownBy = breakdownBy;
        return this;
    }

    public GetRealtimeViewershipNowResponse call() throws Exception {

        return sdk.getRealtimeViewership(
            playbackId,
            creatorId,
            breakdownBy);
    }
}
