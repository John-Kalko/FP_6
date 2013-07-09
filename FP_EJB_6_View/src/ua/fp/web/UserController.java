package ua.fp.web;

import ua.fp.domain.UserAccountEntity;
import ua.fp.service.UserAccountService;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.ejb.EJB;
import javax.faces.bean.SessionScoped;

/**
 * Created with IntelliJ IDEA.
 * User: Ievgen_Kalko
 * Date: 7/4/13
 * Time: 4:34 PM
 * To change this template use File | Settings | File Templates.
 */
@ManagedBean
@SessionScoped
public class UserController {

    @EJB
    private UserAccountService userAccountService;

    private String userLogin;

    private String userLang;

    private int password;

    private String bodyPage = "/template/default/defaultBody.xhtml";

    public void setBodyPage(String bodyPage) {
        this.bodyPage = bodyPage;
    }

    public String getBodyPage() {
        return bodyPage;
    }

    public String toAuthPage() {
        return "authPage";
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public void setUserLang(String userLang) {
        this.userLang = userLang;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getUserLogin() {
        UserAccountEntity res = this.userAccountService.findUser50();
        return res.getEmail();
    }

    public String getUserLang() {
        UserAccountEntity res = this.userAccountService.findUser50();
        this.userLang = res.getLanguage();
        return this.userLang;
    }

    public int getPassword() {
        return password;
    }

    public String beanMeth() {
        return "auth";
    }


}
