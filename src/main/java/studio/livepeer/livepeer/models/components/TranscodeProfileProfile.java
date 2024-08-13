/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.components;


import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum TranscodeProfileProfile {
    H264_BASELINE("H264Baseline"),
    H264_MAIN("H264Main"),
    H264_HIGH("H264High"),
    H264_CONSTRAINED_HIGH("H264ConstrainedHigh");

    @JsonValue
    private final String value;

    private TranscodeProfileProfile(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
