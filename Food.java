import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Food implements Serializable
{
    public int itemno;
    public int quantity;
   public float price;

   public Food(int itemno,int quantity)
    {
        this.itemno=itemno;
        this.quantity=quantity;
        switch(itemno)
        {
            case 1:price=quantity*50;
                break;
            case 2:price=quantity*60;
                break;
            case 3:price=quantity*70;
                break;
            case 4:price=quantity*30;
                break;
        }
    }

    /**
     *
     */

   public String toString(){
       String s1=null;
    switch(itemno)
        {
            case 1:s1="Sandwich";
                break;
            case 2:s1="Pasta";
                break;
            case 3:s1="Noodles";
                break;
            case 4:s1="coke";
                break;
        }
        return s1;
   }
}
