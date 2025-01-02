# Library-Management-System-Using-SpringBoot
This project provides RESTful APIs for managing a library system. Below are the details for using the API:

1.**Add a new author**

`POST/api/v1/author/save`

Payload:

```json
{
    "name" : "Peter"
}
```
2.**Get all author**

`GET/api/v1/author/getAllAuthor`

3.**Update an author**

`PUT/api/v1/author/update`

Payload:

```json
{
        "authorid": 1,
        "name": "James Steve"
}
```

4.**Delete an author**

`DELETE/api/v1/author/delete/52`

5.**Add a new publisher**

`POST/api/v1/publisher/save`

Payload:

```json
{
    "name" : "Arun"
}
```
6.**Get all publisher**

`GET/api/v1/publisher/getAllPublisher`

7.**Update a publisher**

`PUT/api/v1/publisher/update`

Payload:

```json
{
        "publisherid": 2,
        "name": "Arun Prasanth"
}
```

4.**Delete a publisher**

`DELETE/api/v1/publisher/delete/1`


