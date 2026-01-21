# E-Commerce Backend Service

A robust RESTful backend built with Spring Boot that powers core e-commerce workflows such as product catalog management, cart handling, order lifecycle management, and simulated payment processing.

---

## Technology Stack

- **Backend Framework**: Spring Boot 4.0.1  
- **Programming Language**: Java 21  
- **Database**: MongoDB  
- **Build System**: Gradle  

---

## Core Capabilities

- 🛒 Product catalog management with full CRUD and search support  
- 🧺 Shopping cart operations per user  
- 📦 Order creation with real-time stock validation  
- 💳 Simulated Razorpay-style payment flow  
- 🔄 Asynchronous payment handling using webhook callbacks  
- 📜 User order history tracking  
- ❗ Centralized and consistent exception handling  

---

## System Requirements

- Java 21 or higher  
- MongoDB Atlas account and cluster  
- Gradle version 8 or above  

---

## Setup & Execution

### Step 1: Clone the Codebase

```bash
git clone https://github.com/Jenish-1235/ecom-backend.git
cd ecom-backend
```

---

### Step 2: MongoDB Atlas Configuration

The application requires MongoDB Atlas connection details. Create a `.env` file in the root directory based on `env.example`:

```bash
cp env.example .env
```

Update the `.env` file with your MongoDB Atlas credentials:

```env
MONGODB_USERNAME=your_atlas_username
MONGODB_PASSWORD=your_atlas_password
MONGODB_CLUSTER=your_cluster.mongodb.net
MONGODB_DATABASE=ecommerce_db
```

**Note:** This application uses MongoDB Atlas exclusively. Ensure you have a MongoDB Atlas account and cluster set up before running the application.

---

### Step 3: Run the Application

```bash
./gradlew bootRun
```

Server runs at: `http://localhost:8080`

---

### Step 4: Build the Project

```bash
./gradlew build
```

---

## API Overview

### Product APIs

| Method | Endpoint | Description |
|------|---------|-------------|
| POST | `/api/products` | Create a new product |
| GET | `/api/products` | Retrieve all products |
| GET | `/api/products/{id}` | Get product by ID |
| GET | `/api/products/search?q={query}` | Search products |

---

### Cart APIs

| Method | Endpoint | Description |
|------|---------|-------------|
| POST | `/api/cart/add` | Add item to cart |
| GET | `/api/cart/{userId}` | Fetch user cart |
| DELETE | `/api/cart/{userId}/clear` | Clear cart |
| DELETE | `/api/cart/{userId}/item/{productId}` | Remove item |

---

### Order APIs

| Method | Endpoint | Description |
|------|---------|-------------|
| POST | `/api/orders` | Create order |
| GET | `/api/orders/{orderId}` | Get order details |
| GET | `/api/orders/user/{userId}` | Order history |
| POST | `/api/orders/{orderId}/cancel` | Cancel unpaid order |

---

### Payment APIs

| Method | Endpoint | Description |
|------|---------|-------------|
| POST | `/api/payments/create` | Initiate payment |
| GET | `/api/payments/{paymentId}` | Get payment |
| GET | `/api/payments/order/{orderId}` | Payment by order |

---

### Webhook

| Method | Endpoint | Description |
|------|---------|-------------|
| POST | `/api/webhooks/payment` | Payment callback |

---

## Payment Flow

1. Order is created from cart  
2. Payment is initiated  
3. Mock gateway processes payment  
4. Webhook updates status  
5. Order state updated  

---

## Order States

| State | Description |
|------|-------------|
| CREATED | Awaiting payment |
| PAID | Payment successful |
| FAILED | Payment failed |
| CANCELLED | Order cancelled |

---

## Project Structure

```
src/main/java/com/jenish/ecombackend/
├── config/
├── controller/
├── dto/
│   ├── request/
│   └── response/
├── exception/
├── model/
│   └── enums/
├── repository/
└── service/
    └── impl/
```

---
