package com.aitesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class SmartProductRecommendationTesting {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/"); 

		String productName = "Samsung Galaxy M14"; // Example product
		searchProduct(driver, productName);

		// 1. View a product (Simulate user action)
		WebElement firstProduct = driver.findElement(By.xpath(
				"//div[@data-component-type='s-search-result']//span[@class='a-size-medium a-color-base a-text-normal']")); // Adjust
																															// XPath
		firstProduct.click();

		// 2. Get recommended products
		List<String> recommendedProducts = getRecommendedProducts(driver);

		// 3. Analyze recommendations (Simple content-based example)
		List<String> viewedProductKeywords = extractKeywords(productName); // Very basic keyword extraction
		int matchingKeywords = 0;
		for (String recommendedProduct : recommendedProducts) {
			List<String> recommendedProductKeywords = extractKeywords(recommendedProduct);
			for (String keyword : viewedProductKeywords) {
				if (recommendedProductKeywords.contains(keyword)) {
					matchingKeywords++;
					break; // Found a match, no need to check other keywords in the recommended product
				}
			}
		}

		// 4. Report (Very basic report)
		System.out.println("Viewed Product: " + productName);
		System.out.println("Recommended Products: " + recommendedProducts);
		System.out.println("Keyword Matches: " + matchingKeywords);

		if (matchingKeywords > 0) {
			System.out.println("Recommendations show some relevance.");
		} else {
			System.out.println("Recommendations seem random (Improve recommendation logic).");
		}

		driver.quit();
	}

	private static void searchProduct(WebDriver driver, String productName) {
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox")); // Adjust ID
		searchBox.sendKeys(productName);
		searchBox.submit();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='a-color-state a-text-bold']"))); // Adjust
																															// XPath
	}

	private static List<String> getRecommendedProducts(WebDriver driver) {
		List<String> recommendations = new ArrayList<>();
		// *CRITICAL:* Adapt this XPath to match the *actual* HTML structure of the
		// recommendations section on the product page.
		List<WebElement> recommendedElements = driver
				.findElements(By.xpath("//div[contains(@class, 'similar-product')]//a[@class='a-link-normal']")); // Example
																													// XPath
																													// -
																													// Adjust!

		for (WebElement element : recommendedElements) {
			recommendations.add(element.getText()); // Or get the product name from an attribute if needed
		}
		return recommendations;
	}

	private static List<String> extractKeywords(String text) {
		// Very basic keyword extraction (Improve this)
		List<String> keywords = new ArrayList<>();
		String[] words = text.toLowerCase().split("\\s+"); // Split into words
		for (String word : words) {
			if (word.length() > 2) { // Simple filter: words longer than 2 characters
				keywords.add(word);
			}
		}
		return keywords;
	}
}