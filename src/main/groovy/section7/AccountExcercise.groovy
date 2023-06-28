package section7

class Account {

    BigDecimal balance = 0.0;

    def deposit(BigDecimal amount){
        if(amount<0){
            throw new Exception("Deposit amount must be greater than 0");
        }
        balance+=amount;
    }

    def deposit(List<BigDecimal> amounts ){
        for(amount in amounts){
            deposit(amount);
        }
    }
}

Account checking = new Account();
checking.deposit(10);
println checking.balance;

try{
    checking.deposit(-10);
}catch (Exception e){
    println e.message;
}

println checking.balance;

checking.deposit([1,32,21,43,545,12]);
println checking.balance;

