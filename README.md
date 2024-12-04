# Library-System
## Overview

**IbrarySystem** is a Spring Boot application built to demonstrate the implementation of a library management system. The application leverages Spring Boot's powerful ecosystem, including JPA for data management and PostgreSQL for database storage, to create a scalable and efficient backend solution.

## Features

- RESTful APIs for library management.
- Persistent data storage using PostgreSQL.
- Simplified development experience with Spring Boot DevTools.
- Leveraging Lombok for boilerplate code reduction.
- - there is a simple authintication in the requests

## Technologies Used

- **Java 17**
- **Spring Boot 3.4.0**
- **Spring Data JPA** for ORM and database operations.
- **PostgreSQL** as the database.
- **Lombok** for reducing boilerplate Java code.
- **Maven** for build and dependency management.

## Prerequisites

Ensure the following are installed:

- Java 17 
- Maven 3.6
- PostgreSQL database

1. Create a PostgreSQL database.
2. Update the `application.properties` file with your database connection details:
   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/your_database_name
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   spring.jpa.hibernate.ddl-auto=update
## Project Structure

- `src/main/java`: Contains the Java source code.
  - `controller`: REST API endpoints.
  - `service`: Business logic.
  - `repository`: Interfaces for database interaction using JPA.
  - `model`: Entity classes mapping to database tables.
- `src/main/resources`: Configuration files and static resources.
  - `application.properties`: Contains database and application settings.
- `src/test`: Unit and integration tests.

## Dependencies

Key dependencies used in this project are:

- **Spring Boot Starter Data JPA**: For database operations and ORM.
- **Spring Boot Starter Web**: For building REST APIs.
- **PostgreSQL Driver**: To interact with PostgreSQL database.
- **Lombok**: For reducing boilerplate code.
- **Spring Boot DevTools**: For enhancing the development experience.

  ## API Endpoints

The following endpoints are available for managing authors in the library system:

## Author

### Base URL
`/library/author`

### Endpoints

1. **Get All Authors**
   - **URL:** `/get-all-authors`
   - **Method:** `GET`
   - **Description:** Retrieves a list of all authors in the system.
   - **Response:** Returns a JSON array of `Author` objects.

2. **Get Author by ID**
   - **URL:** `/get-author-by-id`
   - **Method:** `GET`
   - **Description:** Retrieves the details of an author by their ID.
   - **Query Parameter:**
     - `id` (integer): The ID of the author.
   - **Response:** Returns a JSON object representing the `Author`.

3. **Add a New Author**
   - **URL:** `/add-author`
   - **Method:** `POST`
   - **Description:** Adds a new author to the system.
     - Add a `name` with actual values.
   - **Response:** Returns the created `Author` object.

4. **Update an Author**
   - **URL:** `/update-author`
   - **Method:** `POST`
   - **Description:** Updates an existing author's details.
     - Replace `name` with actual values.
   - **Response:** Returns the updated `Author` object.

5. **Delete an Author by ID**
   - **URL:** `/delete-author-by-id`
   - **Method:** `POST`
   - **Description:** Deletes an author by their ID.
   - **Query Parameter:**
     - `id` (integer): The ID of the author to be deleted.
   - **Response:** None.

6. **Delete All Authors**
   - **URL:** `/delete-all-authors`
   - **Method:** `POST`
   - **Description:** Deletes all authors in the system.
   - **Response:** None.

## Book

### Base URL
`/library/book/`

#### Get All Books  
**URL**: `/get-all-books`  
**Method**: `GET`  
**Description**: Retrieves a list of all books in the system.  
**Response**: Returns a JSON array of Book objects.

---

#### Get Book by ID  
**URL**: `/get-book-by-id`  
**Method**: `GET`  
**Description**: Retrieves the details of a book by its ID.  
**Query Parameter**:  
- `id` (integer): The ID of the book.  
**Response**: Returns a JSON object representing the Book.

---

#### Add a New Book  
**URL**: `/add-book`  
**Method**: `POST`  
**Description**: Adds a new book to the system.  
**Request Body**:  
- A `Book` object containing the book's details.  
**Query Parameters**:  
- `authorId` (integer): The ID of the author.  
- `catgId` (integer): The ID of the category.  
- `publisherId` (integer): The ID of the publisher.  
**Response**: Returns the created Book object.

