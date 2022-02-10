class sample14{
    
    public static void main(String args[]){
        
        int arr[]={23,78,54,90,33};
        try{
        System.out.println(arr[5]);  // Exception
        }
        catch(Exception e){
           System.out.println("Invalid index"); 
        }
       
        
    }
}