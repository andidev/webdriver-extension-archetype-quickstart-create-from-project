package com.groupname;

import com.groupname.page.MainPage;
import com.github.webdriverextensions.WebRepository;
import com.github.webdriverextensions.junitrunner.WebDriverRunner;
import com.github.webdriverextensions.junitrunner.annotations.Chrome;
import com.github.webdriverextensions.junitrunner.annotations.Firefox;
import com.github.webdriverextensions.junitrunner.annotations.InternetExplorer;
import org.junit.Before;
import org.junit.runner.RunWith;

@RunWith(WebDriverRunner.class)
@Firefox
@Chrome
@InternetExplorer
public class SiteNameSiteTest extends WebRepository {

    // Site
    public SiteNameSite site;

    // Pages
    public MainPage mainPage;
    // ...add your Site's WebPages here

    @Before
    public void setUp() {
        initElements();
    }
}
