package com.ucn.web.repository;

public interface BaseDAO {
	
	public void save(Object obj) throws Exception;
	public void update(Object obj) throws Exception;
	public void delete(Object obj) throws Exception;
}
