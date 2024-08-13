/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import studio.livepeer.livepeer.models.components.TargetAddPayload;
import studio.livepeer.livepeer.utils.SpeakeasyMetadata;
import studio.livepeer.livepeer.utils.Utils;


public class AddMultistreamTargetRequest {

    /**
     * ID of the parent stream
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    @SpeakeasyMetadata("request:mediaType=application/json")
    private TargetAddPayload targetAddPayload;

    @JsonCreator
    public AddMultistreamTargetRequest(
            String id,
            TargetAddPayload targetAddPayload) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(targetAddPayload, "targetAddPayload");
        this.id = id;
        this.targetAddPayload = targetAddPayload;
    }

    /**
     * ID of the parent stream
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    @JsonIgnore
    public TargetAddPayload targetAddPayload() {
        return targetAddPayload;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * ID of the parent stream
     */
    public AddMultistreamTargetRequest withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public AddMultistreamTargetRequest withTargetAddPayload(TargetAddPayload targetAddPayload) {
        Utils.checkNotNull(targetAddPayload, "targetAddPayload");
        this.targetAddPayload = targetAddPayload;
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
        AddMultistreamTargetRequest other = (AddMultistreamTargetRequest) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.targetAddPayload, other.targetAddPayload);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            targetAddPayload);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AddMultistreamTargetRequest.class,
                "id", id,
                "targetAddPayload", targetAddPayload);
    }
    
    public final static class Builder {
 
        private String id;
 
        private TargetAddPayload targetAddPayload;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * ID of the parent stream
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder targetAddPayload(TargetAddPayload targetAddPayload) {
            Utils.checkNotNull(targetAddPayload, "targetAddPayload");
            this.targetAddPayload = targetAddPayload;
            return this;
        }
        
        public AddMultistreamTargetRequest build() {
            return new AddMultistreamTargetRequest(
                id,
                targetAddPayload);
        }
    }
}

