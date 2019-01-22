package com.naztech.Enum;


enum Month{
	JANUARY("January",31),
	FEBRUARY("February",27),
	MARCH("March",31),
	APRIL("April",30),
	MAY("May",31),
	JUNE("June",30),
	JULY("July",31),
	AUGUST("August",31),
	SEPTEMBER("September",30),
	OCTOBER("October",31),
	NOVEMBER("November",30),
	DECEMBER("December",31);
	
	private final String mnth;
	private final int day;
	
	Month(String m, int d){
		this.mnth = m;
		this.day = d;
	}
	
	public String getMonth()
	{
		return this.mnth;
	}
	
	public int getDay()
	{
		return this.day;
	}
	
	 public Month parse(String val) {
		   if(val==null) 
			   return null;
		   else {
			   try {
				   return valueOf(val);
			   }catch(Exception e) {
				   for(Month mnth: values()) {
					   String s1=val.toUpperCase();
					   String s2=mnth.name().substring(0,3);
						if(s1.equalsIgnoreCase(s2)) {
							return mnth;
						}
				   }
				   
			   }
			   return null;
		   }
		   
		   
		   
	   }
	   
}
