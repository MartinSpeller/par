package org.parcore.domain;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

/**
 * PAR API
 * <p>
 * DocumentInformation
 * <p>
 * Domain model for the DocumentInformation object (part of the FileFormat Core Entity)
 * <p>
 * OpenAPI spec version: 1.0.0
 * <p>
 * This class is based on code auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 */
public class DocumentInformation {
    @SerializedName("documentId")
    private String documentId = null;

    @SerializedName("documentIdNamespace")
    private String documentIdNamespace = null;

    @SerializedName("displayText")
    private String displayText = null;

    @SerializedName("documentType")
    private String documentType = null;

    @SerializedName("availabilityDescription")
    private String availabilityDescription = null;

    @SerializedName("availabilityNote")
    private String availabilityNote = null;

    @SerializedName("publicationDate")
    private String publicationDate = null;

    @SerializedName("titleText")
    private String titleText = null;

    @SerializedName("documentIPR")
    private String documentIPR = null;

    @SerializedName("documentNote")
    private String documentNote = null;

    @SerializedName("author")
    private AuthorInformation author = null;

    @SerializedName("publisher")
    private PublisherInformation publisher = null;

    /**
     * Get documentId
     *
     * @return documentId
     **/
    @ApiModelProperty(required = true, value = "")
    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    /**
     * Get documentIdNamespace
     *
     * @return documentIdNamespace
     **/
    @ApiModelProperty(required = true, value = "")
    public String getDocumentIdNamespace() {
        return documentIdNamespace;
    }

    public void setDocumentIdNamespace(String documentIdNamespace) {
        this.documentIdNamespace = documentIdNamespace;
    }

    /**
     * Get displayText
     *
     * @return displayText
     **/
    @ApiModelProperty(value = "")
    public String getDisplayText() {
        return displayText;
    }

    public void setDisplayText(String displayText) {
        this.displayText = displayText;
    }

    /**
     * Get documentType
     *
     * @return documentType
     **/
    @ApiModelProperty(value = "")
    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    /**
     * Get availabilityDescription
     *
     * @return availabilityDescription
     **/
    @ApiModelProperty(value = "")
    public String getAvailabilityDescription() {
        return availabilityDescription;
    }

    public void setAvailabilityDescription(String availabilityDescription) {
        this.availabilityDescription = availabilityDescription;
    }

    /**
     * Get availabilityNote
     *
     * @return availabilityNote
     **/
    @ApiModelProperty(value = "")
    public String getAvailabilityNote() {
        return availabilityNote;
    }

    public void setAvailabilityNote(String availabilityNote) {
        this.availabilityNote = availabilityNote;
    }

    /**
     * Get publicationDate
     *
     * @return publicationDate
     **/
    @ApiModelProperty(value = "")
    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    /**
     * Get titleText
     *
     * @return titleText
     **/
    @ApiModelProperty(value = "")
    public String getTitleText() {
        return titleText;
    }

    public void setTitleText(String titleText) {
        this.titleText = titleText;
    }

    /**
     * Get documentIPR
     *
     * @return documentIPR
     **/
    @ApiModelProperty(value = "")
    public String getDocumentIPR() {
        return documentIPR;
    }

    public void setDocumentIPR(String documentIPR) {
        this.documentIPR = documentIPR;
    }

    /**
     * Get documentNote
     *
     * @return documentNote
     **/
    @ApiModelProperty(value = "")
    public String getDocumentNote() {
        return documentNote;
    }

    public void setDocumentNote(String documentNote) {
        this.documentNote = documentNote;
    }

    /**
     * Get author
     *
     * @return author
     **/
    @ApiModelProperty(value = "")
    public AuthorInformation getAuthor() {
        return author;
    }

    public void setAuthor(AuthorInformation author) {
        this.author = author;
    }

    /**
     * Get publisher
     *
     * @return publisher
     **/
    @ApiModelProperty(value = "")
    public PublisherInformation getPublisher() {
        return publisher;
    }

    public void setPublisher(PublisherInformation publisher) {
        this.publisher = publisher;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DocumentInformation documentInformation = (DocumentInformation) o;
        return Objects.equals(this.documentId, documentInformation.documentId) &&
                Objects.equals(this.documentIdNamespace, documentInformation.documentIdNamespace) &&
                Objects.equals(this.displayText, documentInformation.displayText) &&
                Objects.equals(this.documentType, documentInformation.documentType) &&
                Objects.equals(this.availabilityDescription, documentInformation.availabilityDescription) &&
                Objects.equals(this.availabilityNote, documentInformation.availabilityNote) &&
                Objects.equals(this.publicationDate, documentInformation.publicationDate) &&
                Objects.equals(this.titleText, documentInformation.titleText) &&
                Objects.equals(this.documentIPR, documentInformation.documentIPR) &&
                Objects.equals(this.documentNote, documentInformation.documentNote) &&
                Objects.equals(this.author, documentInformation.author) &&
                Objects.equals(this.publisher, documentInformation.publisher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(documentId, documentIdNamespace, displayText, documentType, availabilityDescription, availabilityNote, publicationDate, titleText, documentIPR, documentNote, author, publisher);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DocumentInformation {\n");

        sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
        sb.append("    documentIdNamespace: ").append(toIndentedString(documentIdNamespace)).append("\n");
        sb.append("    displayText: ").append(toIndentedString(displayText)).append("\n");
        sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
        sb.append("    availabilityDescription: ").append(toIndentedString(availabilityDescription)).append("\n");
        sb.append("    availabilityNote: ").append(toIndentedString(availabilityNote)).append("\n");
        sb.append("    publicationDate: ").append(toIndentedString(publicationDate)).append("\n");
        sb.append("    titleText: ").append(toIndentedString(titleText)).append("\n");
        sb.append("    documentIPR: ").append(toIndentedString(documentIPR)).append("\n");
        sb.append("    documentNote: ").append(toIndentedString(documentNote)).append("\n");
        sb.append("    author: ").append(toIndentedString(author)).append("\n");
        sb.append("    publisher: ").append(toIndentedString(publisher)).append("\n");
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
