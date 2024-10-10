/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;
import studio.livepeer.livepeer.utils.LazySingletonValue;
import studio.livepeer.livepeer.utils.Utils;


public class Spec {

    /**
     * Name of the NFT metadata template to export. 'player'
     * will embed the Livepeer Player on the NFT while 'file'
     * will reference only the immutable MP4 files.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("nftMetadataTemplate")
    private Optional<? extends NftMetadataTemplate> nftMetadataTemplate;

    /**
     * Additional data to add to the NFT metadata exported to
     * IPFS. Will be deep merged with the default metadata
     * exported.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("nftMetadata")
    private Optional<? extends NftMetadata> nftMetadata;

    @JsonCreator
    public Spec(
            @JsonProperty("nftMetadataTemplate") Optional<? extends NftMetadataTemplate> nftMetadataTemplate,
            @JsonProperty("nftMetadata") Optional<? extends NftMetadata> nftMetadata) {
        Utils.checkNotNull(nftMetadataTemplate, "nftMetadataTemplate");
        Utils.checkNotNull(nftMetadata, "nftMetadata");
        this.nftMetadataTemplate = nftMetadataTemplate;
        this.nftMetadata = nftMetadata;
    }
    
    public Spec() {
        this(Optional.empty(), Optional.empty());
    }

    /**
     * Name of the NFT metadata template to export. 'player'
     * will embed the Livepeer Player on the NFT while 'file'
     * will reference only the immutable MP4 files.
     * 
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<NftMetadataTemplate> nftMetadataTemplate() {
        return (Optional<NftMetadataTemplate>) nftMetadataTemplate;
    }

    /**
     * Additional data to add to the NFT metadata exported to
     * IPFS. Will be deep merged with the default metadata
     * exported.
     * 
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<NftMetadata> nftMetadata() {
        return (Optional<NftMetadata>) nftMetadata;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Name of the NFT metadata template to export. 'player'
     * will embed the Livepeer Player on the NFT while 'file'
     * will reference only the immutable MP4 files.
     * 
     */
    public Spec withNftMetadataTemplate(NftMetadataTemplate nftMetadataTemplate) {
        Utils.checkNotNull(nftMetadataTemplate, "nftMetadataTemplate");
        this.nftMetadataTemplate = Optional.ofNullable(nftMetadataTemplate);
        return this;
    }

    /**
     * Name of the NFT metadata template to export. 'player'
     * will embed the Livepeer Player on the NFT while 'file'
     * will reference only the immutable MP4 files.
     * 
     */
    public Spec withNftMetadataTemplate(Optional<? extends NftMetadataTemplate> nftMetadataTemplate) {
        Utils.checkNotNull(nftMetadataTemplate, "nftMetadataTemplate");
        this.nftMetadataTemplate = nftMetadataTemplate;
        return this;
    }

    /**
     * Additional data to add to the NFT metadata exported to
     * IPFS. Will be deep merged with the default metadata
     * exported.
     * 
     */
    public Spec withNftMetadata(NftMetadata nftMetadata) {
        Utils.checkNotNull(nftMetadata, "nftMetadata");
        this.nftMetadata = Optional.ofNullable(nftMetadata);
        return this;
    }

    /**
     * Additional data to add to the NFT metadata exported to
     * IPFS. Will be deep merged with the default metadata
     * exported.
     * 
     */
    public Spec withNftMetadata(Optional<? extends NftMetadata> nftMetadata) {
        Utils.checkNotNull(nftMetadata, "nftMetadata");
        this.nftMetadata = nftMetadata;
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
        Spec other = (Spec) o;
        return 
            Objects.deepEquals(this.nftMetadataTemplate, other.nftMetadataTemplate) &&
            Objects.deepEquals(this.nftMetadata, other.nftMetadata);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            nftMetadataTemplate,
            nftMetadata);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Spec.class,
                "nftMetadataTemplate", nftMetadataTemplate,
                "nftMetadata", nftMetadata);
    }
    
    public final static class Builder {
 
        private Optional<? extends NftMetadataTemplate> nftMetadataTemplate;
 
        private Optional<? extends NftMetadata> nftMetadata = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Name of the NFT metadata template to export. 'player'
         * will embed the Livepeer Player on the NFT while 'file'
         * will reference only the immutable MP4 files.
         * 
         */
        public Builder nftMetadataTemplate(NftMetadataTemplate nftMetadataTemplate) {
            Utils.checkNotNull(nftMetadataTemplate, "nftMetadataTemplate");
            this.nftMetadataTemplate = Optional.ofNullable(nftMetadataTemplate);
            return this;
        }

        /**
         * Name of the NFT metadata template to export. 'player'
         * will embed the Livepeer Player on the NFT while 'file'
         * will reference only the immutable MP4 files.
         * 
         */
        public Builder nftMetadataTemplate(Optional<? extends NftMetadataTemplate> nftMetadataTemplate) {
            Utils.checkNotNull(nftMetadataTemplate, "nftMetadataTemplate");
            this.nftMetadataTemplate = nftMetadataTemplate;
            return this;
        }

        /**
         * Additional data to add to the NFT metadata exported to
         * IPFS. Will be deep merged with the default metadata
         * exported.
         * 
         */
        public Builder nftMetadata(NftMetadata nftMetadata) {
            Utils.checkNotNull(nftMetadata, "nftMetadata");
            this.nftMetadata = Optional.ofNullable(nftMetadata);
            return this;
        }

        /**
         * Additional data to add to the NFT metadata exported to
         * IPFS. Will be deep merged with the default metadata
         * exported.
         * 
         */
        public Builder nftMetadata(Optional<? extends NftMetadata> nftMetadata) {
            Utils.checkNotNull(nftMetadata, "nftMetadata");
            this.nftMetadata = nftMetadata;
            return this;
        }
        
        public Spec build() {
            if (nftMetadataTemplate == null) {
                nftMetadataTemplate = _SINGLETON_VALUE_NftMetadataTemplate.value();
            }            return new Spec(
                nftMetadataTemplate,
                nftMetadata);
        }

        private static final LazySingletonValue<Optional<? extends NftMetadataTemplate>> _SINGLETON_VALUE_NftMetadataTemplate =
                new LazySingletonValue<>(
                        "nftMetadataTemplate",
                        "\"file\"",
                        new TypeReference<Optional<? extends NftMetadataTemplate>>() {});
    }
}

