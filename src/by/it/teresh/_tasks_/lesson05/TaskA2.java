package by.it.teresh._tasks_.lesson05;

import java.util.ArrayList;
import java.util.Scanner;

import static jdk.nashorn.internal.runtime.regexp.joni.constants.AsmConstants.END;

/*
Создайте список строк.
Вводите строки с клавиатуры, пока пользователь не введет слово END.
Каждую введенную строку, кроме слова END добавьте в список типа ArrayList.

Напечатайте список, не используйте для этого цикл.
Список - это объект. Его можно просто напечатать, как переменную.

Для вот такого ввода:
ONE
TWO
THREE
FOUR
FIVE
END
Ожидается такой вывод:
[ONE, TWO, THREE, FOUR, FIVE]

*/
public class TaskA2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            String line = sc.next();
            if (line.equals("END")) break;
            else list.add(line);
        }
        System.out.println(list);
    }


}
