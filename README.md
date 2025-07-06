# E-Commerce Website 🛒🛒

## Overview

This project is a full-stack **E-commerce Order Management System** built using:

- 💻 React (frontend)
- ⚙️ Spring Boot (backend)
- 🗄️ MySQL (database)

Users can view and filter customer orders. The system supports multiple filters, pagination, and clean UI design using Bootstrap.

---

## Features 🪶

- 📋 Display all orders in a table
- 🔍 Filter by:
  - Order ID
  - Customer Name
  - Order Item
  - Delivery Date range
  - Pricing Range
  - Order Status
- 📄 Pagination (10 orders per page)
- 🧼 Bootstrap responsive design
- 🔁 Tabbed view by status (Completed, Pending, etc.)

---

## Technologies Used  

<a href="https://www.java.com" target="_blank" rel="noreferrer">
  <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/>
</a>
+
<a href="https://spring.io/" target="_blank" rel="noreferrer">
  <img src="https://www.vectorlogo.zone/logos/springio/springio-icon.svg" alt="spring" width="40" height="40"/>
</a>
+
<a href="https://reactjs.org/" target="_blank" rel="noreferrer">
  <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/react/react-original-wordmark.svg" alt="react" width="40" height="40"/>
</a>
+
<a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript" target="_blank" rel="noreferrer">
  <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/javascript/javascript-original.svg" alt="javascript" width="40" height="40"/>
</a>
+
<a href="https://www.mysql.com/" target="_blank" rel="noreferrer">
  <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/mysql/mysql-original-wordmark.svg" alt="mysql" width="40" height="40"/>
</a>

---

## ⚙️ Backend Setup

1. **Create the database:**
   ```sql
   CREATE DATABASE ecommerce;
   ```

2. **Update `application.properties`:**
   ```
   spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce
   spring.datasource.username=your-username
   spring.datasource.password=your-password
   spring.jpa.hibernate.ddl-auto=update
   ```

3. **Run the Spring Boot application:**
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

   The backend will be available at:  
   ➜ `http://localhost:8080`

---

## 🌐 Frontend Setup

1. **Navigate to frontend directory:**
   ```bash
   cd ecom-frontend
   ```

2. **Install dependencies:**
   ```bash
   npm install
   ```

3. **Run the frontend server:**
   ```bash
   npm run dev
   ```

   The frontend will be available at:  
   ➜ `http://localhost:5173`

---

## 🔌 API Endpoints

### 🔹 Get All or Filtered Orders
- **URL:** `/api/orders`
- **Method:** `GET`
- **Query Parameters:**
  - `orderId`
  - `customer`
  - `orderItem`
  - `startDate`
  - `endDate`
  - `minPrice`
  - `maxPrice`
  - `status`

### Example:
```
GET /api/orders?customer=Kavya&status=Completed
```

---

## 🗂️ Project Structure

```
E-commerce
├── backend
│   ├── controller
│   ├── model
│   ├── service
│   ├── repository
│   └── EcommerceApplication.java
├── ecom-frontend
│   └── src
│       └── OrderDashboard.jsx
└── README.md
```

---

## 🧾 Order Model

```java
@Entity
public class Order {
  private String orderId;
  private String customer;
  private String orderItem;
  private LocalDate deliveryDate;
  private Double deliveryPricing;
  private String status;
}
```

---

## 👩‍💼 Submitted By

**Kavya Chellem**  
📁 Office Assignment Submission

---

## 🛡️ License

This project is for **internal office use** and is not intended for educational or open-source distribution.

