package org.openapitools.client.logs;

import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ExtentManager {
    public static String reportName = "petstore.html";
    private static ExtentReports instance;

    public static synchronized ExtentReports getInstance(){
        if(instance == null){
            instance = new ExtentReports();
            //ExtentSparkReporter reporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/" + reportName);
            ExtentHtmlReporter reporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/" + reportName);
            System.out.println(System.getProperty("user.dir") + "/" + reportName);
            reporter.config().setDocumentTitle("Petstore Automation Report");
            reporter.config().setReportName("IM API Automation Report");
            instance.setSystemInfo("OS", System.getProperty("os.name"));
            instance.setSystemInfo("OS version", System.getProperty("os.version"));
            instance.setSystemInfo("OS Arch", System.getProperty("os.arch"));
            instance.setSystemInfo("User", System.getProperty("user.home"));
            instance.setSystemInfo("Java version", System.getProperty("java.version"));
            instance.attachReporter(reporter);
        }
        return instance;
    }
}
