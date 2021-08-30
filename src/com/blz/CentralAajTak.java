package com.blz;

import java.util.ArrayList;
import java.util.List;

public class CentralAajTak {
	
	List<Observer> list = new ArrayList<>();

	public void register(Observer observer) {
		list.add(observer);

	}

	public void unregister(Observer observer) {
		list.remove(observer);
	}

	public void update(News news) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getNewsType() == news.newsType) {
				list.get(i).onUpdate(news);
			}
		}
	}
}
