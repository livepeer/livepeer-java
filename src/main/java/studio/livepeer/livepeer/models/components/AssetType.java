/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * AssetType - Type of the asset.
 */
public enum AssetType {
    VIDEO("video"),
    AUDIO("audio");

    @JsonValue
    private final String value;

    private AssetType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
