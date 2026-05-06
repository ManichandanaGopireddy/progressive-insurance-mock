# Progressive Insurance Mock — Quote Session API

A production-grade Spring Boot microservice that simulates the customer
data collection wizard for an auto insurance quoting platform.
Built with a contract-first approach using OpenAPI 3.0.

---

## Architecture

This is **API 1** of a two-microservice insurance platform.
progressive-insurance-mock/
├── common-models/          # Shared exceptions
├── openapi-contract/       # YAML contract + generated Java interfaces
├── dynamo-proxy/           # DynamoDB entities and repositories
└── quote-session-service/  # Spring Boot application (port 8081)

---

## Tech Stack

| Technology | Purpose |
|---|---|
| Java 21 | Language |
| Spring Boot 3.2.4 | Application framework |
| OpenAPI Generator 7.4.0 | Contract-first code generation |
| AWS DynamoDB | Data persistence |
| MapStruct 1.5.5 | Object mapping |
| Lombok | Boilerplate reduction |
| Springdoc OpenAPI | Swagger UI |

---

## DynamoDB Tables

| Table | Partition Key | Sort Key | Purpose |
|---|---|---|---|
| quote_sessions | quoteReferenceId | — | Customer session data |
| session_drivers | quoteReferenceId | driverId | Driver records |
| session_vehicles | quoteReferenceId | vehicleId | Vehicle records |

---

## API Endpoints

### Quote Session
| Method | Endpoint | Description |
|---|---|---|
| POST | /api/v1/quote-session/start | Start a new quote session |
| POST | /api/v1/quote-session/{id}/drivers | Add drivers to session |
| POST | /api/v1/quote-session/{id}/vehicles | Add vehicles to session |
| POST | /api/v1/quote-session/{id}/coverage | Save coverage selection |
| GET | /api/v1/quote-session/{id}/review | Full session snapshot |

---

## Key Design Decisions

**Permanent customerId**
Derived from email via `UUID.nameUUIDFromBytes(email)`.
Same email always produces the same customerId across sessions.

**Duplicate prevention**
If the same email already has an IN_PROGRESS session,
returns 409 CONFLICT with the existing quoteReferenceId.

**Data masking**
- SSN stored as `***-**-XXXX` (last 4 digits only)
- VIN stored as `***********XXXXXX` (last 6 characters only)

**licenseNumber**
Stored as-is. First character used by API 2 (Quote Engine)
for CLUE verification risk scoring.

**Coverage selection in API 1**
Customer selects coverage tier and deductible in API 1
(not API 2) because it is customer input data, not a
calculation. API 2 reads it from the session review endpoint.

---

## Prerequisites

- Java 21
- Maven 3.8+
- AWS account with DynamoDB access
- AWS credentials configured at `~/.aws/credentials`

---

## Running the Application

```bash
# Build
mvn clean install -DskipTests

# Run
java -jar quote-session-service/target/quote-session-service-1.0.0-SNAPSHOT.jar
```

Application starts on **port 8081**.

Swagger UI: `http://localhost:8081/swagger-ui/index.html`

---

## Test Flow

Run these endpoints in order:

POST /api/v1/quote-session/start
→ Returns quoteReferenceId
POST /api/v1/quote-session/{quoteReferenceId}/drivers
→ Add at least one driver with licenseNumber
→ Returns driverIds
POST /api/v1/quote-session/{quoteReferenceId}/vehicles
→ Add vehicles using driverIds from step 2
→ Returns vehicleIds
POST /api/v1/quote-session/{quoteReferenceId}/coverage
→ Select BASIC / CHOICE / RECOMMENDED + deductible
GET /api/v1/quote-session/{quoteReferenceId}/review
→ Confirm full session snapshot
→ Pass quoteReferenceId to API 2 for quote calculation


---

## Related Project

**API 2 — Progressive Quote Engine**
Reads session data from this API, runs CLUE verification,
applies multi-factor rate calculation, and returns 3 quote packages.

Repository: `progressive-quote-engine`
