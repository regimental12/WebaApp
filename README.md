# Web application for CI346

## Usage
- Pull the repo. 
- cd into root.
- $ mvn clean install.
- $ docker-compose build.
- $ docker compose up.


You can view the results at [localhost8080/shiftplanner-0.1/](Link to Shiftplanner)

Got a the basic hypermedia controls working. These can be tested [localhost8080/shiftplanner-0.1/api](Here)

A mamy to many relationship is configured in the back end but I cant get it to show up on the web interface. Again
hopefully this shows up when you navigate the api.

Have WildFly and a postgres db in seperate containers on Docker.

API-MAN does work with rate limiting and authentication but gives a http 500 error but it is not persistant so needs configuring each time the server restarts, Same goes for Keycloak.

No unit testing.


