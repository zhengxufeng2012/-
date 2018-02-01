package com.javen.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javen.mapping.pictureBookMapper;
import com.javen.model.pictureBook;
import com.javen.service.pictureBookService;

@Service
public class pictureBookServiceImpl implements pictureBookService {
	@Autowired
	public pictureBookMapper picturebookMapper;

	@Override
	public  List<pictureBook> selectPicture() {
		// TODO Auto-generated method stub
		System.out.println("impl of pictureBook");
		 List<pictureBook> it=picturebookMapper.selectPicture();
		return it;
	}

	@Override
	public int insert(pictureBook record) {
		// TODO Auto-generated method stub
		System.out.println("impl of picture insert pictureBook"+record);
		int picm=picturebookMapper.insert(record);
		System.out.println("impl of picture insert pictureBook end+"+picm);
		return picm;
	}

}
