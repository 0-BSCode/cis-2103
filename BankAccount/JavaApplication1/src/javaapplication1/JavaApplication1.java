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
        
        System.out.println(newAccount.depositFunds(69.20f));
        newAccount.withdrawFunds(69.0f);
        System.out.println(newAccount.withdrawFunds(69.0f));
        System.out.println(newAccount.depositFunds(-2.0f));

    }
}
