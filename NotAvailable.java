import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
public class NotAvailable extends Exception
{
    @Override
    public String toString()
    {
        return "Not Available !";
    }
}
