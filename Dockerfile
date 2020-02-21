FROM maven:3-jdk-11 AS builder
ADD . /root/spring
WORKDIR /root/spring
RUN [ "mvn", "package" ]

FROM openjdk:11
COPY --from=builder /root/spring/target/spring-example-*.jar /root/spring-example.jar
WORKDIR /root
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "spring-example.jar" ]