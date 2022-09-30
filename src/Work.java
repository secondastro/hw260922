public class Work {
    public static void main(String[] args) {

        Book shine = new Book("Сияние",1973, new Author("Стивен", "Кинг"));
        System.out.print(shine.getName() + ": ");
        System.out.print(shine.getAuthor().getFirstName() + " " + shine.getAuthor().getLastName() + ": ");
        System.out.print(shine.getYear());
        System.out.println();

        Book oprichniksDay = new Book("День опричника", 2006, new Author("Владимир", "Сорокин"));
        System.out.print(oprichniksDay.getName() + ": ");
        System.out.print(oprichniksDay.getAuthor().getFirstName() + " " + oprichniksDay.getAuthor().getLastName() + ": ");
        System.out.print(oprichniksDay.getYear());
        System.out.println();

        oprichniksDay.setYear(2007);
        System.out.println(oprichniksDay.getYear());
    }
}
