package miniproject;

public class Hotel {
	
	 private String name;
	    private long phone;
	    private String location;

	    public Hotel(String name, long phone, String location) {
	        this.name = name;
	        this.phone = phone;
	        this.location = location;
	    }

	    public String getname() {
	        return name;
	    }

	    public long getphone() {
	        return phone;
	    }

	    public String getlocation() {
	        return location;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setPhone(long phone) {
	        this.phone = phone;
	    }

	    public void setLocation(String location) {
	        this.location = location;
	    }
	}


