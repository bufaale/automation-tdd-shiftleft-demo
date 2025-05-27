# Dockerfile

FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

# Copiar el pom.xml desde la raíz del proyecto
COPY pom.xml .

# Copiar el código fuente del backend
COPY backend/src ./src

# Instalar Maven y construir el proyecto
RUN apk add --no-cache maven \
  && mvn clean package -DskipTests

# Ejecutar el JAR generado (ajustá el nombre si llegara a cambiar)
CMD ["java", "-jar", "target/automation-tdd-shiftleft-demo-1.0.0.jar"]
