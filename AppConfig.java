package com.devops.config;

import java.io.Serializable;

/**
 * AppConfig represents the runtime configuration for the Java Application.
 * Mapping 1:1 with config.json.
 */
public class AppConfig implements Serializable {
    private static final long serialVersionUID = 1L;

    private int port;
    private boolean debug;
    private String env;

    public AppConfig() {
    }

    public AppConfig(int port, boolean debug, String env) {
        this.port = port;
        this.debug = debug;
        this.env = env;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public boolean isDebug() {
        return debug;
    }

    public void setDebug(boolean debug) {
        this.debug = debug;
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }

    @Override
    public String toString() {
        return "AppConfig{" +
                "port=" + port +
                ", debug=" + debug +
                ", env='" + env + '\'' +
                '}';
    }
}
