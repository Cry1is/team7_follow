# team7_follow

Follow user feature for a social network.

## How to run
### For frontend: 

First, rename config.json.example to config.json. If you are running the backend locally on port 9005, nothing needs to be changed. However, if that is not where the backend is located, change that to the appropriate URL before building the frontend. Please make sure there are no trailing slashes and ensure the protocol (HTTP or HTTPS) is specified.

Then, run the following commands in the react_frontend directory:

```bash
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

