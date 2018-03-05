package net.mihai.shoppingbackend.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.mihai.shoppingbackend.dao.UserDAO;
import net.mihai.shoppingbackend.dto.Address;
import net.mihai.shoppingbackend.dto.Cart;
import net.mihai.shoppingbackend.dto.User;


@Repository("userDAO")
@Transactional
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	// return the user by id
	@Override
	public User get(int id) {
		return sessionFactory.getCurrentSession().get(User.class, Integer.valueOf(id));
	}

	
	
	@Override
	public User getByEmail(String email) {
		String selectQuery = "FROM User WHERE email =:email";
		try {
		return sessionFactory
				.getCurrentSession()
					.createQuery(selectQuery,User.class)
						.setParameter("email",email)
							.getSingleResult();
		}
		catch(Exception ex) {
			return null;
		}
							
	}

	@Override
	public boolean add(User user) {
		try {			
			sessionFactory.getCurrentSession().persist(user);			
			return true;
		}
		catch(Exception ex) {
			return false;
		}
	}

	@Override
	public boolean addAddress(Address address) {
		try {			
			// will look for this code later and why we need to change it
			sessionFactory.getCurrentSession().persist(address);			
			return true;
		}
		catch(Exception ex) {
			return false;
		}
	}
	
	@Override
	public boolean updateAddress(Address address) {
		try {			
			sessionFactory.getCurrentSession().update(address);			
			return true;
		}
		catch(Exception ex) {
			return false;
		}
	}	
	
	
	
	
	@Override
	public boolean updateCart(Cart cart) {
		try {			
			sessionFactory.getCurrentSession().update(cart);			
			return true;
		}
		catch(Exception ex) {
			return false;
		}
	}



	@Override
	public List<Address> listAddresses(User user, boolean isBilling) {
		String selectQuery = "FROM Address WHERE user = :user AND billing = :isBilling";
		return sessionFactory
				.getCurrentSession()
					.createQuery(selectQuery,Address.class)
						.setParameter("user", user)
						.setParameter("isBilling", isBilling)
							.getResultList();
		
	}



	@Override
	public Address getAddress(int addressId) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Address getBillingAddress(int userId) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public List<Address> listShippingAddresses(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

}