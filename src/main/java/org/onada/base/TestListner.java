package org.onada.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListner implements ITestListener {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestListner.class);

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {}
    public void onStart(ITestContext context) {}
    public void onTestSkipped(ITestResult result) {}
    public void onTestSuccess(ITestResult result) {
        LOGGER.info("Test Passed :" + result.getName());
    }
    public void onTestStart(ITestResult result) {}
    public void onFinish(ITestContext context) {}
    public void onTestFailure(ITestResult result) {
        LOGGER.info("capure screentshot and store it in repository :" + result.getName());
    }
}
