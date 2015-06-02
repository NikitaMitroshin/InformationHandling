package by.mitroshin.infohandl.run;

import by.mitroshin.infohandl.entity.TextComposite;
import by.mitroshin.infohandl.exception.TechnicalException;
import by.mitroshin.infohandl.parser.Parser;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

/**
 * Created by HP M6 on 30.05.2015.
 */
public class InformationRunner {

    public final static Logger LOG = Logger.getLogger(InformationRunner.class);

    static{
        new DOMConfigurator().doConfigure("config/log4j.xml", LogManager.getLoggerRepository());
    }

    public static void main(String[] args) {
     /*   String s = "void applyBrakes() {" ;
        String s1 = "// the \"if\" clause: bicycle must be moving";
        String s3 = "if (isMoving){ ";
        String s4 = "currentSpeed--;";
        String s5 = "    }";
        System.out.println(s.matches("^(//).+"));
        System.out.println(s1.matches("^(void|//|if).+"));
        System.out.println(s3.matches("^(void|//|if).+"));
        System.out.println(s.matches("(.+(\\}|;|\\{)$)|(^(//).+)"));
        System.out.println(s1.matches("(.+(\\}|;|\\{)$)|(^(//).+)"));
        System.out.println(s3.trim().matches("(.+(\\}|;|\\{)$)|(^(//).+)"));
        System.out.println(s4.matches("(.+(\\}|;|\\{)$)|(^(//).+)"));
        System.out.println(s5.matches("(.+(\\}|;|\\{)$)|(^(//).+)")); */
        String s = "The if-then statement is the most basic of all the control flow statements: It tells your program to execute a certain section of code only if a particular test evaluates to true. For example, the Bicycle class could allow the brakes to decrease the bicycle's speed only if the bicycle is already in motion. One possible implementation of the applyBrakes method could be as follows:";
      //  System.out.println(s.matches("[A-Z]{1}[\\w\\s\\d*'*%*\\-*,*:*\\(*\\)*\"*;*]+[\\.|!|\\?|:]$"));
       // System.out.println(s.matches("[A-Z]{1}[\\w\\s\\d(\\p{Punct})*]+[\\.|!|\\?|:]$"));
       // String[] mas = s.split("[\\.|!|\\?|:]");
        String[] mas = s.split(" ");
        for(String string : mas){
            System.out.println(string);
        }
      //  System.out.println(s.matches("^[A-Z]{1}"));

      /*  try {
            TextComposite textComposite = Parser.INSTANCE.parseText("input/text.txt");
          //  textComposite.printListing();
         //   textComposite.printListing();
          //  Parser.INSTANCE.writeTextToFile(textComposite, "output/result.txt");
        }catch (TechnicalException e) {
            LOG.error("TechnicalException!!!", e);
        } */



    }
}
