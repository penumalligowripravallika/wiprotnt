package collections1;

import java.util.HashSet;

public class BoxService {

    HashSet<Box> set = new HashSet<Box>();

    public void addBox(Box b) {

        set.add(b);

    }

    public void display() {

        System.out.println("Unique Boxes in the Set are");

        for (Box b : set) {

            System.out.println(
                    "Length =" + b.getLength() +
                    " Width =" + b.getWidth() +
                    " Height =" + b.getHeight() +
                    " Volume =" + b.getVolume());

        }

    }

}