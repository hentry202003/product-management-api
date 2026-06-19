# Product Management REST API

A RESTful API built using Spring Boot for managing products.

## Features

* Add Product
* Get All Products
* Get Product By ID
* Update Product
* Delete Product
* Search Product By Name
* Filter Products By Category

## Tech Stack

* Java
* Spring Boot
* Spring Data JPA
* MySQL
* Postman
* Git & GitHub

## API Endpoints

### Create Product

POST /api/products

### Get All Products

GET /api/products

### Get Product By ID

GET /api/products/{id}

### Update Product

PUT /api/products

### Delete Product

DELETE /api/products/{id}

### Search Product By Name

GET /api/products/search/{name}

### Filter Products By Category

GET /api/products/category/{category}

## Sample Request

```json
{
  "name": "Laptop",
  "price": 55000,
  "stock": 10,
  "category": "Electronics"
}
```

## Author

Hentry Joseph
