package com.edu.ubosque.prg.dao;

import com.edu.ubosque.prg.entity.User;
import java.util.List;

public interface UserDAO {

	public void save(User usuario);

	public User getUsuario(long id);

	public List<User> list();

	public void remove(User usuario);

	public void update(User usuario);

}
