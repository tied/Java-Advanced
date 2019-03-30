package edu.ap.karenveraa;

import javafx.scene.control.ListView;

/**
 * ProcessViewer
 */
public class ProcessViewer {
    ListView<String> processListView;

    public ProcessViewer() {
        this.processListView = new ListView();
        setItems();
    }

    public ListView<String> getItems() {
        return processListView;
    }

    public void setItems() {

    }
}