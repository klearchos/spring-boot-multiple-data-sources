#Spring Boot + Spring Data using multiple datasources and the same domain

I needed to transfer some entities from one database to another (source-target).

Both DBs had the same model. 
I followed the excellent instructions from this [post](https://medium.com/@joeclever/using-multiple-datasources-with-spring-boot-and-spring-data-6430b00c02e7).
The difference is that I required both datasources to have the same domain model.    