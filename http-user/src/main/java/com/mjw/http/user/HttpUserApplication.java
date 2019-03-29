package com.mjw.http.user;

import com.mjw.basehttp.BaseHttpApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Min_j
 */
@Controller
public class HttpUserApplication extends BaseHttpApplication {

    public static void main(String[] args) {
        startHttp(HttpUserApplication.class,args);
    }

    @Override
    protected String getApplicationName() {
        return "http-user";
    }

}
