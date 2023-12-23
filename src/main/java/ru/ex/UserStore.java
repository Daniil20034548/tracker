package ru.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        int result = -1;
        User user = null;
        for (User usere : users) {
            if (usere.getUsername().equals(login)) {
                result = 1;
                user = usere;
                break;
            }
        }
        if (result == -1) {
            throw new UserNotFoundException("пользователя не найдено.");
        }
        return user;
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
                new User("Ivan Ivanov", true), new User("vdvdvd", true)
        };
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
