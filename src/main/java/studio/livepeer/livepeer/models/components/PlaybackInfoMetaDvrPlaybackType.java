/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum PlaybackInfoMetaDvrPlaybackType {
    HTML5_APPLICATION_VND_APPLE_MPEGURL("html5/application/vnd.apple.mpegurl");

    @JsonValue
    private final String value;

    private PlaybackInfoMetaDvrPlaybackType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
