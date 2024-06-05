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


public class GetRecordedSessionsRequestBuilder {

    private String parentId;
    private Optional<? extends Record> record = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetRecordedSessions sdk;

    public GetRecordedSessionsRequestBuilder(SDKMethodInterfaces.MethodCallGetRecordedSessions sdk) {
        this.sdk = sdk;
    }

    public GetRecordedSessionsRequestBuilder parentId(String parentId) {
        Utils.checkNotNull(parentId, "parentId");
        this.parentId = parentId;
        return this;
    }
                
    public GetRecordedSessionsRequestBuilder record(Record record) {
        Utils.checkNotNull(record, "record");
        this.record = Optional.of(record);
        return this;
    }

    public GetRecordedSessionsRequestBuilder record(Optional<? extends Record> record) {
        Utils.checkNotNull(record, "record");
        this.record = record;
        return this;
    }

    public GetRecordedSessionsResponse call() throws Exception {

        return sdk.getRecorded(
            parentId,
            record);
    }
}
