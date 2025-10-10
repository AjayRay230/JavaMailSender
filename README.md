Perfect! Here’s a **fancier, portfolio-ready README** with badges, a “Try API” section, and clean formatting that will look professional on GitHub:

````markdown
# Portfolio Backend

[![Java](https://img.shields.io/badge/Java-17+-blue)](https://www.oracle.com/java/) 
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2-green)](https://spring.io/projects/spring-boot) 
[![License](https://img.shields.io/badge/License-MIT-yellow)](LICENSE)

A Spring Boot backend service for handling contact messages from a portfolio website.  
It receives messages from a contact form and sends them via email.



## 🔹 Features

- REST API to receive contact messages  
- Sends email notifications to the portfolio owner  
- Uses Spring Boot, JavaMailSender, and Lombok  
- CORS enabled for all origins  

---

## 📦 Technologies

- Java 17+  
- Spring Boot 3.x  
- Spring Web  
- Spring Mail  
- Lombok  

---

## 🚀 API Endpoint

### POST `/api/contact/message`

Send a contact message to the portfolio owner.

**Request Body:**

```json
{
  "name": "John Doe",
  "email": "john@example.com",
  "message": "Hello! I am interested in your portfolio."
}
````

**Response:**

```json
"Message sent successfully!"
```

---

## ⚙️ Configuration

Add your email credentials in `application.properties`:

```properties
spring.mail.host=smtp.example.com
spring.mail.port=587
spring.mail.username=your-email@example.com
spring.mail.password=your-email-password
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true
```

> Emails will be sent **from** and **to** this address.
> Make sure your email provider allows SMTP access (Gmail requires an App Password).

---

## 💻 Usage

1. Clone the repository:

```bash
git clone https://github.com/yourusername/PortfolioBackend.git
cd PortfolioBackend
```

2. Build the project:

```bash
./mvnw clean install
```

3. Run the application:

```bash
./mvnw spring-boot:run
```

4. Test the API using Postman, curl, or your frontend:

```bash
curl -X POST http://localhost:8080/api/contact/message \
-H "Content-Type: application/json" \
-d '{"name":"John Doe","email":"john@example.com","message":"Hello!"}'
```

---

## 🌐 Try API

You can also test the API live from your frontend portfolio or using tools like:

* [Postman](https://www.postman.com/)
* [Insomnia](https://insomnia.rest/)
* `curl` from terminal

---

## 📝 Notes

* Modify `@CrossOrigin` in `ContactController` to restrict access if needed.
* Ensure your SMTP credentials are correct.


