package config;

import com.codeborne.selenide.Configuration;

public class WebDriverConfig {
    private final DataOfConfig dataConfig;

    public WebDriverConfig(DataOfConfig dataConfig) {
        this.dataConfig = dataConfig;
    }

    public void dataConfig() {
        //Configuration.holdBrowserOpen = true;
        Configuration.pageLoadStrategy = "eager";
        Configuration.baseUrl = dataConfig.getBaseUrl();
        Configuration.browser = dataConfig.getBrowser();
        Configuration.browserSize = dataConfig.getBrowserSize();
        Configuration.browserVersion = dataConfig.getBrowserVersion();
        if (dataConfig.isRemote()) {
            Configuration.remote = dataConfig.remoteUrl();
        }
    }
}