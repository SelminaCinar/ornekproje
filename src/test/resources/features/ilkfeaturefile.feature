@amazon_search
Feature: ilk feature file


  Scenario: TC01_amazon_lego_arama
    Given kullanici amazon gider
    When kullanici lego için arama yapar
    Then sonuclarda lego oldugunu dogrular
  And close the application

    @mouse
  Scenario: TC02_amazon_mouse_arama
  Given kullanici amazon gider
  When kullanici mouse için arama yapar
  Then sonuclarda mouse oldugunu dogrular
  Then close the application

  @amazon_giris_yap
  Scenario: TC03_amazon_giris_yap
  Given kullanici amazon gider
  When kullanici giris yap butonuna basar
  Then kullanici telefon numarasini girer
  Then kullanici devam et butonuna basar
  Then kullanici password girer
  Then kullanici sign in butonuna basar
  Then giris yaptigini dogrular
  And close the application






#  1. Her feature file, Feature: kelimesi ile baslamak zorundadir
#  2. Her bir file da, yanliz bit Feature: kullanilabilir
#  3. Senaryo(TEST CASE) olusturmak icin Scenario kelimesi kullanilir
#  4. Birden fazla Scenario: kullanilabilir
#  5. Her bir adim Given,When,And,Then,But,* kelimelerinden biriyle baslamalidir.
#  6. Given -> Genelde ilk satirlarda, pre condition stepleri icin kullanilir
#  7. Then -> Genelde son satirlarda, verification stepleri icin kullanilir
#  8. And, When -> Genelde ara adimlarda baglar olarak kullanilir
#  NOTE: Teknik olarak istenilen kelime isteniler step de kullanilabilir,
#        ama anlam karmasasi olmamasi icin bu adimlar takip edilir
  #9. Belirli Scenario lari calistirmak icin cucumber tagsler kullanilir
  # tag ler Fetuature , Scenario , Scerio Outline ,Examples kelimeleri ile birlikte kullanilabilir.
  #10. Background : Her bir Scenario kelimesinden ONCE tek bir sefer calisir
  #11.dryRun=false--> dryRun yokmus gibi calisir yani tum adimlari tek tek browserda acar
  #12.dryRun=true--> Yeni bir step eklendiginde sadece step definitionslari olusturmak icin kullanilur
  #kullanilma sebebi zamandan tasarruftur