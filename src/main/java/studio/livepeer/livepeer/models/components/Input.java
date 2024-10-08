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


@JsonDeserialize(using = Input._Deserializer.class)
public class Input {

    @JsonValue
    private TypedObject value;
    
    private Input(TypedObject value) {
        this.value = value;
    }

    public static Input of(Input1 value) {
        Utils.checkNotNull(value, "value");
        return new Input(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<Input1>(){}));
    }

    public static Input of(Input2 value) {
        Utils.checkNotNull(value, "value");
        return new Input(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<Input2>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code studio.livepeer.livepeer.models.components.Input1}</li>
     * <li>{@code studio.livepeer.livepeer.models.components.Input2}</li>
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
        Input other = (Input) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<Input> {

        public _Deserializer() {
            super(Input.class, false,
                  TypeReferenceWithShape.of(new TypeReference<studio.livepeer.livepeer.models.components.Input2>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<studio.livepeer.livepeer.models.components.Input1>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(Input.class,
                "value", value);
    }
 
}
