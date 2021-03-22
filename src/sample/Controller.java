package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;


import java.util.ArrayList;

public class Controller {
    @FXML private TextField NameTxtbox;
    @FXML private TextField TelTxtbox;
    @FXML private TextField RelTxtbox;
    @FXML private ListView PeopleList;

    ArrayList<Person> people = new ArrayList<Person>();






    public void updateExistingBtn(ActionEvent actionEvent) {
    }

    public void addNewPersonBtn(ActionEvent actionEvent) {
        people.add(new Person(NameTxtbox.getText(), Integer.parseInt(TelTxtbox.getText()), RelTxtbox.getText()));

        people.forEach((n)-> PeopleList.getItems(). add(n.getName()) );
    }
}
