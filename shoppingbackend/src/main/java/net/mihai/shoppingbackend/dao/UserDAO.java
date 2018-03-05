package net.mihai.shoppingbackend.dao;

import java.util.List;

import net.mihai.shoppingbackend.dto.Address;
import net.mihai.shoppingbackend.dto.Cart;
import net.mihai.shoppingbackend.dto.User;

public interface UserDAO {

	
	// user related operation
		User getByEmail(String email);
		User get(int id);

		boolean add(User user);
		
		// adding and updating a new address
		Address getAddress(int addressId);
		boolean addAddress(Address address);
		boolean updateAddress(Address address);
		Address getBillingAddress(int userId);
		List<Address> listShippingAddresses(int userId);
		List<Address> listAddresses(User user, boolean isBilling);
		boolean updateCart(Cart cart);
		
}
