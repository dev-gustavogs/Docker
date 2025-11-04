# Usar imagem oficial do OpenJDK 17 (ou 21 se seu projeto for compatível)
FROM openjdk:17-jdk-slim

# Diretório de trabalho dentro do container
WORKDIR /app

# Copiar pom.xml e baixar dependências antes para cache do Docker
COPY pom.xml .
RUN ./mvnw dependency:go-offline

# Copiar todo o código fonte
COPY src ./src

# Build da aplicação
RUN ./mvnw clean package -DskipTests

# Expõe porta (Spring Boot default)
EXPOSE 8080

# Rodar a aplicação
ENTRYPOINT ["java","-jar","target/softfact-0.0.1-SNAPSHOT.jar"]