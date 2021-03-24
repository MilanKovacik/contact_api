# Contact Api

Its easy to run just do thees three steps: 

`cd repositories/contact_api`

`mvn clean package`

`docker-compose up --build`
 
Its it your backend api now runs on port `8080`

###PgAdmin
You can also use pgAdmin for look to the postrgeSQL. For PgAdmin is exposed port `16543` so you can use `http://localhost:16543`
```
Login: pgadmin4@pgadmin.org
Password: admin
```
```
Server config:
Host: postgreSQL
Port: 5432
Maintenance: contacts
username: admin
password: Xasdf54asd
```
