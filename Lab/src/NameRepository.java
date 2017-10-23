
public class NameRepository implements Container{
   public String shoopingList[]={"1 Bag","2 Clothes","3 LapTop","4 Shoes",};
   public int weight[]={5,12,2,24};
   public float price=0.75f;
  
   
   @Override()
   public Iterator getIterator(){
	   return new NameIterator();
   }
   
   
   private class NameIterator implements Iterator{
	   
	   int index;
	  
	   @Override
	   public boolean weightLess(){
		if(index<shoopingList.length||index<weight.length){
		  return true;
		}
		 return false;  
	   }
	   @Override
	   public boolean weightGreater(){
		   if(index<shoopingList.length||index<weight.length){
		   return true;
		   }
		   return false;
	   }
	   
	  @Override
	  public Object hasNextList(){
		  if(this.weightLess()){
		  return shoopingList[index++];
		  }
		  return null;
	  }
	  @Override
	  public Object hasNextPrice(){
		  if(this.weightGreater()){
		  return weight[index++];
		  }
		  return null;
	  }
	   
   }
   
   public void totalWeight(){
	   float w=0.75f;
	   for(int i=0;i<weight.length;i++){
		   w=w+weight[i]*w;
	   }
	   System.out.print("Total weight is "+w);
   }
}