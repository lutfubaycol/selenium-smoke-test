# Selenium Smoke Test Projesi

Bu proje, bir web uygulamasının en temel işlevlerini hızlıca kontrol etmek için hazırlanmış basit bir smoke test altyapısıdır. Amaç, Selenium kullanarak testleri düzenli ve anlaşılır bir şekilde yazmak ve kritik akışların sorunsuz çalıştığını hızlıca doğrulamaktır.

Testler, mümkün olduğunca okunabilir ve kolay genişletilebilir şekilde tasarlandı. Böylece yeni test senaryoları eklemek veya mevcut testleri güncellemek oldukça kolaydır.

---

## Kullanılan Teknolojiler

* Java 21
* Selenium WebDriver
* JUnit 5
* WebDriverManager
* Maven

---

## Proje Yapısı

```id="a9k3lm"
src/test/java
 ├── base
 │    └── BaseTest.java
 ├── pages
 │    └── LoginPage.java
 ├── tests
 │    └── LoginSmokeTest.java
 └── utils
      └── DriverFactory.java
```

* **base**: Testlerde ortak kullanılan driver kurulum ve kapanış işlemleri
* **pages**: Page Object Model yapısına uygun olarak sayfa elementleri ve aksiyonlar
* **tests**: Test senaryolarının bulunduğu kısım
* **utils**: Driver oluşturma gibi yardımcı sınıflar

---

## Test Senaryoları

Projede 3 temel senaryo test edildi:

* Doğru kullanıcı adı ve şifre ile giriş yapılabiliyor mu
* Yanlış bilgiler girildiğinde sistem doğru hata mesajını veriyor mu
* Giriş yaptıktan sonra çıkış işlemi düzgün çalışıyor mu

---

## Testleri Çalıştırma

IntelliJ üzerinden:

* Test class’ına sağ tık → Run diyerek çalıştırabilirsiniz

Terminal üzerinden (Maven kuruluysa):

```id="r8d2ks"
mvn test
```

---