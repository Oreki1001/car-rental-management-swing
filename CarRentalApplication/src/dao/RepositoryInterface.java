package dao;

import java.util.ArrayList;

public interface RepositoryInterface<T> {
	
	public int insert(T t);
	public int update(T t);
	public int delete(T t);
	public ArrayList<T> selectAll();
	public T seclectById(T t);
}
