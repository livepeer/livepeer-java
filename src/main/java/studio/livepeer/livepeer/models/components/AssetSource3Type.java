/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.components;


import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum AssetSource3Type {
    DIRECT_UPLOAD("directUpload"),
    CLIP("clip");

    @JsonValue
    private final String value;

    private AssetSource3Type(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
