package com.getick.timer;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 定时任务
 *
 * @author ikuacc
 * Created on 2018/4/17
 */
@Component
public class ScheduledTasks {

    @Scheduled(cron = "0 0 4 * * ?")
    public void clearCommodityDayHot() {

    }
}

