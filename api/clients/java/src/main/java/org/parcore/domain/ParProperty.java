package org.parcore.domain;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * ParProperty
 */
@SuppressWarnings("unused")
public class ParProperty {

    @SerializedName("equivalentTo")
    private List<String> equivalentTo = null;

    @SerializedName("id")
    private ParIdentifier id = null;

    @SerializedName("localLastModifiedDate")
    private String localLastModifiedDate = null;

    @SerializedName("units")
    private String units = null;

    @SerializedName("value")
    private String value = null;

    public void addEquivalentToItem(String equivalentToItem) {
        if (this.equivalentTo == null) {
            this.equivalentTo = new ArrayList<>();
        }
        this.equivalentTo.add(equivalentToItem);
    }

    /**
     * Equivalent To allows for assertions that a specific property is equivalent to named properties in other schemas or registries, for example, an Aspect Ration property for a video may be declared to be equivalent to the ebucore:aspectRatio, even if the representation of the measurement is different
     * @return equivalentTo
     **/
    @ApiModelProperty(value = "Equivalent To allows for assertions that a specific property is equivalent to named properties in other schemas or registries, for example, an Aspect Ration property for a video may be declared to be equivalent to the ebucore:aspectRatio, even if the representation of the measurement is different")
    public List<String> getEquivalentTo() {
        return equivalentTo;
    }

    public void setEquivalentTo(List<String> equivalentTo) {
        this.equivalentTo = equivalentTo;
    }

    /**
     * Get id
     * @return id
     **/
    @ApiModelProperty(required = true, value = "")
    public ParIdentifier getId() {
        return id;
    }

    public void setId(ParIdentifier id) {
        this.id = id;
    }

    /**
     * Get localLastModifiedDate
     * @return localLastModifiedDate
     **/
    @ApiModelProperty(value = "")
    public String getLocalLastModifiedDate() {
        return localLastModifiedDate;
    }

    public void setLocalLastModifiedDate(String localLastModifiedDate) {
        this.localLastModifiedDate = localLastModifiedDate;
    }

    /**
     * Property Units allow for the specification of the units in which the value is given, for example an image size may be given in pixels (px), video bitrates may be specified in bits per second (bps) or kilobits per second (kbps).
     * @return units
     **/
    @ApiModelProperty(value = "Property Units allow for the specification of the units in which the value is given, for example an image size may be given in pixels (px), video bitrates may be specified in bits per second (bps) or kilobits per second (kbps).")
    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    /**
     * Property Value is the measured value of a specific property for a particular object.
     * @return value
     **/
    @ApiModelProperty(value = "Property Value is the measured value of a specific property for a particular object.")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ParProperty parProperty = (ParProperty) o;
        return Objects.equals(this.equivalentTo, parProperty.equivalentTo) &&
                Objects.equals(this.id, parProperty.id) &&
                Objects.equals(this.localLastModifiedDate, parProperty.localLastModifiedDate) &&
                Objects.equals(this.units, parProperty.units) &&
                Objects.equals(this.value, parProperty.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(equivalentTo, id, localLastModifiedDate, units, value);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ParProperty {\n");

        sb.append("    equivalentTo: ").append(toIndentedString(equivalentTo)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    localLastModifiedDate: ").append(toIndentedString(localLastModifiedDate)).append("\n");
        sb.append("    units: ").append(toIndentedString(units)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
