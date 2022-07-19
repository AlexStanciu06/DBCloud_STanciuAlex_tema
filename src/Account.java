public class Account
{
    private int accountNo;
    private int amount;
    private int nationalId;
    private int current = 0;

    public Account()
    {
        int amount = 0;

        accountNo = current;
        current++;
    }

    public void deposit(int amount)
    {
        this.amount += amount;
    }

    public void withdraw(int amount)
    {
        if(this.amount < amount)
            throw new NotEnoughMoneyException("Insufficient Founds");

        this.amount -= amount;
    }

    public void linkToNationalId(int nationalId)
    {
        if(nationalId % 10 == 0)
            throw new InvalidNationalIdException("Invalid ID");

        this.nationalId = nationalId;
    }

    @Override
    public String toString()
    {
        return "Account{" + "accountNo=" + accountNo + ", amount=" + amount + ", nationalId=" + nationalId + '}';
    }
}
