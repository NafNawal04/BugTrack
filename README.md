# BugTrack

remove any target folder before running

### 1. Start Service Registry

```bash
cd ServiceRegistry
./mvnw spring-boot:run
```

### 1. Start User Service

```bash
cd user-service
./mvnw spring-boot:run
```

### 1. Start API Gateway

```bash
cd APIGateway
./mvnw spring-boot:run
```

make sure to have jdk 11 installed 
for every service, use java version 11 and spring cloud version 2021.0.8
