package gecko_app

class Member {

	String name
	String email
	String birthDate
	
//	static belongsTo=[beer:Beer]
    static constraints = {
		name (blank:false, nullable:false, size:3..30, matches:"[a-zA-Z1-9_]+")
		email (unique: true)
		
    }
	
}
