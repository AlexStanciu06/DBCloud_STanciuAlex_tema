public class Main
{
    public static void main(String[] args)
    {
       int i = 0;

        Account[] accounts = new Account[4];
        while(i != 4)
        {
            accounts[i] = new Account();
            i++;
        }

        System.out.println("Accounts: ");
        for(i = 0; i < 4; i++)
            System.out.println(accounts[i]);

        try
        {
            accounts[0].linkToNationalId(23443650);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println(accounts[0]);

        try
        {
            accounts[1].linkToNationalId(12);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println(accounts[1]);
        accounts[0].deposit(500);
        System.out.println(accounts[0]);
        accounts[0].withdraw(250);

        try
        {
            accounts[0].withdraw(300);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}