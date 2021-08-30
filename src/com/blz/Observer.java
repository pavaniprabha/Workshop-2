package com.blz;

import com.blz.News.NewsType;

public abstract class Observer {
	public void onUpdate(News news) {
		System.out.println(getClass().getSimpleName() + ":" + news.news);
	}
	 public abstract NewsType getNewsType();
	
}