---

#### Update a Book  
**URL**: `/update-book`  
**Method**: `POST`  
**Description**: Updates an existing book's details.  
**Request Body**:  
- A `Book` object containing the updated details.  
**Query Parameters**:  
- `authorId` (integer): The ID of the author.  
- `catgId` (integer): The ID of the category.  
- `publisherId` (integer): The ID of the publisher.  
**Response**: Returns the updated Book object.

---

#### Delete a Book by ID  
**URL**: `/delete-book-by-id`  
**Method**: `POST`  
**Description**: Deletes a book by its ID.  
**Query Parameter**:  
- `id` (integer): The ID of the book to be deleted.  
**Response**: None.

---

#### Delete All Books  
**URL**: `/delete-all-book`  
**Method**: `POST`  
**Description**: Deletes all books in the system.  
**Response**: None.

## Category

### Base URL
`/library/category/`


#### Get All Categories  
**URL**: `/get-all-categories`  
**Method**: `GET`  
**Description**: Retrieves a list of all categories in the system.  
**Response**: Returns a JSON array of Category objects.

---

#### Get Category by ID  
**URL**: `/get-category-by-id`  
**Method**: `GET`  
**Description**: Retrieves the details of a category by its ID.  
**Query Parameter**:  
- `id` (integer): The ID of the category.  
**Response**: Returns a JSON object representing the Category.

---

#### Add a New Category  
**URL**: `/add-category`  
**Method**: `POST`  
**Description**: Adds a new category to the system.  
**Request Body**:  
- A `Category` object containing the category's details.  
**Response**: Returns the created Category object.

---

#### Update a Category  
**URL**: `/update-category`  
**Method**: `POST`  
**Description**: Updates an existing category's details.  
**Request Body**:  
- A `Category` object containing the updated details.  
**Response**: Returns the updated Category object.

---

#### Delete a Category by ID  
**URL**: `/delete-category-by-id`  
**Method**: `POST`  
**Description**: Deletes a category by its ID.  
**Query Parameter**:  
- `id` (integer): The ID of the category to be deleted.  
**Response**: None.

---

#### Delete All Categories  
**URL**: `/delete-all-categories`  
**Method**: `POST`  
**Description**: Deletes all categories in the system.  
**Response**: None.


## Publisher

### Base URL
`/library/publisher/`


#### Get All Publishers  
**URL**: `/get-all-publishers`  
**Method**: `GET`  
**Description**: Retrieves a list of all publishers in the system.  
**Response**: Returns a JSON array of Publisher objects.

---

#### Get Publisher by ID  
**URL**: `/get-publisher-by-id`  
**Method**: `GET`  
**Description**: Retrieves the details of a publisher by its ID.  
**Query Parameter**:  
- `id` (integer): The ID of the publisher.  
**Response**: Returns a JSON object representing the Publisher.

---

#### Add a New Publisher  
**URL**: `/add-publisher`  
**Method**: `POST`  
**Description**: Adds a new publisher to the system.  
**Request Body**:  
- A `Publisher` object containing the publisher's details.  
**Response**: Returns the created Publisher object.

---

#### Update a Publisher  
**URL**: `/update-publisher`  
**Method**: `POST`  
**Description**: Updates an existing publisher's details.  
**Request Body**:  
- A `Publisher` object containing the updated details.  
**Response**: Returns the updated Publisher object.

---

#### Delete a Publisher by ID  
**URL**: `/delete-publisher-by-id`  
**Method**: `POST`  
**Description**: Deletes a publisher by its ID.  
**Query Parameter**:  
- `id` (integer): The ID of the publisher to be deleted.  
**Response**: None.

---

#### Delete All Publishers  
**URL**: `/delete-all-publisher`  
**Method**: `POST`  
**Description**: Deletes all publishers in the system.  
**Response**: None.

---

# Future Enhancements
-  Improved validation for request payloads.
-  Pagination for retrieving large data sets.
-  Enhanced error handling with custom exception messages.
