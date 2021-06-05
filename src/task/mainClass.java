package task;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class mainClass {
    public static void main(String[] args){
        PyramidCSVDAO pyramidCSVDAO = new PyramidCSVDAO();

        List<Pyramid> pyramids = null;
        pyramids = pyramidCSVDAO.readPyramidsFromCSV("E:\\AI Diploma\\Semester 1\\Java\\Day1\\pyramids.csv");
        int i = 0 ;
        for (Pyramid p:pyramids)
            System.out.println("#"+(i++)+1);
    }
}
