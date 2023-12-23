package ru.ex;

import java.util.Objects;

public class ElementNotFoundException extends Exception {
        public static int indexOf(String[] value, String key) throws ElementNotFoundException {
            int result = -1;
            for (int i = 0; i < value.length; i++) {
                if (Objects.equals(value[i], key)) {
                    result = i;
                    break;
                }
            }
            if (result == -1) {
                throw new ElementNotFoundException();
            }
            return result;
        }

        public static void main(String[] args) {
            String[] value = {"1", "2", "ret"};
            try {
                System.out.println(indexOf(value, "re"));
            } catch (ElementNotFoundException e) {
                e.printStackTrace();
                System.out.println("Ключ не найден ");
            }
        }
    }


