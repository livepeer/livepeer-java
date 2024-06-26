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


public class GetSigningKeyRequestBuilder {

    private String keyId;
    private final SDKMethodInterfaces.MethodCallGetSigningKey sdk;

    public GetSigningKeyRequestBuilder(SDKMethodInterfaces.MethodCallGetSigningKey sdk) {
        this.sdk = sdk;
    }

    public GetSigningKeyRequestBuilder keyId(String keyId) {
        Utils.checkNotNull(keyId, "keyId");
        this.keyId = keyId;
        return this;
    }

    public GetSigningKeyResponse call() throws Exception {

        return sdk.get(
            keyId);
    }
}
