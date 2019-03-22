package com.mjw.http.user;

import com.mjw.base.util.BaseUtilApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Min_j
 */
@SpringBootApplication
public class HttpUserApplication extends BaseUtilApplication {

    public static void main(String[] args) {
        startHttp(HttpUserApplication.class,args);
    }

    @Override
    protected String getApplicationName() {
        return "http-user";
    }
}
