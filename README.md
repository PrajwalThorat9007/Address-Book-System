# Address-Book-System

## Project Overview

The **Address Book System** is a console-based Java application developed using Object-Oriented Programming principles and the Java Collection Framework.

The system allows users to:

* Manage multiple Address Books
* Add, edit, and delete contacts
* Prevent duplicate entries
* Search contacts across address books
* Group and count contacts by city or state
* Sort contacts by name, city, state, or zip
* Follow GitFlow branching strategy for version control

This project was implemented use-case by use-case (UC1–UC12) with proper refactoring and clean commit history.

---

## Technologies Used

* Java (OOP Concepts)
* Java Collection Framework (List, Map)
* Java Streams API
* Comparator API
* Git & GitFlow
* Maven Project Structure
* IntelliJ IDEA

---

## Project Structure

```
Address-Book-System
 ├── src
 │   └── main
 │       └── java
 │           ├── AddressBookMain.java
 │           ├── AddressBook.java
 │           └── Contact.java
 ├── pom.xml
 └── .gitignore
```

---

## Key Features (UC1 – UC12)

### UC1

* Created `Contact` class with required fields.
* Displayed welcome message.

### UC2

* Added console-based contact creation.
* Implemented HAS-A relationship between AddressBook and Contact.

### UC3

* Edit contact using name.

### UC4

* Delete contact using name.

### UC5

* Converted system into menu-driven application.
* Allowed multiple contacts using `ArrayList`.

### UC6

* Added support for multiple AddressBooks.
* Used `Map<String, AddressBook>` for dictionary structure.

### UC7

* Prevented duplicate contacts.
* Overrode `equals()` and `hashCode()`.
* Used Java Streams for duplicate checking.

### UC8

* Search contacts by City or State across multiple AddressBooks.
* Used `flatMap()` with Streams.

### UC9

* Group contacts by City or State.
* Used `Collectors.groupingBy()`.

### UC10

* Count contacts by City or State.
* Used `Collectors.counting()`.

### UC11

* Sort contacts alphabetically by Name.
* Used `Comparator.comparing()` and `thenComparing()`.

### UC12

* Sort contacts by City, State, or Zip.
* Implemented dynamic Comparator selection.

---

## Core Concepts Demonstrated

* Object-Oriented Design
* Encapsulation
* HAS-A Relationship
* List and Map Collections
* Java Streams

  * filter()
  * flatMap()
  * groupingBy()
  * counting()
  * sorted()
* Comparator and Method References
* equals() and hashCode() override
* Modular Design
* Menu-driven Console Application
* GitFlow Feature Branching Strategy

---

## Git Workflow Followed

Each use case was implemented in a separate feature branch:

```
git flow feature start UCx
git add .
git commit -m "[Prajwal]:UCx: Description"
git push origin feature/UCx
git flow feature finish -k UCx
git push origin develop
```

Feature branches were preserved using the `-k` flag to maintain history.

---

## How to Run the Project

1. Clone the repository:

```
git clone <repository-url>
```

2. Navigate to project folder:

```
cd Address-Book-System
```

3. Build using Maven:

```
mvn clean install
```

4. Run the application:

```
mvn exec:java
```

Or run `AddressBookMain.java` directly from IDE.

---

## Sample Functionalities

* Create new Address Book
* Add multiple contacts
* Edit or delete contacts
* Prevent duplicate entries
* Search across all address books
* View grouped contacts
* Count contacts by location
* Sort contacts dynamically
  
---

## Conclusion

This project demonstrates practical implementation of:

* Java OOP principles
* Collection Framework
* Stream API
* Comparator usage
* Structured GitFlow development

The system is modular, scalable, and follows clean coding and version control practices.
