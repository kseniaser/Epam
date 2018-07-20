package multithreading.task1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConcurrentAccount {
    private Path accountFile;
    private int accountBalance;
    private static Lock lock = new ReentrantLock();

    public ConcurrentAccount() {
        this.accountFile = Paths.get("e:\\Git\\java\\Epam\\src\\main\\java\\multithreading\\Account");
        this.accountBalance = 0;
        UploadAccountBalance();
    }

    public void makeOperation(int amount){
        lock.lock();
        accountBalance+=amount;
        WriteBalanceChanges(amount);
        WriteBalance();
        lock.unlock();

    }

    public void WriteBalance(){
        System.out.println(accountBalance);
    }

    private void UploadAccountBalance(){
        try(BufferedReader reader = Files.newBufferedReader(accountFile)){
            String s;
            while((s = reader.readLine()) != null) {
                accountBalance+=Integer.parseInt(s);
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    private void WriteBalanceChanges(int amount){
        try(BufferedWriter writer = Files.newBufferedWriter(accountFile, StandardOpenOption.APPEND)){
            writer.newLine();
            writer.write(String.valueOf(amount));
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }




}
