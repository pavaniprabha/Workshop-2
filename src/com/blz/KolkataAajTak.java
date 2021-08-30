package com.blz;

import com.blz.News.NewsType;

public class KolkataAajTak extends Observer{

	@Override
	public NewsType getNewsType() {
		return News.NewsType.KOLKATA_NEWS;
	}

}
