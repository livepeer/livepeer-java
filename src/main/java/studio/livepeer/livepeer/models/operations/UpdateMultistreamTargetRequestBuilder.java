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


public class UpdateMultistreamTargetRequestBuilder {

    private String id;
    private studio.livepeer.livepeer.models.components.MultistreamTargetPatchPayload multistreamTargetPatchPayload;
    private final SDKMethodInterfaces.MethodCallUpdateMultistreamTarget sdk;

    public UpdateMultistreamTargetRequestBuilder(SDKMethodInterfaces.MethodCallUpdateMultistreamTarget sdk) {
        this.sdk = sdk;
    }

    public UpdateMultistreamTargetRequestBuilder id(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public UpdateMultistreamTargetRequestBuilder multistreamTargetPatchPayload(studio.livepeer.livepeer.models.components.MultistreamTargetPatchPayload multistreamTargetPatchPayload) {
        Utils.checkNotNull(multistreamTargetPatchPayload, "multistreamTargetPatchPayload");
        this.multistreamTargetPatchPayload = multistreamTargetPatchPayload;
        return this;
    }

    public UpdateMultistreamTargetResponse call() throws Exception {

        return sdk.update(
            id,
            multistreamTargetPatchPayload);
    }
}
