
package com.denisimusit.testtask.models;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class USA {

    @SerializedName("RestResponse")
    private RestResponse restResponse;

    public RestResponse getRestResponse() {
        return restResponse;
    }

    public void setRestResponse(RestResponse restResponse) {
        this.restResponse = restResponse;
    }

    @Override
    public String toString() {
        return "USA{" +
                "restResponse=" + restResponse +
                '}';
    }
}
