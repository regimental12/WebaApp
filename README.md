# Web application for CI346

## Usage
- Pull the repo. 
- cd into root.
- $ mvn clean install.
- $ docker-compose build.
- $ docker compose up.


Once installed and running you can view the results at [Link to Shiftplanner](http://localhost:8080/shiftplanner-0.1/)

Got the basic hypermedia controls working. These can be tested [Here](http://localhost:8080/shiftplanner-0.1/api)

A mamy to many relationship is configured in the back end but I can't get it to show up on the web interface. Again
hopefully this shows up when you navigate the api.

Have WildFly and a postgres db in seperate containers on Docker.

API-MAN does work with rate limiting and authentication but gives a http 500 error once credentials are entered.
It is not persistant so needs configuring each time the server restarts, Same goes for Keycloak.

No unit testing.


