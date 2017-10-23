
public class IteratorPattern {
public static void main(String[] args){
	
	NameRepository nameRepository=new NameRepository();
	
	
	
	for(Iterator iter = nameRepository.getIterator();iter.weightLess();){
        String name = (String)iter.hasNextList();
        System.out.println("Name : " + name);
     } 
	
	for(Iterator iter = nameRepository.getIterator();iter.weightGreater();){
        int price = (int)iter.hasNextPrice();
        System.out.println("Name : " + price);
     } 
     nameRepository.totalWeight();
}
}