package com.blz;

import com.blz.News.NewsType;

public class MumbaiAajTak extends Observer{

	@Override
	public NewsType getNewsType() {
		return News.NewsType.MUMBAI_NEWS;
	}

}
