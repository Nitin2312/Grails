package gecko_app

class BeerController {
	static scaffold = Beer
    def index() {
		
	}
	def save(){
		
		def beer = new Beer(params)
		
			beer.save();
		render(view:'/index')
		
	}
	def list(){
		log.info "Executing within controller $controllerName"
		println "Hello world"
		render(view: beerView)
	}
	
	
	
	
}
