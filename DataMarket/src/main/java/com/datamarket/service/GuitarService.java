package com.datamarket.service;

import java.util.List;

import com.datamarket.entity.Guitar;

public interface GuitarService extends BaseService<Guitar> {
	public List <Guitar> search(String  builder );
}
