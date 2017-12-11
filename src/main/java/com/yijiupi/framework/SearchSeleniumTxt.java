package com.yijiupi.framework;

/**
 * @author 作者 : gaoting
 * @date 创建时间：2017年12月7日 下午4:24:58
 */
public class SearchSeleniumTxt {

	public static void main(String[] args) {
		// 手动加载浏览器驱动
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");

		String filePath = "C:\\Users\\admin\\Desktop\\selenium2java\\datatool.txt";
		SearchSeleniumTxtMethod.readTxtFile(filePath);

		System.out.println("读取文件结束");
	}
}
