package com.getick.domain;

/**
 * json文件信息
 *
 * @author ikuacc
 * Created on 2019/6/17
 */
public class JsonUser {
    private long d;
    private int enable;
    private String method;
    private String obfs;
    private String passwd;
    private int port;
    private String protocol;
    private long transfer_enable;
    private long u;
    private String user;

    public long getD() {
        return d;
    }

    public void setD(long d) {
        this.d = d;
    }

    public int getEnable() {
        return enable;
    }

    public void setEnable(int enable) {
        this.enable = enable;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getObfs() {
        return obfs;
    }

    public void setObfs(String obfs) {
        this.obfs = obfs;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public long getTransfer_enable() {
        return transfer_enable;
    }

    public void setTransfer_enable(long transfer_enable) {
        this.transfer_enable = transfer_enable;
    }

    public long getU() {
        return u;
    }

    public void setU(long u) {
        this.u = u;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
