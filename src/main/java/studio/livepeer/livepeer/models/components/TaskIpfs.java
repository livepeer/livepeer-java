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

public class TaskIpfs {

    /**
     * IPFS CID of the exported video file
     */
    @JsonProperty("videoFileCid")
    private String videoFileCid;

    /**
     * URL for the file with the IPFS protocol
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("videoFileUrl")
    private Optional<? extends String> videoFileUrl;

    /**
     * URL to access file via HTTP through an IPFS gateway
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("videoFileGatewayUrl")
    private Optional<? extends String> videoFileGatewayUrl;

    /**
     * IPFS CID of the default metadata exported for the video
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("nftMetadataCid")
    private Optional<? extends String> nftMetadataCid;

    /**
     * URL for the metadata file with the IPFS protocol
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("nftMetadataUrl")
    private Optional<? extends String> nftMetadataUrl;

    /**
     * URL to access metadata file via HTTP through an IPFS
     * gateway
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("nftMetadataGatewayUrl")
    private Optional<? extends String> nftMetadataGatewayUrl;

    @JsonCreator
    public TaskIpfs(
            @JsonProperty("videoFileCid") String videoFileCid,
            @JsonProperty("videoFileUrl") Optional<? extends String> videoFileUrl,
            @JsonProperty("videoFileGatewayUrl") Optional<? extends String> videoFileGatewayUrl,
            @JsonProperty("nftMetadataCid") Optional<? extends String> nftMetadataCid,
            @JsonProperty("nftMetadataUrl") Optional<? extends String> nftMetadataUrl,
            @JsonProperty("nftMetadataGatewayUrl") Optional<? extends String> nftMetadataGatewayUrl) {
        Utils.checkNotNull(videoFileCid, "videoFileCid");
        Utils.checkNotNull(videoFileUrl, "videoFileUrl");
        Utils.checkNotNull(videoFileGatewayUrl, "videoFileGatewayUrl");
        Utils.checkNotNull(nftMetadataCid, "nftMetadataCid");
        Utils.checkNotNull(nftMetadataUrl, "nftMetadataUrl");
        Utils.checkNotNull(nftMetadataGatewayUrl, "nftMetadataGatewayUrl");
        this.videoFileCid = videoFileCid;
        this.videoFileUrl = videoFileUrl;
        this.videoFileGatewayUrl = videoFileGatewayUrl;
        this.nftMetadataCid = nftMetadataCid;
        this.nftMetadataUrl = nftMetadataUrl;
        this.nftMetadataGatewayUrl = nftMetadataGatewayUrl;
    }
    
    public TaskIpfs(
            String videoFileCid) {
        this(videoFileCid, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * IPFS CID of the exported video file
     */
    @JsonIgnore
    public String videoFileCid() {
        return videoFileCid;
    }

    /**
     * URL for the file with the IPFS protocol
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> videoFileUrl() {
        return (Optional<String>) videoFileUrl;
    }

    /**
     * URL to access file via HTTP through an IPFS gateway
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> videoFileGatewayUrl() {
        return (Optional<String>) videoFileGatewayUrl;
    }

    /**
     * IPFS CID of the default metadata exported for the video
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> nftMetadataCid() {
        return (Optional<String>) nftMetadataCid;
    }

    /**
     * URL for the metadata file with the IPFS protocol
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> nftMetadataUrl() {
        return (Optional<String>) nftMetadataUrl;
    }

    /**
     * URL to access metadata file via HTTP through an IPFS
     * gateway
     * 
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> nftMetadataGatewayUrl() {
        return (Optional<String>) nftMetadataGatewayUrl;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * IPFS CID of the exported video file
     */
    public TaskIpfs withVideoFileCid(String videoFileCid) {
        Utils.checkNotNull(videoFileCid, "videoFileCid");
        this.videoFileCid = videoFileCid;
        return this;
    }

    /**
     * URL for the file with the IPFS protocol
     */
    public TaskIpfs withVideoFileUrl(String videoFileUrl) {
        Utils.checkNotNull(videoFileUrl, "videoFileUrl");
        this.videoFileUrl = Optional.ofNullable(videoFileUrl);
        return this;
    }

    /**
     * URL for the file with the IPFS protocol
     */
    public TaskIpfs withVideoFileUrl(Optional<? extends String> videoFileUrl) {
        Utils.checkNotNull(videoFileUrl, "videoFileUrl");
        this.videoFileUrl = videoFileUrl;
        return this;
    }

