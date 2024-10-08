/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * StorageType - Type of service used for output files
 */
public enum StorageType {
    S3("s3");

    @JsonValue
    private final String value;

    private StorageType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
