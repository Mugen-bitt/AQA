package Practic1;

public class MathOperations1 {

    //Метод сложения двух чисел
    public static int add(int x, int y){
        return x + y;
    }
    //Метод вычитания
    public static int subtract(int x, int y){
        return x - y;
    }
    //Метод умножения
    public static int multiply(int x, int y){
        return x * y;
    }
    //Метод деления
    public static double divide(int x, int y){
        return (double) x / y;
    }
    //Нахождение максимального числа
    public static int findMax(int a, int b){
        return Math.max(a,b);
    }
    //Метод разницы двух чисел
    public static int difference(int x, int y){
        return Math.abs(x - y);
    }
    //Метод вычисления площажи
    public static int squareArea(int side){
        return side;
    }
    //Метод для вычисления периметра
    public static int squarePerimeter(int side){
        return 4 * side;
    }
    //Метод для перевода секунд в минуты
    public static double convertSecondsToMinutes(int seconds){
        return seconds / 60.0;
    }
    //Метод вычесления средней скорости
    public static double averageSpeed(double distance, double time){
        return distance / time;
    }
    //Метод вычисления гипотенузы
    public static double findHypotenuse(double a, double b){
        return Math.sqrt(a * a + b * b);
    }
    //Метод для вычисления радиуса окружности
    public static double circleCircumference(double radius){
        return 2 * Math.PI * radius;
    }
    public static double circleCircumference2(double radius){
        return 2 * Math.PI * radius;
    }
    //Метод вычисления процента
    public static double calculatePercentage(double total, double part){
        return part / total * 100;
    }
    //Метода для перевода Цельсии в Фарингейт
    public static double celsiusToFahrenheit(double celsius){
        return celsius * 9 / 5 + 32;
    }
    //Метод для перевода Фарингейт в Цельсию
    public static double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5 / 9;
    }




    public static void main(String[] args){

        int sum = add(5, 10);
        System.out.println("Сложение: " + sum);

        int difference = subtract(10, 7);
        System.out.println("Разница: " + difference);

        int product = multiply(5, 5);
        System.out.println("Умножение: " + product);

        double quotien = divide(42,6);
        System.out.println("Деление: " + quotien);

        int max = findMax(15,5);
        System.out.println("Максимальное число: " + max);

        int result1 = difference(50, 9);
        System.out.println("Разница между 50 и 9: " + result1);

        int side = 9;
        int area = squareArea(side);
        System.out.println("Площадь квадрата: " + side + area);

        int perimetr = squarePerimeter(side);
        System.out.println("Периметр квадрата: " + side + perimetr);

        int seconds = 150;
        double minutes = convertSecondsToMinutes(seconds);
        System.out.println(seconds + "секунд = " + minutes + "минут");

        double speed1 = averageSpeed(150,2);
        System.out.println("Средняя скорость: " + speed1 + "км/ч" );

        double hypotenuse1 = findHypotenuse(4,5);
        System.out.println("Гипотенуза для (4,5): " + hypotenuse1);

        double circleCircumference1 = circleCircumference(5);
        System.out.println("Длина окружности с радиусом 5: " + circleCircumference1);

        double circleCircumference2 = circleCircumference(6);
        System.out.println("Длина окружности с радиусом 6: " + circleCircumference2);

        double percentage1 = calculatePercentage(200,55);
        System.out.println("55 из 200: " + percentage1 + "%");

        double fahrenheit1 = celsiusToFahrenheit(35);
        System.out.println("35С в Фаренгейт: " + fahrenheit1);

        double celsius1 = fahrenheitToCelsius(52);
        System.out.println("52F в Цельсиях: " + celsius1);
    }
}
