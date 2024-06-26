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
import studio.livepeer.livepeer.utils.Utils;

import java.time.OffsetDateTime;
import java.time.LocalDate;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import studio.livepeer.livepeer.utils.TypedObject;
import studio.livepeer.livepeer.utils.Utils.JsonShape;

/**
 * To - End timestamp for the query range (exclusive)
 */

@JsonDeserialize(using = To._Deserializer.class)
public class To {

    @com.fasterxml.jackson.annotation.JsonValue
    private TypedObject value;
    
    private To(TypedObject value) {
        this.value = value;
    }

    public static To of(OffsetDateTime value) {
        Utils.checkNotNull(value, "value");
        return new To(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<OffsetDateTime>(){}));
    }

    public static To of(long value) {
        Utils.checkNotNull(value, "value");
        return new To(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<Long>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code OffsetDateTime}</li>
     * <li>{@code long}</li>
     * </ul>
     * 
     * <p>Use {@code instanceof} to determine what type is returned. For example:
     * 
     * <pre>
     * if (obj.value() instanceof String) {
     *     String answer = (String) obj.value();
     *     System.out.println("answer=" + answer);
     * }
     * </pre>
     * 
     * @return value of oneOf type
     **/ 
    public java.lang.Object value() {
        return value.value();
    }    
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        To other = (To) o;
        return java.util.Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends studio.livepeer.livepeer.utils.OneOfDeserializer<To> {

        public _Deserializer() {
            super(To.class,
                  Utils.TypeReferenceWithShape.of(new TypeReference<OffsetDateTime>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<Long>() {}, Utils.JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(To.class,
                "value", value);
    }
 
}
