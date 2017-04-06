package gecko_app

class Beer {
	Member giver;
	Member reciever;
	String dateCreate;
	int amount;
//	static hasMany=[members:Member]
    static constraints = {
		
		dateCreate nullable:false,blank:false
    }
}
