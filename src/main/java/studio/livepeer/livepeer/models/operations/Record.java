/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package studio.livepeer.livepeer.models.operations;


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
 * Record - Flag indicating if the response should only include recorded
 * sessions
 * 
 */

@JsonDeserialize(using = Record._Deserializer.class)
public class Record {

    @JsonValue
    private TypedObject value;
    
    private Record(TypedObject value) {
        this.value = value;
    }

    public static Record of(boolean value) {
        Utils.checkNotNull(value, "value");
        return new Record(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<java.lang.Boolean>(){}));
    }

    public static Record of(long value) {
        Utils.checkNotNull(value, "value");
        return new Record(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<java.lang.Long>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code boolean}</li>
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
        Record other = (Record) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<Record> {

        public _Deserializer() {
            super(Record.class, false,
                  TypeReferenceWithShape.of(new TypeReference<java.lang.Long>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<java.lang.Boolean>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(Record.class,
                "value", value);
    }
 
}
