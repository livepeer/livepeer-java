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
 * QueryParamTo - End timestamp for the query range (exclusive)
 */

@JsonDeserialize(using = QueryParamTo._Deserializer.class)
public class QueryParamTo {

    @com.fasterxml.jackson.annotation.JsonValue
    private TypedObject value;
    
    private QueryParamTo(TypedObject value) {
        this.value = value;
    }

    public static QueryParamTo of(OffsetDateTime value) {
        Utils.checkNotNull(value, "value");
        return new QueryParamTo(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<OffsetDateTime>(){}));
    }

    public static QueryParamTo of(long value) {
        Utils.checkNotNull(value, "value");
        return new QueryParamTo(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<Long>(){}));
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
        QueryParamTo other = (QueryParamTo) o;
        return java.util.Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends studio.livepeer.livepeer.utils.OneOfDeserializer<QueryParamTo> {

        public _Deserializer() {
            super(QueryParamTo.class,
                  Utils.TypeReferenceWithShape.of(new TypeReference<OffsetDateTime>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<Long>() {}, Utils.JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(QueryParamTo.class,
                "value", value);
    }
 
}
