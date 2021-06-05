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

public class PyramidCSVDAO {
    Scanner scFile;
    public void readFile(String fileName){
        File myFile = new File(fileName);
        try {
            scFile = new Scanner(myFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
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
        Pyramid pyramid = new Pyramid(metaData[0],metaData[2],metaData[4],Double.parseDouble(metaData[7]) );
        return pyramid;
    }
}
