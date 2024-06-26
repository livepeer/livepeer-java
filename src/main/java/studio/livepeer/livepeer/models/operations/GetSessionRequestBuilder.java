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


public class GetSessionRequestBuilder {

    private String id;
    private final SDKMethodInterfaces.MethodCallGetSession sdk;

    public GetSessionRequestBuilder(SDKMethodInterfaces.MethodCallGetSession sdk) {
        this.sdk = sdk;
    }

    public GetSessionRequestBuilder id(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public GetSessionResponse call() throws Exception {

        return sdk.get(
            id);
    }
}
