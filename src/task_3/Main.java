package task_3;

public class Main {

    public static void main(String[] args) {
        String text = "Java - это высокоуровневый объектно-ориентированный язык программирования. Он был разработан компанией Sun Microsystems (позднее приобретенной Oracle Corporation) и выпущен в 1995 году. Java получила широкое распространение благодаря своей платформенной независимости, что означает, что программы, написанные на Java, могут выполняться на различных операционных системах без необходимости перекомпиляции.";
        int length = text.length();
        System.out.println(length);
        int half = text.length() / 2;
        System.out.println(half);

        int i = text.lastIndexOf(' ', half);

        String first = text.substring(0, i);
        String second = text.substring(i);

        System.out.println("Первая половина: " + first);
        System.out.println("Вторая половина: " + second);
    }
}
