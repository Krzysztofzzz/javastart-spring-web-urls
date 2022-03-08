package com.javastart;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class PictureRepository {
    private final Map<String, Picture> pictures = new HashMap<>();

    public PictureRepository() {
        Picture birdPicture = new Picture("bird", "Biały ptak", "bird.jpeg");
        Picture flowerPicture = new Picture("flower", "Żółty kwiatek", "flower.jpeg");
        Picture handPicture = new Picture("hand", "Ręka pośród kwaitów", "hand.jpeg");
        pictures.put(birdPicture.getId(), birdPicture);
        pictures.put(flowerPicture.getId(), flowerPicture);
        pictures.put(handPicture.getId(), handPicture);
    }

    Picture findImageById(String id) {
        return pictures.get(id);
    }

    Collection<Picture> findAll() {
        return pictures.values();
    }
}
