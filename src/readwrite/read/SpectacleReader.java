package readwrite.read;

import com.opencsv.CSVReader;
import models.Client;
import models.Spectacle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SpectacleReader extends Reader<Spectacle> {

    private static List<Spectacle> spectacleList = new ArrayList<>();

    public static void readData() {

        SpectacleReader spectacleReader = new SpectacleReader();

        spectacleList = spectacleReader.readAndCreateObjects(
                "D:\\PAO\\ProiectPAO\\src\\readwrite\\resources\\Spectacles.csv");

        for (Spectacle spectacle : spectacleList) {
            System.out.println(spectacle);
        }
    }

    public static List<Spectacle> getSpectacleList() {
        return Collections.unmodifiableList(spectacleList);
    }

    @Override
    Spectacle createObject(String[] objectDetails) {
        return new Spectacle(objectDetails[0], objectDetails[1], objectDetails[2], Integer.parseInt(objectDetails[3]));
    }
}