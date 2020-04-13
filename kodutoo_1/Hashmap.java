import java.util.HashMap;
/**
 * Hashmap
 */
public class Hashmap {
    private String[] maakonnad;
    HashMap<String, String> hm = new HashMap<String, String>();
    public Hashmap(String maakond, String keskus){
       // HashMap<String, String> hm = new HashMap<String, String>();
        hm.put("Harjumaa", "Tallinn");
        hm.put("Ida-Virumaa", "Narva");
        hm.put("Saaremaa", "Kuressaare");
        hm.put("Lääne-Virumaa", "Rakvere");
        hm.put(maakond, keskus);
    }
    public HashMap getMaakond(){
        for(int i = 0; i < hm.size(); i++){
            return hm.keySet();
        }
    }
}