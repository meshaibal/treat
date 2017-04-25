import treat.Member
import treat.Beer

class BootStrap {

    def init = { servletContext ->
		def member1 = new Member(name: "Alice",
			email: "alice@gmail.com",
			birthDate: new Date()).save(failOnError: true)

		def member2 = new Member(name: "Bob",
					email: "bob@gmail.com",
					birthDate: new Date()).save(failOnError: true)
					   
		def member3 = new Member(name: "Frank",
					email: "frank@gmail.com",
					birthDate: new Date()).save(failOnError: true)
		
		
		def beer = new Beer(giver: member1,
					   receiver: member2,
					   dateCreated: new Date(),
					   amount: 1
					   ).save()
    }
    def destroy = {
    }
}
