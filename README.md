🔹 Key Feature:
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


🔹 Project Structure 
-----------------------------------------------------------------------------------------------------------------------------------------------------
Root Directory:


• JDBC_CRUD_1/

• JDBC_CRUD_2/

• JDBC_CRUD_3/

• JDBC_CRUD_4/

    - .classpath  
    - .project  
    • .settings/  
        - org.eclipse.core.resources.prefs  
        - org.eclipse.jdt.core.prefs  
    • bin/ (Compiled Classes)  
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
        - module-info.class  
        • softronix/in/  
            - UserController.class  
            • entity/  
                - User.class  
                
    • src/ (Source Code)  
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
        - module-info.java  
        • softronix/in/  
            - UserController.java  
            • entity/  
                - User.java  

     


Output:-
---------------------------------------------------------------------------------------------------------------------------------------------
<img width="625" alt="image" src="https://github.com/user-attachments/assets/1e22f2d2-de05-480f-b6b4-405963227479" />


