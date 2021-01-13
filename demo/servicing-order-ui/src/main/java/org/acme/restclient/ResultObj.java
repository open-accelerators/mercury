package org.acme.restclient;

import java.util.List;

public class ResultObj {

    String dueDiligence;
    String riskCheck;
    String creditCheck;
    String eligibilityCheck;

    public String getDueDiligence() {
        return dueDiligence;
    }

    public void setDueDiligence(String dueDiligence) {
        this.dueDiligence = dueDiligence;
    }

    public String getRiskCheck() {
        return riskCheck;
    }

    public void setRiskCheck(String riskCheck) {
        this.riskCheck = riskCheck;
    }

    public String getCreditCheck() {
        return creditCheck;
    }

    public void setCreditCheck(String creditCheck) {
        this.creditCheck = creditCheck;
    }

    public String getEligibilityCheck() {
        return eligibilityCheck;
    }

    public void setEligibilityCheck(String eligibilityCheck) {
        this.eligibilityCheck = eligibilityCheck;
    }
}
