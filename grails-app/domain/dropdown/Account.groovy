package dropdown

class Account {
    
    User user
    BigDecimal balance = 0
    String currencyIso

    static constraints = {
        currencyIso inlist: ["GBP", "EUR", "USD"]
    }
    
    String toString() {
        return this.currencyIso
    }
}
