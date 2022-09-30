public class Work {
    public static void main(String[] args) {

        Book shine = new Book("Сияние",1973, new Author("Стивен", "Кинг"));
        printerBook(shine);

        Book oprichniksDay = new Book("День опричника", 2006, new Author("Владимир", "Сорокин"));
        printerBook(oprichniksDay);

        oprichniksDay.setYear(2007);
        System.out.println(oprichniksDay.getYear());
    }

    public static void printerBook(Book book) {
        System.out.print(book.getName() + ": ");
        System.out.print(book.getAuthor().getFirstName() + " " + book.getAuthor().getLastName() + ": ");
        System.out.print(book.getYear());
        System.out.println();
    }
}
