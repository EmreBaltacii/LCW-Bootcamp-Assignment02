Feature: Basket Managing

  Scenario: Purchase as a guest
    Given Uygulama acilir
    When Arama cubuguna "ayfone" yazilir
    When Ara butonuna tiklanir
    Then Aranan kelimenin düzeltildigi kontrol edilir
    Then Urunlerin listelendigi kontrol edilir
    When Ilk siradaki urune tiklanir
    When Sepete ekleye tiklanir
    When Arama cubuguna "ayfone" yazilir
    When Ara butonuna tiklanir
    When Son siradaki urune tiklanir
    When Sepete ekleye tiklanir
    When Arama cubuguna "ayfone" yazilir
    When Ara butonuna tiklanir
    When ücüncü sayfaya gidilir
    When 5 siradaki urune tiklanir
    When Sepete ekleye tiklanir
    When Sepetim sayfasina gidilir
    Then en ucuz ürünün sayısı 3 yapılır
    And Satın al butonuna tıklanır
    When Misafir kullanıcı secilir
    Then Uye olmadan devam edilir