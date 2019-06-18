package com.getick.constants;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 主Constants
 *
 * @author ikuacc
 * Created on 2019/6/18
 */
@Component
public class MainConstants {
    @Value("${mudb.path}")
    private String mudbPath;

    public void setMudbPath(String mudbPath) {
        this.mudbPath = mudbPath;
    }

    public String getMudbPath() {
        return mudbPath;
    }
}
