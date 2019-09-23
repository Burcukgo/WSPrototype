# WSPrototype
Persistency, Web Servis(WS) ve loglama gibi özelliklere sahip ufak bir prototip tasarlanmıştır.
Bu projede Spring Boot, REST Service,Hibernate, Log4j teknolojileri kullanılmıştır.Veritabanı olarak MYSQL kullanılmıştır.

Bu projenin amacı REST Servis isteklei ile veritabanındaki subscriber tablosu üzerinde veri ekleme silme ve düzenleme işlemlerini yapmak.Ve bu işlemlerin log bilgilerini veritabanındaki Applog tablosuna kaydetmektir.

# Project Schema
<p>

<a href="https://github.com/Burcukgo/WSPrototype/blob/master/img/projeSchema.png" target="_blank">
<img src="https://github.com/Burcukgo/WSPrototype/blob/master/img/projeSchema.png" width="200" style="max-width:100%;"></a>
  
</p>  


# Project Test Enviroment(POSTMAN)
<p>
Http Request List                                                          
<h4>/subscriber [POST]:   localhost:9090/subscriber ContextType:(application/json) RequestBody: {“id”:”4”,”name”:”Stephany Kirk”, “msisdn”:”9055588”}</h4>
<h4>/subscriber [PUT]:    localhost:9090/subscriber ContextType:(application/json) RequestBody: {“id”:”4”,”name”:”Jhon Kirk”, “msisdn”:”9055588”}</h4>
<h4>/subscriber [DELETE]: localhost:9090/subscriber  ContextType:(application/json) RequestBody: {“id”:”4”}</h4>
<h4>/getAllSubscriber [GET]:    localhost:9090/getAllSubscriber </h4>
<h4>/getAllSubscribersByIdr [GET]:    localhost:9090/getAllSubscribersById/{id} </h4>

<a href="https://github.com/Burcukgo/WSPrototype/blob/master/img/test.png" target="_blank">
<img src="https://github.com/Burcukgo/WSPrototype/blob/master/img/test.png" width="200" style="max-width:100%;"></a>
  
</p> 

# Notes
<p>
Eklemiş olduğum prototype.sql dosyasını veritabanınıza import edebilirsiniz(Dosya karakter grubu: UTF8).
/getAllSubscriber [GET]:   /getAllSubscribersByIdr [GET]: İstek sayfaları çalışmakta fakat datalar görünmemektedir.(Tamamlanmamıştır)


  
</p> 

