package com.termux.api;

import android.content.Context;
import android.content.Intent;
import android.util.JsonWriter;

import com.termux.api.util.ResultReturner;

import org.json.JSONObject;

public class SmsSendAPI {

    static void onReceive(Context context, final JSONObject opts) {
        ResultReturner.returnData(context, new ResultReturner.ResultJsonWriter() {
            @Override
            public void writeJson(JsonWriter out) throws Exception {
                out.beginObject();
                out.name("error").value("Sending SMS is no longer permitted by Google");
                out.endObject();
            }
        });
    }

}
