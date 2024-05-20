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


public class DeleteStreamRequestBuilder {

    private String id;
    private final SDKMethodInterfaces.MethodCallDeleteStream sdk;

    public DeleteStreamRequestBuilder(SDKMethodInterfaces.MethodCallDeleteStream sdk) {
        this.sdk = sdk;
    }

    public DeleteStreamRequestBuilder id(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public DeleteStreamResponse call() throws Exception {

        return sdk.delete(
            id);
    }
}
