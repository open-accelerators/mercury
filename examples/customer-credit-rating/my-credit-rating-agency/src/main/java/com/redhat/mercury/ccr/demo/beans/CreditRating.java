
package com.redhat.mercury.ccr.demo.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Root Type for SubmitCreditRatingRequest
 * <p>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "tin",
        "score"
})
public class CreditRating {

    /**
     * Credit Rating Score
     * (Required)
     */
    @JsonProperty("score")
    @JsonPropertyDescription("Credit Rating Score")
    private Integer score;
    /**
     * Tax Identification Number
     * (Required)
     */
    @JsonProperty("tin")
    @JsonPropertyDescription("Tax Identification Number")
    private String tin;

    /**
     * Credit Rating Score
     * (Required)
     */
    @JsonProperty("score")
    public Integer getScore() {
        return score;
    }

    /**
     * Credit Rating Score
     * (Required)
     */
    @JsonProperty("score")
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * Tax Identification Number
     * (Required)
     */
    @JsonProperty("tin")
    public String getTin() {
        return tin;
    }

    /**
     * Tax Identification Number
     * (Required)
     */
    @JsonProperty("tin")
    public void setTin(String tin) {
        this.tin = tin;
    }

}
