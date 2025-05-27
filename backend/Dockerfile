FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

# Copiar código fuente y pom.xml
COPY backend/pom.xml .
COPY backend/src ./src

# Instalar Maven (ligero) y construir
RUN apk add --no-cache maven && mvn clean package -DskipTests

# Ejecutar el JAR
CMD ["java", "-jar", "target/backend-1.0.0.jar"]
