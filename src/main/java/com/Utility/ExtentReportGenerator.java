package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerator {

	public static ExtentReports extent;
	public static ExtentReports getReports() {
		
		String reportpath = "C:\\Users\\Admin\\eclipse-workspace\\Framework\\Reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(reportpath);
		reporter.config().setDocumentTitle("Automation Test Report");
		reporter.config().setReportName("B13 Automation Test Report");
		reporter.config().setTheme(Theme.STANDARD);
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("Project Name ", "B13 Amazon");
		extent.setSystemInfo("Module", "Seleneium Automation");
		extent.setSystemInfo("Tool", "Selenium");
		extent.setSystemInfo("QA Name", "Suraj");
		return extent;
		
	}
}
