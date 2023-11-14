package com.st1.components;

import com.st1.Game;
import com.st1.inventory.Item;
import com.st1.inventory.UsableItem;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

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
        String imagePath = Game.class.getResource(item.imagePath()).toString();
        ImageView image = new ImageView(imagePath);
        image.setFitHeight(64);
        image.setFitWidth(64);
        button.setGraphic(image);
        if (item instanceof UsableItem) {
            button.setOnMouseClicked(MouseEvent -> ((UsableItem) item).use(Game.context));
        }
    }
}
