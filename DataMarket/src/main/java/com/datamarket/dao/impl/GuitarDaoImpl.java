package com.datamarket.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;


import com.datamarket.dao.BaseDao;
import com.datamarket.dao.GuitarDao;
import com.datamarket.entity.Guitar;

@Repository("guitarDao")
public  class GuitarDaoImpl extends BaseDaoImpl<Guitar> implements GuitarDao{

	@Override
	public List <Guitar>  search(String  builder) {
		String hql="select g from Guitar g where g.builder =:builder";
		return (List<Guitar>) getSession().createQuery(hql).setString("builder", builder).list();
	}
  
}
