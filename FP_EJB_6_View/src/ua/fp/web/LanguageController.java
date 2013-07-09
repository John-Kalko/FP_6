package ua.fp.web;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

/**
 * Created with IntelliJ IDEA.
 * User: Калько Евгений
 * Date: 7/7/13
 * Time: 10:56 PM
 * To change this template use File | Settings | File Templates.
 */
@ManagedBean(name = "language")
@SessionScoped
public class LanguageController implements Serializable {

    private static final long serialVersionUID = 1L;
    private static final Locale RU_LOCALE = new Locale("ru");
    private static final Locale EN_LOCALE = Locale.ENGLISH;
    private static final String RU_ICON = "/resources/russian_icon.png";
    private static final String EN_ICON = "/resources/english_icon.png";

    private String currentIcon;

    public LanguageController() {
    }

    public void setCurrentIcon(String currentIcon) {
        this.currentIcon = currentIcon;
    }

    public String getCurrentIcon() { //Must get info from BD also  !!!!!!
        if (this.currentIcon == null) {    //For the first call
            setIcon();
        }
        return currentIcon;
    }

    private void setIcon() {
        if (FacesContext.getCurrentInstance().getViewRoot().getLocale().getDisplayLanguage().
                equals(EN_LOCALE.getDisplayLanguage())) {

            this.currentIcon = RU_ICON;
        } else {
            this.currentIcon = EN_ICON;
        }
    }

    public void changeLocale() {
        if (FacesContext.getCurrentInstance().getViewRoot().getLocale().getDisplayLanguage().
                equals(EN_LOCALE.getDisplayLanguage())) {

            FacesContext.getCurrentInstance().getViewRoot().setLocale(RU_LOCALE);
            this.currentIcon = EN_ICON;
        }
        else {
            FacesContext.getCurrentInstance().getViewRoot().setLocale(EN_LOCALE);
            this.currentIcon = RU_ICON;
        }
    }
}
