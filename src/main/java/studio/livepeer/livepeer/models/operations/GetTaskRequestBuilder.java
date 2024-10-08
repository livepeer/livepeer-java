/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.operations;

import java.lang.String;
import studio.livepeer.livepeer.utils.Utils;

public class GetTaskRequestBuilder {

    private String taskId;
    private final SDKMethodInterfaces.MethodCallGetTask sdk;

    public GetTaskRequestBuilder(SDKMethodInterfaces.MethodCallGetTask sdk) {
        this.sdk = sdk;
    }

    public GetTaskRequestBuilder taskId(java.lang.String taskId) {
        Utils.checkNotNull(taskId, "taskId");
        this.taskId = taskId;
        return this;
    }

    public GetTaskResponse call() throws Exception {

        return sdk.get(
            taskId);
    }
}
