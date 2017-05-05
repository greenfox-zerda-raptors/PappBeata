import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        File points = new File("src/main/resources/points.dat");
        byte[] bytes = Files.toByteArray(points);

        int firstNr = ((bytes[2]) << 8) | (bytes[3] & 0xff);
        System.out.println(firstNr);

    }
}
/*
        String content = Files.toString(new File("/home/user/foo.txt"), Charsets.UTF_8);

------------------
    byte[] buffer = new byte[4];
    InputStream is = new FileInputStream("somwhere.in.the.dark");
if(is.read(buffer)!=buffer.length)

    {
        // do something
    }
is.close();
// at this point, the buffer contains the 4 bytes...
--------------------------

    byte[] bytes = Files.toByteArray(file);


    -----------------------------

    public static void main(String... aArgs) throws IOException {
        SmallBinaryFiles binary = new SmallBinaryFiles();
        byte[] bytes = binary.readSmallBinaryFile(FILE_NAME);
        log("Small - size of file read in:" + bytes.length);
        binary.writeSmallBinaryFile(bytes, OUTPUT_FILE_NAME);
    }

    final static String FILE_NAME = "C:\\Temp\\cottage.jpg";
    final static String OUTPUT_FILE_NAME = "C:\\Temp\\cottage_output.jpg";

    byte[] readSmallBinaryFile(String aFileName) throws IOException {
        Path path = Paths.get(aFileName);
        return Files.readAllBytes(path);
    }

    void writeSmallBinaryFile(byte[] aBytes, String aFileName) throws IOException {
        Path path = Paths.get(aFileName);
        Files.write(path, aBytes); //creates, overwrites
    }

    private static void log(Object aMsg) {
        System.out.println(String.valueOf(aMsg));
    }

}
*/
