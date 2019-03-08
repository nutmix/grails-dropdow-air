package dropdown

class BootStrap {

    def init = { servletContext ->
        
        def user1  = new User( name: "Bob").save(failOnError:true)
        def user2  = new User( name: "Dave").save(failOnError:true)
        
        def ac1 = new Account (currencyIso: "GBP", user: user1).save(failOnError:true)
        def ac2 = new Account (currencyIso: "EUR", user: user1).save(failOnError:true)
        def ac3 = new Account (currencyIso: "USD", user: user1).save(failOnError:true)
        
        def ac4 = new Account (currencyIso: "GBP", user: user2).save(failOnError:true)
        def ac5 = new Account (currencyIso: "EUR", user: user2).save(failOnError:true)
        
        def t1 = new Transaction(account: ac1, creidt: 100, debit: 0).save(failOnError:true)
        
    }
    def destroy = {
    }
}
