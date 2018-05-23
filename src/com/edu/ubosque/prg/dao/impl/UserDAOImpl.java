package com.edu.ubosque.prg.dao.impl;

import com.edu.ubosque.prg.entity.User;
import com.edu.ubosque.prg.dao.UserDAO;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.edu.ubosque.prg.util.HibernateUtil;

public class UserDAOImpl implements UserDAO {

	public void save(User usuario) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.save(usuario);
		t.commit();
	}

	public User getUsuario(long id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		return (User) session.load(User.class, id);
	}

	public void update(User usuario) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.update(usuario);
		t.commit();
	}

	public void remove(User usuario) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.delete(usuario);
		t.commit();
	}

	public List<User> list() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		List lista = session.createQuery("from User").list();
		t.commit();
		return lista;
	}

}
