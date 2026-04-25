class BankAccount
{
    private int balance = 100000;

    // Tu khoa synchronized dam bao loai tru tuong ho (Mutex) tu dong
    public synchronized void deposit(int amount)
    {
        balance += amount;
        System.out.println("Nap: " + amount + " | So du: " + balance);

        // Danh thuc cac luong dang doi rut tien (Condition Variable - Signal All)
        notifyAll();
    }

    public synchronized void withdraw(int amount)
    {
        // Dung vong lap while de kiem tra lai dieu kien sau khi bi danh thuc
        while (balance < amount)
        {
            try
            {
                System.out.println("Dang cho du tien de rut " + amount + "...");
                wait(); // Tam nghi va nha khoa cho nguoi khac vao nap tien
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        balance -= amount;
        System.out.println("Rut: " + amount + " | So du con lai: " + balance);
    }
}

public class Main
{
    public static void main(String[] args)
    {
        BankAccount account = new BankAccount();
        System.out.println("So du ban dau: 100000");

        // Luong 1: Nguoi chong muon rut 150.000 (Nhieu hon so du hien tai)
        Thread chong = new Thread(()->{
            account.withdraw(150000);
        });

        // Luong 2: Nguoi vo di chuyen tien vao tai khoan
        Thread vo = new Thread(()->{
            try
            {
                Thread.sleep(2000); // Gia lap 2 giay sau vo moi nap tien
            }
            catch(InterruptedException e) {}
            account.deposit(60000);
        });

        chong.start();
        vo.start();

        try
        {
            chong.join();
            vo.join();
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println("Giao dich hoan tat!");
    }
// }