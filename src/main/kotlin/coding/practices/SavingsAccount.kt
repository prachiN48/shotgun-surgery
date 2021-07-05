package coding.practices

class SavingsAccount(private val accountNumber: String, private var amount: Int) {
    fun debit(debit: Int) {
        if (amount <= 500) {
            throw Exception("Mininum balance shuold be over 500")
        }
        amount -= debit
        println("Now amount is $amount for account number $accountNumber")
    }

    fun transfer(to: SavingsAccount, creditAmount: Int) {
        if (amount <= 500) {
            throw Exception("Mininum balance shuold be over 500")
        }
        to.amount = amount + creditAmount
        amount -= creditAmount
        println("Amount $amount transferred from $accountNumber to ${to.accountNumber}")
    }

    fun sendWarningMessage() {
        if (amount <= 500) {
            println("amount should be over 500 but it is $amount")
        }
    }
}