    /**
     * URL to access file via HTTP through an IPFS gateway
     */
    public TaskIpfs withVideoFileGatewayUrl(String videoFileGatewayUrl) {
        Utils.checkNotNull(videoFileGatewayUrl, "videoFileGatewayUrl");
        this.videoFileGatewayUrl = Optional.ofNullable(videoFileGatewayUrl);
        return this;
    }

    /**
     * URL to access file via HTTP through an IPFS gateway
     */
    public TaskIpfs withVideoFileGatewayUrl(Optional<? extends String> videoFileGatewayUrl) {
        Utils.checkNotNull(videoFileGatewayUrl, "videoFileGatewayUrl");
        this.videoFileGatewayUrl = videoFileGatewayUrl;
        return this;
    }

    /**
     * IPFS CID of the default metadata exported for the video
     */
    public TaskIpfs withNftMetadataCid(String nftMetadataCid) {
        Utils.checkNotNull(nftMetadataCid, "nftMetadataCid");
        this.nftMetadataCid = Optional.ofNullable(nftMetadataCid);
        return this;
    }

    /**
     * IPFS CID of the default metadata exported for the video
     */
    public TaskIpfs withNftMetadataCid(Optional<? extends String> nftMetadataCid) {
        Utils.checkNotNull(nftMetadataCid, "nftMetadataCid");
        this.nftMetadataCid = nftMetadataCid;
        return this;
    }

    /**
     * URL for the metadata file with the IPFS protocol
     */
    public TaskIpfs withNftMetadataUrl(String nftMetadataUrl) {
        Utils.checkNotNull(nftMetadataUrl, "nftMetadataUrl");
        this.nftMetadataUrl = Optional.ofNullable(nftMetadataUrl);
        return this;
    }

    /**
     * URL for the metadata file with the IPFS protocol
     */
    public TaskIpfs withNftMetadataUrl(Optional<? extends String> nftMetadataUrl) {
        Utils.checkNotNull(nftMetadataUrl, "nftMetadataUrl");
        this.nftMetadataUrl = nftMetadataUrl;
        return this;
    }

    /**
     * URL to access metadata file via HTTP through an IPFS
     * gateway
     * 
     */
    public TaskIpfs withNftMetadataGatewayUrl(String nftMetadataGatewayUrl) {
        Utils.checkNotNull(nftMetadataGatewayUrl, "nftMetadataGatewayUrl");
        this.nftMetadataGatewayUrl = Optional.ofNullable(nftMetadataGatewayUrl);
        return this;
    }

