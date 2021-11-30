# hibernate and JPA

1. Hibernate is a framework that simplifies the development of java application to interact with Database
2. Hibernate is an ORM Tool
    1. Object Relational Mapping
        1. O specifies java objects which are referred for classes
        2. Relation database is mapped to object to make task easy for development
3. Hibernate is open source and light weight , no separate dependency is required
4. Hibernate is a non-invasive framework , means it won't force the programmers to implement or extend any
   class/interface
5. Invented by Gavin King in 2001
6. Any type of application can be build with Hibernate Framework
7. With help of JDBC we used to write code manually to perform any action related to database
8. With help of hibernate we do not need to write the dao classes
9. We need to inform hibernate about the transaction we need to perform and rest action will be done by hibernate
10. We will map the classes with tables and column names and inform hibernate with mapping
11. We need not write SQL Queries to perform Database Transactions
12. Mapping cna be done using XML or using Java annotations
13. JPA provides the mapping, entities , relationship mapping, entityManager,JPQL
14. @Table
    1. Helps you to map class with the Table
15. @Id
    1. Used to specify the primary key
16. @Column
    1. Used to specify the table column
17. @ManyToMany
18. @Entity
    1. Used to detect classes to be used as tables
19. JPA is specification it is an interface and hibernate is implementation of JPA
20. JPA defines different annotations and hibernate provides implementation to all these annotations
21. Hibernate is one of the most popular ORM Framework and JPA Standards it, which means it tells that these are the
    rules we should abid by
22. Whatever JPA Defines Hibernate implements it
23. To save entity to database we can make use of entity manager
24. Entity manager tracks only those objects that are persisted using entity manager
25. @PersistenceContext
    1. Used to track objects persisted through entity manager
26. CommandLineRunner launches up when the application is started up
27. In memory database we have used over here to create tables
    1. All tables columns are automatically created in database
    2. We do not need to maintain them
    3. When we stop the instance data is removed
    4. We do not need to install them manually
    5. Url to see data in h2-console
        1. http://localhost:8080/h2-console
    6. DB Url
        1. jdbc:h2:mem:testdb
28. Spring Boot Autoconfiguration detects database as everything
29. Spring Boot is intelligent it identifies if we are using DB or in memory database and accordingly initializes the
    database
30. But we want to create one more entity we will have to create new dao service for it with almost all similar methods
31. Spring Data JPA resolves above problem by asking us to simply create an interface which will act like repository and
    will have predefined methods that cna be used by anyEntity without writing same code again and again
32. Repository will then interact with the actual database to perform operations required
33. Repository will extend JPA Repository where we need to provide 2 values
    1. Entity name
    2. Primary Key
34. Spring Data JPA makes it easy to work with entities
35. Repository further simplifies it by providing all methods in one place which can be implemented by as many other
    repositories