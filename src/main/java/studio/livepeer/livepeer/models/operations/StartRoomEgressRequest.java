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

public class StartRoomEgressRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    @SpeakeasyMetadata("request:mediaType=application/json")
    private studio.livepeer.livepeer.models.components.RoomEgressPayload roomEgressPayload;

    @JsonCreator
    public StartRoomEgressRequest(
            String id,
            studio.livepeer.livepeer.models.components.RoomEgressPayload roomEgressPayload) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(roomEgressPayload, "roomEgressPayload");
        this.id = id;
        this.roomEgressPayload = roomEgressPayload;
    }

    @JsonIgnore
    public String id() {
        return id;
    }

    @JsonIgnore
    public studio.livepeer.livepeer.models.components.RoomEgressPayload roomEgressPayload() {
        return roomEgressPayload;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public StartRoomEgressRequest withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public StartRoomEgressRequest withRoomEgressPayload(studio.livepeer.livepeer.models.components.RoomEgressPayload roomEgressPayload) {
        Utils.checkNotNull(roomEgressPayload, "roomEgressPayload");
        this.roomEgressPayload = roomEgressPayload;
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
        StartRoomEgressRequest other = (StartRoomEgressRequest) o;
        return 
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.roomEgressPayload, other.roomEgressPayload);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            id,
            roomEgressPayload);
    }
    
    @Override
    public String toString() {
        return Utils.toString(StartRoomEgressRequest.class,
                "id", id,
                "roomEgressPayload", roomEgressPayload);
    }
    
    public final static class Builder {
 
        private String id;
 
        private studio.livepeer.livepeer.models.components.RoomEgressPayload roomEgressPayload;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder roomEgressPayload(studio.livepeer.livepeer.models.components.RoomEgressPayload roomEgressPayload) {
            Utils.checkNotNull(roomEgressPayload, "roomEgressPayload");
            this.roomEgressPayload = roomEgressPayload;
            return this;
        }
        
        public StartRoomEgressRequest build() {
            return new StartRoomEgressRequest(
                id,
                roomEgressPayload);
        }
    }
}

