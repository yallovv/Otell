import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

class Parcels{}

public double fee(String shipType, double weight, int pCode){

    double fee = 0.0;
    final int MAX_WEIGHT_LETTER = 500;
    final int MAX_WEIGHT_PARCEL = 5000;

    final int MIN_WEIGHT_LETTER = 100;
    final int MIN_WEIGHT_PARCEL = 500;

    if(shipType.equals.ignoreCase("letter") && weight > MAX_WEIGHT_LETTER)
        throw new IllegalStateException("Letters weight too heavy");
    if(shipType.equals.ignoreCase("parcel") && weight > MAX_WEIGHT_LETTER)
        throw new IllegalStateException("Letters weight too heavy");

    if(pCode >= 11000 && pCode <= 14999){

    }
    else if(pCode >= 15000 && pCode <= 18999)){

    }

}
public static void main(String [] S){

    Double feeTest = fee("letter", 300, 12000);
    System.out.println(feeTest);
        
}


}




// day delivery anywhere in Riyadh (postal codes 11000-14999 inclusive)

// overnight delivery anywhere in the K.S.A. outside Riyadh (postal codes 15000-18999 inclusive). 

