package be.ap.javadv.javafx;

import java.util.ArrayList;

import be.ap.javadv.javafx.style.ClockStyle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class SidePane extends Group {
	public SidePane() {
		getChildren().addAll(createSidePane());
	}

	public Node createSidePane() {
		StackPane sidePane = new StackPane();
		Stage stage = Timesup.getStage();

		sidePane.setPadding(new Insets(ClockStyle.SPACING, ClockStyle.SPACING, ClockStyle.SPACING, ClockStyle.RADIUS));
		sidePane.visibleProperty().bind(Clock.sidePaneVisible);

		Clock.sidePaneVisible.addListener((arg, oldVal, newVal) -> {
			if (newVal) {
				stage.setWidth(ClockStyle.RADIUS + ClockStyle.PANE_WIDTH);

			} else {
				stage.setWidth(ClockStyle.DIAM);
			}

			Clock.setPos(Clock.getPos());
		});

		ArrayList<Podcast> podcasts = new ArrayList<>();

		podcasts.add(new Podcast("Ariana Grande - 7 Rings", "file:///C:/Users/karen/Pictures/Wallpapers/RedFlowers.jpg",
				"file:///C:/Users/karen/Music/7_rings.mp3"));
		podcasts.add(new Podcast("Ariana Grande - Bloodline",
				"file:///C:/Users/karen/Pictures/Wallpapers/RedBudsFlowers.jpg",
				"file:///C:/Users/karen/Music/bloodlines.mp3"));

		ObservableList<Podcast> data = FXCollections.observableArrayList(podcasts);

		sidePane.getChildren().addAll(createSidePaneBack(), new PodcastPane(data));

		return sidePane;
	}

	public Node createSidePaneBack() {
		Rectangle background = new Rectangle(0, 0, ClockStyle.PANE_WIDTH - ClockStyle.SPACING,
				ClockStyle.DIAM - 2 * ClockStyle.SPACING);

		background.setFill(ClockStyle.ACCENT);
		background.setArcWidth(ClockStyle.ARC);
		background.setArcHeight(ClockStyle.ARC);

		return background;
	}
}