package treat

class BeerController {

	static scaffold = Beer
	
   // def index() { }
   
   def owingList(){
		def members = Beer.list();
		[members : members]
	}
}
