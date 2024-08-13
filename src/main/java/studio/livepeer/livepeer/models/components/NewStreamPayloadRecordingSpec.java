/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;
import studio.livepeer.livepeer.utils.Utils;


public class NewStreamPayloadRecordingSpec {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("profiles")
    private JsonNullable<? extends List<TranscodeProfile>> profiles;

    @JsonCreator
    public NewStreamPayloadRecordingSpec(
            @JsonProperty("profiles") JsonNullable<? extends List<TranscodeProfile>> profiles) {
        Utils.checkNotNull(profiles, "profiles");
        this.profiles = profiles;
    }
    
    public NewStreamPayloadRecordingSpec() {
        this(JsonNullable.undefined());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<TranscodeProfile>> profiles() {
        return (JsonNullable<List<TranscodeProfile>>) profiles;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public NewStreamPayloadRecordingSpec withProfiles(List<TranscodeProfile> profiles) {
        Utils.checkNotNull(profiles, "profiles");
        this.profiles = JsonNullable.of(profiles);
        return this;
    }

    public NewStreamPayloadRecordingSpec withProfiles(JsonNullable<? extends List<TranscodeProfile>> profiles) {
        Utils.checkNotNull(profiles, "profiles");
        this.profiles = profiles;
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
        NewStreamPayloadRecordingSpec other = (NewStreamPayloadRecordingSpec) o;
        return 
            Objects.deepEquals(this.profiles, other.profiles);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            profiles);
    }
    
    @Override
    public String toString() {
        return Utils.toString(NewStreamPayloadRecordingSpec.class,
                "profiles", profiles);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends List<TranscodeProfile>> profiles = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder profiles(List<TranscodeProfile> profiles) {
            Utils.checkNotNull(profiles, "profiles");
            this.profiles = JsonNullable.of(profiles);
            return this;
        }

        public Builder profiles(JsonNullable<? extends List<TranscodeProfile>> profiles) {
            Utils.checkNotNull(profiles, "profiles");
            this.profiles = profiles;
            return this;
        }
        
        public NewStreamPayloadRecordingSpec build() {
            return new NewStreamPayloadRecordingSpec(
                profiles);
        }
    }
}
