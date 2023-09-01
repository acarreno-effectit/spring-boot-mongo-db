# STEPS to build PoC to connect SpringBoot and NoSQL MongoDB


### STEP 1. Install MongoDB and MongoExpress using `docker-compose.yml` running `docker-compose up -d`

### STEP 2. Install Mongo CLI, you can download in this url: https://www.mongodb.com/try/download/shell

### STEP 3. Create `MyTestDB` Database from Mongo Express

### STEP 4. Connect to MongoDB by CLI using:
``` SHELL
mongosh --username admin --password Test123* --host localhost --port 27017
```

### STEP 5. Use Database using:
```
use MyTestDB
```

### STEP 6. Create user and assign roles to manage this Database:
```
db.createUser({user: "UserTest", pwd:  "UserTest123*", roles: [ {role: 'read', db: 'reporting'},{ role: "readWrite", db: "MyTestDB" }]})
```