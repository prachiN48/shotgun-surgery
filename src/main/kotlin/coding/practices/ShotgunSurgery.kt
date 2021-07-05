package coding.practices

fun main() {
    val personalAccount = SavingsAccount("AC1234", 1000)
    personalAccount.debit(400)
    val transferToAccount = SavingsAccount("AC5678", 250)
    personalAccount.transfer(transferToAccount, 400)
    personalAccount.sendWarningMessage()
}
