package app.model;

import app.entities.AirLines;
import app.entities.DBConnect;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.sql.*;

public class Model {
    private static Model instance = new Model();
    private List<AirLines> model;

    public static Model getInstance() {

        return instance;
    }

    private Model() {
       setModel();
    }
    public Model (boolean refresh){
        setModel();
    }
    private void setModel(){
        System.out.println("Вход в модель");
        model = new ArrayList<>();
        DBConnect con1 = new DBConnect();
        ResultSet r1 = con1.setSQL("select * from авиалинии.авиалинии");
        try {
            while (r1.next()) {

                AirLines a = new AirLines(r1.getString("name"));
                model.add(a);
            }
        } catch (Exception e) {

        }
    }

    public void add(AirLines airLines) {
        model.add(airLines);

    }

    public List<String> list() {

        return model.stream()
                .map(AirLines::getName)
                .collect(Collectors.toList());
    }

}
