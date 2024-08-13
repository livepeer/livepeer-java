/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.operations;

import java.lang.String;
import studio.livepeer.livepeer.models.components.RoomEgressPayload;
import studio.livepeer.livepeer.utils.Utils;

public class StartRoomEgressRequestBuilder {

    private String id;
    private RoomEgressPayload roomEgressPayload;
    private final SDKMethodInterfaces.MethodCallStartRoomEgress sdk;

    public StartRoomEgressRequestBuilder(SDKMethodInterfaces.MethodCallStartRoomEgress sdk) {
        this.sdk = sdk;
    }

    public StartRoomEgressRequestBuilder id(java.lang.String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public StartRoomEgressRequestBuilder roomEgressPayload(studio.livepeer.livepeer.models.components.RoomEgressPayload roomEgressPayload) {
        Utils.checkNotNull(roomEgressPayload, "roomEgressPayload");
        this.roomEgressPayload = roomEgressPayload;
        return this;
    }

    public StartRoomEgressResponse call() throws Exception {

        return sdk.startEgress(
            id,
            roomEgressPayload);
    }
}
