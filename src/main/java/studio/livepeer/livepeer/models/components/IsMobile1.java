/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.components;

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
 * IsMobile1 - 0: not mobile, 1: mobile screen share, 2: mobile camera.
 */
public enum IsMobile1 {
    ZERO(0L),
    ONE(1L),
    TWO(2L);

    @JsonValue
    private final long value;

    private IsMobile1(long value) {
        this.value = value;
    }
    
    public long value() {
        return value;
    }
}
