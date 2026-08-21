# Spring 6 & Thymeleaf 3 Enterprise Web Application

A Java web application built to explore the underlying concepts of the
modern Spring Framework ecosystem using explicit configuration and a
traditional layered application architecture.

The project brings together Spring Framework 6, Spring MVC, Spring Data JPA,
Hibernate, Thymeleaf and relational persistence within a deployable WAR-based
web application.

The purpose of the project is not simply to demonstrate CRUD functionality,
but to explore how the different layers of a Spring-based enterprise
application are configured and integrated.

---

## Overview

Modern Spring applications often hide significant infrastructure behind
Spring Boot auto-configuration.

This project deliberately explores the framework concepts beneath that
abstraction.

The application provides a reference for understanding the relationship
between:

- Spring Core and Dependency Injection
- Spring MVC
- Controller and presentation responsibilities
- Thymeleaf server-side rendering
- Spring Data JPA
- Hibernate ORM
- Relational database persistence
- Connection pooling
- Transaction management
- Application security infrastructure
- Logging
- Object mapping
- WAR-based application deployment

The objective is to understand how these components work together as part of
a traditional enterprise Java web application.

---

# Architecture Overview

The application follows a layered architecture:

```text
┌──────────────────────────────────────┐
│          Presentation Layer          │
│                                      │
│      Thymeleaf Views / Web UI        │
└───────────────────▲──────────────────┘
                    │
┌───────────────────┴──────────────────┐
│           Spring MVC Layer           │
│                                      │
│        Controllers / Web Flow        │
└───────────────────▲──────────────────┘
                    │
┌───────────────────┴──────────────────┐
│         Application / Service        │
│                                      │
│      Business Logic / Use Cases      │
└───────────────────▲──────────────────┘
                    │
┌───────────────────┴──────────────────┐
│          Persistence Layer           │
│                                      │
│   Spring Data JPA / Hibernate ORM    │
└───────────────────▲──────────────────┘
                    │
┌───────────────────┴──────────────────┐
│             Data Layer               │
│                                      │
│           MySQL / H2                 │
└──────────────────────────────────────┘
````

The project is intended to make the responsibilities of each layer visible
rather than collapsing application concerns into controllers or persistence
code.

---

# Technology Stack

| Area                    | Technology                      |
| ----------------------- | ------------------------------- |
| Language                | Java 17                         |
| Core Framework          | Spring Framework 6.1            |
| Web Framework           | Spring MVC                      |
| View Technology         | Thymeleaf 3.1                   |
| Template Layout         | Thymeleaf Layout Dialect        |
| Persistence             | Spring Data JPA                 |
| ORM                     | Hibernate                       |
| Databases               | MySQL / H2                      |
| Connection Pooling      | HikariCP                        |
| Security Infrastructure | Spring Security                 |
| Object Mapping          | ModelMapper                     |
| JSON                    | Jackson                         |
| Logging                 | SLF4J / Log4j                   |
| Testing                 | JUnit 5 / Mockito / Spring Test |
| Build Tool              | Maven                           |
| Packaging               | WAR                             |
| Servlet API             | Jakarta Servlet 6               |

---

# Core Concepts Explored

## Spring Core and Dependency Injection

The application explores Spring's Inversion of Control container and
dependency management.

Rather than application components manually constructing their dependencies,
the Spring container is responsible for creating, configuring and managing
application objects.

Conceptually:

```text
Application Component
        │
        ▼
Dependency Required
        │
        ▼
Spring Application Context
        │
        ▼
Dependency Resolution and Injection
```

This provides the foundation for loose coupling and independently testable
application components.

---

## Spring MVC

The web layer follows the Model-View-Controller pattern.

```text
HTTP Request
     │
     ▼
DispatcherServlet
     │
     ▼
Controller
     │
     ├──── Model
     │
     ▼
View Resolution
     │
     ▼
Thymeleaf Template
     │
     ▼
