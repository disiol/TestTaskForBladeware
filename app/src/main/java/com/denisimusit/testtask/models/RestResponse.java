
package com.denisimusit.testtask.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;


@SuppressWarnings("unused")
public class RestResponse {

    @SerializedName("messages")
    private List<String> mMessages;
    @SerializedName("result")
    private List<Result> mResult;

    public RestResponse(List<String> mMessages,
                        List<Result> mResult) {
        this.mMessages = mMessages;
        this.mResult = mResult;
    }

    public List<String> getmMessages() {
        return mMessages;
    }

    public List<Result> getmResult() {
        return mResult;
    }

    @Override
    public String toString() {
        return "RestResponse{" +
                "mMessages=" + mMessages +
                ", mResult=" + mResult +
                '}';
    }
}
