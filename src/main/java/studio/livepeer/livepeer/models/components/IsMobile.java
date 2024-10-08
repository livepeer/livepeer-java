/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.components;


import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import studio.livepeer.livepeer.utils.OneOfDeserializer;
import studio.livepeer.livepeer.utils.TypedObject;
import studio.livepeer.livepeer.utils.Utils.JsonShape;
import studio.livepeer.livepeer.utils.Utils.TypeReferenceWithShape;
import studio.livepeer.livepeer.utils.Utils;

/**
 * IsMobile - Indicates whether the stream will be pulled from a mobile source.
 */

@JsonDeserialize(using = IsMobile._Deserializer.class)
public class IsMobile {

    @JsonValue
    private TypedObject value;
    
    private IsMobile(TypedObject value) {
        this.value = value;
    }

    public static IsMobile of(One value) {
        Utils.checkNotNull(value, "value");
        return new IsMobile(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<One>(){}));
    }

    public static IsMobile of(boolean value) {
        Utils.checkNotNull(value, "value");
        return new IsMobile(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<java.lang.Boolean>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code studio.livepeer.livepeer.models.components.One}</li>
     * <li>{@code boolean}</li>
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
        IsMobile other = (IsMobile) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<IsMobile> {

        public _Deserializer() {
            super(IsMobile.class, false,
                  TypeReferenceWithShape.of(new TypeReference<java.lang.Boolean>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<studio.livepeer.livepeer.models.components.One>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(IsMobile.class,
                "value", value);
    }
 
}
