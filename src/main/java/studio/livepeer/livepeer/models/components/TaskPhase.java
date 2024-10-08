/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * TaskPhase - Phase of the task
 */
public enum TaskPhase {
    PENDING("pending"),
    WAITING("waiting"),
    RUNNING("running"),
    FAILED("failed"),
    COMPLETED("completed"),
    CANCELLED("cancelled");

    @JsonValue
    private final String value;

    private TaskPhase(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
