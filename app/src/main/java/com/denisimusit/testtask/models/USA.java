
package com.denisimusit.testtask.models;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class USA {

    @SerializedName("RestResponse")
    private RestResponse mRestResponse;

    public RestResponse getRestResponse() {
        return mRestResponse;
    }

    public void setRestResponse(RestResponse restResponse) {
        mRestResponse = restResponse;
    }

    @Override
    public String toString() {
        return "USA{" +
                "mRestResponse=" + mRestResponse +
                '}';
    }
}
