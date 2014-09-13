package com.packagename;

import com.packagename.SiteNameSite;
import com.packagename.page.MainPage;
import com.github.webdriverextensions.junitrunner.WebDriverRunner;
import com.github.webdriverextensions.junitrunner.annotations.Chrome;
import com.github.webdriverextensions.junitrunner.annotations.Firefox;
import com.github.webdriverextensions.junitrunner.annotations.InternetExplorer;
import org.junit.runner.RunWith;

@RunWith(WebDriverRunner.class)
@Firefox
@Chrome
@InternetExplorer
public class SiteNameSiteTest {

    // Site
    public SiteNameSite site;

    // Pages
    public MainPage mainPage;
    // ...add your Site's WebPages here

}
