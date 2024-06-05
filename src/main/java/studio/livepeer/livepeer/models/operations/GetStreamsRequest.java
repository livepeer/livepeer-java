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
import java.util.Optional;
import studio.livepeer.livepeer.utils.SpeakeasyMetadata;
import studio.livepeer.livepeer.utils.Utils;

public class GetStreamsRequest {

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=streamsonly")
    private Optional<? extends String> streamsonly;

    @JsonCreator
    public GetStreamsRequest(
            Optional<? extends String> streamsonly) {
        Utils.checkNotNull(streamsonly, "streamsonly");
        this.streamsonly = streamsonly;
    }
    
    public GetStreamsRequest() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> streamsonly() {
        return (Optional<String>) streamsonly;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetStreamsRequest withStreamsonly(String streamsonly) {
        Utils.checkNotNull(streamsonly, "streamsonly");
        this.streamsonly = Optional.ofNullable(streamsonly);
        return this;
    }

    public GetStreamsRequest withStreamsonly(Optional<? extends String> streamsonly) {
        Utils.checkNotNull(streamsonly, "streamsonly");
        this.streamsonly = streamsonly;
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
        GetStreamsRequest other = (GetStreamsRequest) o;
        return 
            java.util.Objects.deepEquals(this.streamsonly, other.streamsonly);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            streamsonly);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetStreamsRequest.class,
                "streamsonly", streamsonly);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> streamsonly = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder streamsonly(String streamsonly) {
            Utils.checkNotNull(streamsonly, "streamsonly");
            this.streamsonly = Optional.ofNullable(streamsonly);
            return this;
        }

        public Builder streamsonly(Optional<? extends String> streamsonly) {
            Utils.checkNotNull(streamsonly, "streamsonly");
            this.streamsonly = streamsonly;
            return this;
        }
        
        public GetStreamsRequest build() {
            return new GetStreamsRequest(
                streamsonly);
        }
    }
}

