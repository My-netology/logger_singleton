import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запуск программы.");
        logger.log("Запрос исходных данных.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер списка: ");
        int size = scanner.nextInt();
        System.out.print("Введите верхнюю границу для значений: ");
        int maxValue = scanner.nextInt();
        logger.log("Генерация списка случайных чисел.");
        List<Integer> source = new Random().ints(size, 0, maxValue).boxed().toList();
        logger.log("Список случайных чисел сгенерирован.");
        System.out.println("Вот наш список: " + source);
        logger.log("Запрос данных для фильтрации списка.");
        System.out.print("Введите порог для фильтра: ");
        int filterValue = scanner.nextInt();
        Filter filter = new Filter(filterValue);
        List<Integer> result = filter.filterOut(source);
        System.out.println("Отфильтрованный список: " + result);
        logger.log("Завершение программы.");
    }
}