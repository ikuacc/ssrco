package com.getick.service.impl;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.getick.constants.MainConstants;
import com.getick.domain.JsonUser;
import com.getick.service.MainService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.getick.utils.Util.getCollectionType;

/**
 * 主ServiceImpl
 *
 * @author ikuacc
 * Created on 2019/6/17
 */
@Service
public class MainServiceImpl implements MainService {

    @Resource
    private MainConstants mainConstants;

    @Override
    public List<JsonUser> getAllUser() {
        ObjectMapper mapper = new ObjectMapper();
        JavaType javaType = getCollectionType(ArrayList.class, JsonUser.class);
        List<JsonUser> jsonUsers = null;
        try {
            jsonUsers = mapper.readValue(new File(mainConstants.getMudbPath()), javaType);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonUsers;
    }
}
