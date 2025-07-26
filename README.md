# NTG-Task-CustomerManagementAPI
# 🧾 Customer Management & Payment Processing System

This Spring Boot project implements two main modules:

1. **Customer Management REST API**
2. **Dynamic Payment Processing System**

---

## 📁 Part 1: Customer Management REST API

A simple in-memory REST API for managing customer records. No database is used — customers are stored in a list.

### 🔧 Features
- ✅ Add a new customer
- ✅ Retrieve all customers
- ✅ Retrieve a customer by ID
- ✅ Update a customer by ID
- ✅ Delete a customer by ID
- ✅ Filter customers by name

# Part 2: Payment Processing System
Allows dynamic selection of a customer's payment method at runtime using a switch statement and Spring dependency injection.

📥 Request Parameters
accountNumber (Long)

paymentMethod (String: PayPal, ApplePay, Stripe)

💡 Dynamic Bean Switching
The payment logic uses a switch block in a service class to select and invoke the correct payment implementation based on the paymentMethod.

# Response Format
Customer No: {accountNumber} will pay with --> {paymentMethod}

## Technologies Used

Java 17+
Spring Boot
Spring Web (REST)
No database (in-memory list)
