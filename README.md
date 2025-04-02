# Collaborative Code Editor

A real-time, browser-based collaborative code editor with project management, version control, and integrated execution support. Built using **Spring Boot**, **Node.js**, **Monaco Editor**, and **Yjs**.

##  Features

- **Real-Time Collaboration**: Multiple users can edit the same file simultaneously using **Yjs**.
- **Role-Based Access Control**: Project owners can assign roles (viewer/editor).
- **Integrated Code Execution**: Supports running code inside **Docker containers**.
- **Project Management**: Users can create, delete, rename, and organize projects.
- **Version Control**: Users can create branches, commit changes, and send merge requests.
- **OAuth 2.0 Authentication**: Google & GitHub login support.
- **Monaco Editor Integration**: IntelliSense, syntax highlighting, and error checking.
- **Persistent Rooms**: Rooms remain active even after page refresh.
- **Backend API with Spring Boot**: Uses **Java Process Builder** for code execution.
- **Frontend with Node.js & Webpack**: Modular frontend setup for scalability.
- **WebSocket Communication**: Real-time updates via **Y-WebSocket Server**.
- **Database Management**: **MySQL** with JPA for data persistence.

##  Tech Stack

### Backend:

- **Spring Boot**: Manages API requests and handles business logic.
- **Java Process Builder**: Enables secure code execution inside **Docker**.
- **JPA (Java Persistence API)**: ORM for database interaction.
- **Y-WebSocket Server**: Facilitates real-time collaborative editing.
- **OAuth 2.0 with Spring Security**: Handles authentication and user sessions.
- **WebSockets**: Enables low-latency, real-time data transfer.

### Frontend:

- **Node.js & Webpack**: Provides a modular and optimized frontend.

- **Monaco Editor**: The same editor used by VS Code

- **Yjs**: A powerful CRDT-based library for real-time collaboration.

- **WebSocket Clients**: Communicates with the backend for real-time updates.

### Database:

- **MySQL**: Stores projects and users data.


##  Implementation Details

### 1. Real-Time Collaboration

- **Yjs** is used to manage collaborative editing.
- **Y-WebSocket Server** handles WebSocket communication for real-time updates.
- Each user connects to a unique **document room**, and changes are synced instantly.

### 2. Project Management

- Users can create and manage multiple projects.
- Project data is stored in **MySQL** using **JPA**.
- Unique project IDs ensure no duplicate project names for the same user.

### 3. Version Control System

- Users can create branches from existing projects.
- Commit history is stored in the database.
- **Git-like functionality** for tracking changes.

### 4. Code Execution

- The **Java Process Builder** runs user code inside Docker containers.
- Each execution is sandboxed to prevent security vulnerabilities.
- Supports multiple languages including **Java and Python**
- Input/output is streamed via WebSockets for real-time interaction.

### 5. Authentication & Security

- Users authenticate via **OAuth 2.0** (Google/GitHub).
- Role-based access ensures editors/viewers have appropriate permissions.


