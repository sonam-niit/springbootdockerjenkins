FROM java

COPY ./target/springbootjpaCRUD*.jar /usr/app/dockerDemo.jar

WORKDIR /usr/app

EXPOSE 8082

ENTRYPOINT ["java","-jar","dockerDemo.jar"]
