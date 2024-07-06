# Spring Boot PATCH Mapping API with ReflectionUtils

This project is a Spring Boot API that demonstrates how to perform partial updates (PATCH requests) on an entity using `ReflectionUtils`. The API allows updating specific fields of the `Name And Roll No` entity.

## Features

- Update specific fields of the `PutAndPatch` entity via PATCH requests.
- Handle non-existent fields gracefully.
- Return appropriate HTTP status codes for different scenarios.

## Prerequisites

- Java 17 or higher
- Maven 3.6.3 or higher
- Spring Boot 2.5.0 or higher
- An existing database configured in `application.properties`

## Getting Started

### Clone the Repository

```bash
git clone https://github.com/KoushalKumar22/Springboot-patch-reflection-api.git
cd springboot-patch-reflection-api
