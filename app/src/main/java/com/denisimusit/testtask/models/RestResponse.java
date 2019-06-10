
package com.denisimusit.testtask.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;


@SuppressWarnings("unused")
public class RestResponse {

    @SerializedName("messages")
    private List<String> messages;
    @SerializedName("result")
    private List<Result> result;

    public RestResponse(List<String> mMessages,
                        List<Result> mResult) {
        this.messages = mMessages;
        this.result = mResult;
    }

    public List<String> getMessages() {
        return messages;
    }

    public List<Result> getResult() {
        return result;
    }

    @Override
    public String toString() {
        return "RestResponse{" +
                "messages=" + messages +
                ", result=" + result +
                '}';
    }
}
