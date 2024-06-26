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


public class CreateMultistreamTargetRequestBuilder {

    private studio.livepeer.livepeer.models.components.MultistreamTargetInput request;
    private final SDKMethodInterfaces.MethodCallCreateMultistreamTarget sdk;

    public CreateMultistreamTargetRequestBuilder(SDKMethodInterfaces.MethodCallCreateMultistreamTarget sdk) {
        this.sdk = sdk;
    }

    public CreateMultistreamTargetRequestBuilder request(studio.livepeer.livepeer.models.components.MultistreamTargetInput request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreateMultistreamTargetResponse call() throws Exception {

        return sdk.create(
            request);
    }
}
