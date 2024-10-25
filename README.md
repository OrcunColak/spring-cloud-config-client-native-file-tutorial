# Read me

This project demonstrates how to use cloud bus

# To Refresh Manually

```
curl -X POST http://localhost:8080/actuator/refresh
```

This prints the name of refreshed variables

```
>curl -X POST http://localhost:8080/actuator/refresh
["eureka.client.serviceUrl.defaultZone"]

>curl -X POST http://localhost:8080/actuator/refresh
[]
```