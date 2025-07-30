# 🔐 Redis Token Cache Example - Spring Boot

A Spring Boot project that uses Redis to cache access tokens for fast, stateless authentication.

## Tecg Stack
- Java 17
- Spring Boot
- Redis
- Spring Data Redis

## 🚀 How it works
- On login, token is stored in Redis with TTL(currently set to 60 seconds).
- Every request checks Redis to validate the token.
-  - You can increase or decrease TTL as needed.

## 🏃‍♀️ Run
Make sure Redis is running locally, then:

```bash
./mvnw spring-boot:run
