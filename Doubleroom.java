import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
public class Doubleroom extends Singleroom implements Serializable
{
   public String name2;
  public  String contact2;
  public  String gender2;
   public ArrayList<Food> food =new ArrayList<>();

  public  Doubleroom()
    {
        this.name="";
        this.name2="";
    }
  public  Doubleroom(String name,String contact,String gender,String name2,String contact2,String gender2)
    {
        this.name=name;
        this.contact=contact;
        this.gender=gender;
        this.name2=name2;
        this.contact2=contact2;
        this.gender2=gender2;
    }
}
