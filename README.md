<h1 align="center">💸 Smart Expense Tracker</h1>

<p align="center">
  <img src="https://img.shields.io/badge/SpringBoot-Expense--Tracker-green.svg" alt="Expense Tracker Badge" />
  <img src="https://img.shields.io/badge/Java-17-blue.svg" alt="Java 17" />
  <img src="https://img.shields.io/badge/Database-MySQL-orange.svg" alt="MySQL" />
</p>

<p align="center">
  A smart expense tracking web application built with <strong>Java Spring Boot</strong>. It helps users monitor and categorize their spending with visual reports, and sends real-time alerts via <strong>WhatsApp</strong>.
</p>

---

<h2>🚀 Features</h2>

<ul>
  <li>User Authentication (Login/Register)</li>
  <li>Add / Update / Delete Expenses</li>
  <li>Expense Categories & Date Filters</li>
  <li>View Reports: Daily, Weekly, Monthly</li>
  <li>WhatsApp Expense Alerts</li>
  <li>Responsive Dashboard UI</li>
</ul>

---

<h2>🧑‍💻 Tech Stack</h2>

<table>
  <tr>
    <td><strong>Backend</strong></td>
    <td>Java 17, Spring Boot, Spring Data JPA</td>
  </tr>
  <tr>
    <td><strong>Frontend</strong></td>
    <td>HTML5, CSS3, Bootstrap, Thymeleaf / React (optional)</td>
  </tr>
  <tr>
    <td><strong>Database</strong></td>
    <td>MySQL</td>
  </tr>
  <tr>
    <td><strong>Messaging</strong></td>
    <td>WhatsApp API (Twilio or similar)</td>
  </tr>
</table>

---

<h2>📂 Project Structure</h2>

plaintext
src/
├── controller/
│   └── ExpenseController.java
├── service/
│   └── ExpenseService.java
├── entity/
│   ├── User.java
│   └── Expense.java
├── repository/
│   └── ExpenseRepository.java
├── dto/
│   └── ExpenseDTO.java
└── Application.java

<h2>🔧 Setup Instructions</h2> <ol> <li>Clone the repository: <pre><code>git clone https://github.com/your-username/expense-tracker.git</code></pre> </li> <li>Configure <code>application.properties</code>: <pre><code> spring.datasource.url=jdbc:mysql://localhost:3306/expense_db spring.datasource.username=root spring.datasource.password=yourpassword twilio.whatsapp.number=+14155238886 </code></pre> </li> <li>Run the project: <pre><code>./mvnw spring-boot:run</code></pre> </li> <li>Access it in browser: <code>http://localhost:8080</code></li> </ol> 

<h2>📬 WhatsApp Integration</h2> <ul> <li>Setup a Twilio account and enable sandbox for WhatsApp.</li> <li>Get your Account SID, Auth Token, and Sandbox WhatsApp number.</li> <li>Configure them in your environment or <code>application.properties</code>.</li> </ul>

<h2>📸 Screenshots</h2> <p align="center"> <img src="https://yourdomain.com/assets/dashboard.png" alt="Dashboard Screenshot" width="80%"/> <img src="https://yourdomain.com/assets/add-expense.png" alt="Add Expense Screenshot" width="80%"/> </p>

<h2>🤝 Contributing</h2> <p>Feel free to fork the repo and submit a pull request. Open an issue first if you want to make significant changes.</p>

<h2>📄 License</h2> <p>This project is licensed under the MIT License. See the <code>LICENSE</code> file for details.</p>

<h2>📞 Contact</h2> <p> Developed with ❤️ by <strong>ChiragKumawat</strong><br> 📧 chiragkumawat457@gmail.com<br> 🌐 <a href="https://www.linkedin.com/in/chirag-kumawat-b58401263">LinkedIn</a> </p> 
