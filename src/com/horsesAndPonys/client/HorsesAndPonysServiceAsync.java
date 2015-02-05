package com.horsesAndPonys.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface HorsesAndPonysServiceAsync {
    void getMessage(String msg, AsyncCallback<String> async);
}
