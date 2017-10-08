package org.game.stage.Filter;

import org.apache.log4j.Logger;
import javax.servlet.*;
import javax.servlet.FilterConfig;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by Stiles on 2017/8/20.
 */
public class FilterSetup implements Filter {
    private Logger logger = Logger.getLogger(FilterSetup.class);
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        logger.info("doFilter...");
        boolean flag =false;
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        flag = httpServletRequest.getRequestURL().toString().contains("hello") ?  true : false;
        if (flag){
            logger.info("Filter invoking");
        }
        //servletRequest.setCharacterEncoding("UTF-8");
        servletResponse.setCharacterEncoding("UTF-8");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
    }
}
