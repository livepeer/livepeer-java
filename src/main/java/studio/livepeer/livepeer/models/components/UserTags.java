/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.components;

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


@JsonDeserialize(using = UserTags._Deserializer.class)
public class UserTags {

    @com.fasterxml.jackson.annotation.JsonValue
    private TypedObject value;
    
    private UserTags(TypedObject value) {
        this.value = value;
    }

    public static UserTags of(String value) {
        Utils.checkNotNull(value, "value");
        return new UserTags(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<String>(){}));
    }

    public static UserTags of(double value) {
        Utils.checkNotNull(value, "value");
        return new UserTags(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<Double>(){}));
    }

    public static UserTags of(java.util.List<UserTags3> value) {
        Utils.checkNotNull(value, "value");
        return new UserTags(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<java.util.List<UserTags3>>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code String}</li>
     * <li>{@code double}</li>
     * <li>{@code java.util.List<UserTags3>}</li>
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
        UserTags other = (UserTags) o;
        return java.util.Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends studio.livepeer.livepeer.utils.OneOfDeserializer<UserTags> {

        public _Deserializer() {
            super(UserTags.class,
                  Utils.TypeReferenceWithShape.of(new TypeReference<String>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<Double>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<java.util.List<UserTags3>>() {}, Utils.JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(UserTags.class,
                "value", value);
    }
 
}
