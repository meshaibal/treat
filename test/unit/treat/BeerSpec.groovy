package treat

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Beer)
class BeerSpec extends Specification {

    void "get by giver"() {
		setup:
		mockDomain(Member)
		mockDomain(Beer)
		
		when:
		new Beer(
			giver: new Member(
				name: "Alice",
				email: "alice@gmail.com",
				birthDate: new Date()).save(), 
			receiver: new Member(
				name: "Bob",
				email: "bob@gmail.com",
				birthDate: new Date()).save(),
			amount: 1,
			dateCreated: new Date()
			).save()
			
		then:
		Beer.findByGiver(Member.findByName(nameGiver)) != null
		
		where:
		nameGiver = "Alice"
    }
}
