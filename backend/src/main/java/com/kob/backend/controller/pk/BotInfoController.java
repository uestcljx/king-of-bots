package com.kob.backend.controller.pk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 李姜辛
 * @description
 * @since 2022/9/1 20:43
 */
@RestController
@RequestMapping("/pk")
public class BotInfoController {
    @RequestMapping("/getbotinfo")
    public Map<String, String> getBotInfo(){
        HashMap<String, String> map = new HashMap<>();
        map.put("name", "apple");
        map.put("rating", "1500");
        return map;
        // test git hha
    }
}
