package com.muili.insurance;

public class ClaimsData {
    private final String claimId;
    private final String claimMonth;
    private final String policyHolder;
    private final int age;
    private final String gender;
    private final String claimType;
    private final double claimAmount;
    private final String claimStatus;


    public ClaimsData(String claimId, String claimMonth, String policyHolder,
                      int age, String gender, String claimType, double claimAmount, String claimStatus) {
        this.claimId = claimId;
        this.claimMonth = claimMonth;
        this.policyHolder = policyHolder;
        this.age = age;
        this.gender = gender;
        this.claimType = claimType;
        this.claimAmount = claimAmount;
        this.claimStatus = claimStatus;
    }

    public String getClaimId() {
        return claimId;
    }

    public String getClaimMonth() {
        return claimMonth;
    }

    public String getPolicyHolder() {
        return policyHolder;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getClaimType() {
        return claimType;
    }

    public double getClaimAmount() {
        return claimAmount;
    }

    public String getClaimStatus() {
        return claimStatus;
    }

    @Override
    public String toString() {
        return "ClaimsData{" +
                "claimId='" + claimId + '\'' +
                ", claimMonth='" + claimMonth + '\'' +
                ", policyHolder='" + policyHolder + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", claimType='" + claimType + '\'' +
                ", claimAmount=" + claimAmount +
                ", claimStatus='" + claimStatus + '\'' +
                '}';
    }
}
