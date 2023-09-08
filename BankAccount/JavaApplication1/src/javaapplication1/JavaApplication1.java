/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author User
 */
public class JavaApplication1 {

    public static void main(String[] args) {
        BankAccount newAccount = new BankAccount(1, "Bryan", "bryan@gmail.com", "01234567");
        BankAccount newAccount2 = new BankAccount(2, "Christian", "christian@gmail.com", "01234567");
       
//        System.out.println(newAccount.depositFunds(69.20f));
//        newAccount.withdrawFunds(69.0f);
//        System.out.println(newAccount.withdrawFunds(69.0f));
//        System.out.println(newAccount.depositFunds(-2.0f));

        newAccount.depositFunds(69.42f);
        
        System.out.printf("Account 1 OB: %.2f\n", newAccount.getAccountBalance());
        System.out.printf("Account 2 OB: %.2f\n", newAccount2.getAccountBalance());

        System.out.println(newAccount.transfer(newAccount2, 45.0f));
        
        System.out.printf("Account 1 NB: %.2f\n", newAccount.getAccountBalance());
        System.out.printf("Account 2 NB: %.2f\n", newAccount2.getAccountBalance());


    }
}
