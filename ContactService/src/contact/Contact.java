package contact;

public class Contact {

		private String contactID;
		private String contactFirstName;
		private String contactLastName;
		private String contactPhoneNumber;
		private String contactAddress;
		
		public Contact(String contactID, String firstName, String lastName, String phoneNumber, String address)
		{
			if (contactID == null || contactID.length() > 10)
			{
				throw new IllegalArgumentException("Invalid id");
			}
			
			if (firstName == null || firstName.length() > 10)
			{
				throw new IllegalArgumentException("Invalid First Name");
			}
			
			if (lastName == null || lastName.length() > 10)
			{
				throw new IllegalArgumentException("Invalid Last Name");
			}
			
			if (phoneNumber == null || phoneNumber.length() != 10)
			{
				throw new IllegalArgumentException("Invalid Phone Number");
			}
			
			if (address == null || address.length() > 30)
			{
				throw new IllegalArgumentException("Invalid Address");
			}
			
			this.contactID =  contactID;
			this.contactFirstName =  firstName;
			this.contactLastName = lastName;
			this.contactPhoneNumber = phoneNumber;
			this.contactAddress = address;
		}
	
		public String getID()
		{
			return contactID;
		}
		
		public String getFirstName()
		{
			return contactFirstName;
		}
		public void setFirstName(String firstName)
		{
			this.contactFirstName = firstName;
		}
		
		public String getLastName()
		{
			return contactLastName;
		}
		public void setLastName(String lastName)
		{
			this.contactLastName = lastName;
		}
		
		public String getPhoneNnumber()
		{
			return contactPhoneNumber;
		}
		public void setPhoneNumber(String phoneNumber)
		{
			this.contactPhoneNumber = phoneNumber;
		}
		
		public String getAddress()
		{
			return contactAddress;
		}
		public void setAddress(String address)
		{
			this.contactAddress = address;
		}
}
