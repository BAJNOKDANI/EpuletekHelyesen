import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class Epuletek {
   private ArrayList<Epulet> lista;

    private String[] nyersAdatok = {
            "Burj Khalifa, 828, Dubai",
            "Merdeka 118, 678, Kuala Lumpur",
            "Shanghai Tower, 632, Shanghai",
            "Abraj Al Bait Clock Tower, 601, Mecca",
            "Ping An Finance Centre, 599, Shenzhen",
            "Lotte World Tower, 555, Seoul",
            "One World Trade Center, 541, New York",
            "Guangzhou CTF Finance Centre, 530, Guangzhou",
            "Tianjin CTF Finance Centre, 530, Tianjin",
            "China Zun, 528, Beijing",
            "Taipei 101, 508, Taipei",
            "Shanghai World Financial Center, 492, Shanghai",
            "International Commerce Centre, 484, Hong Kong",
            "Lakhta Center, 462, Saint Petersburg",
            "Vincom Landmark 81, 461, Ho Chi Minh City",
            "Changsha IFS Tower T1, 452, Changsha",
            "Petronas Tower 1, 451, Kuala Lumpur",
            "Petronas Tower 2, 451, Kuala Lumpur",
            "Suzhou IFS, 450, Suzhou",
            "Zifeng Tower, 450, Nanjing",
            "The Exchange 106, 445, Kuala Lumpur",
            "Willis Tower, 442, Chicago",
            "KK100, 442, Shenzhen",
            "Guangzhou International Finance Center, 438, Guangzhou",
            "432 Park Avenue, 426, New York",
            "Marina 101, 425, Dubai",
            "Trump International Hotel & Tower, 423, Chicago",
            "Jin Mao Tower, 421, Shanghai",
            "Princess Tower, 414, Dubai",
            "Al Hamra Tower, 413, Kuwait City",
            "Burj Mohammed bin Rashid, 381, Abu Dhabi",
            "One Vanderbilt, 427, New York",
            "Shun Hing Square, 384, Shenzhen",
            "Lotte Tower, 380, Busan",
            "Nanning China Resources Tower, 403, Nanning",
            "23 Marina, 393, Dubai",
            "Elite Residence, 380, Dubai",
            "Empire State Building, 381, New York",
            "OKO Tower, 354, Moscow",
            "Tashkent Tower, 375, Tashkent",
            "CITIC Tower, 528, Beijing",
            "Central Park Tower, 472, New York",
            "China Resources Tower, 392, Shenzhen",
            "Eton Place Dalian Tower 1, 383, Dalian",
            "The Shard, 310, London",
            "John Hancock Center, 344, Chicago",
            "Shenzhen Center, 375, Shenzhen",
            "Grand Lisboa, 261, Macau",
            "Q1 Tower, 322, Gold Coast"
    };

    public Epuletek(){
        this.lista = new ArrayList<>();
        feldolgozas();
    }

    public void feldolgozas(){
        for (String item : nyersAdatok){
            String [] reszek = item.split(", ");
            lista.add(new Epulet(reszek[0], Integer.parseInt(reszek[1]), reszek[2]));

        }
        for (Epulet item : lista){
            System.out.println(item);
        }
    }

    public double atlagmagassag(){
        double atlag = 0;
        for (Epulet item : lista){
            atlag+=item.getMagassag();
        }
        return Math.round((atlag/lista.size())*100)/100.0;
    }

    public Epulet legalacsonyabb(){
        Epulet alacsony = lista.get(0);
        for (Epulet item : lista){
            if (item.getMagassag()<alacsony.getMagassag()){
                alacsony=item;
            }
        }
        return alacsony;





    }

    public void varosok(){
        ArrayList<String> v = new ArrayList<>();
        for (Epulet item : lista){
            if (!v.contains(item.getVaros())){
                v.add(item.getVaros());
            }
        }
        for (String item : v){
            System.out.println(item);
        }
    }
    public void halmazzalVarosok(){
        //HashSet<String>halmaz = new HashSet<>();
        TreeSet<String>halmaz = new TreeSet<>(); //növekvősorrendben rakja bele az adatokat
        for (Epulet item : lista) {
            halmaz.add(item.getVaros());
        }
        for(String item:halmaz){
            System.out.println(item);
        }
    }
//melyikváros hányszor szerepel - dictionary---> HashMap

    public void hanyszorSzerepel(){
        // <Kulcs tipusa, Value tipusat kell megadni>
        // város a kulcs
        // adott város hányszor szerepel
        HashMap<String, Integer>stat = new HashMap<>();
        for (Epulet item : lista){
            String kulcs = item.getVaros();
            if (!stat.containsKey(kulcs)){
                stat.put(kulcs,0);
            }
            int value = stat.get(kulcs)+1; // egyel növeljük
            stat.put(kulcs, value);
        }
        for (String key : stat.keySet()){
            if (stat.get(key)>1){
                System.out.println(key + " " + stat.get(key));
            }
        }
    }


}
