package task;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class mainClass {
    public static void main(String[] args){
        PyramidCSVDAO pyramidCSVDAO = new PyramidCSVDAO();

        List<Pyramid> pyramids = pyramidCSVDAO.readPyramidsFromCSV("C:\\Users\\hazem\\OneDrive\\Desktop\\Java\\assignment\\1\\pyramids.csv");
        int i = 0 ;
        for (Pyramid p:pyramids)
            System.out.println("#"+(i++)+p.getModern_name()+p.getPharaoh()+p.getSite()+p.getHeight_m());
    }
}
