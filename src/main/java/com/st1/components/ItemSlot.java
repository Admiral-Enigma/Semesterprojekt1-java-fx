package com.st1.components;

import com.st1.Game;
import com.st1.inventory.Item;
import com.st1.inventory.UsableItem;
import com.st1.util.Img;
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
        ImageView imageView = new ImageView(Img.fromAssets("assets/" + item.getImagePath()));
        imageView.setFitHeight(64);
        imageView.setFitWidth(64);
        button.setGraphic(imageView);
        if (item instanceof UsableItem) {
            button.setOnMouseClicked(MouseEvent -> ((UsableItem) item).use(Game.context));
        }
    }
}
