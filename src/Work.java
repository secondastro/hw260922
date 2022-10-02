public class Work {
    public static void main(String[] args) {

        Book shine = new Book("Сияние", 1973, new Author("Стивен", "Кинг"));
        System.out.println(shine);

        Book oprichniksDay = new Book("День опричника", 2006, new Author("Владимир", "Сорокин"));
        System.out.println(oprichniksDay);

        oprichniksDay.setYear(2007);
        System.out.println(oprichniksDay.getYear());

    }
}
