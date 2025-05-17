# 🚀 Data Base Testing

This project is a simple Java automation test that interacts with a **MySQL database** and **web form** using **Selenium WebDriver**. It demonstrates how to read, insert, and update customer data, then use that data to automatically fill out a registration form online.

---

## 🧰 Technologies Used

- ✅ Java
- ✅ MySQL (ClassicModels sample database)
- ✅ Selenium WebDriver (Chrome)
- ✅ TestNG for test automation
- ✅ JDBC for database connection

---

## 🎯 What This Project Does

### 📌 Step-by-Step Summary:

1. **Connects** to the MySQL database `classicmodels`.
2. **Reads** customer data from the `customers` table.
3. **Formats** the data into an email (e.g., `johnsmith@classicmodels.com`).
4. **Opens** a web browser and navigates to a registration page.
5. **Fills out** the form with:
   - First Name
   - Last Name
   - Email
   - Address (used as password in this example)

---

## 🧼 Clean and Organized Code

- Each operation is split into its own method (Insert, Update, Read).

- Runs automatically using @BeforeTest and @Test.

- Ready for scaling into a real-world QA automation framework.

---

## 🧠 Final Thoughts
- This is a great starting point for anyone looking to:

- Learn Java database integration

- Practice test automation

- Automate web form submissions
