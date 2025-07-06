
# 🔧 E-commerce Backend

This is the **Spring Boot backend** for the E-commerce Order Management System, developed by **Kavya Chellem** as part of an internal office assignment.

---

## 🚀 Overview

The backend provides REST APIs for:

- Managing and filtering orders  
- Serving JSON data to the React frontend  
- Connecting to MySQL for data persistence  

---

## 🛠️ Technologies Used

- Java 17  
- Spring Boot  
- Spring Web  
- Spring Data JPA  
- MySQL  
- Maven
 <a href="https://www.java.com" target="_blank" rel="noreferrer">
  <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/>
</a>
+
<a href="https://spring.io/" target="_blank" rel="noreferrer">
  <img src="https://www.vectorlogo.zone/logos/springio/springio-icon.svg" alt="spring" width="40" height="40"/>
</a>
+
<a href="https://www.mysql.com/" target="_blank" rel="noreferrer">
  <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/mysql/mysql-original-wordmark.svg" alt="mysql" width="40" height="40"/>
</a>

---

---

## 📁 Folder Structure

```
ecom-backend/
├── src/
│   └── main/
│       ├── java/com/kavya/ecommerce/
│       │   ├── controller/
│       │   │   └── OrderController.java
│       │   ├── model/
│       │   │   └── Order.java
│       │   ├── repository/
│       │   │   └── OrderRepository.java
│       │   ├── service/
│       │   │   └── OrderService.java
│       │   └── EcommerceApplication.java
│       └── resources/
│           └── application.properties
├── pom.xml
```

---

## ⚙️ Setup Instructions

### 1. Clone the repo

```bash
git clone https://github.com/kavya958/E-commerce-backend.git
cd ecom-backend
```

### 2. Configure MySQL

```sql
CREATE DATABASE ecommerce;
```

Then update the `application.properties` file:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password
spring.jpa.hibernate.ddl-auto=update
```

### 3. Run the Application

```bash
mvn spring-boot:run
```

Backend will be available at:  
📍 `http://localhost:8080`

---

## 🔗 API Endpoint

### `GET /api/orders`

Returns a list of orders, optionally filtered by:

- `orderId`
- `customer`
- `orderItem`
- `startDate` & `endDate`
- `minPrice` & `maxPrice`
- `status`

**Example usage:**

```
http://localhost:8080/api/orders?customer=Kavya&status=Completed
```

---

## 👩‍💻 Author

**Kavya Chellem**  
📝 This backend is developed for internal office use only.


This project is for **internal office use** and is not intended for educational or open-source distribution.

