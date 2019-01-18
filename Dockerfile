FROM winamd64/openjdk:8u191-jdk-nanoserver-sac2016
COPY ./build/libs/hello-java-0.0.1-SNAPSHOT.jar hello-java-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "hello-java-0.0.1-SNAPSHOT.jar"]