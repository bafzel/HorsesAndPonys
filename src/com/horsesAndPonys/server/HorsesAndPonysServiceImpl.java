package com.horsesAndPonys.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.horsesAndPonys.client.HorsesAndPonysService;

public class HorsesAndPonysServiceImpl extends RemoteServiceServlet implements HorsesAndPonysService {
    // Implementation of sample interface method
    public String getMessage(String msg) {
        return "Client said: \"" + msg + "\"<br>Server answered: \"Hi!\"";
    }
}