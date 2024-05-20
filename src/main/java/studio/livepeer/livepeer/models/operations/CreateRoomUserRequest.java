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


public class CreateRoomUserRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    @SpeakeasyMetadata("request:mediaType=application/json")
    private studio.livepeer.livepeer.models.components.RoomUserPayload roomUserPayload;

    @JsonCreator
    public CreateRoomUserRequest(
            String id,
            studio.livepeer.livepeer.models.components.RoomUserPayload roomUserPayload) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(roomUserPayload, "roomUserPayload");
        this.id = id;
        this.roomUserPayload = roomUserPayload;
    }

    @JsonIgnore
    public String id() {
        return id;
    }

    @JsonIgnore
    public studio.livepeer.livepeer.models.components.RoomUserPayload roomUserPayload() {
        return roomUserPayload;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CreateRoomUserRequest withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public CreateRoomUserRequest withRoomUserPayload(studio.livepeer.livepeer.models.components.RoomUserPayload roomUserPayload) {
        Utils.checkNotNull(roomUserPayload, "roomUserPayload");
        this.roomUserPayload = roomUserPayload;
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
        CreateRoomUserRequest other = (CreateRoomUserRequest) o;
        return 
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.roomUserPayload, other.roomUserPayload);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            id,
            roomUserPayload);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateRoomUserRequest.class,
                "id", id,
                "roomUserPayload", roomUserPayload);
    }
    
    public final static class Builder {
 
        private String id;
 
        private studio.livepeer.livepeer.models.components.RoomUserPayload roomUserPayload;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder roomUserPayload(studio.livepeer.livepeer.models.components.RoomUserPayload roomUserPayload) {
            Utils.checkNotNull(roomUserPayload, "roomUserPayload");
            this.roomUserPayload = roomUserPayload;
            return this;
        }
        
        public CreateRoomUserRequest build() {
            return new CreateRoomUserRequest(
                id,
                roomUserPayload);
        }
    }
}

