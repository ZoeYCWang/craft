package com.craft.ctrl;

import com.zoe.snow.auth.AuthBean;
import com.zoe.snow.bean.BeanFactory;
import com.zoe.snow.context.request.Request;
import com.zoe.snow.context.response.Response;
import com.zoe.snow.context.session.Session;
import com.zoe.snow.model.support.user.UserHelper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2018/5/14.
 */
public class BaseController {
    @Autowired
    protected Session session;
    @Autowired
    protected Request request;
    @Autowired
    protected UserHelper userHelper;
    @Autowired
    protected Response response;

    public String getToken() {
        AuthBean authBean = BeanFactory.getBean(AuthBean.class);
        if (authBean.getAuthSwitch()){
            if (userHelper.getUser() == null) {
                response.redirectTo("/mip/user/v/login");
                return "";
            }
            return userHelper.getUser().getToken();
        }
        return "";
    }

    public Session getSession() {
        return this.session;
    }

}
