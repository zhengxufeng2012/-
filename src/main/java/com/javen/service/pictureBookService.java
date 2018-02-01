package com.javen.service;

import java.util.List;

import com.javen.model.pictureBook;

public interface pictureBookService {
	 List<pictureBook> selectPicture();
	
	 int insert(pictureBook record);

}
