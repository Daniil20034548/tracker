package ru.ex;

import java.util.Objects;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        int result = -1;
        for (User user : users) {
            if (Objects.equals(user.getUsername(), login)) {
                result = 1;
            }
            if (result == -1) {
                throw new UserNotFoundException("пользователя не найдено.");
            }
        }
        return users[users.length - 1];
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("пользователь не валидный");
        }
        return true;
    }

    public static void main(String[] args) {
        try {
        User[] users = {
                new User("Ivan Ivanov", true)
        };
        User user = findUser(users, "Ivan Ivanov");
        if (validate(user)) {
            System.out.println("This user has an access");
        }
        } catch (UserInvalidException r) {
            r.printStackTrace();
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
    }
}
