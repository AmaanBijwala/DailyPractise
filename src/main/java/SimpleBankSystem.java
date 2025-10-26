
public class SimpleBankSystem {
    public static void main(String[] args)
    {

    }
}
    class Bank {
        long[] acc;
        public Bank(long[] balance) {
            int n=balance.length;
            acc=new long[n+1];
            for(int i=1;i<=n;i++){
                acc[i]=balance[i-1];
            }
        }

        public boolean transfer(int account1, int account2, long money) {
            int n=acc.length;
            if(account1>=n || account2>=n)
                return false;
            long acc1=acc[account1];
            long acc2=acc[account2];
            if(acc1<money)
                return false;
            acc[account2]+=money;
            acc[account1]-=money;
            return true;
        }

        public boolean deposit(int account, long money) {
            int n=acc.length;
            if(account>=n)
                return false;
            acc[account]+=money;
            return true;
        }

        public boolean withdraw(int account, long money) {
            int n=acc.length;
            if(account>=n || acc[account]<money)
                return false;
            acc[account]-=money;
            return true;
        }
    }

/**
 * Your Bank object will be instantiated and called as such:
 * Bank obj = new Bank(balance);
 * boolean param_1 = obj.transfer(account1,account2,money);
 * boolean param_2 = obj.deposit(account,money);
 * boolean param_3 = obj.withdraw(account,money);
 */



