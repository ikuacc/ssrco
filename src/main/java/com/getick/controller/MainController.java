package com.getick.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.getick.service.MainService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * 主Controller
 *
 * @author ikuacc
 * Created on 2019/6/17
 */
@CrossOrigin
@Controller
@RestController
@RequestMapping(value = "/Main", produces = "text/html;charset=UTF-8", method = RequestMethod.POST)
public class MainController {

    @Resource
    private MainService mainService;

    @RequestMapping(value = "/postAll.do")
    public String postCommon() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(mainService.getAllUser());
    }
}
