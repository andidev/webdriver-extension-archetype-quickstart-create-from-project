package com.groupname;

import com.groupname.page.MainPage;
import com.github.webdriverextensions.WebSite;
import static com.github.webdriverextensions.Bot.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SiteNameSite extends WebSite {

    // Logger
    private static final Logger log = LoggerFactory.getLogger(SiteNameSite.class);

    // Url
    public static String url = "http://yoururl.com/";

    // Pages
    public MainPage mainPage;
    // ...add your Site's WebPages here

    public void open() {
        open(url);
    }

    @Override
    public void assertIsOpen() throws Error {
        assertCurrentUrlStartsWith(url);
    }

}
