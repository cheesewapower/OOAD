package com.datamarket.dao;

import com.datamarket.entity.Guitar;

public interface GuitarDao extends BaseDao<Guitar> {
	public String search();
}
