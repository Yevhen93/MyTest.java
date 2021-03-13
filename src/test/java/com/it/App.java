package com.it;

import com.it.helpers.CommonHelper;
import com.it.helpers.DashboardHelper;
import com.it.helpers.EmailHelper;
import com.it.helpers.LoginHelper;

public class App {
    public CommonHelper common;
    public LoginHelper login;
    public DashboardHelper dashboard;
    public EmailHelper email;

    public App() {
        this.common = new CommonHelper();
        this.login = new LoginHelper();
        this.dashboard = new DashboardHelper();
        this.email = new EmailHelper();
    }
}
