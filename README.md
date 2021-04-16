# Online Music Store

### Edit (04/16/21)
Deployed the app on [Heroku](https://online-music-store-01.herokuapp.com/).

### About
1.  An online music store where a customer can view/search for music products like songs and albums, add them to a shopping cart and later purchase them. 
2.  A customer can place multiple orders and all the information about the orders, items purchased in an order are kept persistent using a mysql database.
3.  There are two views for this application: 1) Customer View and 2) Admin View. As mentioned above a customer can view music products and purchase them whereas an admin can add new products, manage customers and customers orders status.
4.  For the backend, I used java persistence annotations for creating the database entities, Spring Data JPA for performing CRUD operations on the database and REST controllers for handling HTTP requests from the front end.
5.  Used Spring securities form login authentication for handling login/logout sessions and also for access limiting users based on roles using ant matchers.
6.  Frontend was built using jsps, thymeleaf and bootstrap.

### To Run
1. Clone this project to your device.
2. Update database configuration in application.properties file.
3. Run this project as a Maven Build.
4. The application runs at localhost:8090.


### Technologies
1. Java 8
2. Spring Boot
3. Spring MVC, Security, Data JPA, Devtools
4. MySQL
5. JSP, Thymeleaf
6. Bootstrap
7. Maven, Tomcat

### Entity Relation Diagram
![ERD](https://github.com/codeShuriken/music-store/blob/main/imgs/erd.png)


### Login page
![Login](https://github.com/codeShuriken/music-store/blob/main/imgs/login.png)

### Products Search Page
![Products](https://github.com/codeShuriken/music-store/blob/main/imgs/products_search_page.png)

### Admin Home Page
![Admin](https://github.com/codeShuriken/music-store/blob/main/imgs/admin.png)
