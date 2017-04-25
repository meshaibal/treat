package treat

import grails.test.mixin.TestFor
import spock.lang.Specification
import grails.test.mixin.Mock

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(BeerController)
@Mock([Beer])
class BeerControllerSpec extends Specification {

    void "test something"() {
		setup:
		def owingList = Beer.list()
		
		expect:
		controller.owingList() == [members : owingList]
    }
}
