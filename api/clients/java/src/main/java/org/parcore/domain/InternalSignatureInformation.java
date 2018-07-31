package org.parcore.domain;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * PAR API
 * <p>
 * InternalSignatureInformation
 * <p>
 * Domain model for the InternalSignatureInformation object (part of the FileFormat Core Entity)
 * <p>
 * OpenAPI spec version: 1.0.0
 * <p>
 * This class is based on code auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 */
public class InternalSignatureInformation {
    @SerializedName("signatureId")
    private String signatureId = null;

    @SerializedName("signatureIdNamespace")
    private String signatureIdNamespace = null;

    @SerializedName("signatureName")
    private String signatureName = null;

    @SerializedName("signatureNote")
    private String signatureNote = null;

    @SerializedName("byteSequences")
    private List<ByteSequenceInformation> byteSequences = null;

    /**
     * Get signatureId
     *
     * @return signatureId
     **/
    @ApiModelProperty(required = true, value = "")
    public String getSignatureId() {
        return signatureId;
    }

    public void setSignatureId(String signatureId) {
        this.signatureId = signatureId;
    }

    /**
     * Get signatureIdNamespace
     *
     * @return signatureIdNamespace
     **/
    @ApiModelProperty(required = true, value = "")
    public String getSignatureIdNamespace() {
        return signatureIdNamespace;
    }

    public void setSignatureIdNamespace(String signatureIdNamespace) {
        this.signatureIdNamespace = signatureIdNamespace;
    }

    /**
     * Get signatureName
     *
     * @return signatureName
     **/
    @ApiModelProperty(value = "")
    public String getSignatureName() {
        return signatureName;
    }

    public void setSignatureName(String signatureName) {
        this.signatureName = signatureName;
    }

    /**
     * Get signatureNote
     *
     * @return signatureNote
     **/
    @ApiModelProperty(value = "")
    public String getSignatureNote() {
        return signatureNote;
    }

    public void setSignatureNote(String signatureNote) {
        this.signatureNote = signatureNote;
    }

    public void addByteSequencesItem(ByteSequenceInformation byteSequencesItem) {
        if (this.byteSequences == null) {
            this.byteSequences = new ArrayList<>();
        }
        this.byteSequences.add(byteSequencesItem);
    }

    /**
     * Get byteSequences
     *
     * @return byteSequences
     **/
    @ApiModelProperty(value = "")
    public List<ByteSequenceInformation> getByteSequences() {
        return byteSequences;
    }

    public void setByteSequences(List<ByteSequenceInformation> byteSequences) {
        this.byteSequences = byteSequences;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InternalSignatureInformation internalSignatureInformation = (InternalSignatureInformation) o;
        return Objects.equals(this.signatureId, internalSignatureInformation.signatureId) &&
                Objects.equals(this.signatureIdNamespace, internalSignatureInformation.signatureIdNamespace) &&
                Objects.equals(this.signatureName, internalSignatureInformation.signatureName) &&
                Objects.equals(this.signatureNote, internalSignatureInformation.signatureNote) &&
                Objects.equals(this.byteSequences, internalSignatureInformation.byteSequences);
    }

    @Override
    public int hashCode() {
        return Objects.hash(signatureId, signatureIdNamespace, signatureName, signatureNote, byteSequences);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InternalSignatureInformation {\n");

        sb.append("    signatureId: ").append(toIndentedString(signatureId)).append("\n");
        sb.append("    signatureIdNamespace: ").append(toIndentedString(signatureIdNamespace)).append("\n");
        sb.append("    signatureName: ").append(toIndentedString(signatureName)).append("\n");
        sb.append("    signatureNote: ").append(toIndentedString(signatureNote)).append("\n");
        sb.append("    byteSequences: ").append(toIndentedString(byteSequences)).append("\n");
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
