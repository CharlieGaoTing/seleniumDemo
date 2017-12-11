package com.yijiupi.framework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author 作者 : gaoting
 * @date 创建时间：2017年12月7日 下午4:26:26
 */
public class SearchSeleniumTxtMethod {
	// 百度搜索Selenium
	public static void baiduTestSelenium(String testdata) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.baidu.com");
		Thread.sleep(1000);
		driver.findElement(By.id("kw")).sendKeys(testdata);
		Thread.sleep(2000);
		driver.findElement(By.id("su")).click();
		driver.get(
				"https://www.baidu.com/s?ie=utf-8&f=8&rsv_bp=0&rsv_idx=1&tn=baidu&wd=selenium&rsv_pq=93e3298a000061c5&rsv_t=bee4koZGhtpHv7LJReHUyDPrzEnGWzAhc4NoQAcIq92jh5urcDzkKai%2F5SU&rqlang=cn&rsv_enter=0&rsv_sug3=8&inputT=145&rsv_sug4=145");
		driver.findElement(By.xpath("//*[@id=\"2\"]/h3/a")).click();
		Thread.sleep(2000);
		driver.close();

	}

	// 百度搜索webdriver
	public static void baiduTestWebdriver(String testdata) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.baidu.com");
		Thread.sleep(1000);
		driver.findElement(By.id("kw")).sendKeys(testdata);
		Thread.sleep(2000);
		driver.findElement(By.id("su")).click();
		driver.get(
				"https://www.baidu.com/s?wd=webdriver&rsv_spt=1&rsv_iqid=0xb121462f0000cac8&issp=1&f=8&rsv_bp=1&rsv_idx=2&ie=utf-8&rqlang=cn&tn=baiduhome_pg&rsv_enter=0&oq=%25E5%259C%25A8java%25E9%2587%258C%25E9%259D%25A2%25E8%25AF%25BB%25E5%258F%2596txt%25E6%2596%2587%25E4%25BB%25B6%25E5%2586%2585%25E5%25AE%25B9%25E5%25B9%25B6%25E4%25B8%2594%25E5%258F%2596%25E5%2587%25BA%25E5%2585%25B3%25E9%2594%25AE%25E5%25AD%2597%25E8%25BF%259B%25E8%25A1%258C%25E5%2588%25A4%25E6%2596%25AD&rsv_t=ca99gvDuUpaFTVrXxidY6MWBSn2U2X5MYWtU8jLQRLcrtRzS3MNHe8dINx23VngUH8MC&rsv_pq=daf4115100018a59&inputT=17270&rsv_sug3=143&rsv_n=2&bs=%E5%9C%A8java%E9%87%8C%E9%9D%A2%E8%AF%BB%E5%8F%96txt%E6%96%87%E4%BB%B6%E5%86%85%E5%AE%B9%E5%B9%B6%E4%B8%94%E5%8F%96%E5%87%BA%E5%85%B3%E9%94%AE%E5%AD%97%E8%BF%9B%E8%A1%8C%E5%88%A4%E6%96%AD");
		driver.findElement(By.xpath("//*[@id=\"2\"]/h3/a")).click();
		Thread.sleep(2000);
		driver.close();

	}

	// 百度搜索Java
	public static void baiduTestJava(String testdata) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.baidu.com");
		Thread.sleep(1000);
		driver.findElement(By.id("kw")).sendKeys(testdata);
		Thread.sleep(2000);
		driver.findElement(By.id("su")).click();
		driver.get(
				"https://www.baidu.com/s?wd=Java&rsv_spt=1&rsv_iqid=0xb121462f0000cac8&issp=1&f=8&rsv_bp=1&rsv_idx=2&ie=utf-8&rqlang=cn&tn=baiduhome_pg&rsv_enter=0&oq=webdriver&rsv_t=dafbNQ2Wsf0MOZ9ZClFcSgsyeSDHP91axfqfwzNSd2sTOW5zb9NohWQ8KgWazJmjbg1F&rsv_pq=d50dda1a0001f857&inputT=1336&rsv_n=2&rsv_sug3=144&bs=webdriver");
		driver.findElement(By.xpath("//*[@id=\"2\"]/h3/a")).click();
		Thread.sleep(2000);
		driver.close();

	}

	// 百度搜索 网易云音乐
	public static void baiduTestWangYi(String testdata) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.baidu.com");
		Thread.sleep(1000);
		driver.findElement(By.id("kw")).sendKeys(testdata);
		Thread.sleep(2000);
		driver.findElement(By.id("su")).click();
		driver.get(
				"https://www.baidu.com/s?wd=%E7%BD%91%E6%98%93%E4%BA%91%E9%9F%B3%E4%B9%90&rsv_spt=1&rsv_iqid=0xce470c0500021447&issp=1&f=8&rsv_bp=1&rsv_idx=2&ie=utf-8&rqlang=cn&tn=baiduhome_pg&rsv_enter=0&oq=%25E7%25BD%2591%25E6%2598%2593%25E4%25BA%2591%25E9%259F%25B3%25E4%25B9%2590&rsv_t=8db9Cc7Y3r%2Fu%2B%2BBp4icKIoodEjsbu5LRkx8xu9A712S4MCij5ooQ%2FvQvV76qd7E5Qx6Y&rsv_pq=dd7b6d4400027f00");
		driver.findElement(By.xpath("//*[@id=\"1\"]/h3/a[1]")).click();
		driver.get("http://music.163.com/");
		Thread.sleep(2000);
		driver.close();

	}

	// 读文件
	public static void readTxtFile(String filePath) {
		try {
			String encoding = "utf-8";
			File file = new File(filePath);
			// 判断文件是否存在
			if (file.isFile() && file.exists()) {

				// 编码格式
				InputStreamReader read = new InputStreamReader(new FileInputStream(file), encoding);
				BufferedReader bufferedReader = new BufferedReader(read);
				String lineTxt = null;
				while ((lineTxt = bufferedReader.readLine()) != null) {

					System.out.println(lineTxt);
					if (lineTxt.equals("selenium")) {
						// 调用baiduTestSelenium方法
						baiduTestSelenium(lineTxt);
					} else if (lineTxt.equals("webdriver")) {
						baiduTestWebdriver(lineTxt);
					} else if (lineTxt.equals("Java")) {
						baiduTestJava(lineTxt);
					} else if (lineTxt.equals("网易云音乐")) {
						baiduTestWangYi(lineTxt);
					}

				}
				read.close();
			} else {
				System.out.println("找不到指定路径");
			}

		} catch (Exception e) {
			System.out.println("读取文件内容错误");
			e.printStackTrace();
		}
	}
}
