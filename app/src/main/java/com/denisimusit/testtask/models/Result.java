
package com.denisimusit.testtask.models;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Result {

    @SerializedName("abbr")
    private String mAbbr;
    @SerializedName("area")
    private String mArea;
    @SerializedName("capital")
    private String mCapital;
    @SerializedName("country")
    private String mCountry;
    @SerializedName("id")
    private Long mId;
    @SerializedName("largest_city")
    private String mLargestCity;
    @SerializedName("name")
    private String mName;

    public Result(String mAbbr,
                  String mArea,
                  String mCapital,
                  String mCountry,
                  Long mId,
                  String mLargestCity,
                  String mName) {
        this.mAbbr = mAbbr;
        this.mArea = mArea;
        this.mCapital = mCapital;
        this.mCountry = mCountry;
        this.mId = mId;
        this.mLargestCity = mLargestCity;
        this.mName = mName;
    }

    public String getmAbbr() {
        return mAbbr;
    }

    public String getmArea() {
        return mArea;
    }

    public String getmCapital() {
        return mCapital;
    }

    public String getmCountry() {
        return mCountry;
    }

    public Long getmId() {
        return mId;
    }

    public String getmLargestCity() {
        return mLargestCity;
    }

    public String getmName() {
        return mName;
    }

    @Override
    public String toString() {
        return "Result{" +
                "mAbbr='" + mAbbr + '\'' +
                ", mArea='" + mArea + '\'' +
                ", mCapital='" + mCapital + '\'' +
                ", mCountry='" + mCountry + '\'' +
                ", mId=" + mId +
                ", mLargestCity='" + mLargestCity + '\'' +
                ", mName='" + mName + '\'' +
                '}';
    }
}
