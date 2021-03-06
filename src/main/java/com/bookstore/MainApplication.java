package com.bookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
/*
 * 
 * Offset Pagination - Trigger SELECT COUNT Subquery And Return List<projection> That Maps Entities And The Total Number Of Records Via Projection

Description: This application fetches data as List<projection> via Spring Boot offset pagination. The projection maps the entity and the total number of records. This information is fetched in a single database rountrip because the SELECT COUNT triggered for counting the total number of records is a subquery of the main SELECT. Therefore, there will be a single database roundtrip instead of two (typically, there is one query needed for fetching the data and one for counting the total number of records). Use this approch only if the fetched data is not read-only. Otherwise, prefer List<dto> as here.

Key points:

write a Spring projection that maps the entity and the total number of records
write a repository that extends PagingAndSortingRepository
fetch data via a JPQL query (that includes SELECT COUNT subquery) into a List<projection>
 * 
 * 
 * 
 */
