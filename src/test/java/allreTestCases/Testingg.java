package allreTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import AllureConfig.AllureTestNGListerners;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;


@Listeners(AllureTestNGListerners.class)

public class Testingg {

	@Step("Initialize the ChromeDriver")
	@BeforeTest(description = "BeforeTest TestNG")
	public void seetup() throws Exception {

		/*
		 * setup("chrome");
		 * getLdriver().navigate().to("https://demo.automationtesting.in/Windows.html");
		 * getLdriver().manage().window().maximize();
		 */
	}

//	@Step("TestCase case1 will run")
//	@Description("This is description for case1")
//	@Severity(SeverityLevel.BLOCKER)
//
//	@Test
//	public void case1() {
//
//		Assert.assertEquals(true, false);
//	}

	@Step("TestCase case2 will run")
	@Description("This is description for case2")
	@Severity(SeverityLevel.TRIVIAL)

	@Test
	public void case2() {
		Assert.assertEquals(true, false);

	}

	@Step("TestCase case3 will run")
	@Description("This is description for case3")
	@Severity(SeverityLevel.NORMAL)
	@Story("skdjhaukshfhasdhf")
	@Test
	public void case3() {
		Assert.assertEquals(true, true);

	}

	@Story("case4")
	@Step("TestCase case4 will run")
	@Description("This is description for case4")
	@Severity(SeverityLevel.NORMAL)
	@Test
	public void case4() {
		System.out.println("***********Testcase 4***************");
	}

}
