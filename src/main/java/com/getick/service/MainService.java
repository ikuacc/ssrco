package com.getick.service;

import com.getick.domain.JsonUser;

import java.util.List;

/**
 * 主Service
 *
 * @author ikuacc
 * Created on 2019/6/17
 */
public interface MainService {

    /**
     * 读取json文件中的所有信息
     *
     * @return List<User> json文件内容
     */
    List<JsonUser> getAllUser();
}
