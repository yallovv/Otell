import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class holder implements Serializable {

    public Doubleroom arr1[] = new Doubleroom[10]; //Luxury
    public Doubleroom arr2[] = new Doubleroom[20]; //Deluxe
    public Singleroom arr3[] = new Singleroom[10]; //Luxury
    public Singleroom arr4[] = new Singleroom[20]; //Deluxe
}
