package org.parcore.domain;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@ApiModel(description = "A list of preservation actions")
public class PreservationActions {

    @SerializedName("preservationActions")
    private List<PreservationAction> preservationActions = null;

    public void addPreservationAction(PreservationAction preservationAction) {
        if (this.preservationActions == null) {
            this.preservationActions = new ArrayList<>();
        }
        this.preservationActions.add(preservationAction);
    }

    /**
     * Get preservationActions
     *
     * @return preservationActions
     **/
    @ApiModelProperty(value = "")
    public List<PreservationAction> getPreservationActions() {
        if (this.preservationActions == null) {
            this.preservationActions = new ArrayList<>();
        }
        return preservationActions;
    }

    public void setPreservationActions(List<PreservationAction> preservationActions) {
        this.preservationActions = preservationActions;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PreservationActions preservationActions = (PreservationActions) o;
        return Objects.equals(this.preservationActions, preservationActions.preservationActions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(preservationActions);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PreservationActions {\n");

        sb.append("    preservationActions: ").append(toIndentedString(preservationActions)).append("\n");
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
