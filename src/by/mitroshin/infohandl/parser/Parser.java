package by.mitroshin.infohandl.parser;

import by.mitroshin.infohandl.entity.*;
import by.mitroshin.infohandl.exception.TechnicalException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ResourceBundle;

/**
 * Created by HP M6 on 30.05.2015.
 */
public enum Parser {

    INSTANCE;

    private static final ResourceBundle resourceBundle = ResourceBundle.getBundle("resources.regulars");
    private static BufferedReader reader;
    private static FileWriter fileWriter;

    public TextComposite parseText(String filePath) throws TechnicalException {
       try {
            reader = new BufferedReader(new FileReader(filePath));
            TextComposite result = new TextComposite();
            String stringFromFile;
            while ((stringFromFile = reader.readLine()) != null){
                System.out.println(stringFromFile);
                if(stringFromFile.trim().matches(resourceBundle.getString("listing"))) {
                    char[] array = stringFromFile.toCharArray();
                    Listing listing = new Listing();
                    for (int i = 0; i < array.length; i++) {
                        listing.add(new Sign(array[i]));
                    }
                    listing.add(new Sign('\n'));
                    result.add(listing);
                } else {



                }
            }
            reader.close();
            return result;
        }catch (IOException e){
            throw new TechnicalException(filePath + "error with file!!!", e);
        }
    }

   /* public void writeTextToFile(TextComposite text, String filePath) throws TechnicalException {
        try {
            Component component;
            int index = 0;
            fileWriter = new FileWriter(filePath);
            while ((component = text.getChild(0)) != null){
                if(component instanceof Listing){
                    Listing listing = (Listing) component;
                    int listingIndex = 0;
                    Sign sign;
                    while ((sign = listing.getChild(listingIndex)) != null){
                        fileWriter.write(sign.getSymbol());
                        listingIndex++;
                    }
                    listingIndex = 0;
                } else if (component instanceof Sign){
                    Sign sign = (Sign) component;
                    fileWriter.write(sign.getSymbol());
                }
                index++;
            }
            fileWriter.close();
        } catch (IOException e) {
            throw new TechnicalException(filePath + "error with file!!!", e);
        }
    }
    */

}
