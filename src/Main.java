public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        /*
        Представьте, что вы работаете в небольшой компании. Данные сотрудников хранятся в неструктурированном
        формате. Бухгалтерия попросила написать программу, в которой  можно работать с Ф. И. О. сотрудников.
        Выведите в консоль фразу: «ФИО сотрудника — …».
        В качестве данных для задачи используйте "Ivanov Ivan Ivanovich".
         */
        System.out.println("Задача 1");
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("ФИО сотрудника — " + fullName);
        System.out.println();
    }

    public static void task2() {
        /*
        Для ежемесячного отчета и ведения документации бухгалтерии нужны Ф. И. О. сотрудников, полностью
        написанные заглавными буквами (верхним регистром).

        Напишите программу, которая изменит написание Ф. И. О. сотрудника с "Ivanov Ivan Ivanovich" на
        полностью заглавные буквы.

        В качестве строки с исходными данными используйте строку fullName.

        Результат программы выведите в консоль в формате: "Данные ФИО сотрудника для заполнения отчета — …"
         */
        System.out.println("Задача 2");
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
        System.out.println();
    }

    public static void task3() {
        /*
        Система, в которой мы работаем, не принимает символ «ё». Напишите программу, которая заменяет символ
        «ё» на символ «е».
        В качестве исходных данных используйте строку fullName и данные в ней — "Иванов Семён Семёнович".
        Выведите результат программы в консоль в формате: «Данные ФИО сотрудника — ...».
         */
        System.out.println("Задача 3");
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }
}