# User Login Using Servlet and HTML Form

## 🎯 Objective
To create a simple login page using Java Servlets that validates user credentials and displays a personalized message.

## 📂 Project Structure
```
UserLoginApp/
├── src/com/example/servlet/LoginServlet.java
├── WebContent/login.html
└── WebContent/WEB-INF/web.xml
```

## ⚙️ Setup Instructions
1. Install Apache Tomcat (version 9+ recommended).
2. Import this project into Eclipse/NetBeans or any IDE.
3. Deploy the project on Tomcat server.
4. Open browser and visit:  
   `http://localhost:8080/UserLoginApp/login.html`

## 👤 Default Credentials
```
Username: admin  
Password: 1234
```

## 🧠 Concepts Demonstrated
- HTML form submission using POST method  
- Servlet request handling (`doPost`)  
- Dynamic response generation using `PrintWriter`
