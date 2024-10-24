# 架構

Postman - Controller - Service - DAO - DB

# 開發順序

1. 設定 applications
2. 製作 model
3. 製作 DAO (repository / 資料庫介面)
4. 製作 Service (業務邏輯)
5. 製作 controller
6. 製作 exception

# 開發過程

## 建立專案

### Spring Boot Dependencies

- Spring Web
- Spring Data JPA
- Lombok
- MariaDB Driver (視資料庫而定)

## 專案架構

![專案架構.png](https://i.imgur.com/our9jEc.png)

# 測試

| 資料庫操作 | Request |
| --- | --- |
| create | Post |
| read | Get |
| update | Put |
| delete | Delete |

## 1. Create a new employee

### POST

> http://localhost:8080/api/employees
> 

### Request Body

```json
{
	"firstName": "Amelia",
    "lastName": "Thompson",
    "email": "amelia.thompson@email.com"
}
```

## 2. Get all employees

### GET

> http://localhost:8080/api/employees
> 

## 3. Get an employee by ID

### GET

> http://localhost:8080/api/employees/1
> 

## 4. Update an existing employee

### PUT

> http://localhost:8080/api/employees/1
> 

### Request Body

```json
{
    "id": 1,
    "firstName": "Alexis",
    "lastName": "Ann",
    "email": "alexis.ann@email.com"
} 
```

## 5. Delete an employee by ID

### DELETE

> http://localhost:8080/api/employees/1
> 

# 參考資料

- https://hackmd.io/@takeaction/ryHiJ3exK
