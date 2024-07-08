package org.openapitools.client.logs;

public class PrintLogs {

    Class className;

    public PrintLogs(Class className, String reportName){
        ExtentManager.reportName = reportName;
        this.className = className;
    }

    public synchronized void info(String message) {
        try {
            ExtentTestManager.getTest().info(message);
        } catch (Exception exp) {
            System.out.println(exp.getMessage());
        }
    }

    public synchronized void pass(String message) {
        try {
            ExtentTestManager.getTest().pass(className.getSimpleName() + " : " + message);
        } catch (Exception exp) {
            System.out.println(exp.getMessage());
        }
    }

    public synchronized void error(String message) {
        try {
            ExtentTestManager.getTest().error("Failed......." + className.getSimpleName() + " : " + message);
        } catch (Exception exp) {
            System.out.println(exp.getMessage());
        }
    }

    public synchronized void warn(String message) {
        try {
            ExtentTestManager.getTest().warning(className.getSimpleName() + " : " + message);
        } catch (Exception exp) {
            System.out.println(exp.getMessage());
        }
    }

    public synchronized void debug(String message) {
        try {
            ExtentTestManager.getTest().debug(className.getSimpleName() + " : " + message);
        } catch (Exception exp) {
            System.out.println(exp.getMessage());
        }
    }

    public synchronized void fail(String message) {
        try {
            ExtentTestManager.getTest().fail(className.getSimpleName() + " : " + message);
        } catch (Exception exp) {
            System.out.println(exp.getMessage());
        }
    }
}
