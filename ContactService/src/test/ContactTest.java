package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import contact.Contact;

class ContactTest {

	@Test
	void TestContact() {
		Contact contact = new Contact("123456789", "Reginald", "Reed Jr.", "5556667777", "123 MainStreet Dr");
		assertTrue(contact.getID().equals("123456789"));
	}

	@Test
	void TestIDLength()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345678910", "Reginald", "Reed Jr.", "5556667777", "123 MainStreet Dr");
		});
	}
	
	@Test
	void TestIDNull()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Reginald", "Reed Jr.", "5556667777", "123 MainStreet Dr");
		});
	}
	
	@Test
	void TestFirstNameLength()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456789", "Reginald Reed", "Reed Jr.", "5556667777", "123 MainStreet Dr");
		});
	}
	
	@Test
	void TestFirstNameNull()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456789", null, "Reed Jr.", "5556667777", "123 MainStreet Dr");
		});
	}
	
	@Test
	void TestLastNameLength()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456789", "Reginald", "Reginald Reed Jr.", "5556667777", "123 MainStreet Dr");
		});
	}
	
	@Test
	void TestLastNameNull()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456789", "Reginald", null, "5556667777", "123 MainStreet Dr");
		});
	}
	
	@Test
	void TestPhoneNumberTooLong()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456789", "Reginald", "Reed Jr.", "555666777788", "123 MainStreet Dr");
		});
	}
	
	@Test
	void TestPhoneNumberTooShort()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456789", "Reginald", "Reed Jr.", "555666777", "123 MainStreet Dr");
		});
	}
	
	@Test
	void TestPhoneNumberNull()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456789", "Reginald", "Reed Jr.", null, "123 MainStreet Dr");
		});
	}
	
	@Test
	void TestAddressLength()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456789", "Reginald", "Reed Jr.", "5556667777", "123456 MainStreet Dr. New Hampshire United States");
		});
	}
	
	@Test
	void TestAddressNull()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456789", "Reginald", "Reed Jr.", "5556667777", null);
		});
	}
}
