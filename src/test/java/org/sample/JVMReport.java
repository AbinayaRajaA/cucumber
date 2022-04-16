package org.sample;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	public static void generateReport(String jsonPath) {
		
	File f=new File(System.getProperty("user.dir")+"\\Reports\\JVMReport");
	
	Configuration c=new Configuration(f,"Facebook Application");
	c.addClassifications("JDK", "1.8");
	c.addClassifications("Platform", "Windows");
	
	List<String> l=new ArrayList<String>();
	l.add(jsonPath);
	
	ReportBuilder r=new ReportBuilder(l, c);
	r.generateReports();
	
}}
