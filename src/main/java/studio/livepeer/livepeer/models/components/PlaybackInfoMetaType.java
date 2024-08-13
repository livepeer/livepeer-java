/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.components;


import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum PlaybackInfoMetaType {
    HTML5_APPLICATION_VND_APPLE_MPEGURL("html5/application/vnd.apple.mpegurl"),
    HTML5_VIDEO_MP4("html5/video/mp4"),
    HTML5_VIDEO_H264("html5/video/h264"),
    VIDEO_X_FLV("video/x-flv"),
    IMAGE_JPEG("image/jpeg"),
    IMAGE_PNG("image/png"),
    TEXT_VTT("text/vtt");

    @JsonValue
    private final String value;

    private PlaybackInfoMetaType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
