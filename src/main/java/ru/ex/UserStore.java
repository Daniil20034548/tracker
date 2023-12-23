package ru.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User foundUser = null;
        for (User user : users) {
            if (user.getUsername().equals(login)) {
                foundUser = user;
                break;
            }
        }
        if (foundUser == null) {
            throw new UserNotFoundException("пользователя не найдено.");
        }
        return foundUser;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("пользователь не валидный");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Ivan Ivanov", true), new User("vdvdvd", true)};
        try {
        User user = findUser(users, "vdvdvd");
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
