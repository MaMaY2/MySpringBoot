package org.game.stage.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Stiles on 2017/8/19.
 */
@Controller
public class NormalController {
    private Logger logger = Logger.getLogger(NormalController.class);
    @RequestMapping("/hello3")
    public ModelAndView getPage(){
        logger.info("hello3 hits...");
        ModelAndView mav = new ModelAndView();
        mav.setViewName("NormalHtml");
        return mav;
    }
}
