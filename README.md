🔹 Key Features:
----------------------------------------------------------------------------------------------------

CRUD Operations – Create, Read, Update, Delete users in the database.

Modular Design – Follows DAO (Data Access Object) and Service patterns.

JDBC Connection Factory – Centralized database connection management.

Separation of Concerns – Well-structured with Controller, Service, DAO, and Entity layers.

Eclipse-Compatible – Includes .classpath and .project for easy import.

MySQL/PostgreSQL Support – Uses JDBC for flexible database integration.

Scalability – Can be extended for more features like authentication, logging, or UI integration.


graph TD;
    User -->|Requests| UserController;
    
    UserController -->|Processes Request| UserService;
    
    UserService -->|Calls DAO| UserDaoImpl;
    
    UserDaoImpl -->|Uses| ConnectionFactory;
    
    ConnectionFactory -->|Connects to| Database;


    JDBC_CRUD_PROJECTS/
_________________________________________________________________________________________________________________________

│── src/

│   ├── softronix/in/

│   │   ├── UserController.java

│   │   ├── entity/

│   │   │   ├── User.java

│   ├── UserDao/

│   │   ├── UserDao.java

│   │   ├── UserDaoImpl.java

│   ├── UserFactory/

│   │   ├── ConnectionFactory.java

│   │   ├── DaoFactory.java

│   │   ├── ServiceFactory.java

│   ├── UserService/

│   │   ├── UserService.java

│   │   ├── UserServiceImpl.java

│   ├── module-info.java

│

├── bin/                # Compiled .class files

├── .classpath          # Eclipse classpath settings

├── .project            # Eclipse project file

├── .settings/          # Eclipse settings folder




<img width="533" alt="image" src="https://github.com/user-attachments/assets/da9ed85a-044c-4a02-8fa0-9b2b2d5343ac" />