HTML Response
```

Controllers are responsible for coordinating HTTP requests with application
behaviour while keeping business and persistence concerns outside the web
layer.

---

## Thymeleaf

Thymeleaf is used as the server-side template engine for rendering dynamic
HTML views.

The project explores:

* Template resolution
* Model attributes
* Server-side rendering
* Dynamic HTML
* View composition
* Layout management

Thymeleaf integrates directly with Spring MVC, allowing data prepared by the
controller layer to be rendered within the presentation layer.

---

## Persistence

The persistence layer combines Spring Data JPA and Hibernate.

The conceptual flow is:

```text
Application Service
        │
        ▼
Repository
        │
        ▼
Spring Data JPA
        │
        ▼
Hibernate
        │
        ▼
JDBC / Connection Pool
        │
        ▼
Relational Database
```

This provides an opportunity to explore how Spring's higher-level persistence
abstractions relate to the underlying ORM and database infrastructure.

---

## Connection Pooling

Database connectivity is not treated simply as a direct connection from the
application to the database.

The project includes connection-pooling infrastructure to explore how
enterprise applications manage database connections efficiently.

```text
Application
     │
     ▼
Persistence Layer
     │
     ▼
Connection Pool
     │
     ▼
Database
```

---

## Traditional WAR-Based Deployment

The project is packaged as a WAR application.

This provides a useful contrast with executable Spring Boot applications.

The project therefore explores concepts associated with traditional enterprise
Java deployment, including:

* WAR packaging
* Servlet containers
* `web.xml`
* Application context configuration
* MVC configuration
* External application deployment

Understanding this deployment model provides useful context for understanding
what Spring Boot later automates.

---

# Why Explore Spring Without Relying Entirely on Auto-Configuration?

Spring Boot significantly reduces application setup.

However, the infrastructure still exists.

For example:

```text
Spring Boot

Developer Configuration
        │
        ▼
Auto-Configuration
        │
        ▼
Spring Application Context
        │
        ├── Beans
        ├── DataSource
        ├── EntityManagerFactory
        ├── Transaction Manager
        ├── MVC Infrastructure
        └── Application Components
```

This project focuses on understanding the underlying application infrastructure
rather than only consuming framework abstractions.

The goal is to develop transferable engineering knowledge:

> Understanding what the framework is doing makes it easier to reason about
> configuration, debugging, performance and architectural trade-offs.

---

# Project Structure

The project follows a conventional enterprise Java application structure.

```text
src
├── main
│   ├── java
│   │   └── Application source code
│   │
│   ├── resources
│   │   └── Application configuration and resources
│   │
│   └── webapp
│       ├── WEB-INF
│       └── Web application resources
│
└── test
    └── Application and component tests
```

---

# Engineering Focus

This project represents a transition from:

> "I can build a web application using a framework."

towards:

> "I understand how an enterprise Java web application is structured,
> configured and integrated across its web, application, persistence and
> infrastructure layers."

The emphasis is therefore on the interaction between:

```text
Spring Core
      +
Spring MVC
      +
Server-Side Rendering
      +
Persistence
      +
ORM
      +
Database Infrastructure
      +
Enterprise Deployment
```

---

# Building the Application

The project uses Maven.

```bash
mvn clean install
```

The project targets Java 17.

---

# Running the Application

As the project is packaged as a WAR, it is intended for deployment to a
compatible Jakarta Servlet container.

Runtime configuration may need to be adapted depending on the target
environment and database configuration.

---

# Key Learning Takeaway

The purpose of this project is to understand the infrastructure and
architectural relationships beneath a Spring-based web application.

The core question is not simply:

> "How do I build a website with Spring?"

It is:

> "How do Spring Core, MVC, server-side rendering, persistence, ORM,
> transaction infrastructure and deployment fit together inside an
> enterprise Java application?"

Understanding that relationship provides a stronger engineering foundation
than learning individual framework annotations in isolation.
