package contact;

import java.util.*;

public class ContactService
{
	
	private Map<String, Contact> contacts = new HashMap<String, Contact>();
	
	public void AddContact(Contact contact)
	{		
		if(contacts.containsKey(contact.getID()))
			throw new IllegalArgumentException("Contact with this id exist already");
		else
			contacts.put(contact.getID(), contact);
	}
	
	public void DeleteContact(Contact contact)
	{
		if(contacts.containsKey(contact.getID()))
			contacts.remove(contact.getID());
		else
			throw new IllegalArgumentException("Contact with this id does not exist");
	}
	
	public void UpdateContactFirstName(Contact contact, String newFirstName)
	{
		if(contacts.containsKey(contact.getID()) && newFirstName.length() <= 10)
			contact.setFirstName(newFirstName);
		else
			throw new IllegalArgumentException("Contact does not exist or name is greater than 10 chracters"); 
	}
	
	public void UpdateContactLastName(Contact contact, String newLastName)
	{
		if(contacts.containsKey(contact.getID()) && newLastName.length() <= 10)
			contact.setLastName(newLastName);
		else
			throw new IllegalArgumentException("Contact does not exist or name is greater than 10 chracters"); 
	}
	
	public void UpdateContactPhoneNumber(Contact contact, String newPhoneNumber)
	{
		if(contacts.containsKey(contact.getID()) && newPhoneNumber.length() == 10)
			contact.setPhoneNumber(newPhoneNumber);
		else
			throw new IllegalArgumentException("Contact does not exist or number is greater or less than 10 chracters"); 
	}
	
	public void UpdateContactAddress(Contact contact, String newAddress)
	{
		if(contacts.containsKey(contact.getID()) && newAddress.length() <= 30)
			contact.setFirstName(newAddress);
		else
			throw new IllegalArgumentException("Contact does not exist or address is greater than 30 chracters"); 
	}

}