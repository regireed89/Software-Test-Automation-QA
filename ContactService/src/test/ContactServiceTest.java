package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import contact.Contact;
import contact.ContactService;

class ContactServiceTest {

	
	@Test
	void TestAddContact()
	{
		ContactService contactService = new ContactService();
		Contact contact = new Contact("123456789", "Reginald", "Reed Jr.", "5556667777", "123 MainStreet Dr");		
		contactService.AddContact(contact);
	}
	
	@Test
	void TestAddDuplicateContact()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		ContactService contactService = new ContactService();
		Contact contact1 = new Contact("123456789", "Reginald", "Reed Jr.", "5556667777", "123 MainStreet Dr");
		Contact contact2 = new Contact("123456789", "Reginald", "Reed Jr.", "5556667777", "123 MainStreet Dr");
		contactService.AddContact(contact1);	
		contactService.AddContact(contact2);
		});
	}

	@Test
	void TestDeleteContact()
	{
		ContactService contactService = new ContactService();
		Contact contact = new Contact("123456789", "Reginald", "Reed Jr.", "5556667777", "123 MainStreet Dr");
		contactService.AddContact(contact);
		contactService.DeleteContact(contact);
	}	
	
	@Test
	void TestDeleteNonExistingContact()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("123456789", "Reginald", "Reed Jr.", "5556667777", "123 MainStreet Dr");	
		contactService.DeleteContact(contact);
		});
	}
	
	@Test
	void TestUpdateContactFirstName()
	{
		ContactService contactService = new ContactService();
		Contact contact = new Contact("123456789", "Reginald", "Reed Jr.", "5556667777", "123 MainStreet Dr");
		contactService.AddContact(contact);
		contactService.UpdateContactFirstName(contact, "Bobby");
	}
	
	@Test
	void TestUpdateContactFirstNameTooLong()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("123456789", "Reginald", "Reed Jr.", "5556667777", "123 MainStreet Dr");	
		contactService.AddContact(contact);
		contactService.UpdateContactFirstName(contact, "BobbyLeeJones");
		});
	}
	
	@Test
	void TestUpdateContactLastName()
	{
		ContactService contactService = new ContactService();
		Contact contact = new Contact("123456789", "Reginald", "Reed Jr.", "5556667777", "123 MainStreet Dr");
		contactService.AddContact(contact);
		contactService.UpdateContactLastName(contact, "Johnston");
	}
	
	@Test
	void TestUpdateContactLastNameTooLong()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("123456789", "Reginald", "Reed Jr.", "5556667777", "123 MainStreet Dr");	
		contactService.AddContact(contact);
		contactService.UpdateContactLastName(contact, "Johnstonson");
		});
	}
	
	@Test
	void TestUpdateContactPhoneNumber()
	{
		ContactService contactService = new ContactService();
		Contact contact = new Contact("123456789", "Reginald", "Reed Jr.", "5556667777", "123 MainStreet Dr");
		contactService.AddContact(contact);
		contactService.UpdateContactPhoneNumber(contact, "1234567890");
	}
	
	@Test
	void TestUpdateContactPhoneNumberTooShort()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("123456789", "Reginald", "Reed Jr.", "5556667777", "123 MainStreet Dr");	
		contactService.AddContact(contact);
		contactService.UpdateContactPhoneNumber(contact, "1234");
		});
	}
	
	@Test
	void TestUpdateContactPhoneNumberTooLong()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("123456789", "Reginald", "Reed Jr.", "5556667777", "123 MainStreet Dr");	
		contactService.AddContact(contact);
		contactService.UpdateContactPhoneNumber(contact, "12345678901");
		});
	}
	
	@Test
	void TestUpdateContactAddress()
	{
		ContactService contactService = new ContactService();
		Contact contact = new Contact("123456789", "Reginald", "Reed Jr.", "5556667777", "123 MainStreet Dr");
		contactService.AddContact(contact);
		contactService.UpdateContactAddress(contact, "321 StreetMain Rd");
	}
	
	@Test
	void TestUpdateContactAddressTooLong()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("123456789", "Reginald", "Reed Jr.", "5556667777", "123 MainStreet Dr");	
		contactService.AddContact(contact);
		contactService.UpdateContactAddress(contact, "123456 MainStreet Avenue Drive Manchester");
		});
	}
}
