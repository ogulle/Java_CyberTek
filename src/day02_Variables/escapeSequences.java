package day02_Variables;

public class escapeSequences {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("\tHello");
        // \t means a paragraph space
        // \n new line
        System.out.println("Cyber \nTek");
        System.out.println("\nMy\nName\nis\nMuhtar");
        // \n means new line, starts with new line

        // print: My Favorite TV show is "Game of Thrones"

        System.out.println("My favorite TV show is \"Game of Thrones\"");

        System.out.println("My favorite book is \"The Lord of the Rings\"");
                // \" \" gives you a double quote

        System.out.println("\\");
            // \\ prints single slash on the console

        System.out.println("/");

        System.out.println("My favorite book is \'Java\'");  // \' prints the '
        System.out.println("My favorite book is 'Java' ");  // prints '

    }
}
