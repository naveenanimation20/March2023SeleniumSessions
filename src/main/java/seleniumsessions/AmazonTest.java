package seleniumsessions;

public class AmazonTest {

	public static void main(String[] args) {

		String browserName = "naveen";

		BrowserUtil brUtil = new BrowserUtil();

		brUtil.launchBrowser(browserName);

		brUtil.enterUrl("https://www.amazon.com");

		String actTitle = brUtil.getPageTitle();
		System.out.println(actTitle);
		if (actTitle.contains("Amazon")) {
			System.out.println("correct title");
		} else {
			System.out.println("in-correct title");

		}

		String actUrl = brUtil.getPageURL();
		System.out.println(actUrl);
		if (actUrl.contains("amazon")) {
			System.out.println("correct url");
		} else {
			System.out.println("in-correct url");

		}

		brUtil.quitBrowser();

	}

}

