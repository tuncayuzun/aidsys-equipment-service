# Aidsys Material Service

### aidsys-material-service

This service aims to manage aid materials operations as a part of Aidsys project.

> API ROOT PATHS : ***/api/v1/materials***
>
>TEST ENDPOINT : ***http://<TEST_HOST>/api/v1/materials***
>
>OPEN API ENDPOINT : ***http://<TEST_HOST>/docs/swagger-ui.html***

| Method            | Method | Path | Description         |
|-------------------|--------|------|---------------------|
| createAidMaterial | POST   | /    | Create aid material |

## API Reference

### **Create material**

```http
  POST /api/v1/materials
```

### `Request`

| Parameter     | Type     | Description                                                    |
|:--------------|:---------|:---------------------------------------------------------------|
| `category`    | `string` | **Required**. Material category such as FOOD, HEALTH, CLOTHING |
| `name`        | `string` | **Required**. Material name                                    |
| `description` | `string` | **Required**. Material description                             |
| `picUrl`      | `string` | Uploaded material url                                          |

```bash
{
  "category": "FOOD",
  "name": "Bakliyat",
  "description": "kuru fasulye, nohut v.s",
  "picUrl": "https://www.bakliyat.com/beans"
}
```

### `Response`

| Parameter     | Type     | Description                                      |
|:--------------|:---------|:-------------------------------------------------|
| `id`          | `string` | Communication permission id                      |
| `category`    | `string` | Material category such as FOOD, HEALTH, CLOTHING |
| `name`        | `string` | Material name                                    |
| `description` | `string` | Material description                             |
| `picUrl`      | `string` | Uploaded material url                            |

```bash
{
  "id": "bd0911e1-9965-42f2-84d6-9fb39f088613",
  "category": "FOOD",
  "name": "Bakliyat",
  "description": "kuru fasulye, nohut v.s",
  "picUrl": "https://www.bakliyat.com/beans"
}
```

## Installation

```bash
mvn spring-boot:run
```

## License

[Tallstech](https://talls.tech)
