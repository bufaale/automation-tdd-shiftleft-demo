# Dockerfile (en la raíz del proyecto)
FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

# Copiar el pom.xml desde la raíz
COPY pom.xml .

# Copiar el código fuente desde backend/src
COPY backend/src ./src

# Instalar Maven y construir
RUN apk add --no-cache maven && mvn clean package -DskipTests

# Ejecutar JAR (ajustá el nombre si no es backend-1.0.0.jar)
CMD ["java", "-jar", "target/backend-1.0.0.jar"]
