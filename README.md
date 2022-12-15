# Clickhouse-CRUD-Application

# 1-Run Clickhouse

Open the docker folder: cd docker


# 2-Run Clickhouse

docker-compose up -d


# 3-Login to DB using clickhouse client:

docker-compose run clickhouse-client --host clickhouse-server --user admin --password admin

# 4-Login to DB using Swagger UI

OpenAPI 3 spesifikasyon belgelerini otomatik olarak oluşturmasını sağlamak için hem de swagger arayüzünü kullanabilmek için, basitçe springdoc-openapi-ui bağımlılığını pom.xml dosyamıza ekliyoruz :
![swag](https://user-images.githubusercontent.com/95285650/207963082-3e447295-f7f8-4962-ad6d-2a9e2a0c99c3.png)
