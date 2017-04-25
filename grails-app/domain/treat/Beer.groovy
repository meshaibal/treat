package treat

class Beer {

    Member giver
	Member receiver
	Date dateCreated
	int amount

    static constraints = {
		giver(unique: 'receiver')
    }
}
