package a1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class testBaidu {
	@Test
	public void openfirefox() throws InterruptedException {
		//��������
/*		System.setProperty("webdriver.firefox.bin", "D:\\firefox.exe");
		WebDriver driver=new FirefoxDriver();       */
		System.setProperty("webdriver.chrome.driver", ".//tools//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url ="https://www.baidu.com";
		driver.get(url);
		driver.findElement(By.cssSelector("#kw")).sendKeys("hello");
		//driver.get("https://www.taobao.com"
		//driver.navigate().back();//����
		//driver.navigate().forward();//��ǰ
/*		driver.navigate().refresh();//ˢ��
		driver.manage().window().maximize();//���
		Dimension dimension = new Dimension(900, 800);//���ô��ڴ�С
		driver.manage().window().setSize(dimension);
		String c=driver.getCurrentUrl();//��ȡ��ǰURL
		String d=driver.getTitle();//��ȡ����
		System.out.println(c);
		System.out.println(d);                         */
		
		//��λԪ�ص�һ�ַ�ʽ��
/*		WebElement inputbox=driver.findElement(By.id("kw"));
		//��ͣ
		Thread.sleep(1000);
		//��������������
		inputbox.sendKeys("�῭��");
		//��λ�ٶ�һ�°�ť
		WebElement buton=driver.findElement(By.id("su"));
		buton.click();//�����ť

		//��λԪ�صڶ��ַ�ʽ��
		WebElement inputbox1=driver.findElement(By.name(""));
		
		//��λԪ�ص����ַ�ʽ��
		WebElement buton1=driver.findElement(By.className("mnav"));
		buton1.click();
		
		//�����֣�
		driver.findElement(By.linkText("����")).click();
		Thread.sleep(1000);
		//driver.findElement(By.linkText("����")).click();
		driver.findElement(By.partialLinkText("2019��żٰ��ų�¯")).click();*/
		
		//�����֣�
		
/*		int sum=driver.findElements(By.tagName("a")).size();
		System.out.println("��a��ǩ��Ϊ:"+sum);         */

		
		
	
	}

}
