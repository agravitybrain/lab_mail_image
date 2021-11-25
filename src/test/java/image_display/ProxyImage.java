package image_display;

import lombok.Getter;

public class ProxyImage implements Image{

    @Getter
    private RealImage realImage;
    private String fileName;


    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
    }
}
