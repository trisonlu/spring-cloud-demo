# cloud-eureka-cluster
mvn clean package
java -jar target/cloud-eureka-cluster-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer1
java -jar target/cloud-eureka-cluster-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer2
java -jar target/cloud-eureka-cluster-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer3
java -jar target/cloud-eureka-cluster-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer4
java -jar target/cloud-eureka-cluster-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer5
java -jar target/cloud-eureka-cluster-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer6