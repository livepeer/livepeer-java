/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.components;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import studio.livepeer.livepeer.utils.Utils;

/**
 * NftMetadataTemplate - Name of the NFT metadata template to export. 'player'
 * will embed the Livepeer Player on the NFT while 'file'
 * will reference only the immutable MP4 files.
 * 
 */
public enum NftMetadataTemplate {
    FILE("file"),
    PLAYER("player");

    @JsonValue
    private final String value;

    private NftMetadataTemplate(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
