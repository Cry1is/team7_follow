# team7_follow

Follow user feature for a social network.

## How to run
### For frontend: 
```bash
cd react_frontend
npm install
npx next dev
```
This will spawn a frontend instance on port 3000 on your localhost. Browse to http://localhost:3000 in your browser of choice to interact with it!


### For Backend:
Ensure you have a MySQL/MariaDB instance running. Make sure to get the database name, hostname, username, and password of your database instance.

Next, change the database connection info in [conf/application.conf](ebean-backend/conf/application.conf) to the ones for your specific database.

Finally, start the program like you would any Play! Framework project (Build with sbt, then click run in IntelliJ).

This will spawn a backend instance on port 9005 on your localhost.

## --------------------------------- Info ---------------------------------
*Parts of this project were coded using CodeWithMe, so commits by one user may include the work of multiple people.

