package ru.collection;

import java.util.HashSet;
import java.util.List;

public class NotifyAccount {
    public static HashSet<Account> sent(List<Account> accounts) {
        HashSet<Account> clients = new HashSet<>();
                for (Account client : accounts) {
                    clients.add(client);
                }
        return clients;
    }
}
