/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * AssetVideoSpecType - type of track
 */
public enum AssetVideoSpecType {
    VIDEO("video"),
    AUDIO("audio");

    @JsonValue
    private final String value;

    private AssetVideoSpecType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
