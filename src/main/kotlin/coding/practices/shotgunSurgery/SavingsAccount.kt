package coding.practices.shotgunSurgery

class SavingsAccount(private val accountNumber: String, private var amount: Int) {
    fun debit(debit: Int) {
        if (isAccountUnderflow()) {
            throw Exception("Minimum balance should be over 500")
        }
        amount -= debit
        println("Now amount is $amount for account number $accountNumber")
    }

    fun transfer(to: SavingsAccount, creditAmount: Int) {
        if (isAccountUnderflow()) {
            throw Exception("Minimum balance should be over 500")
        }
        to.amount = amount + creditAmount
        amount -= creditAmount
        println("Amount $amount transferred from $accountNumber to ${to.accountNumber}")
    }

    fun sendWarningMessage() {
        if (isAccountUnderflow()) {
            println("amount should be over 500 but it is $amount")
        }
    }

    private fun isAccountUnderflow() = amount <= 500
}
