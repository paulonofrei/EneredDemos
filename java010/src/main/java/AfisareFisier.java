import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AfisareFisier {
    public static void main(String[] args) {
        String text = "Paul";
        String filename= "C:\\Users\\Paul\\Desktop\\scrierefisier.txt";
        try{
            Files.write(Paths.get(filename), text.getBytes());
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
