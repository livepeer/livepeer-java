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


public class UpdateAssetRequestBuilder {

    private String assetId;
    private studio.livepeer.livepeer.models.components.AssetPatchPayload assetPatchPayload;
    private final SDKMethodInterfaces.MethodCallUpdateAsset sdk;

    public UpdateAssetRequestBuilder(SDKMethodInterfaces.MethodCallUpdateAsset sdk) {
        this.sdk = sdk;
    }

    public UpdateAssetRequestBuilder assetId(String assetId) {
        Utils.checkNotNull(assetId, "assetId");
        this.assetId = assetId;
        return this;
    }

    public UpdateAssetRequestBuilder assetPatchPayload(studio.livepeer.livepeer.models.components.AssetPatchPayload assetPatchPayload) {
        Utils.checkNotNull(assetPatchPayload, "assetPatchPayload");
        this.assetPatchPayload = assetPatchPayload;
        return this;
    }

    public UpdateAssetResponse call() throws Exception {

        return sdk.update(
            assetId,
            assetPatchPayload);
    }
}
