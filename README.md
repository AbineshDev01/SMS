# Student Management System Documentation

## 1. Introduction
The Student Management System is a web application built using Spring Boot that allows administrators to manage student records, including creating, reading, updating, and deleting student information. It is designed to provide a user-friendly interface for managing students' data effectively.

## 2. Features
- **Add Student**: Add new students to the database.
- **View Students**: View a list of all students.
- **Edit Student**: Update existing student information.
- **Delete Student**: Remove students from the database.

## 3. Technologies Used
- Spring Framework
- Spring Boot
- Spring Data JPA
- MySQL
- Thymeleaf
- Tailwind CSS

## 4. System Requirements
- Java 17 or higher
- Maven (if ./mvnw not working)
- MySQL 5.7 or higher

## 5. Setup Instructions
To set up the project:

1. **Clone the repository:**
   ```bash
   git clone https://github.com/abinesh-code/SMS.git
   cd SMS/sms
   ```

2. **Install dependencies:**
   ```bash
   ./mvnw clean install
   ```

3. **Configure the database:**
   In the \`application.yml\` file, configure your MySQL database credentials. The application will automatically update your database schema based on your JPA entities.

## 6. Running the Application
After setting up the database and installing the dependencies, you can run the application using the following command:

```bash
./mvnw spring-boot:run
```

The application will be accessible at `http://localhost:8080`.

## 7. Using the Application
- **Home Page**: Lists all students in the system.
- **Add Student**: Navigate to the 'Add Student' page to add a new student.
- **Edit Student**: Click the 'Edit' button next to a student to update their information.
- **Delete Student**: Click the 'Delete' button next to a student to remove them from the database.
