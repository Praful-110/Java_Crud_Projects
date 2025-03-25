graph TD;
    User -->|Requests| UserController;
    UserController -->|Processes Request| UserService;
    UserService -->|Calls DAO| UserDaoImpl;
    UserDaoImpl -->|Uses| ConnectionFactory;
    ConnectionFactory -->|Connects to| Database;


<img width="533" alt="image" src="https://github.com/user-attachments/assets/da9ed85a-044c-4a02-8fa0-9b2b2d5343ac" />
