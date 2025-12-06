package tema07SetsAndMapsAdvancedLab;

import java.util.*;
import java.util.stream.Collectors;

public class P07CitiesByContinentAndCountry {


    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//
//        int n = Integer.valueOf(scanner.nextLine());
//
//        String name = "Name";
//        name.endsWith("twoletters");
//        //Map<String, Map<String, List<String>>> globus = new LinkedHashMap<>();
//        Set<Continent> globus = new LinkedHashSet<>();
//        Set<String> name = new LinkedHashSet<>();
//        globus.retainAll(name);
//        for(int i = 0; i <= n - 1; i++){
//            String[] tokens = scanner.nextLine().split("\\s+");
//            Continent c = new Continent(tokens[0], tokens[1], new ArrayList<>());
//            if(!globus.contains(c.getName())){
//                globus.add(c);
//                while(true){
//                    String land = globus.iterator().next().getCountry();
//                    if(land.equals(tokens[1])){
//                        c.getTown().add(tokens[2]);
//                        break;
//                    }
//                }
////                if(globus.iterator().next().getCountry().equals(tokens[1])){
////                    globus.iterator().next().getTown().add(tokens[2]);
////                }
//
////                globus.add(c.getName()).put(c.getCountry(), new ArrayList<>());
////                globus.get(c.getName()).get(c.getCountry()).add(c.getTown());
//            } else if(!globus.iterator().next().getName().equals(tokens[0])){
//                globus.add(c);
//
////                globus.get(c.getName()).put(c.getCountry(), new ArrayList<>());
////                globus.get(c.getName()).get(c.getCountry()).add(c.getTown());
//            } else {
//                //globus.add(c.getName()).get(c.getCountry()).add(c.getTown());
//            }
//        }
//
//
//
//
////        for(Map.Entry<String, Map<String, List<String>>> globe: globus.entrySet()){
////            System.out.println(globe.getKey()+":");
////            globe.getValue().entrySet().stream().forEach(country -> {
////                System.out.print(String.format("  %s ->",country.getKey()));
////                country.getValue().stream().forEach(e -> {
////                    String line = String.join(", ", e);
////
////                });
////                System.out.println();
////            });
////
////        }




    }




}

class Continent{

    private String name;
    private String country;
    private List<String> town;



    public Continent(String name, String country, List<String> town){
        this.name = name;
        this.country = country;
        this.town = town;
    }


    public String getName(){
        return name;
    }
    public void setName(String passName){
        this.name = passName;
    }

    public String getCountry(){
        return country;
    }
    public void setCountry(String country){
        this.country = country;
    }

    public List<String> getTown() {
        return town;
    }

    public void setTown(List<String> town) {
        this.town = town;
    }

}
