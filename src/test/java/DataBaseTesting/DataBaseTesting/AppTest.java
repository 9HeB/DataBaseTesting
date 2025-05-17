package DataBaseTesting.DataBaseTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppTest {
	
	Connection con;
	Statement stmt;
	ResultSet rs;
	WebDriver driver = new ChromeDriver();
	String CustomerFirstName;
	String CustomerLastName;
	String CustomerEmail;
	String CustomerPassword;
	
	@BeforeTest
	public void mySetup() throws SQLException {
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels","root","2025");
		driver.get("https://smartbuy-me.com/account/register");
	}
	

	@Test (priority = 1, enabled = false)
	public void InsertIntoDataBase () throws SQLException {
		
		String query = "INSERT INTO customers (customerNumber, customerName, contactLastName, contactFirstName, phone, addressLine1, city, country, salesRepEmployeeNumber, creditLimit) VALUES (999, 'New Corp', 'Smith', 'John', '123456789', '123 Main St', 'Los Angeles', 'USA', 1370, 50000.00);";
		stmt = con .createStatement();
		int effectedrow = stmt.executeUpdate(query);
		System.out.println(effectedrow);
	}
	
	
	
	@Test (priority = 2 , enabled = false)
	public void UpdateDataBase () throws SQLException {
		
		String query = "UPDATE customers SET creditLimit = 75000 WHERE customerNumber = 999;";
		stmt = con .createStatement();
		int effectedrow = stmt.executeUpdate(query);
		System.out.println(effectedrow);
		
	}
	
	
	@Test (priority = 3)
	public void ReadeDataBase () throws SQLException {
		
		String query = "SELECT * FROM customers WHERE customerNumber = 103;";
		stmt = con .createStatement();
		rs = stmt.executeQuery(query);
		while (rs.next()) {
		
			CustomerFirstName = rs.getString("contactFirstName").trim();
			CustomerLastName = rs.getString("contactLastName");
			CustomerEmail = CustomerFirstName.trim().toLowerCase() + CustomerLastName.toLowerCase() + "@classicmodels.com";
			CustomerPassword = rs.getString("addressLine1");
			
			System.out.println("First Name: " + CustomerFirstName);
			System.out.println("Last Name: " + CustomerLastName);
			System.out.println("Email: " + CustomerEmail);
			System.out.println("Password: " + CustomerPassword);

			
			}
		
		driver.findElement(By.id("customer[first_name]")).sendKeys(CustomerFirstName);
		driver.findElement(By.id("customer[last_name]")).sendKeys(CustomerLastName);
		driver.findElement(By.id("customer[email]")).sendKeys(CustomerEmail);
		driver.findElement(By.id("customer[password]")).sendKeys(CustomerPassword);

	}
	
	
	
}

