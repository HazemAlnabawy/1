package task;

/**
 *
 * @author HazemAlnabawy
 */
import java.io.File;

public class CheckFile {
    public static  void main(String args[]){
        File file = new File("E:\\AI Diploma\\Semester 1\\Java\\Day1");
        String[] fileList = file.list();
        System.out.println("######The list of File/Folder###### ");
        for(String name:fileList)
            System.out.println(name);
        System.out.println("####################################");
    }
}
