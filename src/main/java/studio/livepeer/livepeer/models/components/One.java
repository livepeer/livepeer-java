/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.components;


import com.fasterxml.jackson.annotation.JsonValue;

/**
 * One - 0: not mobile, 1: mobile screen share, 2: mobile camera.
 */
public enum One {
    ZERO(0L),
    ONE(1L),
    TWO(2L);

    @JsonValue
    private final long value;

    private One(long value) {
        this.value = value;
    }
    
    public long value() {
        return value;
    }
}
