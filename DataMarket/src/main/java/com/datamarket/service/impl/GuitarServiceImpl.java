package com.datamarket.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;


import com.datamarket.entity.Guitar;
import com.datamarket.service.GuitarService;

@Service("guitarService")
public class GuitarServiceImpl extends BaseServiceImpl<Guitar> implements GuitarService {
  


	@Override
	public List<Guitar> search(String builder) {
		return guitarDao.search(builder);
	}
	
}
