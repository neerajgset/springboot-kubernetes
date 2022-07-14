package com.neeraj.bookmarkerapi;

import com.neeraj.bookmarkerapi.domain.Bookmark;
import com.neeraj.bookmarkerapi.domain.BookmarkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private final BookmarkRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Bookmark(null, "How To Remove Docker Containers, Images, Volumes, and Networks", "https://linuxize.com/post/how-to-remove-docker-images-containers-volumes-and-networks", Instant.now()));
        repository.save(new Bookmark(null, "All You Need To Know About Unit Testing with Spring Boot", "https://reflectoring.io/unit-testing-spring-boot", Instant.now()));
        repository.save(new Bookmark(null, "Spring Boot Security Jwt Authentication", "https://www.devglan.com/spring-security/spring-boot-jwt-auth", Instant.now()));
        repository.save(new Bookmark(null, "A categorized list of all Java and JVM features since JDK 8", "https://advancedweb.hu/2019/02/19/post_java_8", Instant.now()));
        repository.save(new Bookmark(null, "Java Microservices: A Practical Guide", "https://www.marcobehler.com/guides/java-microservices-a-practical-guide", Instant.now()));
        repository.save(new Bookmark(null, "Achieving framework-independent zen with the power of interfaces and hexagonal architecture", "https://rskupnik.github.io/framework-independence-with-hexagonal-architecture", Instant.now()));
        repository.save(new Bookmark(null, "SpringBoot Integration Testing using TestContainers Starter", "https://sivalabs.in/2020/02/spring-boot-integration-testing-using-testcontainers-starter", Instant.now()));
        repository.save(new Bookmark(null, "Deserialize Immutable Objects with Jackson", "https://www.baeldung.com/jackson-deserialize-immutable-objects", Instant.now()));
        repository.save(new Bookmark(null, "How to teach Git", "https://rachelcarmena.github.io/2018/12/12/how-to-teach-git.html", Instant.now()));
        repository.save(new Bookmark(null, "Flyway and jOOQ for Unbeatable SQL Development Productivity", "https://blog.jooq.org/2014/06/25/flyway-and-jooq-for-unbeatable-sql-development-productivity", Instant.now()));
        repository.save(new Bookmark(null, "Spring Boot integration with p6spy, datasource-proxy, flexy-pool and spring-cloud-sleuth", "https://github.com/gavlyukovskiy/spring-boot-data-source-decorator", Instant.now()));
    }
}
