package edu.upc.eetac.dsa.smachado.jersey.example.multipart.model;

import java.util.ArrayList;
import java.util.List;

public class ImageDataCollection {
	private List<ImageData> images = new ArrayList<>();

	public List<ImageData> getImages() {
		return images;
	}

	public void setImages(List<ImageData> images) {
		this.images = images;
	}

	public void addImage(ImageData image) {
		images.add(image);
	}

}
