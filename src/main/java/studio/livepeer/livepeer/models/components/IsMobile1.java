/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.components;

import com.fasterxml.jackson.annotation.JsonValue;

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
