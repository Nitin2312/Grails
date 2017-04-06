package gecko_app

class MemberController {
static scaffold = Member
	def form() {
		
		}
	
	def save() {
		
		def person = new Member(params)
		boolean uniquePerson;
//		List<Member> personList =(ArrayList<Member>)person.list();
//		for(int i =0;i<personList.size();i++){
//			
//			if(personList.get(i).getEmail().equalsIgnoreCase(person.getEmail())){
//				uniquePerson=true;
//			}
//		}
		
		if(!uniquePerson){
			person.save();
		}
		
		render(view:'/index')

	}
	
	def index() {
		
		def members = Member.findAll()
	
		println "Hello world"
		[members:members]
	}
}
