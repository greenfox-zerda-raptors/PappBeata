

public class Workshop18{

    public static void main(String... args) {
        StringBuilder example = new StringBuilder("A long example string");

        // I would like to replace "long" with "short" in this example, but it has a problem. Please fix it! Don't forget that String is immutable
        // Expected ouput: A short example string

        example.replace(2, 6, "short");

        System.out.println(example);
    }
}