    /**
     * URL to access metadata file via HTTP through an IPFS
     * gateway
     * 
     */
    public TaskIpfs withNftMetadataGatewayUrl(Optional<? extends String> nftMetadataGatewayUrl) {
        Utils.checkNotNull(nftMetadataGatewayUrl, "nftMetadataGatewayUrl");
        this.nftMetadataGatewayUrl = nftMetadataGatewayUrl;
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
        TaskIpfs other = (TaskIpfs) o;
        return 
            java.util.Objects.deepEquals(this.videoFileCid, other.videoFileCid) &&
            java.util.Objects.deepEquals(this.videoFileUrl, other.videoFileUrl) &&
            java.util.Objects.deepEquals(this.videoFileGatewayUrl, other.videoFileGatewayUrl) &&
            java.util.Objects.deepEquals(this.nftMetadataCid, other.nftMetadataCid) &&
            java.util.Objects.deepEquals(this.nftMetadataUrl, other.nftMetadataUrl) &&
            java.util.Objects.deepEquals(this.nftMetadataGatewayUrl, other.nftMetadataGatewayUrl);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            videoFileCid,
            videoFileUrl,
            videoFileGatewayUrl,
            nftMetadataCid,
            nftMetadataUrl,
            nftMetadataGatewayUrl);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TaskIpfs.class,
                "videoFileCid", videoFileCid,
                "videoFileUrl", videoFileUrl,
                "videoFileGatewayUrl", videoFileGatewayUrl,
                "nftMetadataCid", nftMetadataCid,
                "nftMetadataUrl", nftMetadataUrl,
                "nftMetadataGatewayUrl", nftMetadataGatewayUrl);
    }
    
    public final static class Builder {
 
        private String videoFileCid;
 
        private Optional<? extends String> videoFileUrl = Optional.empty();
 
        private Optional<? extends String> videoFileGatewayUrl = Optional.empty();
 
        private Optional<? extends String> nftMetadataCid = Optional.empty();
 
        private Optional<? extends String> nftMetadataUrl = Optional.empty();
 
        private Optional<? extends String> nftMetadataGatewayUrl = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * IPFS CID of the exported video file
         */
        public Builder videoFileCid(String videoFileCid) {
            Utils.checkNotNull(videoFileCid, "videoFileCid");
            this.videoFileCid = videoFileCid;
            return this;
        }

        /**
         * URL for the file with the IPFS protocol
         */
        public Builder videoFileUrl(String videoFileUrl) {
            Utils.checkNotNull(videoFileUrl, "videoFileUrl");
            this.videoFileUrl = Optional.ofNullable(videoFileUrl);
            return this;
        }

        /**
         * URL for the file with the IPFS protocol
         */
        public Builder videoFileUrl(Optional<? extends String> videoFileUrl) {
            Utils.checkNotNull(videoFileUrl, "videoFileUrl");
            this.videoFileUrl = videoFileUrl;
            return this;
        }

        /**
         * URL to access file via HTTP through an IPFS gateway
         */
        public Builder videoFileGatewayUrl(String videoFileGatewayUrl) {
            Utils.checkNotNull(videoFileGatewayUrl, "videoFileGatewayUrl");
            this.videoFileGatewayUrl = Optional.ofNullable(videoFileGatewayUrl);
            return this;
        }

        /**
         * URL to access file via HTTP through an IPFS gateway
         */
        public Builder videoFileGatewayUrl(Optional<? extends String> videoFileGatewayUrl) {
            Utils.checkNotNull(videoFileGatewayUrl, "videoFileGatewayUrl");
            this.videoFileGatewayUrl = videoFileGatewayUrl;
            return this;
        }

        /**
         * IPFS CID of the default metadata exported for the video
         */
        public Builder nftMetadataCid(String nftMetadataCid) {
            Utils.checkNotNull(nftMetadataCid, "nftMetadataCid");
            this.nftMetadataCid = Optional.ofNullable(nftMetadataCid);
            return this;
        }

        /**
         * IPFS CID of the default metadata exported for the video
         */
        public Builder nftMetadataCid(Optional<? extends String> nftMetadataCid) {
            Utils.checkNotNull(nftMetadataCid, "nftMetadataCid");
            this.nftMetadataCid = nftMetadataCid;
            return this;
        }

        /**
         * URL for the metadata file with the IPFS protocol
         */
        public Builder nftMetadataUrl(String nftMetadataUrl) {
            Utils.checkNotNull(nftMetadataUrl, "nftMetadataUrl");
            this.nftMetadataUrl = Optional.ofNullable(nftMetadataUrl);
            return this;
        }

        /**
         * URL for the metadata file with the IPFS protocol
         */
        public Builder nftMetadataUrl(Optional<? extends String> nftMetadataUrl) {
            Utils.checkNotNull(nftMetadataUrl, "nftMetadataUrl");
            this.nftMetadataUrl = nftMetadataUrl;
            return this;
        }

        /**
         * URL to access metadata file via HTTP through an IPFS
         * gateway
         * 
         */
        public Builder nftMetadataGatewayUrl(String nftMetadataGatewayUrl) {
            Utils.checkNotNull(nftMetadataGatewayUrl, "nftMetadataGatewayUrl");
            this.nftMetadataGatewayUrl = Optional.ofNullable(nftMetadataGatewayUrl);
            return this;
        }

        /**
         * URL to access metadata file via HTTP through an IPFS
         * gateway
         * 
         */
        public Builder nftMetadataGatewayUrl(Optional<? extends String> nftMetadataGatewayUrl) {
            Utils.checkNotNull(nftMetadataGatewayUrl, "nftMetadataGatewayUrl");
            this.nftMetadataGatewayUrl = nftMetadataGatewayUrl;
            return this;
        }
        
        public TaskIpfs build() {
            return new TaskIpfs(
                videoFileCid,
                videoFileUrl,
                videoFileGatewayUrl,
                nftMetadataCid,
                nftMetadataUrl,
                nftMetadataGatewayUrl);
        }
    }
}

