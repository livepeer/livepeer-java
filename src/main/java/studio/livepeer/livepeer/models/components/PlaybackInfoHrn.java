/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.components;


import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum PlaybackInfoHrn {
    HLS_TS("HLS (TS)");

    @JsonValue
    private final String value;

    private PlaybackInfoHrn(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
