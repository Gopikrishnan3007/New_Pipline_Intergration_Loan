
# #

# # Build

# #

# FROM maven:3.8.3-openjdk-17 AS build

# COPY src /home/app/src

# COPY pom.xml /home/app

# RUN mvn -f /home/app/pom.xml clean package


# #

# # Package stage

# #

# FROM openjdk:17-alpine

# COPY --from=build /home/app/target/Loan_Management_System-0.0.1-SNAPSHOT.jar /usr/local/lib/Loan_Management_System-0.0.1-SNAPSHOT.jar

# ENTRYPOINT ["java","-jar","/usr/local/lib/Loan_Management_System-0.0.1-SNAPSHOT.jar"]

FROM openjdk:18
WORKDIR /app
COPY ./target/Loan_Management_System-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080
CMD ["java", "-jar", "Loan_Management_System-0.0.1-SNAPSHOT.jar"]
 
