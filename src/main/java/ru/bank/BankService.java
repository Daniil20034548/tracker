package ru.bank;

import ru.bank.Account;
import ru.bank.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
            users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void deleteUser(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                users.remove(user);
                break;
            }
        }
    }

    public void addAccount(String passport, Account account) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                for (List<Account> result : users.values())
                    if (!result.contains(account))
                users.get(user).add(account);
            }
        }
    }

    public User findByPassport(String passport) {
        User result = null;
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                result = user;
                break;
            }
        }
        return result;
    }

    public Account findByRequisite(String passport, String requisite) {
        Account account = null;
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                for (Account result : users.get(user)) {
                    if (result.getRequisite().equals(requisite)) {
                        account = result;
                    }
                }
            }
        }
        return account;
    }

    public boolean transferMoney(String sourcePassport, String sourceRequisite,
                                 String destinationPassport, String destinationRequisite,
                                 double amount) {
        boolean result = false;
        Account writeOff = findByRequisite(sourcePassport, sourceRequisite);
        Account replenish = findByRequisite(destinationPassport, destinationRequisite);
        if (writeOff != null && replenish != null && writeOff.getBalance() >= amount) {
            writeOff.setBalance(writeOff.getBalance() - amount);
            replenish.setBalance(replenish.getBalance() + amount);
            result = true;
        }
        return result;
    }

    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}
