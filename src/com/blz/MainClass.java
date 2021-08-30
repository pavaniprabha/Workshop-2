package com.blz;

public class MainClass {
      public static void main(String[] args) {
	   CentralAajTak centralAajTak = new CentralAajTak();
	   DelhiAajTak delhiAajtak = new DelhiAajTak();
	   MumbaiAajTak mumbaiAajTak = new MumbaiAajTak();
	   KolkataAajTak kolkataAajTak = new KolkataAajTak();
	   
       centralAajTak.register(delhiAajtak);
       centralAajTak.register(mumbaiAajTak);
       centralAajTak.register(kolkataAajTak);
       
//       centralAajTak.unregister(delhiAajtak);
//       centralAajTak.unregister(mumbaiAajTak);
//       centralAajTak.unregister(kolkataAajTak);
       
       News headline = new News();
       headline.news = "heavy raining";
       headline.newsType = News.NewsType.MUMBAI_NEWS;
       
       News headline1 = new News();
       headline1.news = "heavy raining";
       headline1.newsType = News.NewsType.KOLKATA_NEWS;
       
       News headline2 = new News();
       headline2.news = "heavy raining";
       headline2.newsType = News.NewsType.DELHI_NEWS;
       
       
       centralAajTak.update(headline);
       centralAajTak.update(headline1);
       centralAajTak.update(headline2);
      
      }

}
