**Camel Integration Project**

**Construir el Proyecto:**

1. docker run -e POSTGRES_USER=camel -e POSTGRES_PASSWORD=camel -p 5432:5432 -d postgres:15

2. mvn clean package

3. mvn camel:run

