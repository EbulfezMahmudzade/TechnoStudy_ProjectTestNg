# Agile Yazılım Test Projesi - TechnoStudy
### *Bu proje eğitim amaçlıdır ve katılımcıların yazılım test becerilerini geliştirmelerine yardımcı olmayı amaçlamaktadır.*

## Proje Genel Bakış

### *Bu proje, Java için popüler bir test çerçevesi olan TestNG kullanarak Techno Study web sitesindeki testlerin otomasyonu üzerine odaklanmaktadır. Amacı, web sitesinin çeşitli işlevlerinin sorunsuz çalıştığını ve canlı ortamda veri bütünlüğünün korunduğunu sağlamaktır.*

## Test Edilen Özellikler
#### Bu projede aşağıdaki kullanıcı hikayeleri test edilmiştir:

### US501_Dropdown Menüsü

* *“Kurslar” menüsünün altındaki açılır menünün görünür olduğunu doğrulayın.*
* *Açılır menüye tıklayınca tüm mevcut kursların listelendiğinden emin olun.*
* *Her kurs adının doğru şekilde görüntülendiğini kontrol edin.*
* *Seçilen kurs sayfasına yönlendirmenin doğru yapıldığını doğrulayın.*

### US502_Kampüs Girişi

* *“Kampüs Girişi” butonunun mevcut olduğunu doğrulayın.*
* *Bu butona tıklayınca Kampüs giriş sayfasına yönlendirmenin çalıştığından emin olun.*

### US503_Başvuru

* *Ana sayfada bir "Başvur" butonunun mevcut olduğunu doğrulayın.*
* *"Başvur" butonuna tıklayınca başvuru formunun açıldığından emin olun.*
* *Formun gerekli bilgilerle doldurulabilir olduğundan emin olun.*
* *İsim alanında “test” ibaresinin, ülke seçiminde "Andorra" olduğundan emin olun.*
* *Form gönderildikten sonra bir onay mesajı görüntülendiğini doğrulayın.*

### US504_Kurslar Alt Menüsü

* *“Kurslar” menüsüne bağlı bir alt menünün var olduğundan emin olun.*
* *Alt menüye tıklandığında bir kurs listesi veya alt menüler görüntülendiğinden emin olun.*
* *Her kursun adı ve kısa açıklamasının mevcut olduğunu kontrol edin.*
* *Seçilen kurs sayfasına yönlendirmenin doğru yapıldığını doğrulayın.*

### US505_Sosyal Medya Linkleri

* *Alt bilgi kısmında sosyal medya linklerinin mevcut olduğundan emin olun.*
* *Her sosyal medya linkinin ikon veya adının göründüğünden emin olun.*
* *Linke tıklayınca ilgili sosyal medya sayfasına yönlendirmenin çalıştığını doğrulayın.*

### US506_Logo ile Ana Sayfaya Dönüş

* *Techno Study logosunun her sayfada mevcut olduğunu doğrulayın.*
* *Logoya tıklayınca ana sayfaya yönlendirmenin çalıştığını kontrol edin.*

### US507_Kurs Detayları

* *Her kursun "Daha Fazla Bilgi" butonuna sahip olduğunu doğrulayın (Kendi Kursunu Seç bölümünde).*
* *Butona tıklayınca kurs detay sayfasına yönlendirme yapıldığını doğrulayın.*
* *Kurs detay sayfasında Techno Study logosunun göründüğünden emin olun.*

### US508_Kullanım Şartları

* *İletişim formunda "Kullanım Şartlarını kabul ediyorum" seçeneğinin mevcut olduğunu doğrulayın.*
* *Bu seçeneğe tıklandığında "Kullanım Şartları" sayfasına yönlendirildiğinden emin olun.*
* *"Kullanım Şartları" sayfasının okunabilir ve iyi yapılandırılmış olduğunu kontrol edin.*

## Team6 Uygulama Projesi

- #### Alan Adı:  [techno.study](https://techno.study/tr)

- #### Desteklenen Tarayıcılar: [Chrome](), [Edge](), [Firefox]()

## Kullanılan Teknolojiler ve Araçlar

#### *Bu projede kullanılan temel teknolojiler ve araçlar şunlardır:*

- **Java** - Programlama dili.
- **Selenium WebDriver** - Tarayıcı otomasyonu aracı.
- **TestNG** - Test yazma ve çalıştırma çerçevesi.
- **Apache POI** - Java ile Excel dosyalarını okuma ve yazma kütüphanesi.
- **Git & GitHub** - Proje işbirliği için versiyon kontrol sistemleri.
- **JIRA & Zephyr** - Test yönetimi, takip ve hata raporlama araçları.
- **Page Object Model (POM)** - Otomatik test vakalarını yapılandırmak için kullanılan bir tasarım deseni.


## Gereksinimler

- **Java Development Kit (JDK):** Java geliştirmesi için sisteminizde JDK'nın kurulu olduğundan emin olun.
- **IDE:** IntelliJ IDEA, Java kodlarını yazmak ve yönetmek için kullanılmalıdır.
- **Git:** Proje için versiyon kontrolü ve GitHub'a gönderim yapmak için Git kullanılmalıdır.
- **Selenium WebDriver:** Tarayıcı otomasyonunu öğrenmek ve uygulamak için kullanın.
- **TestNG:** TestNG çerçevesini ve bu çerçevede test yazmayı öğrenin.
- **Page Object Model (POM):** Test çerçevesini düzenli bir şekilde tutmak için bu deseni uygulayın.
- **JIRA & Zephyr:** Test yönetimi ve hata raporlama işlemlerini yapmak için JIRA'yı kullanın.


## Proje Gereksinimleri

1. **Page Object Model (POM):** Test vakalarını düzenlemek için POM deseni uygulanmalıdır.
2. **Paralel Testler:** Testler, Chrome ve Firefox tarayıcılarında paralel olarak çalıştırılmalıdır.
3. **XML Konfigürasyonu:** Test vakaları XML dosyaları aracılığıyla yapılandırılmalı ve çalıştırılmalıdır.
4. **Smoke ve Regression Testleri:** Smoke ve regression testleri için ayrı XML dosyaları oluşturulmalıdır.
5. **Canlı Ortam Gereksinimleri:** İsim ve e-posta alanlarına "test" ibaresi girilmeli ve veri temizliği kolaylaştırılmalıdır, ülke ise "Arjantin" olarak ayarlanmalıdır.

