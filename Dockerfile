From openjdk:17
copy target/Petzey_Authentication-0.0.1-SNAPSHOT.jar Petzey_Authentication-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","Petzey_Authentication-0.0.1-SNAPSHOT.jar"]
EXPOSE 8087