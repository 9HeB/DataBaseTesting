# 🧪 Data Base Testing

This project demonstrates seamless integration between **Selenium WebDriver**, **MySQL Database**, and **TestNG** using **Java**. It automates reading customer data from a MySQL database and entering it into a registration form on a real web page.

---

## 🚀 Features

- 🔌 **Database Connection** using JDBC to `classicmodels` schema
- 📋 **Customer Data Handling** via SQL:
  - `INSERT`: Add a new customer
  - `UPDATE`: Modify customer credit limit
  - `SELECT`: Retrieve customer info
- 🌐 **Web Form Automation**:
  - Uses **Selenium ChromeDriver**
  - Fills `smartbuy-me.com` registration form with database data

---

## 📂 Project Structure

```java
@BeforeTest
mySetup()            → Initializes DB connection + opens Chrome browser

@Test(priority = 1)
InsertIntoDataBase() → Adds a sample customer (disabled by default)

@Test(priority = 2)
UpdateDataBase()     → Updates customer's credit limit (disabled by default)

@Test(priority = 3)
ReadeDataBase()      → Reads customer info and submits it to the web form
