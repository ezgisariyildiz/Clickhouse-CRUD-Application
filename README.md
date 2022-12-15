
# 1-Run Clickhouse

Open the docker folder: cd docker


# 2-Run Clickhouse

docker-compose up -d


# 3-Login to DB using Clickhouse Console:

![servicee](https://user-images.githubusercontent.com/95285650/207973384-97644a6f-8e9e-430c-b848-c30c4128e588.png)

![ch-db](https://user-images.githubusercontent.com/95285650/207967599-bbcc0712-1df6-4b97-8dc6-696f5070b1de.png)


# 4-Login to DB using Swagger UI

OpenAPI 3 spesifikasyon belgelerini otomatik olarak oluşturmasını sağlamak için hem de swagger arayüzünü kullanabilmek için, basitçe springdoc-openapi-ui bağımlılığını pom.xml dosyamıza ekliyoruz :

![swag](https://user-images.githubusercontent.com/95285650/207963082-3e447295-f7f8-4962-ad6d-2a9e2a0c99c3.png)

![swagger](https://user-images.githubusercontent.com/95285650/207967664-276b7636-3cde-4d16-8dcd-e033cf49d809.png)

# Clickhouse-CRUD-Application

Bu uygulamada SpringBoot, Clickhouse Database kullanarak CRUD(Create, Read, Update, Delete) işlemlerini gerçekleştirdiğim örnek bir proje yer alıyor. 

Bu projede yapacağımız işlemler;

1-) Sistemde yeni bir user kaydı oluşturma

2-) Belirli bir id’ye sahip userı görüntüleme

3-) Belirli bir id’ye göre user bilgisini güncelleme

4-) Belirli bir name’e sahip userı görüntüleme

5-)Belirli bir surname’e sahip userı görüntüleme

6-) Sistemde belirli bir id’ye sahip user bilgisini silme şeklinde ilerleyecektir.

# Kullanılan Teknolojiler ve Toollar

Spring Boot 2.7.6
JDK 8
IDE: Intellij Idea
Clickhouse Veritabanı
Swagger UI

Clickhouse veritabanını kullanmak için clickhouse-jdbs dependency pom dosyasına eklenmelidir.

# SpringBoot Projesi Oluşturma
 https://start.spring.io/ adresinden kullanmak istediğimiz teknolojileri seçerek bir springboot projesi oluşturuyoruz.
 Ben SpringBoot Starter-Web ve Lombok dependency'lerini seçtim.
 
 Projeyi oluşturup idemizde proje yollu açtıktan sonra db konfigürasyon işlemlerini yapmamız gerekiyor. Clickhouse için ilgili dependeny eklenmeli ve Clickhouse Console'a giderek servisi oluşturmalıyız.

Config, Controller, Service, Model, Repository package'ları oluşturduk. 

Config package'ı db bilgilerimin yer aldığı (user, password) bir ClickhouseDatasourceConfig.java class'ı ve db de bir tablo oluşturduğum ve bu tablonun bilgilerinin yer aldığı bir initDatabaseConfig.java class'ı yer alıyor. 

Controller package'ında CRUD işlemlerinin gerçekleşmesini sağlayan HTTP methodları(Post, Get, Put, Delete) bulunuyor. Sistemde yeni bir user kaydı oluşturmak için POST methodunu, belirli bir id’ye sahip userı görüntülemek için GET methodunu, belirli bir id’ye göre user bilgisini güncellemek için PUT methodunu, belirli bir id’ye sahip user bilgisini silmek için DELETE methodunu çağırdığımız UserController.java class'ı yer alıyor.

Model package'ında User'ın sahip olduğu id, name, surname bilgileri tanımlanıyor.

Repository package'ında yaptığım CRUD işlemlerinin connection bilgileri yer alıyor. 





