package section4

@groovy.transform.ToString
class Account {

    BigDecimal balance=0.0;
    String type;

    BigDecimal deposit(BigDecimal ammount){
        this.balance+=ammount;
    }

    BigDecimal withdraw(BigDecimal withdraw){
        this.balance-=ammount;
    }

    BigDecimal plus(Account other){
       return this.balance+=other.balance;
    }
}

Account checking = new Account(type:"Checking")
checking.deposit(100.00)
Account savings = new Account(type:"Savings")
savings.deposit(50.00)
println checking;
println savings;

BigDecimal total = checking + savings
println checking;
println total