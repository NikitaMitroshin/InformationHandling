package by.mitroshin.infohandl.action;

import by.mitroshin.infohandl.entity.Component;
import by.mitroshin.infohandl.entity.Listing;
import by.mitroshin.infohandl.entity.Sign;
import by.mitroshin.infohandl.entity.TextComposite;

/**
 * Created by HP M6 on 31.05.2015.
 */
public class DeleteWordsByLength {
    public TextComposite deleteWordsByLengthIsStartWithSogl(TextComposite text, int length){
        int componentIndex = 0;
        Component component;
        int wordStart = 0;
        int wordEnd = 0;
        while ((component = text.getChild(0)) != null){
            if(component instanceof Listing) {

            } else if (component instanceof Sign){
                Sign sign = (Sign) component;
                if(sign.getSymbol() == ' '){
                    if(wordStart == 0){
                        wordStart = componentIndex;
                    }else if(wordEnd == 0){
                        wordEnd = componentIndex;
                    }else if(wordStart != 0 && wordEnd != 0){
                        String word ="";
                        for (int i = wordStart; i <= wordEnd ; i++) {
                            word = word + text.getChild(i);
                        }
                        if(word.length() == length){
                        //    if()
                        }
                        wordStart = 0;
                        wordEnd = 0;
                    }

                }
            }
        }
        return null;
    }
}
