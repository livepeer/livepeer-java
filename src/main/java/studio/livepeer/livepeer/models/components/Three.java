/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.components;


import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import studio.livepeer.livepeer.utils.OneOfDeserializer;
import studio.livepeer.livepeer.utils.TypedObject;
import studio.livepeer.livepeer.utils.Utils.JsonShape;
import studio.livepeer.livepeer.utils.Utils.TypeReferenceWithShape;
import studio.livepeer.livepeer.utils.Utils;


@JsonDeserialize(using = Three._Deserializer.class)
public class Three {

    @JsonValue
    private TypedObject value;
    
    private Three(TypedObject value) {
        this.value = value;
    }

    public static Three of(String value) {
        Utils.checkNotNull(value, "value");
        return new Three(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<String>(){}));
    }

    public static Three of(double value) {
        Utils.checkNotNull(value, "value");
        return new Three(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<java.lang.Double>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code java.lang.String}</li>
     * <li>{@code double}</li>
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
        Three other = (Three) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<Three> {

        public _Deserializer() {
            super(Three.class, false,
                  TypeReferenceWithShape.of(new TypeReference<Double>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<String>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(Three.class,
                "value", value);
    }
 
}
