package com.datamarket.dao;

import java.util.List;

import com.datamarket.entity.Guitar;

public interface GuitarDao extends BaseDao<Guitar> {
	public List <Guitar> search(String  builder );
}
