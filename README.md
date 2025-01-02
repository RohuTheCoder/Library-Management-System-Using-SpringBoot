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

8.**Delete a publisher**

`DELETE/api/v1/publisher/delete/1`

9.**Add a new book**

`POST/api/v1/book/save`

Payload:

```json
{
        "title": "java book",
        "author_id": 3,
        "publisher_id": 52
}
```
10.**Get all book**

`GET/api/v1/book/getAllBook`

11.**Update a book**

`PUT/api/v1/book/update`

Payload:

```json
{
        "bookid": 1,
        "title": "vb book",
        "author_id": 2,
        "publisher_id": 2
}
```
12.**Delete a book**

`DELETE/api/v1/book/delete/1`

13.**Add a new user**

`POST/api/v1/user/save`

Payload:

```json
{
    "name" : "giysa",
    "email": "giysa@gmail.com"
} 
```
14.**Get all user**

`GET/api/v1/user/getAllUser`

15.**Update a user**

`PUT/api/v1/user/update`

Payload:

```json
{
        "userid": 2,
        "name": "giyda",
        "email": "giysa@gmail.com"
}
```

16.**Delete a user**

`DELETE/api/v1/user/delete/2`

17.**Add a new borrow**

`POST/api/v1/borrow/save`

Payload:

```json
{
    "book_id":104,

    "user_id":1,

    "borrowDate":"2024-07-09",

    "returnDate":"2024-07-11"
}
```
18.**Get all borrow**

`GET/api/v1/borrow/getAllBorrow`

19.**Update a borrow**

`PUT/api/v1/borrow/update`

Payload:

```json
{
    "id":1,
    
    "book_id":104,

    "user_id":1,

    "borrowDate":"2024-07-09",

    "returnDate":"2024-07-15"
}
```


