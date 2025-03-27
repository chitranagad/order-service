FROM openjdk:17-oracle
EXPOSE 9192
ADD target/order-service.jar order-service.jar
ENTRYPOINT ["java", "-jar", "/order-service.jar"]
