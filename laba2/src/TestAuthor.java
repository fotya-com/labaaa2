public class TestAuthor {
    public static void main(String[] args) {
        Author Nikolay = new Author("Nikolay","nik@yandex.ru",'M');
        Author Maria = new Author("Maria","mar@mail.com");
        Author  Maksim =new Author("Maksim","mak@mail.ru",'M');
        System.out.println(Nikolay.toString());
        System.out.println(Maria.toString());
        System.out.println(Maksim.toString());

    }
}