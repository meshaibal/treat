package treat

import grails.converters.JSON

class OwingDetailsController {

    //def index() { }
	
	def getAllOwingList(){
		
		def result = Beer.list().collect{
			[
				giver : it.giver.name,
				amount : it.amount,
				receiver : it.receiver.name
			]
		}
		render(contentType :"text/json", text : result as JSON)
	}
	
	def getAllOwingListByGiver(){
		
		def result = Beer.findByGiver(Member.findByName(params.giver)).collect{
			[
				giver : it.giver.name,
				amount : it.amount,
				receiver : it.receiver.name
			]
		}
		render(contentType :"text/json", text : result as JSON)
	}
}
