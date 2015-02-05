package com.horsesAndPonys.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("HorsesAndPonysService")
public interface HorsesAndPonysService extends RemoteService {
    // Sample interface method of remote interface
    String getMessage(String msg);

    /**
     * Utility/Convenience class.
     * Use HorsesAndPonysService.App.getInstance() to access static instance of HorsesAndPonysServiceAsync
     */
    public static class App {
        private static HorsesAndPonysServiceAsync ourInstance = GWT.create(HorsesAndPonysService.class);

        public static synchronized HorsesAndPonysServiceAsync getInstance() {
            return ourInstance;
        }
    }
}
