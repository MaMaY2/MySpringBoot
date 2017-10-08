package org.game.stage.controller;


import org.apache.log4j.Logger;
import org.apache.tomcat.util.buf.StringUtils;
import org.game.stage.ReadPropertyFile.ReadProperty;
import org.game.stage.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by Stiles on 2017/8/6.
 */
@RestController
public class CustomerController {
    private Logger logger = Logger.getLogger(CustomerController.class);
    @Autowired
    ReadProperty readProperty;

    @RequestMapping("/hello")
    public String index(HttpServletRequest req){
        String hostname = req.getRemoteHost();
        logger.info("hostname = " + hostname);
        return "Hello World";
    }

    @RequestMapping(value = "/hello2",produces = "application/json;charset=UTF-8")
    public User getUser(){
        User user = new User();
        user.setPassWord("123");
        user.setUserName("Jim");
        user.setOtherString(readProperty.getTitle());
        return user;
    }
}
