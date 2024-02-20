package com.eclipse.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.eclipse.entity.User;

@Component
public interface UserRepo extends CrudRepository<User, Integer> {

	public List<User> findByName(String name);

	public List<User> findByAddress(String address);

	public List<User> findByNameAndAddress(String name, String address);

	public List<User> findById(String id);

	public List<User> findByIdAndAddress(String id, String Address);

	public List<User> findByIdAndName(String id, String name);

	public List<User> findByNameNot(String name);

	public List<User> findByNameIsNull();

	public List<User> findByNameIsNotNull();

	public List<User> findByNameStartingWith(String prefix);

	public List<User> findByNameEndingWith(String suffix);

	public List<User> findByNameLike(String likePattern);

	public List<User> findByNameOrderByName(String name);

	public List<User> findByNameOrderByNameAsc(String name);

	public List<User> findByNameOrderByNameDesc(String name);

	public List<User> deleteById(int id);

}
