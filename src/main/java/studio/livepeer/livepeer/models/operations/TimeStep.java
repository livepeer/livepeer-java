/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import studio.livepeer.livepeer.utils.Utils;

/**
 * TimeStep - The time step to aggregate viewership metrics by
 */
public enum TimeStep {
    HOUR("hour"),
    DAY("day"),
    WEEK("week"),
    MONTH("month"),
    YEAR("year");

    @JsonValue
    private final String value;

    private TimeStep(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
