# How to start the application?

start environment (mongo-db)

    docker-compose up -d

start application
cd springboot/

    ../gradlew bootRun
    
create an organizer

    curl -X POST \
      http://localhost:8080/organizer \
      -H 'Content-Type: application/json' \
      -d '{"name" : "test"}'
      
show created organizers

    curl -X GET \
      http://localhost:8080/organizer/all \
      -H 'Content-Type: application/json' \
