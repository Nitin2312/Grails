class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
               
            }
        }

        "/"(view:"/index")
//		"/manageBeer"(controller: "BeerController",view:"/beer/beerView")
//		"/manageuser"(controller: "MemberController",view:"/member/manageUser")
		
        "500"(view:'/error')
	}
}
