/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.components;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;
import studio.livepeer.livepeer.utils.Utils;

public class CreateRoomResponse {

    /**
     * The ID of the room
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<? extends String> id;

    @JsonCreator
    public CreateRoomResponse(
            @JsonProperty("id") Optional<? extends String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
    }
    
    public CreateRoomResponse() {
        this(Optional.empty());
    }

    /**
     * The ID of the room
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> id() {
        return (Optional<String>) id;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The ID of the room
     */
    public CreateRoomResponse withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * The ID of the room
     */
    public CreateRoomResponse withId(Optional<? extends String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
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
        CreateRoomResponse other = (CreateRoomResponse) o;
        return 
            java.util.Objects.deepEquals(this.id, other.id);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            id);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateRoomResponse.class,
                "id", id);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> id = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The ID of the room
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        /**
         * The ID of the room
         */
        public Builder id(Optional<? extends String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }
        
        public CreateRoomResponse build() {
            return new CreateRoomResponse(
                id);
        }
    }
}

