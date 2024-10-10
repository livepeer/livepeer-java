/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.operations;

import java.lang.String;
import studio.livepeer.livepeer.utils.Utils;

public class GetRoomUserRequestBuilder {

    private String id;
    private String userId;
    private final SDKMethodInterfaces.MethodCallGetRoomUser sdk;

    public GetRoomUserRequestBuilder(SDKMethodInterfaces.MethodCallGetRoomUser sdk) {
        this.sdk = sdk;
    }

    public GetRoomUserRequestBuilder id(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public GetRoomUserRequestBuilder userId(String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = userId;
        return this;
    }

    public GetRoomUserResponse call() throws Exception {

        return sdk.getUser(
            id,
            userId);
    }
}
