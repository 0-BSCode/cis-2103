/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Bryan Sanchez
 */
public class BankAccount {
    private int accountNumber;
    private float accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;
    
    public BankAccount(int accountNumber, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.accountBalance = 0;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public boolean withdrawFunds(float amount) {
        boolean res = false;
        float newBalance = this.accountBalance - amount;
        String msg;
        if (newBalance < 0 || newBalance >= this.accountBalance) {
            msg = String.format("Withdrawal invalid! Your account balance is %.2f", this.accountBalance);
            System.out.println(msg);
        } else {
            this.accountBalance = newBalance;
            msg = String.format("Withdrawal successful! Your remaining account balance is %.2f", newBalance);
            System.out.println(msg);
            res = true;
        }
        
        return res;
    }
    
    public boolean depositFunds(float amount) {
        boolean res = false;
        String msg;
        
        if (amount > 0) {
            this.accountBalance = this.accountBalance + amount;
            msg = String.format("Deposit successful! Your new account balance is %.2f", this.accountBalance);
            System.out.println(msg);
            res = true;
        } else {
            msg = String.format("Deposit invalid! Your remaining account balance is %.2f", this.accountBalance);
            System.out.println(msg);
        }
        
        return res;
    }
}
