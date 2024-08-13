/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.operations;


import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum GetCreatorViewershipMetricsQueryParamBreakdownBy {
    DEVICE_TYPE("deviceType"),
    DEVICE("device"),
    CPU("cpu"),
    OS("os"),
    BROWSER("browser"),
    BROWSER_ENGINE("browserEngine"),
    CONTINENT("continent"),
    COUNTRY("country"),
    SUBDIVISION("subdivision"),
    TIMEZONE("timezone"),
    VIEWER_ID("viewerId");

    @JsonValue
    private final String value;

    private GetCreatorViewershipMetricsQueryParamBreakdownBy(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}