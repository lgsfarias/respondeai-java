public class App {
    public static void main(String[] args) throws Exception {
        User user = new User("Farias", "farias@gmail.com", "123456", "123456789", new Module[0]);
        Module module = new Module("Java", "CS101", "Java is a programming language");
        user.newModule(module);

        System.out.println(user.getName());
        System.out.println(user.getModules()[0].name);
        System.out.println(user.getModules()[0].code);
        System.out.println(user.getModules().length);

        Module module2 = new Module("C#", "CS102", "C# is a programming language");
        user.newModule(module2);

        System.out.println(user.getModules()[1].name);
        System.out.println(user.getModules().length);

    }
}
