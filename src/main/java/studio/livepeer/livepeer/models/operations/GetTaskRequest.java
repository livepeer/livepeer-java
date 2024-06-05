/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import studio.livepeer.livepeer.utils.SpeakeasyMetadata;
import studio.livepeer.livepeer.utils.Utils;

public class GetTaskRequest {

    /**
     * ID of the task
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=taskId")
    private String taskId;

    @JsonCreator
    public GetTaskRequest(
            String taskId) {
        Utils.checkNotNull(taskId, "taskId");
        this.taskId = taskId;
    }

    /**
     * ID of the task
     */
    @JsonIgnore
    public String taskId() {
        return taskId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * ID of the task
     */
    public GetTaskRequest withTaskId(String taskId) {
        Utils.checkNotNull(taskId, "taskId");
        this.taskId = taskId;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetTaskRequest other = (GetTaskRequest) o;
        return 
            java.util.Objects.deepEquals(this.taskId, other.taskId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            taskId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetTaskRequest.class,
                "taskId", taskId);
    }
    
    public final static class Builder {
 
        private String taskId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * ID of the task
         */
        public Builder taskId(String taskId) {
            Utils.checkNotNull(taskId, "taskId");
            this.taskId = taskId;
            return this;
        }
        
        public GetTaskRequest build() {
            return new GetTaskRequest(
                taskId);
        }
    }
}

