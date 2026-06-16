# Compare The Market Clone (Spring Boot + Java)

A simplified full-stack insurance comparison platform inspired by Compare The Market.  
Users can enter their details and receive real-time insurance quotes from multiple simulated providers, with support for extensible pricing strategies, asynchronous processing, and a RESTful backend API.

---

## Core Functionality
- Submit a quote request via REST API
- Receive multiple insurance quotes from different providers
- Each provider uses a unique pricing algorithm
- Compare results by price and excess

## Engineering Concepts Demonstrated
- Strategy Design Pattern (pluggable quote providers)
- REST API design using Spring Boot
- Dependency Injection
- Layered architecture (Controller → Service → Model)
- Unit testing (JUnit)
- Asynchronous processing with `CompletableFuture`
- Extensible system design (easy to add new providers)

---

## Tech Stack

### Backend
- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- PostgreSQL
- Maven

### Testing
- JUnit

---

## API Endpoints

### Generate Quotes

**POST** `/api/quotes`

#### Request Body

```json
{
  "age": 25,
  "vehicleValue": 15000,
  "yearsDriving": 5,
  "claims": 1
}
```

#### Response

```json
{
  "provider": "BudgetCover",
  "price": 450.0,
  "excess": 250
},
{
  "provider": "SafeDrive",
  "price": 725.0,
  "excess": 150
}
```
