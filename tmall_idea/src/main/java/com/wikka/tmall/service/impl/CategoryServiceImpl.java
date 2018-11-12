package com.wikka.tmall.service.impl;

import com.wikka.tmall.mapper.CategoryMapper;
import com.wikka.tmall.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CategoryServiceImpl {
	@Autowired
	CategoryMapper categoryMapper;

	public List<Category> list(){
		return categoryMapper.list();
	};
}
