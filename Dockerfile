FROM maven:3.8.5-jdk-8

COPY . /petstore
WORKDIR /petstore

ARG CACHE_BUST
RUN mvn clean install -s /usr/share/maven/ref/settings-docker.xml -DskipTests
CMD mvn test -s /usr/share/maven/ref/settings-docker.xml
