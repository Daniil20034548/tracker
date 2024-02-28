package ru.bank;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод должен добавить пользователя в систему
     * @param user принимает обьект состоящий из ФИО
     * и номера пасспорта
     */

    public void addUser(User user) {
            users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Метод удаляет пользователя из системы
     * @param passport принимает номер пасспорта пользователя
     */

    public void deleteUser(String passport) {
        users.remove(findByPassport(passport));
    }

    /**
     * Метод добавляет пользователю аккаунт
     * @param passport номер пасспорта пользователя
     * @param account обьект состоящий из номера счета
     * и баланса
     */

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null && !users.get(user).contains(account))
            users.get(user).add(account);
    }

    /**
     * Метод должен находить пользователя по пасспарту
     * @param passport номер пасспорта
     * @return возвращает пользователя или null если ничего не нашлось
     */

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

    /**
     * Метод должен найти пользователя по номеру счета
     * @param passport номер пасспорта пользователя
     * @param requisite номер счета пользователя
     * @return возвращает аккаунт пользователя или null если ничего не нашлось
     */

    public Account findByRequisite(String passport, String requisite) {
        Account result = null;
        User user = findByPassport(passport);
        if (user != null) {
            for (Account account : users.get(user)) {
                if (account.getRequisite().equals(requisite)) {
                result = account;
                }
            }
        }
        return result;
    }

    /**
     * Метод предназначен для перечисления денег
     * с одного счёта на другой счёт
     * @param sourcePassport номер пасспорта клиена переводящего средства
     * @param sourceRequisite номер счета клиента переводящего средства
     * @param destinationPassport номер паспорта клиента получающего средства
     * @param destinationRequisite номер счета клиента получающего средства
     * @param amount сумма перевода
     * @return возвращает результат транзакции (булевое значение)
     */

    public boolean transferMoney(String sourcePassport, String sourceRequisite,
                                 String destinationPassport, String destinationRequisite,
                                 double amount) {
        boolean result = false;
        Account sourceAccount = findByRequisite(sourcePassport, sourceRequisite);
        Account destAccount = findByRequisite(destinationPassport, destinationRequisite);
        if (sourceAccount != null && destAccount != null && sourceAccount.getBalance() >= amount) {
            sourceAccount.setBalance(sourceAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            result = true;
        }
        return result;
    }

    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}
