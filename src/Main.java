public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> arrayList = new MyArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
        System.out.println(arrayList);
        System.out.println("Получаем 5-й элемент - " + arrayList.get(4));
        System.out.println("Удаляем 5-й элемент");
        arrayList.remove(4);
        System.out.println(arrayList);
        System.out.println("Добавим 20 элементов, чтобы добиться увеличения размерности массива");
        for (int i = 0; i < 20; i++) {
            arrayList.add(i+10);
        }
        System.out.println(arrayList);
    }
}