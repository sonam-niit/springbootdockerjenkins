FROM java

COPY ./target/springbootjpaCRUD*.jar /usr/app/dockerDemo.jar

WORKDIR /usr/app

EXPOSE 8080

ENTRYPOINT ["java","-jar","dockerDemo.jar"]
