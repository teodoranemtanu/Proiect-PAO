package services;

import javax.xml.crypto.Data;

public class DataBaseConnection {
    private static DataBaseConnection dataBaseConnection;

    private DataBaseConnection() {

    }



    static DataBaseConnection getDataBaseConnectionInstance() {
        if (dataBaseConnection == null) {
            dataBaseConnection = new DataBaseConnection();
        }
        return dataBaseConnection;
    }

}
