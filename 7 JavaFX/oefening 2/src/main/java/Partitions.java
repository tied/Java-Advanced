import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.stage.Stage;
import java.util.Iterator;
import java.util.Map;

public class Partitions extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setWidth(500);
        stage.setHeight(500);

        Scene scene = new Scene(new Group());
        stage.setTitle("Disk Sizes");

        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList();

        // Can replace this with 'foreach' loop, just practicing my iterators
        Iterator it = DiskSpace.getDiskSpace().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            pieChartData.add(new PieChart.Data(pair.getKey().toString(), (long)pair.getValue()));
        }

        final PieChart chart = new PieChart(pieChartData);
        chart.setTitle("Disk Sizes");

        ((Group) scene.getRoot()).getChildren().add(chart);

        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }

}
