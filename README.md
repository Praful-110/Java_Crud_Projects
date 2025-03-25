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

• JDBC_CRUD_1/
  - .classpath
  - .project
  • .settings/
    - org.eclipse.core.resources.prefs
    - org.eclipse.jdt.core.prefs
  • bin/
    - module-info.class
    • softronix/
      • in/
        - UserController.class
        • entity/
          - User.class
      • UserDao/
        - UserDao.class
        - UserDaoImpl.class
      • UserFactory/
        - ConnectionFactory.class
        - DaoFactory.class
        - ServiceFactory.class
      • UserService/
        - UserService.class
        - UserServiceImpl.class
  • src/
    - module-info.java
    • softronix/
      • in/
        - UserController.java
        - entity/
          - User.java
      • UserDao/
        - UserDao.java
        - UserDaoImpl.java
      • UserFactory/
        - ConnectionFactory.java
        - DaoFactory.java
        - ServiceFactory.java
      • UserService/
        - UserService.java
        - UserServiceImpl.java
     



Output:-
______________________________________________________________________________________________________________________________________________
             <img width="733" alt="image" src="https://github.com/user-attachments/assets/221b275b-192a-4ce2-8d51-ff197cd8e03f" />


