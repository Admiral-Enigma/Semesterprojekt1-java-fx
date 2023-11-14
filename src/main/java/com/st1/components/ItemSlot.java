package com.st1.components;

import com.st1.Game;
import com.st1.inventory.Item;
import com.st1.inventory.UsableItem;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ItemSlot extends SimpleComponent {
    private Item item;

    @FXML
    private Button button;

    public ItemSlot(Item item) {
        super("components/item-slot-component.fxml");
        this.item = item;
        render();
    }

    @Override
    public void render() {
        Image image = new Image(Game.class.getResourceAsStream(item.getImagePath()));
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(64);
        imageView.setFitWidth(64);
        button.setGraphic(imageView);
        if (item instanceof UsableItem) {
            button.setOnMouseClicked(MouseEvent -> ((UsableItem) item).use(Game.context));
        }
    }
}
