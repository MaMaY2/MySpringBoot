package org.game.stage;

import org.apache.log4j.Logger;
import org.junit.Test;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Stiles on 2017/9/16.
 */
public class IPHostTest extends HttpServlet{
    private static Logger logger = Logger.getLogger(IPHostTest.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
        logger.info("doPost");
        logger.info("remote hostname: "+req.getRemoteHost());
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
    }

    @Override
    public void destroy() {
        super.destroy();
        logger.info("destroy");
    }

    @Override
    public void init() throws ServletException {
        super.init();
        logger.info("init");
    }

    @Test
    public void ipTest(){
        logger.info("");
    }
    public static void main(String[] args){
        logger.info("start");
    }
}
