# MyApp

## Description

MyApp is a Java Spring Boot application that demonstrates various features and functionalities. This project includes different components such as Developer and Laptop, showcasing object-oriented programming principles and dependency injection.

## Features

- **Developer Management:** Manage developer details and their relationships with laptops.
- **Laptop Management:** Handle laptop information and their associations with developers.

## Technologies Used

- **Java**
- **Spring Boot**
- **Spring Data JPA**
- **MySQL**

## Getting Started

### Prerequisites

- Java 11 or higher
- Maven
- MySQL

### Installation

1. **Clone the repository:**

   ```bash
   git clone https://github.com/MohamadNasser1572/myApp.git
   cd myApp
   ```

2. **Configure the database:**

   Update the `application.properties` file with your MySQL database details.

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
   spring.datasource.username=your_database_username
   spring.datasource.password=your_database_password

   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   ```

3. **Build and run the application:**

   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

## Usage

### API Endpoints

- **Developers:**
  - `GET /developers`: Get all developers
  - `POST /developers`: Create a new developer
  - `GET /developers/{id}`: Get a developer by ID
  - `PUT /developers/{id}`: Update a developer by ID
  - `DELETE /developers/{id}`: Delete a developer by ID

- **Laptops:**
  - `GET /laptops`: Get all laptops
  - `POST /laptops`: Create a new laptop
  - `GET /laptops/{id}`: Get a laptop by ID
  - `PUT /laptops/{id}`: Update a laptop by ID
  - `DELETE /laptops/{id}`: Delete a laptop by ID

## Contributing

1. Fork the repository
2. Create a new branch (`git checkout -b feature-branch`)
3. Commit your changes (`git commit -am 'Add new feature'`)
4. Push to the branch (`git push origin feature-branch`)
5. Create a new Pull Request

## Contact

For any questions or suggestions, feel free to contact me.

---
