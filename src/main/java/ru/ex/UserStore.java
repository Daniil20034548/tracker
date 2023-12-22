package ru.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User user : users) {
            if (user.getUsername() != login) {
                throw new UserNotFoundException();
            }
        }
        return users[users.length - 1];
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.isValid() && user.getUsername().length() < 3) {
            throw new UserInvalidException();
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
            System.out.println("пользователь не валидный");
        } catch (UserNotFoundException e) {
            e.printStackTrace();
            System.out.println("пользователя не найдено.");
        }
    }
}
