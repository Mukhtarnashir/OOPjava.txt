class Person {

    String name;
    String address;
    final String country ="Brebes";

    Person( String paramName, String paramAddress){
        name = paramName;
        address =paramAddress;
        
    }

    Person( String paramName){
        this("String paramName", null) ;
    }
    Person(){
        this(null);
    }
        


    void sayHello ( String paramName ){
        System.out.println( "hello " + paramName + ", my name is " + name );
    }
}



