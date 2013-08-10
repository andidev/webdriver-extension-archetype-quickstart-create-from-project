package com.groupname;

import com.groupname.page.MainPage;
import org.andidev.webdriverextension.ThreadDriver;
import org.andidev.webdriverextension.WebRepository;
import org.andidev.webdriverextension.junitrunner.WebDriverRunner;
import org.andidev.webdriverextension.junitrunner.annotations.Chrome;
import org.andidev.webdriverextension.junitrunner.annotations.Firefox;
import org.andidev.webdriverextension.junitrunner.annotations.InternetExplorer;
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
        initElements(ThreadDriver.getDriver());
    }
}
