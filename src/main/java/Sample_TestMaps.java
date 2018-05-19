import java.util.HashMap;
import java.util.Map;
import java.util.Set;
 
public class Sample_TestMaps {
 
    public void findDuplicateChars(String str){
         
        Map<Character, Integer> dupMap = new HashMap<Character, Integer>(); 
        char[] chrs = str.toCharArray();
        for(Character ch:chrs){
            if(dupMap.containsKey(ch)){
                dupMap.put(ch, dupMap.get(ch)+1);
                
            } else {
                dupMap.put(ch, 1);
            }
            
            System.out.println("Map-->"+ch+"--->"+dupMap.get(ch));
        }
        
        Set<Character> keys = dupMap.keySet();
        for(Character ch:keys){
               System.out.println(ch+"--->"+dupMap.get(ch));
        }
    }
     
    public static void main(String a[]){
        Sample_TestMaps dcs = new Sample_TestMaps();
        String Mystring ="i will win in interview";
        String str= Mystring.replace(" ", "");
        dcs.findDuplicateChars(str);
    }
}