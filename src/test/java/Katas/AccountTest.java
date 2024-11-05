package Katas;

import org.example.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AccountTest {

    @Test
    void whenAccountIsCreatedBalanceIsZero() {
        //Given -> Escenario

        //When -> Acción crear cuenta sin balance
        Account account = new Account();
        //Then -> Comprobar
        double balance = account.getBalance();
        assertEquals(0, balance);
    }

    @Test
    void createAccount() {

        //When
        Account account = new Account(1000);

        //Then
        double balance = account.getBalance();

        assertEquals(1000, balance);
    }

    @Test
    void whenDepositAccountMustBeSumInBalance() {
        //Given --> Una cuenta
        Account account = new Account(1000);

        //When --> Acción depositar
        account.deposit(500);
        //Then --> Que al depositar se sume al saldo inicial
        account.getBalance(); //1500
        double balance = account.getBalance();
        assertEquals(1500, balance);

    }

    @Test
    void whenDepositAccountMustBeTheSameIfAmountIsNegative() {
        //Given
        Account account = new Account(1000);

        //When
        account.deposit(-500);

        //Then
        account.getBalance(); //1500
        double balance = account.getBalance();
        assertEquals(1000, balance);
    }

    @Test
    void retirarMoneyHAPPYPATH() {
        //Given
        Account account = new Account(1000);

        //When
        account.retirarMoney(500);

        //Then
        account.getBalance(); //500
        double balance = account.getBalance();
        assertEquals(500, balance);
    }
    @Test
    void retirarMoneyBADPATH() {
        //Given
        Account account = new Account(1000);

        //When
        account.retirarMoney(2000);

        //Then
        account.getBalance(); //500
        double balance = account.getBalance();
        assertEquals(1000, balance);
    }
}
