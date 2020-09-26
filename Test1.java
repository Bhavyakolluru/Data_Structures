class Test1 { 
  
    void display() 
    { 
        // calling function show() 
        this.show(); 
     
       System.out.println("Inside display function"); 
    } 
      
    void show() { 
        System.out.println("Inside show funcion"); 
    } 
      
  
    public static void main(String args[]) { 
        Test1 t1 = new Test1(); 
        t1.display(); 
    } 
}
