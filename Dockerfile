FROM java:8
ADD target/server-config.jar server-config.jar
ENTRYPOINT ["java","-jar","server-config.jar"]

#docker build -f Dockerfile -t server-config .
#docker images
#docker run -p 8081:8081 server-config
#docker rmi -f <imageId>