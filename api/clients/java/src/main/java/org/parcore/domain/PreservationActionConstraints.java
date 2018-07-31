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
 * PreservationActionConstraints
 */
@SuppressWarnings("unused")
public class PreservationActionConstraints {

    @SerializedName("allowedFormats")
    private List<FileFormat> allowedFormats = null;

    @SerializedName("allowedPropertiesAllOf")
    private List<ParProperty> allowedPropertiesAllOf = null;

    @SerializedName("allowedPropertiesAnyOf")
    private List<ParProperty> allowedPropertiesAnyOf = null;

    @SerializedName("inputItemName")
    private String inputItemName = null;

    public void addAllowedFormatsItem(FileFormat allowedFormatsItem) {
        if (this.allowedFormats == null) {
            this.allowedFormats = new ArrayList<>();
        }
        this.allowedFormats.add(allowedFormatsItem);
    }

    /**
     * Get allowedFormats
     * @return allowedFormats
     **/
    @ApiModelProperty(value = "")
    public List<FileFormat> getAllowedFormats() {
        return allowedFormats;
    }

    public void setAllowedFormats(List<FileFormat> allowedFormats) {
        this.allowedFormats = allowedFormats;
    }

    public void addAllowedPropertiesAllOfItem(ParProperty allowedPropertiesAllOfItem) {
        if (this.allowedPropertiesAllOf == null) {
            this.allowedPropertiesAllOf = new ArrayList<>();
        }
        this.allowedPropertiesAllOf.add(allowedPropertiesAllOfItem);
    }

    /**
     * Get allowedPropertiesAllOf
     * @return allowedPropertiesAllOf
     **/
    @ApiModelProperty(value = "")
    public List<ParProperty> getAllowedPropertiesAllOf() {
        return allowedPropertiesAllOf;
    }

    public void setAllowedPropertiesAllOf(List<ParProperty> allowedPropertiesAllOf) {
        this.allowedPropertiesAllOf = allowedPropertiesAllOf;
    }

    public void addAllowedPropertiesAnyOfItem(ParProperty allowedPropertiesAnyOfItem) {
        if (this.allowedPropertiesAnyOf == null) {
            this.allowedPropertiesAnyOf = new ArrayList<>();
        }
        this.allowedPropertiesAnyOf.add(allowedPropertiesAnyOfItem);
    }

    /**
     * Get allowedPropertiesAnyOf
     * @return allowedPropertiesAnyOf
     **/
    @ApiModelProperty(value = "")
    public List<ParProperty> getAllowedPropertiesAnyOf() {
        return allowedPropertiesAnyOf;
    }

    public void setAllowedPropertiesAnyOf(List<ParProperty> allowedPropertiesAnyOf) {
        this.allowedPropertiesAnyOf = allowedPropertiesAnyOf;
    }

    /**
     * Get inputItemName
     * @return inputItemName
     **/
    @ApiModelProperty(value = "")
    public String getInputItemName() {
        return inputItemName;
    }

    public void setInputItemName(String inputItemName) {
        this.inputItemName = inputItemName;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PreservationActionConstraints preservationActionConstraints = (PreservationActionConstraints) o;
        return Objects.equals(this.allowedFormats, preservationActionConstraints.allowedFormats) &&
                Objects.equals(this.allowedPropertiesAllOf, preservationActionConstraints.allowedPropertiesAllOf) &&
                Objects.equals(this.allowedPropertiesAnyOf, preservationActionConstraints.allowedPropertiesAnyOf) &&
                Objects.equals(this.inputItemName, preservationActionConstraints.inputItemName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allowedFormats, allowedPropertiesAllOf, allowedPropertiesAnyOf, inputItemName);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PreservationActionConstraints {\n");

        sb.append("    allowedFormats: ").append(toIndentedString(allowedFormats)).append("\n");
        sb.append("    allowedPropertiesAllOf: ").append(toIndentedString(allowedPropertiesAllOf)).append("\n");
        sb.append("    allowedPropertiesAnyOf: ").append(toIndentedString(allowedPropertiesAnyOf)).append("\n");
        sb.append("    inputItemName: ").append(toIndentedString(inputItemName)).append("\n");
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
