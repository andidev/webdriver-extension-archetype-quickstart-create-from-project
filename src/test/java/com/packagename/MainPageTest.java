package com.packagename;

import com.packagename.SiteNameSiteTest;
import org.junit.Test;
import static com.github.webdriverextensions.Bot.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainPageTest extends SiteNameSiteTest {

    // Logger
    private static final Logger log = LoggerFactory.getLogger(MainPageTest.class);

    @Test
    public void openMainPageTest() throws Exception {
        open(site);
        assertIsOpen(mainPage);
    }
}

