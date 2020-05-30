FROM openjdk:8-jre-alpine
MAINTAINER Giulio Presazzi "gpresazzi@gmail.com"
COPY ./app/build/libs/spring0-1.0-SNAPSHOT.jar /app/web-service.war
ENTRYPOINT ["java"]
CMD ["-jar", "/app/web-service.war"]
EXPOSE 8080
RUN apk --update --no-cache add curl
#HEALTHCHECK CMD curl -f http://localhost:8080/health || exit 1