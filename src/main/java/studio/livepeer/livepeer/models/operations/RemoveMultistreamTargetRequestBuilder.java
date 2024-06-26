/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import java.util.stream.Stream;
import org.openapitools.jackson.nullable.JsonNullable;
import studio.livepeer.livepeer.models.errors.SDKError;
import studio.livepeer.livepeer.utils.LazySingletonValue;
import studio.livepeer.livepeer.utils.Utils;


public class RemoveMultistreamTargetRequestBuilder {

    private String id;
    private String targetId;
    private final SDKMethodInterfaces.MethodCallRemoveMultistreamTarget sdk;

    public RemoveMultistreamTargetRequestBuilder(SDKMethodInterfaces.MethodCallRemoveMultistreamTarget sdk) {
        this.sdk = sdk;
    }

    public RemoveMultistreamTargetRequestBuilder id(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public RemoveMultistreamTargetRequestBuilder targetId(String targetId) {
        Utils.checkNotNull(targetId, "targetId");
        this.targetId = targetId;
        return this;
    }

    public RemoveMultistreamTargetResponse call() throws Exception {

        return sdk.removeMultistreamTarget(
            id,
            targetId);
    }
}
