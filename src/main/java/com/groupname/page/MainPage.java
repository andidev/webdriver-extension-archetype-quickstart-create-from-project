package com.groupname.page;

import com.groupname.SiteNameSite;
import com.groupname.component.ExampleWebComponent;
import com.github.webdriverextensions.WebPage;
import org.openqa.selenium.support.FindBy;
import static com.github.webdriverextensions.Bot.*;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainPage extends WebPage {

    // Logger
    private static final Logger log = LoggerFactory.getLogger(MainPage.class);

    // Url
    public String url = SiteNameSite.url;

    // Model
    @FindBy(css = "cssselector")
    public WebElement exampleWebElement;
    @FindBy(css = "cssselector")
    public ExampleWebComponent exampleWebComponent;
    // ...add your Page's WebElements and WebComponents here

    @Override
    public void open(Object... arguments) {
        open(url);
        assertIsOpen();
    }

    @Override
    public void assertIsOpen(Object... arguments) throws Error {
        assertCurrentUrlStartsWith(url);
        // ...add your asserts that ensures that the page is loaded
    }

}
