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
import java.util.Objects;
import java.util.Optional;
import studio.livepeer.livepeer.utils.Utils;


public class DvrPlayback {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hrn")
    private Optional<? extends PlaybackInfoHrn> hrn;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<? extends PlaybackInfoMetaDvrPlaybackType> type;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("url")
    private Optional<String> url;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("error")
    private Optional<String> error;

    @JsonCreator
    public DvrPlayback(
            @JsonProperty("hrn") Optional<? extends PlaybackInfoHrn> hrn,
            @JsonProperty("type") Optional<? extends PlaybackInfoMetaDvrPlaybackType> type,
            @JsonProperty("url") Optional<String> url,
            @JsonProperty("error") Optional<String> error) {
        Utils.checkNotNull(hrn, "hrn");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(url, "url");
        Utils.checkNotNull(error, "error");
        this.hrn = hrn;
        this.type = type;
        this.url = url;
        this.error = error;
    }
    
    public DvrPlayback() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PlaybackInfoHrn> hrn() {
        return (Optional<PlaybackInfoHrn>) hrn;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PlaybackInfoMetaDvrPlaybackType> type() {
        return (Optional<PlaybackInfoMetaDvrPlaybackType>) type;
    }

    @JsonIgnore
    public Optional<String> url() {
        return url;
    }

    @JsonIgnore
    public Optional<String> error() {
        return error;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public DvrPlayback withHrn(PlaybackInfoHrn hrn) {
        Utils.checkNotNull(hrn, "hrn");
        this.hrn = Optional.ofNullable(hrn);
        return this;
    }

    public DvrPlayback withHrn(Optional<? extends PlaybackInfoHrn> hrn) {
        Utils.checkNotNull(hrn, "hrn");
        this.hrn = hrn;
        return this;
    }

    public DvrPlayback withType(PlaybackInfoMetaDvrPlaybackType type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    public DvrPlayback withType(Optional<? extends PlaybackInfoMetaDvrPlaybackType> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public DvrPlayback withUrl(String url) {
        Utils.checkNotNull(url, "url");
        this.url = Optional.ofNullable(url);
        return this;
    }

    public DvrPlayback withUrl(Optional<String> url) {
        Utils.checkNotNull(url, "url");
        this.url = url;
        return this;
    }

    public DvrPlayback withError(String error) {
        Utils.checkNotNull(error, "error");
        this.error = Optional.ofNullable(error);
        return this;
    }

    public DvrPlayback withError(Optional<String> error) {
        Utils.checkNotNull(error, "error");
        this.error = error;
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
        DvrPlayback other = (DvrPlayback) o;
        return 
            Objects.deepEquals(this.hrn, other.hrn) &&
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.url, other.url) &&
            Objects.deepEquals(this.error, other.error);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            hrn,
            type,
            url,
            error);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DvrPlayback.class,
                "hrn", hrn,
                "type", type,
                "url", url,
                "error", error);
    }
    
    public final static class Builder {
 
        private Optional<? extends PlaybackInfoHrn> hrn = Optional.empty();
 
        private Optional<? extends PlaybackInfoMetaDvrPlaybackType> type = Optional.empty();
 
        private Optional<String> url = Optional.empty();
 
        private Optional<String> error = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder hrn(PlaybackInfoHrn hrn) {
            Utils.checkNotNull(hrn, "hrn");
            this.hrn = Optional.ofNullable(hrn);
            return this;
        }

        public Builder hrn(Optional<? extends PlaybackInfoHrn> hrn) {
            Utils.checkNotNull(hrn, "hrn");
            this.hrn = hrn;
            return this;
        }

        public Builder type(PlaybackInfoMetaDvrPlaybackType type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        public Builder type(Optional<? extends PlaybackInfoMetaDvrPlaybackType> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public Builder url(String url) {
            Utils.checkNotNull(url, "url");
            this.url = Optional.ofNullable(url);
            return this;
        }

        public Builder url(Optional<String> url) {
            Utils.checkNotNull(url, "url");
            this.url = url;
            return this;
        }

        public Builder error(String error) {
            Utils.checkNotNull(error, "error");
            this.error = Optional.ofNullable(error);
            return this;
        }

        public Builder error(Optional<String> error) {
            Utils.checkNotNull(error, "error");
            this.error = error;
            return this;
        }
        
        public DvrPlayback build() {
            return new DvrPlayback(
                hrn,
                type,
                url,
                error);
        }
    }
}

