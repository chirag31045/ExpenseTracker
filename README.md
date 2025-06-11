💸 Smart Expense Tracker (Java + Spring Boot)
A full-stack Expense Tracker application built with Java, Spring Boot, and MySQL, enabling users to track daily expenses and receive WhatsApp alerts.

📌 Features
User registration & login

Add, update, delete expenses

View expense history by date, category, or range

Daily WhatsApp alert on new expense

RESTful APIs using Spring Boot

MySQL Database integration

Exception handling & validation

🛠️ Tech Stack
Layer	Technology
Backend	Java, Spring Boot
REST API	Spring Web
Database	MySQL
Messaging	Twilio WhatsApp API
ORM	Spring Data JPA
Validation	Hibernate Validator
Build Tool	Maven

📁 Project Structure
css
Copy
Edit
expense-tracker/
├── src/
│   ├── main/
│   │   ├── java/in/erp/com/
│   │   │   ├── controller/
│   │   │   ├── entity/
│   │   │   ├── repository/
│   │   │   ├── service/
│   │   ├── resources/
│   │   │   ├── application.properties
├── pom.xml
├── README.md
⚙️ Setup Instructions
Clone the Repository

bash
Copy
Edit
git clone https://github.com/your-username/expense-tracker.git
cd expense-tracker
Configure the Database
Update src/main/resources/application.properties:

properties
Copy
Edit
spring.datasource.url=jdbc:mysql://localhost:3306/expense_db
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
Run the App

bash
Copy
Edit
mvn spring-boot:run
API Testing
Use Postman or Swagger to test endpoints.

🔗 Sample API Endpoints
Method	Endpoint	Description
POST	/api/users/register	Register a new user
POST	/api/expenses/{userId}	Add new expense
GET	/api/expenses/{userId}	Get all expenses
DELETE	/api/expenses/{userId}/{id}	Delete a specific expense
PUT	/api/expenses/{userId}/{id}	Update an expense

📦 Sample Expense Payload
json
Copy
Edit
{
  "title": "Grocery Shopping",
  "amount": 450.50,
  "category": "Food",
  "date": "2025-06-11"
}
🔔 WhatsApp Alert Setup (via Twilio)
Sign up on Twilio

Get Account SID, Auth Token, and a WhatsApp Sandbox number

Configure in application.properties:

properties
Copy
Edit
twilio.account.sid=your_sid
twilio.auth.token=your_token
twilio.whatsapp.from=whatsapp:+14155238886
Send message in ExpenseService after saving expense:

java
Copy
Edit
twilioService.sendWhatsAppMessage("+91xxxxxxxxxx", "New expense added: ₹450.50");
📸 Screenshots (Optional)
Include screenshots of:

Postman API test

WhatsApp alert message

JSON response

🚀 Future Enhancements
Add monthly summary & charts

Google authentication

Email notifications

Expense limit alerts

👨‍💻 Author
Chirag Kumawat
Master of Computer Applications (MCA)
LinkedIn | GitHub

