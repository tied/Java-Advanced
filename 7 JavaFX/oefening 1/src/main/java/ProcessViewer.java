import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class ProcessViewer extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    private ListView<String> getProcessInfo() {
        ListView<String> processListView = new ListView<>();

        ProcessHandle.allProcesses().filter(p -> p.info().user().isPresent()).forEach(p -> processListView.getItems()
                .add(String.format("%d (%s)", p.pid(), p.info().command().orElse(null))));

        return processListView;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        ListView<String> processListView = getProcessInfo();

        Group group = new Group(processListView);
        Scene scene = new Scene(group);

        primaryStage.setScene(scene);
        primaryStage.centerOnScreen();
        primaryStage.setHeight(800);
        primaryStage.setWidth(1000);
        processListView.setMinWidth(primaryStage.getWidth() - 15);
        processListView.setMinHeight(primaryStage.getHeight() - 15);
        primaryStage.show();

    }
}
