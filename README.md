# Spring-Initializr
# Görev 1: Spring Boot RESTful Servisi

Bu proje, Spring Boot kullanarak bir kitap yönetim sistemi RESTful servisini uygular. Kitapları eklemek, güncellemek, silmek ve listelemek için temel işlevleri sunar. Ayrıca Spring Data JPA ve H2 veritabanı kullanır.

## Bağımlılıklar

- Java 11
- Spring Boot
- Spring Data JPA
- H2 Veritabanı

## Kurulum

1. Java 11'i yükleyin.
2. Projeyi GitHub'dan klonlayın.
3. Proje kök dizininde, `./mvnw spring-boot:run` komutunu kullanarak servisi başlatın.

## Kullanım

Proje başlatıldığında, aşağıdaki işlemleri yapabilirsiniz:

1. Yeni bir kitap eklemek için HTTP POST isteği yapın.
2. Mevcut bir kitabı güncellemek için HTTP PUT isteği yapın.
3. Bir kitabı silmek için HTTP DELETE isteği yapın.
4. Tüm kitapları listelemek için HTTP GET isteği yapın.

Daha fazla ayrıntı için API belgelerini kontrol edin.

## Katkılar

Katkıda bulunmak isterseniz, lütfen bir çekme isteği (pull request) oluşturun ve aşağıdaki kurallara uyun:
- Kod tabanınızı güncel tutun.
- Yeni özellikler eklemek veya hataları düzeltmek için çekme isteği oluşturun.

  # Görev 2: Spring Security ve OAuth Entegrasyonu

Bu proje, Spring Security ve OAuth 2.0 protokolünü kullanarak REST servisinin güvenliğini sağlar. Proje, bir OAuth sağlayıcı hizmeti (örneğin, Google) kullanarak kimlik doğrulama ve yetkilendirme işlemlerini gerçekleştirir.

## Bağımlılıklar

- Java 11
- Spring Boot
- Spring Security
- OAuth 2.0 istemci

## Kurulum

1. Java 11'i yükleyin.
2. Proje kök dizinindeki `application.properties` dosyasını düzenleyin ve OAuth istemci kimlik bilgilerinizi ekleyin.
3. Projeyi GitHub'dan klonlayın.
4. Proje kök dizininde, `./mvnw spring-boot:run` komutunu kullanarak servisi başlatın.

## Kullanım

Proje başlatıldığında, kimlik doğrulama ve yetkilendirme işlemleri otomatik olarak çalışacaktır. İstemciler, güvenliğin tadını çıkarabilirler.

Daha fazla ayrıntı için OAuth sağlayıcı belgelerine başvurun.

## Katkılar

Katkıda bulunmak isterseniz, lütfen bir çekme isteği (pull request) oluşturun ve aşağıdaki kurallara uyun:
- Güvenlik açıkları veya hataları bildirin.

# Görev 3: Spring Boot ve gRPC

Bu proje, kitap yönetim sistemi için bir gRPC servisi oluşturur. Kitap ekleme, güncelleme, silme ve listeleme işlevlerini gRPC üzerinden yapabilen bir sunucu ve istemci tasarlar.

## Bağımlılıklar

- Java 11
- Spring Boot
- gRPC
- ...

## Kurulum

1. Java 11'i yükleyin.
2. Projeyi GitHub'dan klonlayın.
3. Projeyi yerel makinenizde başlatın. Sunucu ve istemci, ayrı ayrı çalıştırılabilir.

## Kullanım

Proje başlatıldığında, şunları yapabilirsiniz:

Sunucu: Kitap eklemek, güncellemek, silmek ve listelemek için gRPC servisi sunar. Sunucuyu başlatın ve gRPC istemcisi ile iletişim kurun.
İstemci: Sunucuya kitap ekleme, güncelleme, silme ve listeleme istekleri yapar. İstemciyi başlatın ve sunucu ile iletişim kurun.
Daha fazla ayrıntı için gRPC API belgelerine başvurun.

Katkılar
Katkıda bulunmak isterseniz, lütfen bir çekme isteği (pull request) oluşturun ve aşağıdaki kurallara uyun:

Yeni gRPC servis metodları eklemek için çekme isteği oluşturun.
Hataları veya eksiklikleri bildirin.
