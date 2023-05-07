# Product Management Fullstack App
#### Frontend Application Live Demo: https://product-management-fullstack.netlify.app/

## APIs

The server runs on Tomcat, on <http://localhost:8090>
Route | METHOD | Description
---------------------------- | ------ | -------------
/api/products/getAll | GET | Get all Products
/api/products/getProduct?id={productId} | GET | Get Product by id
/api/products/add | POST | Add/Create a new Product
/api/products/updateProduct?id={productId} | PUT | Update Product
/api/products/deleteProduct?id={productId} | DELETE | Delete Product

## Dependencies

* [Spring Boot Starter Data JPA](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-data-jpa)
* [Spring Boot Starter Web](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-web)
* [MySQL Connector/J](https://mvnrepository.com/artifact/com.mysql/mysql-connector-j)
* [Lombok](https://mvnrepository.com/artifact/org.projectlombok/lombok)
* [Spring Boot Starter Test](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-test)
