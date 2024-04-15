FROM maven:3-openjdk-11
# Set working directory
WORKDIR /usr/src/app

# Copy the project files into the container
COPY . .

# Run Maven build skipping tests
RUN mvn clean package

EXPOSE 8080

# Specify the command to run the application
CMD ["java","-jar","target/FilmApp-0.0.1-SNAPSHOT.jar"]

#docker build -t sv-74-2021 .
#docker run -e DB_URL=jdbc:postgresql://localhost:5432/clouddb -e DB_USERNAME=postgres -e DB_PASSWORD=tim8 -p 8080:8080 sv-74-2021