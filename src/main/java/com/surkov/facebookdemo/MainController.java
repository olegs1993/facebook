package com.surkov.facebookdemo;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.Page;
import com.gargoylesoftware.htmlunit.RefreshHandler;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.DomElement;
import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.net.URL;

@Controller
@RequestMapping(path = "/home")
public class MainController {

    private final Facebook facebook;

    @Autowired
    public MainController(Facebook facebook) {
        this.facebook = facebook;
    }

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String home() throws IOException {
        WebClient webClient = new WebClient(BrowserVersion.FIREFOX_60);

        webClient.setRefreshHandler(new RefreshHandler() {
            public void handleRefresh(Page page, URL url, int arg) throws IOException {
                System.out.println("handleRefresh");
            }
        });

            HtmlPage page = (HtmlPage) webClient.getPage("https://www.facebook.com/login.php");


        HtmlForm form = page.getForms().get(0);

        // Enter login and passwd
        form.getInputByName("email").setValueAttribute("surkovoleg2010@gmail.com");
        form.getInputByName("pass").setValueAttribute("9stanu1");
        // Click "Login" button/link
       DomElement domElement = page.getElementById("loginbutton").getChildElements().iterator().next();
        return "HELLO";
    }
}
