package task;

/**
 *
 * @author HazemAlnabawy
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PyramidCSVDAO {
    Scanner scFile;
    public void readFile(String fileName){
        File myFile = new File(fileName);
        try {
            scFile = new Scanner(myFile);
        }catch (FileNotFoundException ex) {
            Logger.getLogger(PyramidCSVDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("File Not Found , kindly check name or path");
        }
    }

    public List<Pyramid> readPyramidsFromCSV(String fileName) {
        ArrayList<Pyramid> pyramids = new ArrayList<>();
        readFile(fileName);
        String data ;
        boolean isFirstLine = true;
        while (scFile.hasNextLine()) {
            data = scFile.nextLine();
            if (isFirstLine)
                isFirstLine = false;
            else
                pyramids.add(createPyramid(data));
        }
        return pyramids;
    }

    public Pyramid createPyramid(String inputStr ){
        String[] metaData = inputStr.split(",",-1);
        if(metaData[7].equals("")) metaData[7] ="0";
        Pyramid pyramid = new Pyramid(metaData[0],metaData[2],metaData[4],Double.parseDouble(metaData[7]) );
        return pyramid;
    }
}
