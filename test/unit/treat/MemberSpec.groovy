package treat

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Member)
class MemberSpec extends Specification {

    def "member by name"() {
		setup:
		mockDomain(Member)
		
		when:
		new Member(name: name, email: "alice@gmail.com", birthDate: new Date()).save()
		
		then:
		Member.findByName(name) != null
		
		where:
		name = "Alice"
    }
	
	def "search member by email"(){
		setup:
		mockDomain(Member)
		
		when:
		new Member(name: "Bob", email: email, birthDate: new Date()).save()
		
		then:
		Member.findByEmail(email)
		
		where:
		email = "bob@gmail.com"
	}
}
