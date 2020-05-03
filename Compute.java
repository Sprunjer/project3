package client;
import java.security.MessageDigest;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.codec.digest.DigestUtils;
import java.util.*;
/**
 * Write a description of class client here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Compute
{
    
    static final int RANDOM_NUMBER =50;
  /*  
    public static void main(String args[]) { 
        
        
        String bet=generateRandBet(RANDOM_NUMBER);
        
        System.out.println("The hashed and sent bet is: " + bet);
        
        System.out.println(md5ApacheCommonsCodec(bet));
       
        
    }
  */  
    public static String Betresponder() {
        
        String bet=generateRandBet(RANDOM_NUMBER);
        
        System.out.println("The hashed and sent bet is: " + bet);
       
        return bet;
        
    }
    
    public static String Hashresponder() {
        
    return md5ApacheCommonsCodec(Betresponder());
        
    }
    
    
    public static String md5ApacheCommonsCodec(String content){
       
        return DigestUtils.md5Hex(content);
       
    }
    
    public static String generateRandBet(int value){
         int random = (int)(Math.random() * value + 1);
        
         return Integer.toString(random);
         
         }
    
}