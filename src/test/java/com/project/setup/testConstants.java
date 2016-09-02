package com.project.setup;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class testConstants {
	
	public static class testObj{
		public static List<DesiredCapabilities> lstCap = new ArrayList<DesiredCapabilities>();
		public static List<String> lstPort = new ArrayList<String>();
		public static List<String> lstDevice = new ArrayList<String>();
		public static String DEVICE_PORT = "";
		public static String DEVICE_NAME = "";
		public static boolean isExecuted = false;
	}
	
}
