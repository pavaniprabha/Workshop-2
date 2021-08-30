package com.blz;

import com.blz.News.NewsType;

public class DelhiAajTak extends Observer {

//	public void onUpdate(String data) {
//		System.out.println(data  + "its saving data of ObserverOne");
//	}

	@Override
	public NewsType getNewsType() {
		
		return News.NewsType.DELHI_NEWS;
	}
}
